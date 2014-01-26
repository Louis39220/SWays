package com.controller;

import com.entities.Mcq;
import com.service.McqService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller("gameController")
@RequestMapping(value ="/user/games")
public class GameController 
{
    @Autowired
    private UserService userService;
    
    @Autowired
    private McqService mcqService;
    
    @RequestMapping(value = "/qcm", method = RequestMethod.GET)
    public ModelAndView qcm() 
    {
        Mcq mcq = new Mcq();
        mcq = mcqService.generateMcq(1);
        ModelAndView mav = new ModelAndView();
        return mav;
    }
    
    @RequestMapping(value = "/qcm", method = RequestMethod.POST)
    public String qcmCheck() 
    {
        return "user/games/qcm";
    }
}
