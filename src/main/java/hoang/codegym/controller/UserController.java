package hoang.codegym.controller;

import hoang.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("/login")
    public ModelAndView formLogin(){
        ModelAndView mav = new ModelAndView("/login");
        mav.addObject("user", new User());
        return mav;

    }
    @GetMapping("/board")
        public ModelAndView boarPage(){
        ModelAndView mav = new ModelAndView("/board");
           return mav;
    }
}
