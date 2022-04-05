package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    public static List<Car> getCarsList(List<Car> carList, int count) {
        if (count == 0 || count > 5) return carList;
        return carList.stream().limit(count).collect(Collectors.toList());

    }
}