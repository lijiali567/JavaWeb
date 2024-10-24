package org.example.javawebtest10_23;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bind1")
public class BindController1 {

    @RequestMapping("/submit")
    public String submit() {
        return "submit1";
    }

    @RequestMapping(value = "/getParams", method = RequestMethod.POST)
    public String getParams(Integer age, String gender, String[] hobbies) {
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
        for (int i = 0; i < hobbies.length; i++) {
            System.out.print(hobbies[i] + " ");
        }
        return "success";
    }
}