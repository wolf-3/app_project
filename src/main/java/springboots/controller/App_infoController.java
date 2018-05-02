package springboots.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springboots.service.App_categoryService;
import springboots.service.App_infoService;
import springboots.service.Data_dictionaryService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
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

    @Autowired
    private Data_dictionaryService data_dictionaryService;

    @Autowired
    private App_categoryService app_categoryService;

    @RequestMapping("/backapplist.html")
    public String backEndAppList(@RequestParam(required = false)String querySoftwareName,
                                 @RequestParam(required = false)String queryFlatformId,
                                 @RequestParam(required = false)String queryCategoryLevel1,
                                 @RequestParam(required = false)String queryCategoryLevel2,
                                 @RequestParam(required = false)String queryCategoryLevel3,
                                 @RequestParam(required = false)String pageIndex,
                                 HttpServletRequest httpServletRequest
                                ){
        int pageSize = 5;
        if(querySoftwareName == null || querySoftwareName == ""){
            querySoftwareName = "";
        }
        if(queryFlatformId == null || queryFlatformId == ""){
            queryFlatformId = "0";
        }
        if(queryCategoryLevel1 == null || queryCategoryLevel1 == ""){
            queryCategoryLevel1 = "0";
        }
        if(queryCategoryLevel2 == null || queryCategoryLevel2 == ""){
            queryCategoryLevel2 = "0";
        }
        if(queryCategoryLevel3 == null || queryCategoryLevel3 == ""){
            queryCategoryLevel3 = "0";
        }
        if(pageIndex == null || pageIndex == ""){
            pageIndex = "1";
        }
        List<Map<String,Object>> list = app_infoService.selectPartInfo(querySoftwareName,Integer.parseInt(queryFlatformId),Integer.parseInt(queryCategoryLevel1),Integer.parseInt(queryCategoryLevel2),Integer.parseInt(queryCategoryLevel3),(Integer.parseInt(pageIndex)-1)*pageSize,pageSize);

        int totalCount = app_infoService.infoCount(querySoftwareName,Integer.parseInt(queryFlatformId),Integer.parseInt(queryCategoryLevel1),Integer.parseInt(queryCategoryLevel2),Integer.parseInt(queryCategoryLevel3));//数据总数

        int totalPageCount = totalCount % pageSize == 0?totalCount / pageSize :totalCount / pageSize +1;

        //获取所属平台
        List<Map<String,Object>> app_flatform = data_dictionaryService.selectValueName("APP_FLATFORM");

        //查找一级分类
        List<Map<String,Object>> categoryLevel1List = app_categoryService.selectCategory(0);
        //查找二级分类
        List<Map<String,Object>> categoryLevel2List = new ArrayList<>();
        if(queryCategoryLevel1 != "0"){
            categoryLevel2List = app_categoryService.selectCategory(Integer.parseInt(queryCategoryLevel1));
        }
        //查找三级分类
        List<Map<String,Object>> categoryLevel3List = new ArrayList<>();
        if(queryCategoryLevel2 != "0") {
            categoryLevel3List = app_categoryService.selectCategory(Integer.parseInt(queryCategoryLevel2));
        }

        httpServletRequest.setAttribute("querySoftwareName",querySoftwareName);
        httpServletRequest.setAttribute("queryFlatformId",Integer.parseInt(queryFlatformId));
        httpServletRequest.setAttribute("queryCategoryLevel1",Integer.parseInt(queryCategoryLevel1));
        httpServletRequest.setAttribute("queryCategoryLevel2",Integer.parseInt(queryCategoryLevel2));
        httpServletRequest.setAttribute("queryCategoryLevel3",Integer.parseInt(queryCategoryLevel3));

        httpServletRequest.setAttribute("infoList",list);
        httpServletRequest.setAttribute("flatFormList",app_flatform);
        httpServletRequest.setAttribute("categoryLevel1List",categoryLevel1List);
        httpServletRequest.setAttribute("categoryLevel2List",categoryLevel2List);
        httpServletRequest.setAttribute("categoryLevel3List",categoryLevel3List);


        httpServletRequest.setAttribute("totalCount",totalCount);
        httpServletRequest.setAttribute("currentPageNo",Integer.parseInt(pageIndex));
        httpServletRequest.setAttribute("totalPageCount",totalPageCount);


        return "backend/applist";
    }

    @RequestMapping("/appcheck.html")
    public String appCheck(@RequestParam()String aid,HttpServletRequest httpServletRequest){
        Map<String,Object> map  = app_infoService.selectAppInfo(Integer.parseInt(aid));
        httpServletRequest.setAttribute("appInfoMap",map);
        return "backend/appcheck";
    }

    @RequestMapping("/changestatus")
    @ResponseBody
    public String changeStatus(@RequestParam()String status,@RequestParam()String id){
        String info = "";
        if(app_infoService.chageStatus(Integer.parseInt(status),Integer.parseInt(id))){
            if("2".equals(status)){
                info = "审核通过";
            }else if("3".equals(status)){
                info = "审核未通过";
            }
        }
        return "{\"info\":\""+info+"\"}";
    }

}
