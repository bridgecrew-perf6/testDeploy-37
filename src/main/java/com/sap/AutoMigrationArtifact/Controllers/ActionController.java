/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sap.AutoMigrationArtifact.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ar_ma
 */
@Controller
public class ActionController {
    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String test(){
        System.out.println("open this");
//        action.masterEmployee();
//        action.customer();
//        action.salesOrder();
        return "index";
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        System.out.println("hello world");
//        action.masterEmployee();
//        action.customer();
//        action.salesOrder();
        return "index";
    }
}
