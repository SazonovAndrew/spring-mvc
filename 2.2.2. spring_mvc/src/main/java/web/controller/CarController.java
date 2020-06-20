package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {


    private CarService carService;

    @Autowired
    private void setCarService(CarService carService){
        this.carService = carService;
    }


    @GetMapping(value = "/cars")
    public String printWelcome(HttpServletRequest request, ModelMap model) {
        String count = request.getParameter("count");

        List<Car> carMessages;
        if(count == null || Long.parseLong(count) >= 5){
             carMessages = carService.carList();
        }else{
            carMessages = carService.carList()
                    .stream()
                    .limit(Long.parseLong(count))
                    .collect(Collectors.toList());
        }
        model.addAttribute("carMessages", carMessages);
        return "cars";
    }
}
