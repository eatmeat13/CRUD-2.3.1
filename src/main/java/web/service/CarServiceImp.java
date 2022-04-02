package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {
    public List<Car> carList = new ArrayList<>();
    @Override
    public List<Car> getCars(Integer count) {
        {
            carList.add(new Car("Audi A7", "Black", 100000));
            carList.add(new Car("Mercedes AMG GTS ", "Grey", 100000));
            carList.add(new Car("Range Rover Velar", "Red", 100000));
            carList.add(new Car("Toyota Camry", "Black", 100000));
            carList.add(new Car("Hyandai Sonata", "Black", 100000));
            carList.add(new Car("Audi A7 2", "Black", 100000));
            carList.add(new Car("Mercedes AMG GTS 2 ", "Grey", 100000));
            carList.add(new Car("Range Rover Velar 2", "Red", 100000));
            carList.add(new Car("Toyota Camry 2", "Black", 100000));
            carList.add(new Car("Hyandai Sonata 2", "Black", 100000));
        }
        if (count < 5) {
            return carList.stream().limit(count).collect(Collectors.toList());
        } else {
            return carList;
        }
    }
}