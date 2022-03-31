package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;
import java.util.Optional;

@Controller
public class CarController {


    @GetMapping("/cars")
    public String printCars(@RequestParam(defaultValue="5") Integer count, ModelMap model) {
        CarServiceImp carsServiceImpl = new CarServiceImp();
        List<Car> qtyCars = carsServiceImpl.getCars(count);
        model.addAttribute("cars", qtyCars);
        return "cars";
    }
}

