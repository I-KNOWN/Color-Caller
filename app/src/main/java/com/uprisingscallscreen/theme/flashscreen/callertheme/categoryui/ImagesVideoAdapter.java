package com.uprisingscallscreen.theme.flashscreen.callertheme.categoryui;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.uprisingscallscreen.theme.flashscreen.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class ImagesVideoAdapter extends RecyclerView.Adapter<ImagesVideoAdapter.ViewHolder> {

    public static final String TAG = "ImagesVideoAdapter";
    private Context context;
    private ArrayList<Images> arrayList;


    public ImagesVideoAdapter(Context context, ArrayList<Images> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ImagesVideoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parse_item_video, parent, false);
        
        return new ImagesVideoAdapter.ViewHolder(view/*,recyclerInterface*/);
    }

    @Override
    public void onBindViewHolder(@NonNull ImagesVideoAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(arrayList.get(position).getUrl()).into(holder.imageView);
        final Images temp = arrayList.get(position);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity activity = getActivityFromView(view);
                if (activity != null) {
                    Intent intent = new Intent(context, CategoryShowVideoActivity.class);
                    ArrayList<? extends Parcelable> parcelableList = new ArrayList<>(arrayList);
                    intent.putParcelableArrayListExtra("imageUrl", parcelableList);
                    intent.putExtra("position", position);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                };


            }
        });
    }
    private Activity getActivityFromView(View view) {
        Context context = view.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        GifImageView imageView;
        TextView tvApply;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            tvApply = itemView.findViewById(R.id.tv_apply);
        }

    }
}

