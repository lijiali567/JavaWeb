package org.example.javawebtest10_23;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

//    @RequestMapping("/info")
//    public String info(HttpServletRequest request){
//        String username =request.getParameter("username");
//        String age =request.getParameter("age");
//        System.out.println("username:"+username+"age"+age);
//        return "success";
//    }


//        @RequestMapping("/info")
//        public String info(String username,Integer age){
//            System.out.println("username:"+username+"age"+age);
//            return "success";
//        }


//    @RequestMapping("success")
//    public String success(HttpServletRequest request){
//        request.setAttribute("msg","欢迎访问我的页面");
//        return "success_data1";
//    }

    @RequestMapping("/success2")
    public ModelAndView success2(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success_data2");
        User user = new User();
        user.setAge(18);
        user.setUsername("张三");
        mv.addObject("user",user);
        return mv;
    }

    @RequestMapping("/success")
    public String success(Model model){
        model.addAttribute("msg","好好学习，天天向上");
        return "success_data1";
    }

    //当表单名称和入参名称不一致时
    @RequestMapping("/info")
    public String info(@RequestParam("username") String username,
                       @RequestParam("age") Integer year){
        System.out.println("username:"+username+"age"+year);
        return "success";
    }


}

