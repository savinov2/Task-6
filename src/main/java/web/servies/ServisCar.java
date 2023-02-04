package web.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServisCar {
    @Autowired
    private CarDAO carDAO;
    public List<Car> countCar(Integer count) {
        List<Car> car = carDAO.index();
        List<Car> result = new ArrayList<Car>();
        if(count != null && count> 0  && car.size() > count ){
            for(int i = 0; i < count; i++){
                result.add(car.get(i));
            }
        }else{
            return car;
        }
        return result;
    }
}
