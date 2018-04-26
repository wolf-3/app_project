package springboots.mapper;

import org.apache.ibatis.annotations.Param;
import springboots.pojo.Backend_user;

/**
 * @Description:用户表实体类（数据访问层）
 * @Date Created in 14:03   2018/4/25
 */
public interface Backend_userMapper {




    /**
     * 增
     */


    /**
     * 删
     */


    /**
     * 改
     */


    /**
     * 查
     */
    /**
     * 查询用户类型
     * @return
     */
    public Backend_user selectUserType(@Param("userCode")String userCode, @Param("userPassword")String userPassword);
}
