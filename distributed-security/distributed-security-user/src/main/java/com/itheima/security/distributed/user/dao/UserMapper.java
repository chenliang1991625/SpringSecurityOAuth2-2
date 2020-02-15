package com.itheima.security.distributed.user.dao;
import com.itheima.security.distributed.domain.User;
import com.itheima.security.distributed.mapper.MyMapper;
//不要被@SpringBootApplication(scanBasePackages="")扫描到
public interface UserMapper extends MyMapper<User> {
}