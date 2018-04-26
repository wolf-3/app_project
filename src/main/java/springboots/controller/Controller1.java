package springboots.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

//@Controller木子李
@RestController
public class Controller1 {

    @RequestMapping("/hello")
    public String test01(){
        System.out.println("李小峰");
        return "test";
    }


}
