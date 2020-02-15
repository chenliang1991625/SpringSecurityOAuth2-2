package com.itheima.security.distributed.feign.fallback;
import com.itheima.security.distributed.domain.User;
import com.itheima.security.distributed.domain.returnDto.ResponseResult;
import com.itheima.security.distributed.dto.params.IconParam;
import com.itheima.security.distributed.dto.params.PasswordParam;
import com.itheima.security.distributed.dto.params.ProfileParam;
import com.itheima.security.distributed.feign.ProfileFeign;
import org.springframework.stereotype.Component;
/**
 * 个人信息服务熔断器
 * <p>
 * Description:
 * </p>
 * @author Lusifer
 * @version v1.0.0
 * @date 2019-08-27 23:50:08
 */
@Component
public class ProfileFeignFallback implements ProfileFeign {
    public static final String BREAKING_MESSAGE = "请求失败了,请检查您的网络";
    @Override
    public ResponseResult<User> info(String username) {
        try {
            return new ResponseResult<User>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public ResponseResult<User> update(ProfileParam profileParam) {
        try {
            return new ResponseResult<User>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public ResponseResult<User> modifyPassword(PasswordParam passwordParam) {
        try {
            return new ResponseResult<User>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public ResponseResult<User> modifyIcon(IconParam iconParam) {
        try {
            return new ResponseResult<User>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
