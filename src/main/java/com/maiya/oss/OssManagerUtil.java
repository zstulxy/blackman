package com.maiya.oss;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.Bucket;
import com.aliyun.oss.model.OSSObject;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectResult;
import org.apache.log4j.Logger;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;

/**
 * Created by Administrator on 2017/8/2.
 */
public class OssManagerUtil {
    private static Logger logger = Logger.getLogger(OssManagerUtil.class);
    private String accessKeyId_ = "LTAIjF4OjBEZP5h1";
    private String accessKeySecret_ = "JLQ9yhOn7MzPBmWrEq8X7ChlW0jQzF";
    private String bucketName_ = "asiatic";
    private String endPoint_ = "oss-cn-qingdao.aliyuncs.com";
    private String fold_ = "asiatic_1.0/";
    private OSSClient ossClient_ = null;

    public int connect() {
        ossClient_ = new OSSClient(endPoint_, accessKeyId_, accessKeySecret_);

        return ((ossClient_ != null) ? 0 : -1);
    }

    public String createBucketName(String bucketName) {
        //存储空间
        final String bucketNames = bucketName;
        if (!ossClient_.doesBucketExist(bucketName)) {
            //创建存储空间
            Bucket bucket = ossClient_.createBucket(bucketName);
            logger.info("创建存储空间成功");
            return bucket.getName();
        }
        return bucketNames;
    }

    public void deleteBucket(OSSClient ossClient, String bucketName) {
        ossClient.deleteBucket(bucketName);
        logger.info("delete" + bucketName + "bucket success");
    }

    public String createFolder(String bucketName, String foldName) {
        //文件夹名
        final String keySuffixWithSlash = foldName;
        //判断文件夹是否存在，不存在则创建
        if (!ossClient_.doesObjectExist(bucketName, keySuffixWithSlash)) {
            //创建文件夹
            ossClient_.putObject(bucketName, keySuffixWithSlash, new ByteArrayInputStream(new byte[0]));
            logger.info("创建文件夹成功");
            //得到文件夹名
            OSSObject object = ossClient_.getObject(bucketName, keySuffixWithSlash);
            String fileDir = object.getKey();
            return fileDir;
        }
        return keySuffixWithSlash;
    }

    public void deleteFile(String bucketName, String folder, String key) {
        ossClient_.deleteObject(bucketName, folder + key);
        logger.info("delete" + bucketName + "/" + folder + key + "success");
    }

    public String uploadObject2OSS(InputStream is, String fileName,Long fileSize, String bucketName, String folder) {
        String resultStr = null;
        try {
//            //以输入流的形式上传文件
//            InputStream is = new FileInputStream(file);
//            //文件名
//            String fileName = file.getName();
//            //文件大小
//            Long fileSize = file.length();
            //创建上传Object的Metadata
            ObjectMetadata metadata = new ObjectMetadata();
            //上传的文件的长度
            metadata.setContentLength(is.available());
            //指定该Object被下载时的网页的缓存行为
            metadata.setCacheControl("no-cache");
            //指定该Object下设置Header
            metadata.setHeader("Pragma", "no-cache");
            //指定该Object被下载时的内容编码格式
            metadata.setContentEncoding("utf-8");
            //文件的MIME，定义文件的类型及网页编码，决定浏览器将以什么形式、什么编码读取文件。如果用户没有指定则根据Key或文件名的扩展名生成，
            //如果没有扩展名则填默认值application/octet-stream
            metadata.setContentType(getContentType(fileName));
            //指定该Object被下载时的名称（指示MINME用户代理如何显示附加的文件，打开或下载，及文件名称）
            metadata.setContentDisposition("filename/filesize=" + fileName + "/" + fileSize + "Byte.");
            //上传文件   (上传文件流的形式)
            PutObjectResult putResult = ossClient_.putObject(bucketName, folder + fileName, is, metadata);
            //解析结果
            resultStr = putResult.getETag();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("上传阿里云OSS服务器异常." + e.getMessage(), e);
        }
        return resultStr;
    }

    public String getContentType(String fileName) {
        //文件的后缀名
        String fileExtension = fileName.substring(fileName.lastIndexOf("."));
        if (".bmp".equalsIgnoreCase(fileExtension)) {
            return "image/bmp";
        }
        if (".gif".equalsIgnoreCase(fileExtension)) {
            return "image/gif";
        }
        if (".jpeg".equalsIgnoreCase(fileExtension) || ".jpg".equalsIgnoreCase(fileExtension) || ".png".equalsIgnoreCase(fileExtension)) {
            return "image/jpeg";
        }
        if (".html".equalsIgnoreCase(fileExtension)) {
            return "text/html";
        }
        if (".txt".equalsIgnoreCase(fileExtension)) {
            return "text/plain";
        }
        if (".vsd".equalsIgnoreCase(fileExtension)) {
            return "application/vnd.visio";
        }
        if (".ppt".equalsIgnoreCase(fileExtension) || "pptx".equalsIgnoreCase(fileExtension)) {
            return "application/vnd.ms-powerpoint";
        }
        if (".doc".equalsIgnoreCase(fileExtension) || "docx".equalsIgnoreCase(fileExtension)) {
            return "application/msword";
        }
        if (".xml".equalsIgnoreCase(fileExtension)) {
            return "text/xml";
        }
        //默认返回类型
        return "image/jpeg";
    }

    public URL generatePresignedUrl(String bucketName, String key,
                                    Date expiration) throws ClientException {
        return ossClient_.generatePresignedUrl(bucketName,key,expiration);
    }

}
