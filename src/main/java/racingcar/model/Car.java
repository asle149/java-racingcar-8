package racingcar.model;

public class Car {
    private final CarName name;
    private int position = 0;

    public Car(final CarName name) {
        this.name = name;
    }

    public void move(final int number) {
        if (RaceRule.canMove(number)) {
            position++;
        }
    }

    public CarName name() {
        return name;
    }

    public int position() {
        return position;
    }
}
