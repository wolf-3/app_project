package springboots.service;

import org.springframework.stereotype.Service;
import springboots.mapper.App_infoMapper;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Description:App具体信息实体类（业务逻辑层实现）
 * @Author sxw
 * @Date Created in 14:17   2018/4/25
 */
@Service
public class App_infoServiceImpl implements  App_infoService {
    @Resource
    private App_infoMapper app_infoMapper;


    @Override
    public List<Map<String, Object>> selectPartInfo(String querySoftwareName, int queryFlatformId, int queryCategoryLevel1, int queryCategoryLevel2, int queryCategoryLevel3, int pageIndex, int pageSize) {
        return app_infoMapper.selectPartInfo( querySoftwareName,  queryFlatformId,  queryCategoryLevel1,  queryCategoryLevel2,  queryCategoryLevel3,  pageIndex,  pageSize);
    }

    @Override
    public int infoCount(String querySoftwareName, int queryFlatformId, int queryCategoryLevel1, int queryCategoryLevel2, int queryCategoryLevel3) {
        return app_infoMapper.infoCount(querySoftwareName,  queryFlatformId,  queryCategoryLevel1,  queryCategoryLevel2,  queryCategoryLevel3);
    }
}
