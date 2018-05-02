package springboots.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Description:数据字典的数据访问层
 * @Date Created in 14:05   2018/4/25
 */
public interface Data_dictionaryMapper {


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
    public List<Map<String,Object>> selectValueName(@Param("typeCode")String typeCode);

}
