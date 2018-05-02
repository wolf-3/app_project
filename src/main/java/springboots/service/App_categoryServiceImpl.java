package springboots.service;

import org.springframework.stereotype.Service;
import springboots.mapper.App_categoryMapper;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Description:App分类的接口（业务逻辑层实现）
 * @Author sxw
 * @Date Created in 14:18   2018/4/25
 */
@Service
public class App_categoryServiceImpl implements App_categoryService {
    @Resource
    private App_categoryMapper app_categoryMapper;
    @Override
    public List<Map<String, Object>> selectCategory(int parentId) {
        return app_categoryMapper.selectCategory(parentId);
    }
}
