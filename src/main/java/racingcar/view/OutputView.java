package racingcar.view;

import java.util.stream.Collectors;
import racingcar.model.Car;
import racingcar.model.Cars;

public class OutputView {
    public void printResultTitle() {
        System.out.println();
        System.out.println("실행 결과");
    }

    public void printEachRound(final Cars cars) {
        for (Car car : cars.values()) {
            String track = "-".repeat(car.position());
            System.out.printf("%s : %s%n", car.name().value(), track);
        }
        System.out.println();
    }
}
