package springboots.service;

import springboots.pojo.Backend_user;

/**
 * @Description:用户表实体类（业务逻辑层）
 * @Author sxw
 * @Date Created in 14:11   2018/4/25
 */
public interface Backend_userService {
    /**
     * 登陆状态
     * @param userCode
     * @param userPassword
     * @return 成功则返回其用户信息
     */
    public Backend_user backLognin(String userCode, String userPassword);
}
