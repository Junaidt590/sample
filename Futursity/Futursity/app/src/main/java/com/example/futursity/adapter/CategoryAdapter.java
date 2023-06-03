package com.example.futursity.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.futursity.R;
import com.example.futursity.model.categories.CategoryData;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private final List<CategoryData> dataList;

    public CategoryAdapter(List<CategoryData> dataList){
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_category, parent, false);
        return new CategoryViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        holder.tvCategoryName.setText(dataList.get(position).getName());
        holder.tvCoursesCount.setText(dataList.get(position).getNumberOfCourses() + " courses");
        Picasso.get().load(
                dataList.get(position).getThumbnail()
        ).into(holder.imgCategory);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {

        TextView tvCategoryName, tvCoursesCount;
        ImageView imgCategory;

        CategoryViewHolder(View itemView) {
            super(itemView);
            imgCategory = itemView.findViewById(R.id.imgCategory);
            tvCategoryName = itemView.findViewById(R.id.tvCategoryName);
            tvCoursesCount = itemView.findViewById(R.id.tvCoursesCount);
        }
    }
}
