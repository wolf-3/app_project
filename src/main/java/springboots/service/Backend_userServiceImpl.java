package springboots.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboots.mapper.Backend_userMapper;
import springboots.pojo.Backend_user;

/**
 * @Description:用户表实体类业务逻辑层实现
 * @Author sxw
 * @Date Created in 14:15   2018/4/25
 */
@Service
public class Backend_userServiceImpl implements Backend_userService {

    @Autowired
    private Backend_userMapper backend_userMapper;

    @Override
    public Backend_user backLognin(String userCode, String userPassword) {
       Backend_user backend_user = backend_userMapper.selectUserType(userCode,userPassword);
        return backend_user;
    }
}
