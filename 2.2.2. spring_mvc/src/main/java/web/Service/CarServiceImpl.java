package web.Service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{

    private long COUNT;
    private List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car(++COUNT, "LADA", 2021, 11000));
        carList.add(new Car(++COUNT, "GAZ", 2010, 5000));
        carList.add(new Car(++COUNT, "PAZ", 2015, 6000));
        carList.add(new Car(++COUNT, "UAZ", 2021, 9000));
        carList.add(new Car(++COUNT, "AURUS", 2021, 40000));
        carList.add(new Car(++COUNT, "YO-MOBILE", 2009, 7000));
    }
    public List<Car> getCarList(long count){
        if(count >= 5){
            return carList;
        }
        return carList.stream()
                .filter(c -> c.getId() <= count)
                .collect(Collectors.toList());
    }
}
