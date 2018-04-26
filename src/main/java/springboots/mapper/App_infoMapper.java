package springboots.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Description:App具体信息实体类（数据访问层）
 * @Date Created in 13:58   2018/4/25
 */
public interface App_infoMapper {




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
    public List<Map<String,Object>> selectPartInfo(@Param("pageIndex")int pageIndex,@Param("pageSize")int pageSize);

    public int infoCount();

}
