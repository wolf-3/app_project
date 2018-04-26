package springboots.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springboots.service.App_infoService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:App具体信息实体类
 * @Date Created in 14:21   2018/4/25
 */
@Controller
public class App_infoController {
    @Autowired
    private App_infoService app_infoService;

    @RequestMapping("/hhh.html")
    public void selectAllInfo(){
        List<Map<String,Object>> list = app_infoService.selectPartInfo();
        System.out.print(list.size());
    }



}
