package com.example.foodguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.foodguideapp.CustomAdapter;
import com.example.foodguideapp.R;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    int[] pic = {R.drawable.beans_and_plantain, R.drawable.egusi_soup, R.drawable.fried_rice, R.drawable.jollof_rice, R.drawable.jollof_spag, R.drawable.moi_moi, R.drawable.okro_soup, R.drawable.pepper_soup, R.drawable.pepper_stew, R.drawable.vegetable_soup};
    String[] foodNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foodNames = getResources().getStringArray(R.array.food);
        gridView = (GridView) findViewById(R.id.gridViewId);

        CustomAdapter adapter = new CustomAdapter(this, foodNames, pic);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                if (i==0){
                    Intent intent= new Intent(MainActivity.this,NewActivity.class);
                    startActivity(intent);
                }
                if (i==1) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
                if (i==2) {
                    Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                    startActivity(intent);
                }
                if (i==3) {
                    Intent intent = new Intent(MainActivity.this, FouthActivity.class);
                    startActivity(intent);
                }

                if (i==4) {
                    Intent intent = new Intent(MainActivity.this, FifthActivity.class);
                    startActivity(intent);

                }

                if (i==5) {
                    Intent intent = new Intent(MainActivity.this, SixthActivity.class);
                    startActivity(intent);
                }

                if (i==6) {
                    Intent intent = new Intent(MainActivity.this, SeventhActivity.class);
                    startActivity(intent);
                }

                if (i==7) {
                    Intent intent = new Intent(MainActivity.this, EighthActivity.class);
                    startActivity(intent);
                }

                if (i==8) {
                    Intent intent = new Intent(MainActivity.this, NinethActivity.class);
                    startActivity(intent);
                }

                if (i==9) {
                    Intent intent = new Intent(MainActivity.this, TenthActivity.class);
                    startActivity(intent);




                }   }
        });


    }



}