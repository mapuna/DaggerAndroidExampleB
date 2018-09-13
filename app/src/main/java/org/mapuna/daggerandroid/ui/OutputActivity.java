package org.mapuna.daggerandroid.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import org.mapuna.daggerandroid.R;

import javax.inject.Inject;

public class OutputActivity extends BaseAppCompatActivity {
    @Inject OutputPresenter outputPresenter;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        textView = findViewById(R.id.text_view);
    }

    @Override
    protected void onStart() {
        super.onStart();
        outputPresenter.onStart();
    }

    public void showText(String text) {
        textView.setText(text);
    }
}
