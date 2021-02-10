package com.example.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.DONE_BTN).setOnClickListener(view -> addNickName(view));
    }

    // set the nickname and display the hidden text view
    private void addNickName(View v) {
        EditText editNickNameText = findViewById(R.id.EDIT_NICKNAME_TEXT);
        String nickName = editNickNameText.getText().toString();
        TextView hiddenNickNameTextView = findViewById(R.id.HIDDEN_NICKNAME);

        hiddenNickNameTextView.setText(nickName);
        hiddenNickNameTextView.setVisibility(v.VISIBLE);
    }
}