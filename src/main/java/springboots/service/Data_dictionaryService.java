package springboots.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Description:数据字典的业务逻辑层
 * @Author sxw
 * @Date Created in 14:12   2018/4/25
 */
public interface Data_dictionaryService {




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
