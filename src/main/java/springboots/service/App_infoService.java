package springboots.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Description:App具体信息实体类（业务逻辑层）
 * @Author 罗曼蒂克
 * @Date Created in 14:09   2018/4/25
 */
public interface App_infoService {


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
    public List<Map<String,Object>> selectPartInfo(int pageIndex, int pageSize);

    public int pageCount(int pageSize);

}
