package springboots.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springboots.service.App_categoryService;

import java.util.List;
import java.util.Map;

/**
 * @Description:App分类的控制器
 * @Date Created in 14:21   2018/4/25
 */

//@Controller
    @RestController
public class App_categoryController {
        @Autowired
        private App_categoryService app_categoryService;

        @RequestMapping("/categorylevellist")
        public String getCategoryLevelList(@RequestParam()String pid){
            List<Map<String,Object>> list = app_categoryService.selectCategory(Integer.parseInt(pid));
            return JSON.toJSONString(list);
        }
}
