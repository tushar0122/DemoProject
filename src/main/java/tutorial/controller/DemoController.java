package tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("users")
    @ResponseBody
    public String getUsers(){
        String s = "Tushar Agrawal";
        System.out.println(s);
        return s;
    }
}
