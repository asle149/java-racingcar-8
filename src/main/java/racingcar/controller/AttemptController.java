package racingcar.controller;

import racingcar.model.AttemptCount;
import racingcar.view.AttemptInputView;

public class AttemptController {
    private final AttemptInputView inputView;

    public AttemptController(final AttemptInputView inputView) {
        this.inputView = inputView;
    }

    public AttemptCount collectValidAttemptCount() {
        int count = inputView.readAttemptCount();
        return new AttemptCount(count);
    }
}
