package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class AttemptInputView {
    private static final String INPUT_GUIDE = "시도할 횟수는 몇 회인가요?";

    public int readAttemptCount() {
        System.out.println(INPUT_GUIDE);
        String line = Console.readLine();
        ensureNotNull(line);
        String trimmed = line.trim();
        ensureNumeric(trimmed);
        return parsePositive(trimmed);
    }

    private void ensureNotNull(final String input) {
        if (input == null) {
            throw new IllegalArgumentException("입력이 null입니다.");
        }
    }

    private void ensureNumeric(final String s) {
        if (s.isEmpty() || !s.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }
    }

    private int parsePositive(final String s) {
        try {
            int value = Integer.parseInt(s);
            if (value < 1) {
                throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
            }
            return value;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("유효한 정수 범위를 벗어났습니다.");
        }
    }
}
