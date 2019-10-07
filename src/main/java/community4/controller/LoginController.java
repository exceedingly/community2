package community4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by MaoChenDong on 2019/10/7.
 */
@Controller
public class LoginController {

    @GetMapping("/")
    public String LoginController(){
        return "login";
    }
}
