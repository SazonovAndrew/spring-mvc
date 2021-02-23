package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import web.Service.CarService;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping
    public void getCar(){

    }
}
