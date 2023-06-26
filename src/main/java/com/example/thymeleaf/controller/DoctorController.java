package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @GetMapping("/doctor/")
    public String doctor(@RequestParam(value ="number" ,required = false ,defaultValue = "0") int number,
                         @RequestParam(value="name", required = false,defaultValue = "Jhon smith") String name, Model model) {


            Doctor doctor = new Doctor(number, name);
            model.addAttribute("doctor", doctor);

        return "doctor";
    }
}
