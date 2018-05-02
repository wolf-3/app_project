package springboots.service;

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
    public boolean chageStatus(int status,int id);

    /**
     * 查
     */
    public List<Map<String,Object>> selectPartInfo(String querySoftwareName,
                                                   int queryFlatformId,
                                                   int queryCategoryLevel1,
                                                   int queryCategoryLevel2,
                                                   int queryCategoryLevel3,
                                                   int pageIndex,
                                                    int pageSize
    );

    public int infoCount(String querySoftwareName,
                         int queryFlatformId,
                         int queryCategoryLevel1,
                         int queryCategoryLevel2,
                         int queryCategoryLevel3);

    public Map<String,Object> selectAppInfo(int id);
}
