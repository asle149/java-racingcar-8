package racingcar.controller;

import java.util.List;
import racingcar.model.CarNames;
import racingcar.view.InputView;

public class NameController {
    private final InputView inputView;

    public NameController(final InputView inputView) {
        this.inputView = inputView;
    }

    public CarNames collectValidCarNames() {
        final List<String> rawNames = inputView.readCarNames();
        return CarNames.of(rawNames);
    }
}
