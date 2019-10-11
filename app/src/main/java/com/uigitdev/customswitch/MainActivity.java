package com.uigitdev.customswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.uigitdev.customswitch.uigitdev.design.CustomSwitch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomSwitch customSwitch = new CustomSwitch(findViewById(R.id.customSwitch));
        customSwitch.setDefault(true);
        customSwitch.getSwitchValue();
    }
}
