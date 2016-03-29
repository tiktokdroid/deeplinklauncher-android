package io.github.tiktokdroid.android.deeplinklauncher;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout mUriTextInputLayout;
    private Button mUriLaunchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUriTextInputLayout = (TextInputLayout) findViewById(R.id.activity_main_uri_text_input_layout);
        mUriLaunchButton = (Button) findViewById(R.id.activity_main_uri_launch_button);

        mUriLaunchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uriString = mUriTextInputLayout.getEditText().getText().toString();
                Uri uri = Uri.parse(uriString);

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
