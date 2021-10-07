package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Infinity QX50", "Blue", "53333$"));
        carList.add(new Car("Mercedes GLS400d", "Black", "141200$"));
        carList.add(new Car("Audi TT", "Yellow", "36600$"));
        carList.add(new Car("Genesis GV70", "Red", "66700$"));
        carList.add(new Car("Skoda Octavia", "White", "26650$"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
