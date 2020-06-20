package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> carList() {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", 2020, 30000));
        cars.add(new Car("Ford", 2000, 2000));
        cars.add(new Car("Audi", 2010, 20000));
        cars.add(new Car("KIA", 2015, 15000));
        cars.add(new Car("Lada", 2021, 13000));
        cars.add(new Car("GAZ", 2021, 10000));

        return cars;
    }
}
