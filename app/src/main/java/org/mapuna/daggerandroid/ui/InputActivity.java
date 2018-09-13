package org.mapuna.daggerandroid.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.EditText;

import org.mapuna.daggerandroid.R;

import static org.mapuna.daggerandroid.inject.modules.BundleModule.EXTRA_SOME_INPUT;

public class InputActivity extends BaseAppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        final EditText editText = findViewById(R.id.edit_text);
        findViewById(R.id.enter_button).setOnClickListener(
                v -> {
                    Intent intent = new Intent(InputActivity.this, OutputActivity.class);
                    intent.putExtra(EXTRA_SOME_INPUT, editText.getText().toString());
                    InputActivity.this.startActivity(intent);
                }
        );
    }
}
