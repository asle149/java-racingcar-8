package racingcar;

import racingcar.controller.NameController;
import racingcar.model.CarNames;
import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {
        NameController nameController = new NameController(new InputView());
        CarNames carNames = nameController.collectValidCarNames();

    }
}
