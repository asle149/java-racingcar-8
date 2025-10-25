package racingcar.model;

import java.util.List;

public class CarNames {
    private final List<CarName> values;

    private CarNames(final List<CarName> values) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("최소 1개 이상의 자동차 이름을 입력해야 합니다.");
        }
        this.values = List.copyOf(values);
    }

    public static CarNames of(final List<String> rawNames) {
        return new CarNames(
                rawNames.stream()
                        .map(CarName::new)
                        .toList()
        );
    }

    public List<CarName> values() {
        return values;
    }
}
