package com.maiya.bean;

import java.io.Serializable;
import java.util.Date;

public class ProductPic implements Serializable {
    private Long ppId;

    private String link;

    private Long ppProductId;

    private Boolean isMasterGraph;

    private Date ppCreateTime;

    private static final long serialVersionUID = 1L;

    public Long getPpId() {
        return ppId;
    }

    public void setPpId(Long ppId) {
        this.ppId = ppId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Long getPpProductId() {
        return ppProductId;
    }

    public void setPpProductId(Long ppProductId) {
        this.ppProductId = ppProductId;
    }

    public Boolean getIsMasterGraph() {
        return isMasterGraph;
    }

    public void setIsMasterGraph(Boolean isMasterGraph) {
        this.isMasterGraph = isMasterGraph;
    }

    public Date getPpCreateTime() {
        return ppCreateTime;
    }

    public void setPpCreateTime(Date ppCreateTime) {
        this.ppCreateTime = ppCreateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ProductPic other = (ProductPic) that;
        return (this.getPpId() == null ? other.getPpId() == null : this.getPpId().equals(other.getPpId()))
            && (this.getLink() == null ? other.getLink() == null : this.getLink().equals(other.getLink()))
            && (this.getPpProductId() == null ? other.getPpProductId() == null : this.getPpProductId().equals(other.getPpProductId()))
            && (this.getIsMasterGraph() == null ? other.getIsMasterGraph() == null : this.getIsMasterGraph().equals(other.getIsMasterGraph()))
            && (this.getPpCreateTime() == null ? other.getPpCreateTime() == null : this.getPpCreateTime().equals(other.getPpCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPpId() == null) ? 0 : getPpId().hashCode());
        result = prime * result + ((getLink() == null) ? 0 : getLink().hashCode());
        result = prime * result + ((getPpProductId() == null) ? 0 : getPpProductId().hashCode());
        result = prime * result + ((getIsMasterGraph() == null) ? 0 : getIsMasterGraph().hashCode());
        result = prime * result + ((getPpCreateTime() == null) ? 0 : getPpCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ppId=").append(ppId);
        sb.append(", link=").append(link);
        sb.append(", ppProductId=").append(ppProductId);
        sb.append(", isMasterGraph=").append(isMasterGraph);
        sb.append(", ppCreateTime=").append(ppCreateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}