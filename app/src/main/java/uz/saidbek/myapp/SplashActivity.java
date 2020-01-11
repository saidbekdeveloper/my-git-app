package uz.saidbek.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceStat) {
        super.onCreate(savedInstanceStat);
        Intent intent = new Intent(this, LoginActivity.class);
        Log.d("Splash Activity", "onCreate ");
        startActivity(intent);
    }



}
