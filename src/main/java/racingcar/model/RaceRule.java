package racingcar.model;

public final class RaceRule {
    private static final int MOVE_THRESHOLD = 4;

    private RaceRule() {
    }

    public static boolean canMove(final int randomNumber) {
        return randomNumber >= MOVE_THRESHOLD;
    }
}
