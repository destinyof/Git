package com.ck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pagecontroller {

        @RequestMapping("page")
        public String page(String page){
            return page;
        }
}