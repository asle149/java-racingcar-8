package racingcar;

import racingcar.controller.AttemptController;
import racingcar.controller.NameController;
import racingcar.model.AttemptCount;
import racingcar.model.CarNames;
import racingcar.view.AttemptInputView;
import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {
        NameController nameController = new NameController(new InputView());
        CarNames carNames = nameController.collectValidCarNames();

        AttemptController attemptController = new AttemptController(new AttemptInputView());
        AttemptCount attemptCount = attemptController.collectValidAttemptCount();

    }
}
