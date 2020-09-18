package web.servise;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;


public class ServiseCar {
    public static List<Car> getCars() {
        List<Car> cars = new ArrayList<>();

        Car auto1 = new Car("Audi", 7, "black");
        Car auto2 = new Car("Mercedes", 9, "black");
        Car auto3 = new Car("Porsche", 6, "white");

        cars.add(auto1);
        cars.add(auto2);
        cars.add(auto3);

        return cars;
    }
}
