package com.itheima.security.distributed.domain.returnDto;
import lombok.Data;

import java.io.Serializable;
/**
 * 登录信息
 * <p>
 * Description:
 * </p>
 * @author Lusifer
 * @version v1.0.0
 * @date 2019-07-29 15:07:12
 */
@Data
//登录信息
public class LoginInfo implements Serializable {
    private String name;
    private String avatar;//头像
    private String nickName;//别名
}
