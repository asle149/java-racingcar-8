package racingcar.model;

import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class Cars {
    private final List<Car> cars;

    private Cars(final List<Car> cars) {
        this.cars = List.copyOf(cars);
    }

    public static Cars from(final CarNames carNames) {
        return new Cars(
                carNames.values().stream()
                        .map(Car::new)
                        .toList()
        );
    }

    public void moveAll() {
        for (Car car : cars) {
            int random = Randoms.pickNumberInRange(0, 9);
            car.move(random);
        }
    }

    public List<Car> values() {
        return cars;
    }
}