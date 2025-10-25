package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class InputView {
    private static final String INPUT_GUIDE =
            "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    public List<String> readCarNames() {
        System.out.println(INPUT_GUIDE);
        String line = Console.readLine();
        ensureNotNull(line);
        List<String> names = Arrays.stream(line.split(",", -1)).toList();
        ensureNoEmpty(names);
        return names;
    }

    private void ensureNotNull(final String input) {
        if (input == null) {
            throw new IllegalArgumentException("입력이 null입니다.");
        }
    }

    private void ensureNoEmpty(final List<String> names) {
        for (String name : names) {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("빈 이름은 허용되지 않습니다.");
            }
        }
    }
}
