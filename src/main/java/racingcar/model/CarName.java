package racingcar.model;

import java.util.Objects;

public class CarName {
    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 5;

    private final String value;

    public CarName(final String value) {
        String trimmed = Objects.requireNonNull(value, "이름은 null일 수 없습니다.").trim();
        validateLength(trimmed);
        this.value = trimmed;
    }

    private void validateLength(final String name) {
        int length = name.length();
        if (length < MIN_LENGTH || length > MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 1~5자여야 합니다: " + name);
        }
    }

    public String value() {
        return value;
    }
}
