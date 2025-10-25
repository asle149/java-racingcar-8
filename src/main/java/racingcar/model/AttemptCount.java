package racingcar.model;

public class AttemptCount {
    private static final int MIN = 1;

    private final int value;

    public AttemptCount(final int value) {
        if (value < MIN) {
            throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
        }
        this.value = value;
    }

    public int value() {
        return value;
    }
}
