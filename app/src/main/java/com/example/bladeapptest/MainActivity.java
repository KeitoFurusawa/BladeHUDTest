package com.example.bladeapptest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.vuzix.hud.actionmenu.ActionMenuActivity;
//追加分↓
import android.view.MenuItem;
import android.view.Menu;
import android.widget.TextView;
import android.app.Activity;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}