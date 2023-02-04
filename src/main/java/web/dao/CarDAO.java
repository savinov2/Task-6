package web.dao;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<Car>();
        cars.add(new Car("Mersedes","222", "Mercedes-Benz"));
        cars.add(new Car("Shaxa","2107", "lada"));
        cars.add(new Car("Mazdochka","rx", "mazda"));
        cars.add(new Car("Starixhok","m5", "bmw"));
        cars.add(new Car("Starixhok","m5", "RR"));
    }

    public List<Car> index(){
        return cars;
    }

}
