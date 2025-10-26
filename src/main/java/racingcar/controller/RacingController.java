package racingcar.controller;

import racingcar.model.AttemptCount;
import racingcar.model.CarNames;
import racingcar.model.Cars;
import racingcar.view.OutputView;

public class RacingController {
    private final OutputView outputView;

    public RacingController(final OutputView outputView) {
        this.outputView = outputView;
    }

    public void run(final CarNames carNames, final AttemptCount attemptCount) {
        Cars cars = Cars.from(carNames);
        outputView.printResultTitle();

        for (int i = 0; i < attemptCount.value(); i++) {
            cars.moveAll();
            outputView.printEachRound(cars);
        }

        outputView.printWinners(cars.findWinners());
    }
}