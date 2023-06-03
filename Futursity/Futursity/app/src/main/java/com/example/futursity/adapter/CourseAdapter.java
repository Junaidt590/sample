package com.example.futursity.adapter;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.futursity.R;
import com.example.futursity.model.courses.CourseData;
import com.google.android.material.card.MaterialCardView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    private final List<CourseData> dataList;
    private Context context;

    public CourseAdapter(List<CourseData> dataList, Context context){
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_course, parent, false);
        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CourseViewHolder holder, int position) {
        holder.tvCourseName.setText(dataList.get(position).getTitle());
        holder.tvAmount.setText(dataList.get(position).getPrice());
        Picasso.get().load(
                dataList.get(position).getThumbnail()
        ).into(holder.imgCourse);

        holder.rootCard.getLayoutParams().width = getScreenWidth(context)/2;
    }

    public static int getScreenWidth(Context context) {
        WindowManager wm= (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class CourseViewHolder extends RecyclerView.ViewHolder {

        TextView tvCourseName, tvAmount;
        ImageView imgCourse;
        MaterialCardView rootCard;

        CourseViewHolder(View itemView) {
            super(itemView);
            imgCourse = itemView.findViewById(R.id.imgCourse);
            tvAmount = itemView.findViewById(R.id.tvAmount);
            tvCourseName = itemView.findViewById(R.id.tvCourseName);
            rootCard = itemView.findViewById(R.id.rootCard);
        }
    }
}
