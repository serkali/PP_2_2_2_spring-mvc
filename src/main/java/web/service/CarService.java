package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    public static List<Car> getCarsList(List<Car> carList, int count) {
        carList.add(new Car("Red", 5, "BMW"));
        carList.add(new Car("Blue", 4, "KIA"));
        carList.add(new Car("BLACK", 3, "RENAULT"));
        carList.add(new Car("Yellow", 2, "Hyundai"));
        carList.add(new Car("Gray", 1, "Lada"));
        if (count == 0 || count > 5 || count < 0) return carList;
        return carList.stream().limit(count).collect(Collectors.toList());

    }
}