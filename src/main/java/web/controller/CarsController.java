package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarsController {
    @GetMapping("/cars")
    public String carsCount(@RequestParam(value = "count", defaultValue = "5") int value, Model model) {
        List<Car> carList = new ArrayList<>();
        carList = CarService.getCarsList(carList, value);
        model.addAttribute("message", carList);
        return "car";
    }
}
