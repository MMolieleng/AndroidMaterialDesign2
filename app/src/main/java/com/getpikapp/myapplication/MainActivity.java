package com.getpikapp.myapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomAppBar bottomAppBar = findViewById(R.id.bottom_bar);
        setSupportActionBar(bottomAppBar);

        Chip chip = findViewById(R.id.android_chip);
        chip.setOnClickListener(e-> Toast.makeText(this, "hello World", Toast.LENGTH_SHORT).show());

        Chip windowsChip = findViewById(R.id.windows_chip);
        windowsChip.setOnClickListener(e-> Toast.makeText(this, "Windows World", Toast.LENGTH_SHORT).show());

        //ChipGroup chipGroup = findViewById(R.id.chip_group1);
        //Toast.makeText(this, "Checked : "+chipGroup.getCheckedChipId(), Toast.LENGTH_SHORT).show();
        //chipGroup.setOnCheckedChangeListener((group, checkedId) -> {
        //
        //    Toast.makeText(this, "Checked ", Toast.LENGTH_SHORT).show();
        //    if (checkedId == R.id.android_chip) {
        //        Toast.makeText(MainActivity.this, "Android Clicked", Toast.LENGTH_SHORT).show();
        //    }
        //    if (checkedId == R.id.windows_chip) {
        //        Toast.makeText(MainActivity.this, "Windows Clicked", Toast.LENGTH_SHORT).show();
        //    }
        //    if (checkedId == R.id.travel_chip) {
        //        Toast.makeText(MainActivity.this, "Travel Clicked", Toast.LENGTH_SHORT).show();
        //    } else {
        //        Toast.makeText(this, "Something is  not right", Toast.LENGTH_SHORT).show();
        //    }
        //});


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.settings) {
            Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.add) {
            Toast.makeText(this, "Adding", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
