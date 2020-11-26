package com.example.covid_19;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private int positionCountry;

    TextView tvCountry,tvCases,tvTodayCases,tvTodayDeaths,tvRecovered,tvActive,tvCritical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent=getIntent();
        positionCountry=intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of "+Affectedcountries.countryModelList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        tvCases=findViewById(R.id.tvCases);
        tvCountry=findViewById(R.id.tvcountry);
        tvTodayCases=findViewById(R.id.tvTodayCases);
        tvTodayDeaths=findViewById(R.id.tvTotalDeaths);
        tvRecovered=findViewById(R.id.tvRecovered);
        tvActive=findViewById(R.id.tvActive);
        tvCritical=findViewById(R.id.tvCritical);

        tvCountry.setText(Affectedcountries.countryModelList.get(positionCountry).getCountry());
        tvCases.setText(Affectedcountries.countryModelList.get(positionCountry).getCases());
        tvRecovered.setText(Affectedcountries.countryModelList.get(positionCountry).getRecovered());
        tvCritical.setText(Affectedcountries.countryModelList.get(positionCountry).getCritical());
        tvActive.setText(Affectedcountries.countryModelList.get(positionCountry).getActive());
        tvTodayCases.setText(Affectedcountries.countryModelList.get(positionCountry).getTodayCases());
        tvTodayDeaths.setText(Affectedcountries.countryModelList.get(positionCountry).getTodayDeaths());















    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}