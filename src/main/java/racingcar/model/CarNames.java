package racingcar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarNames {
    private final List<CarName> values;

    private CarNames(final List<CarName> values) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("최소 1개 이상의 자동차 이름을 입력해야 합니다.");
        }
        this.values = Collections.unmodifiableList(new ArrayList<>(values));
    }

    public static CarNames of(final List<String> rawNames) {
        final List<CarName> list = new ArrayList<>();
        for (final String raw : rawNames) {
            list.add(new CarName(raw));
        }
        return new CarNames(list);
    }

    public List<CarName> values() {
        return values;
    }
}
