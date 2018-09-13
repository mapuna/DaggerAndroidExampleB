package org.mapuna.daggerandroid.ui;

import org.mapuna.daggerandroid.inject.SomeInput;

import javax.inject.Inject;

public class OutputPresenter {

    private final OutputActivity activity;
    private final String inputText;

    @Inject
    OutputPresenter(OutputActivity activity, @SomeInput String inputText) {
        this.activity = activity;
        this.inputText = inputText;
    }

    public void onStart() {
        activity.showText(inputText);
    }
}
