package racingcar.model;

import java.util.List;

public final class WinnerFinder {
    private WinnerFinder() {
    }

    public static List<Car> findWinners(final List<Car> cars) {
        int maxPosition = cars.stream()
                .mapToInt(Car::position)
                .max()
                .orElse(0);

        return cars.stream()
                .filter(car -> car.position() == maxPosition)
                .toList();
    }
}