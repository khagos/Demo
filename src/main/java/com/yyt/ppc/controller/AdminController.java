package com.yyt.ppc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by kibrom on 6/27/16.
 */
@Controller
@RequestMapping({"/admin"})
public class AdminController {

    public ModelAndView home(){
        return new ModelAndView("/home");
    }
}
