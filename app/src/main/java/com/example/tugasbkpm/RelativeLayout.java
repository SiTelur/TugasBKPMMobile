package com.example.tugasbkpm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.ReceiverCallNotAllowedException;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class RelativeLayout extends AppCompatActivity {

        DatePickerDialog datePickerDialog;
    EditText editText;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        editText = findViewById(R.id.editTextDate);
        btn = findViewById(R.id.button2);
        txt = findViewById(R.id.textView);

        editText.setInputType(InputType.TYPE_NULL);

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                int month = calendar.get(Calendar.MONTH);
                int  year = calendar.get(Calendar.YEAR);

                datePickerDialog = new DatePickerDialog(RelativeLayout.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        editText.setText(year + "/" + month + "/" + day);
                    }
                }, year ,month,day);
            datePickerDialog.show();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("Selected Date : "+  editText.getText());
            }
        });

    }
}