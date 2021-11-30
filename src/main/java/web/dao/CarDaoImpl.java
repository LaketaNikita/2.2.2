package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarDaoImpl implements CarDao{
    public static List<Car> list;

    static {
        list = new ArrayList<>();


        list.add(new Car("Ferrari", 4313, "$100"));
        list.add(new Car("RollsRoyce", 78654, "$150"));
        list.add(new Car("BMW", 3452, "$200"));
        list.add(new Car("Mercedes", 555, "$200"));
        list.add(new Car("Lada", 14, "$200000"));
    }
    public CarDaoImpl() {
    }
    @Override
    public List<Car> getListCar(List<Car> list, int count) {
        if (count >= 5 || count == 0) return list;
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
