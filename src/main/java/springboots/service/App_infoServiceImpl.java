package springboots.service;

import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Map<String,Object>> selectPartInfo(int pageIndex, int pageSize){
        return app_infoMapper.selectPartInfo(pageIndex,pageSize);
    }

    public int pageCount(int pageSize){
        int infoCount = app_infoMapper.infoCount();
        return infoCount % pageSize == 0 ? infoCount / pageSize : infoCount/pageSize+1;
    }
}
