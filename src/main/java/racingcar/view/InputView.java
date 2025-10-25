package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class InputView {
    private static final String INPUT_GUIDE =
            "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    public List<String> readCarNames() {
        System.out.println(INPUT_GUIDE);
        final String line = Console.readLine();
        final List<String> tokens = splitByComma(line);
        ensureNoEmpty(tokens);
        return tokens;
    }

    private List<String> splitByComma(final String line) {
        if (line == null) {
            throw new IllegalArgumentException("입력이 null 입니다.");
        }
        final String[] parts = line.split(",", -1);
        final List<String> result = new ArrayList<>(parts.length);
        for (final String p : parts) {
            result.add(p);
        }
        return result;
    }

    private void ensureNoEmpty(final List<String> tokens) {
        for (final String t : tokens) {
            if (t == null || t.trim().isEmpty()) {
                throw new IllegalArgumentException("빈 이름은 허용되지 않습니다.");
            }
        }
    }
}
