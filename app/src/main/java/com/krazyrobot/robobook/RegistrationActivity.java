package com.krazyrobot.robobook;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Calendar;

import static java.util.Calendar.*;


@SuppressWarnings("ALL")
public class RegistrationActivity extends ActionBarActivity {

    private static final int DATE_DIALOG_ID = 3;
    private int year;
    private int month;
    private int day;
    private TextView dob;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        getActionBar().hide();

        dob = (TextView) findViewById(R.id.dob_text);

        final Calendar calendar = getInstance();
        year = calendar.get(YEAR);
        month = calendar.get(MONTH);
        day = calendar.get(DAY_OF_MONTH);
        // set selected date into textview
        dob.setText(new StringBuilder().append(day + 1)
                .append("-").append(month).append("-").append(year)
                .append(" "));

        dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DATE_DIALOG_ID);
            }
        });

        Button submit_button = (Button) findViewById(R.id.submit_button);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this, FollowRobotsActivity.class));
            }
        });

    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_DIALOG_ID:
                // set date picker as current date
                return new DatePickerDialog(this, datePickerListener, year, month,
                        day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {

        // when dialog box is closed, below method will be called.
        public void onDateSet(DatePicker view, int selectedYear,
                              int selectedMonth, int selectedDay) {
            year = selectedYear;
            month = selectedMonth;
            day = selectedDay;

            // set selected date into textview
            dob.setText(new StringBuilder().append(day + 1)
                    .append("-").append(month).append("-").append(year)
                    .append(" "));

        }
    };

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_male:
                if (checked)
                    break;
            case R.id.radio_female:
                if (checked)
                    break;
        }
    }

}
