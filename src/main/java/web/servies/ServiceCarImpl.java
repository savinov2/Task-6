package web.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceCarImpl implements ServiceCar {
    @Autowired
    private CarDAOImpl carDAOImpl;
    @Override
    public List<Car> countCar(Integer count) {
        List<Car> car = carDAOImpl.index();
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
