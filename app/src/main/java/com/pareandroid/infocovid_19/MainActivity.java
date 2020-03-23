package com.pareandroid.infocovid_19;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.text.format.DateFormat;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pareandroid.infocovid_19.Fragment.FragmentDaerahIdn;

//import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements  BottomNavigationView.OnNavigationItemSelectedListener {
    TextView tvtoday;
    String hariini;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvtoday = findViewById(R.id.tvDate);
        Date date = Calendar.getInstance().getTime();
        hariini = (String) DateFormat.format("EEEE",date);

        FragmentDaerahIdn fragmentDaerahIdn = new FragmentDaerahIdn();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.flMain,fragmentDaerahIdn)
                .commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        hari();
    }

    public void hari(){
        Date date = Calendar.getInstance().getTime();
        String tanggal = (String) DateFormat.format("d MMM yyy",date);
        String formatfix = hariini + " , " + tanggal;
        tvtoday.setText(formatfix);
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.summaryMenu:
                Toast.makeText(MainActivity.this,"Lagi Pengembagan Cess..",Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }

    public void onErrorLoading(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }
}
