package com.themecolor.callerphone.wallpaper.callertheme.categoryui;



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


import com.bumptech.glide.request.RequestOptions;
import com.themecolor.callerphone.wallpaper.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class ImagesVideoAdapter extends RecyclerView.Adapter<ImagesVideoAdapter.ViewHolder> {

    public static final String TAG = "ImagesVideoAdapter";
    private Context context;
    private ArrayList<String> arrayList;


    public ImagesVideoAdapter(Context context, ArrayList<String> arrayList) {
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
        RequestOptions myOptions = new RequestOptions()
                .override(200, 200);
        Glide.with(context)
                .asBitmap()
                .load(arrayList.get(position))
                .apply(myOptions)
                .into(holder.imageView);
        final String temp = arrayList.get(position);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity activity = getActivityFromView(view);
                if (activity != null) {
                    Intent intent = new Intent(context, CategoryShowVideoActivity.class);
                    ArrayList<String> parcelableList = new ArrayList<>(arrayList);
                    intent.putExtra("imageUrl", parcelableList);
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

