package racingcar;

import racingcar.controller.NameController;
import racingcar.model.CarNames;
import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {
        final NameController nameController = new NameController(new InputView());
        final CarNames carNames = nameController.collectValidCarNames();


    }
}
