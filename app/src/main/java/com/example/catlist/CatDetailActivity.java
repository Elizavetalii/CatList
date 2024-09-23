package com.example.catlist;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.catlist.R;

public class CatDetailActivity extends AppCompatActivity {
    private TextView tvBreedName;
    private TextView tvBreedDescription;
    private TextView tvBreedHabits; // Новое поле
    private TextView tvBreedHistory; // Новое поле
    private ImageView imgBreed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_detail);

        tvBreedName = findViewById(R.id.tvBreedName);
        tvBreedDescription = findViewById(R.id.tvBreedDescription);
        tvBreedHabits = findViewById(R.id.tvBreedHabits); // Инициализация
        tvBreedHistory = findViewById(R.id.tvBreedHistory); // Инициализация
        imgBreed = findViewById(R.id.imgBreed);

        String breedName = getIntent().getStringExtra("breed_name");
        String breedDescription = getIntent().getStringExtra("breed_description");
        int breedImageResId = getIntent().getIntExtra("breed_image", -1);
        String breedHabits = getIntent().getStringExtra("breed_habits"); // Получаем привычки
        String breedHistory = getIntent().getStringExtra("breed_history"); // Получаем историю

        tvBreedName.setText(breedName);
        tvBreedDescription.setText(breedDescription);
        tvBreedHabits.setText("Привычки: " + breedHabits); // Устанавливаем привычки
        tvBreedHistory.setText("История: " + breedHistory); // Устанавливаем историю
        imgBreed.setImageResource(breedImageResId);
    }
}