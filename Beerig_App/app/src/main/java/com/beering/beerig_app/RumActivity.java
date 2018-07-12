package com.beering.beerig_app;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RumActivity extends AppCompatActivity {

    Bundle savedInstanceState = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rum);



    }

    public void openRumSpritz(View view){
        DialogFragment rumSpritz = new ConfirmDrinkFragment();

        rumSpritz.show(getFragmentManager(), "Rum Spritz");

    }
}
