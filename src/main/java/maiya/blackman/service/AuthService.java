package maiya.blackman.service;

import com.maiya.bean.Auth;

public interface AuthService {
    public int insert(Auth record);

    public Auth selectByToken(String token);
}
