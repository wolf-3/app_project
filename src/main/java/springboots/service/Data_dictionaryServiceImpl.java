package springboots.service;

import org.springframework.stereotype.Service;
import springboots.mapper.Data_dictionaryMapper;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Description:数据字典的业务逻辑层实现Impl
 * @Author sxw
 * @Date Created in 14:14   2018/4/25
 */
@Service
public class Data_dictionaryServiceImpl implements  Data_dictionaryService {

    @Resource
    private Data_dictionaryMapper data_dictionaryMapper;

    @Override
    public List<Map<String, Object>> selectValueName(String typeCode) {
        return data_dictionaryMapper.selectValueName(typeCode);
    }
}
