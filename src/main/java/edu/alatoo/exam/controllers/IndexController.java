package edu.alatoo.exam.controllers;

import edu.alatoo.exam.models.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/")
    public String getMainPage(Model model){
        model.addAttribute("customers", customerRepository.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String addCustomer(){
        return "add";
    }

    @PostMapping("/add")
    public String addCustomerPost(){
        return "hello";
    }
}

