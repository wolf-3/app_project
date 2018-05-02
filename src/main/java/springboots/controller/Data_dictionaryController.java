package springboots.controller;

import org.springframework.web.bind.annotation.RestController;
import springboots.service.Data_dictionaryService;

import javax.annotation.Resource;

/**
 * @Description:数据字典d控制器
 * @Date Created in 14:24   2018/4/25
 */

//@Controller
@RestController
public class Data_dictionaryController {

        @Resource
        private Data_dictionaryService data_dictionaryService;

}
