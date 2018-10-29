package com.anggitprayogo.dicoding.learnespresso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edtText;
    Button btnChangeText, btnSwitchActivity;
    TextView tvPrintedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Learn Espresso");
        edtText = (EditText)findViewById(R.id.et_text);
        btnChangeText = (Button)findViewById(R.id.btn_change_text);
        btnSwitchActivity = (Button)findViewById(R.id.btn_swicth_activity);
        tvPrintedText = (TextView)findViewById(R.id.tv_hasil);
        btnChangeText.setOnClickListener(this);
        btnSwitchActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_change_text:
                edtText.setText("HELLO");
                String input = edtText.getText().toString().trim();
                tvPrintedText.setText(input);
                break;
            case R.id.btn_swicth_activity:
                String text = edtText.getText().toString().trim();
                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra(SecondActivity.EXTRA_INPUT, text);
                startActivity(intent);
                break;
        }
    }
}
