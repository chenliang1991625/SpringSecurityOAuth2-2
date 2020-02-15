package com.itheima.security.distributed.feign.fallback;

import com.itheima.security.distributed.domain.User;
import com.itheima.security.distributed.domain.returnDto.ResponseResult;
import com.itheima.security.distributed.dto.params.IconParam;
import com.itheima.security.distributed.dto.params.PasswordParam;
import com.itheima.security.distributed.dto.params.ProfileParam;
import com.itheima.security.distributed.feign.ProfileFeign;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class MyFallBack implements FallbackFactory {
    public static final String BREAKING_MESSAGE = "请求失败了,请检查您的网络";
    @Override
    public Object create(Throwable throwable) {
        return new ProfileFeign() {
            @Override
            public ResponseResult<User> info(String username) {
                try {
                    return new ResponseResult<>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public ResponseResult<User> update(ProfileParam profileParam) {
                try {
//                    return MapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
                    return new ResponseResult<>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public ResponseResult<User> modifyPassword(PasswordParam passwordParam) {
                try {
//                    return MapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
                    return new ResponseResult<>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE);

                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public ResponseResult<User> modifyIcon(IconParam iconParam) {
                try {
//                    return MapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
                    return new ResponseResult<>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE);

                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }
        };
    }
}
