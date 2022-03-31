package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCars(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Audi A7", "Black", 100000));
            carList.add(new Car("Mercedes AMG GTS ", "Grey", 100000));
            carList.add(new Car("Range Rover Velar", "Red", 100000));
            carList.add(new Car("Toyota Camry", "Black", 100000));
            carList.add(new Car("Hyandai Sonata", "Black", 100000));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}