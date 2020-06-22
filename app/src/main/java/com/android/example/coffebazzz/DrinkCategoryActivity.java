package com.android.example.coffebazzz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.android.example.coffebazzz.databinding.ActivityDrinkCategoryBinding;

public class DrinkCategoryActivity extends AppCompatActivity {
    Intent intent;
    ActivityDrinkCategoryBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(DrinkCategoryActivity.this,R.layout.activity_drink_category);
        intent = getIntent();
        fillSpinner();
        setListenerSpinner();


    }



    private void fillSpinner(){

    ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.spinner_options,android.R.layout.simple_list_item_1);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    binding.spinner.setAdapter(adapter);

    }



    private void setListenerSpinner(){
        binding.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0: setLatteOption();
                    break;
                    case 1: setCappuccinoOption();
                    break;
                    case 2: setFilterOption();
                    break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void setLatteOption() {

        binding.imgCoffee.setImageResource(R.drawable.latte);
        binding.tvCoffeeName.setText(Drink.drinks[0].getName());
        binding.tvCoffeeDescr.setText(Drink.drinks[0].getDescription());

    }
    private void setCappuccinoOption() {
        binding.imgCoffee.setImageResource(R.drawable.cappuccino);
        binding.tvCoffeeName.setText(Drink.drinks[1].getName());
        binding.tvCoffeeDescr.setText(Drink.drinks[1].getDescription());
    }
    private void setFilterOption() {
        binding.imgCoffee.setImageResource(R.drawable.filter);
        binding.tvCoffeeName.setText(Drink.drinks[2].getName());
        binding.tvCoffeeDescr.setText(Drink.drinks[2].getDescription());
    }


}