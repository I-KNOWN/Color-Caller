package com.themecolor.callerphone.wallpaper.callertheme.categoryui.linearCategory.kpopCategory;



import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.themecolor.callerphone.wallpaper.R;
import com.themecolor.callerphone.wallpaper.callertheme.categoryui.CategoryShowActivity;
import com.themecolor.callerphone.wallpaper.callertheme.categoryui.Images;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class LinearKpopAdapter extends RecyclerView.Adapter<LinearKpopAdapter.ViewHolder> {
    public static final String TAG = "LinearKpopAdapter";
    private Context context;
    private ArrayList<String> arrayList;


    public LinearKpopAdapter(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public LinearKpopAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parse_item_linear, parent, false);
        
        return new LinearKpopAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LinearKpopAdapter.ViewHolder holder, int position) {
        Picasso.get().load(arrayList.get(position)).into(holder.imageView);
        final String temp = arrayList.get(position);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CategoryShowActivity.class);
                ArrayList<String> parcelableList = new ArrayList<>(arrayList);
                intent.putExtra("imageUrl", parcelableList);
                intent.putExtra("position", position);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size()> 5 ? 5 : arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView,correct;
        TextView tvApply;

        public ViewHolder(View itemView/*, RecyclerInterface recyclerInterface*/) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            tvApply = itemView.findViewById(R.id.tv_apply);
            int dimension = (int) itemView.getContext().getResources().getDimension(R.dimen.pa);
            int i = (itemView.getContext().getResources().getDisplayMetrics().widthPixels - (dimension * 3)) / 2;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, (i * 640) / 360);
            layoutParams.addRule(14);
            layoutParams.setMargins(0, dimension, 0, 0);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                }
            });
        }
    }
}
