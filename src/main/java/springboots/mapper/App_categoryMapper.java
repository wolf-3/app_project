package springboots.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Description:App分类的接口（数据访问层）
 * @Date Created in 13:56   2018/4/25
 */
public interface App_categoryMapper {



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
    public List<Map<String,Object>>  selectCategory(@Param("parentId")int parentId);



}
