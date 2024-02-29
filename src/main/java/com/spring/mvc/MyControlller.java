package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
//@RequestMapping("")
public class MyControlller {


    @RequestMapping("/")
    public String a() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails(Model model) {

//        Employee emp = new Employee();
//        emp.setName("Dan");
//        emp.setSurname("Melinte");
//        emp.setSalary(3000);

        model.addAttribute("employee", new Employee());
        return "ask-details";
    }

    @RequestMapping("/showDetails")
    public String showDetails() {
        return "show-details";
    }


//    @RequestMapping("/showEmpDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("txtB1");
//        empName = "Mr." + empName;
//
//        model.addAttribute("nameEmp", empName);
//        return "show-emp-details";
//    }


    @PostMapping( "/showEmpDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp,
                                 BindingResult bindingResult) {

//        emp.setName("aaaa");
//        txtParam = "Mr." + txtParam;
//        String empName = request.getParameter("txtB1");
//        empName = "Mr." + empName;
//        model.addAttribute("nameEmp", txtParam);

        if (bindingResult.hasErrors())
            return "ask-details";
        else
            return "show-emp-details";
    }
}
