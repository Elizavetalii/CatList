package com.example.catlist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.catlist.CatBreed;
import com.example.catlist.CatDetailActivity;
import com.example.catlist.R;

import java.util.List;

public class CatBreedAdapter extends RecyclerView.Adapter<CatBreedAdapter.ViewHolder> {
    private Context context;
    private List<CatBreed> catBreeds;

    public CatBreedAdapter(Context context, List<CatBreed> catBreeds) {
        this.context = context;
        this.catBreeds = catBreeds;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_cat_breed, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CatBreed catBreed = catBreeds.get(position);
        holder.tvCatBreedName.setText(catBreed.getName());
        holder.tvCatBreedDescription.setText(catBreed.getDescription());
        holder.imgCatBreed.setImageResource(catBreed.getImageResId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, CatDetailActivity.class);
            intent.putExtra("breed_name", catBreed.getName());
            intent.putExtra("breed_description", catBreed.getDescription());
            intent.putExtra("breed_image", catBreed.getImageResId()); // Передаем ID изображения
            intent.putExtra("breed_habits", catBreed.getHabits()); // Передаем привычки
            intent.putExtra("breed_history", catBreed.getHistory()); // Передаем историю
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return catBreeds.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvCatBreedName;
        TextView tvCatBreedDescription;
        ImageView imgCatBreed;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCatBreedName = itemView.findViewById(R.id.tvCatBreedName);
            tvCatBreedDescription = itemView.findViewById(R.id.tvCatBreedDescription);
            imgCatBreed = itemView.findViewById(R.id.imgCatBreed);
        }
    }
}