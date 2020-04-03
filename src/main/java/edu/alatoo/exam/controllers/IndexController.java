package edu.alatoo.exam.controllers;

import edu.alatoo.exam.models.Customer;
import edu.alatoo.exam.models.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/")
    public ModelAndView getMainPage(Model model){
        List<Customer> readingList = customerRepository.findAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("customers", readingList);
        return mav;
    }

    @GetMapping("/add")
    public ModelAndView addCustomer(){
        return new ModelAndView("add");
    }

    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }

    @PostMapping("/add")
    public ModelAndView addCustomerPost(Customer c){
        customerRepository.save(c);
        return new ModelAndView("redirect:/");
    }

}

