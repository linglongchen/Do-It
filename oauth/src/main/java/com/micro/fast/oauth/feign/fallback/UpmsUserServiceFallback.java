package com.micro.fast.oauth.feign.fallback;

import com.micro.fast.oauth.dto.UpmsUser;
import com.micro.fast.oauth.feign.UpmsUserService;
import org.springframework.stereotype.Component;
import com.micro.fast.boot.starter.common.response.ServerResponse;

/**
 * UpmsUserService类服务调用失败时候调用的方法,需要把这个类注入到ioc中
 * @author lsy
 */
@Component
public class UpmsUserServiceFallback implements UpmsUserService{

    @Override
    public ServerResponse<UpmsUser> getUserByUserName(String username) {
        return ServerResponse.error();
    }
}
