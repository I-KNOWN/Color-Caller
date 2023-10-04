package com.themecolor.callerphone.wallpaper.callertheme.categoryui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adsmodule.api.adsModule.AdUtils;
import com.adsmodule.api.adsModule.utils.Constants;
import com.themecolor.callerphone.wallpaper.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class FavouritesLiveAdapter extends RecyclerView.Adapter<FavouritesLiveAdapter.ViewHolder> {
    private ArrayList<String> favoriteDataList;
    private Context context;

    public FavouritesLiveAdapter(Context context, ArrayList<String> favoriteDataList) {
        this.context = context;
        this.favoriteDataList = favoriteDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parse_item_video, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String data = favoriteDataList.get(position);
        Glide.with(context).load(data).into(holder.favoriteImage);

        holder.favoriteImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity activity = getActivityFromView(view);
                if (activity != null) {
                    AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                        Intent intent = new Intent(activity, CategoryShowVideoActivity.class);
                        ArrayList<String> parcelableList = new ArrayList<>(favoriteDataList);
                        intent.putExtra("imageUrl", parcelableList);
                        intent.putExtra("position", position);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        activity.startActivity(intent);
                    });

                }

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
        return favoriteDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView favoriteImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            favoriteImage = itemView.findViewById(R.id.imageView);
        }
    }
}
