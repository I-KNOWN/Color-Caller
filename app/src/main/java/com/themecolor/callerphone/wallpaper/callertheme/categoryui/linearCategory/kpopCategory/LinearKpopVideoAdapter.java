package com.themecolor.callerphone.wallpaper.callertheme.categoryui.linearCategory.kpopCategory;



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
import com.themecolor.callerphone.wallpaper.callertheme.categoryui.CategoryShowVideoActivity;
import com.themecolor.callerphone.wallpaper.callertheme.categoryui.Images;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class LinearKpopVideoAdapter extends RecyclerView.Adapter<LinearKpopVideoAdapter.ViewHolder> {
    public static final String TAG = "LinearKpopVideoAdapter";
    private Context context;
    private ArrayList<String> arrayList;


    public LinearKpopVideoAdapter(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public LinearKpopVideoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parse_item_linear_video, parent, false);
        
        return new LinearKpopVideoAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LinearKpopVideoAdapter.ViewHolder holder, int position) {
        RequestOptions myOptions = new RequestOptions()
                .override(200, 200);
        Glide.with(context)
                .asBitmap()
                .apply(myOptions)
                .load(arrayList.get(position))
                .into(holder.imageView);
//        Picasso.get().load(arrayList.get(position).getUrl()).into(holder.imageView);
        final String temp = arrayList.get(position);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                        Intent intent = new Intent(context, CategoryShowVideoActivity.class);
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
        GifImageView imageView;
        TextView tvApply;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            tvApply = itemView.findViewById(R.id.tv_apply);
        }


    }
}
