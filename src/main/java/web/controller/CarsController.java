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
        carList.add(new Car("Red", 5, "BMW"));
        carList.add(new Car("Blue", 4, "KIA"));
        carList.add(new Car("BLACK", 3, "RENAULT"));
        carList.add(new Car("Yellow", 2, "Hyundai"));
        carList.add(new Car("Gray", 1, "Lada"));
        carList = CarService.getCarsList(carList, value);
        model.addAttribute("message", carList);
        return "car";
    }
}
