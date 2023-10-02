package com.themecolor.callerphone.wallpaper.callertheme.ui.fragment;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.themecolor.callerphone.wallpaper.R;
import com.themecolor.callerphone.wallpaper.callertheme.categoryui.Images;
import com.themecolor.callerphone.wallpaper.callertheme.categoryui.KpopCategoryActivity;
import com.themecolor.callerphone.wallpaper.callertheme.categoryui.linearCategory.kpopCategory.LinearKpopVideoAdapter;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class CallScreenLiveThemeFragment extends Fragment {
    private Activity activity;
    public CallScreenLiveThemeFragment() {

    }
    RecyclerView kpop_recycler,neon_recycler,love_recycler,call_of_duty_recycler,anime_recycler,soccer_recycler,cutefunny_recycler,modern_recycler,nature_recycler,animals_recycler,christmas_recycler,trending_recycler;
    private ArrayList<Images> categoryIdentifier,imagesList,neonList,loveList,callofdutyList,animeList,soccerList,cutefunnyList,modernList,natureList,animalsList,christmaslist,trendingList;
    TextView kpop_see,neon_see,love_see,call_of_duty_see,anime_see,soccer_see,cutefunny_see,modern_see,nature_see,animals_see,christmas_see,trending_see;

    LinearLayout adsView, adsView1, adsView2, adsView3, adsView4, adsView5;
    private Timer fetchTimer;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = getActivity();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_call_screen_theme, container, false);


        Map<String, Object> defaultValues = new HashMap<>();
        defaultValues.put("categories_parameter", "new");


        kpop_see = view.findViewById(R.id.kpop_see);
        neon_see = view.findViewById(R.id.neon_see);
        love_see = view.findViewById(R.id.love_see);
        anime_see = view.findViewById(R.id.anime_see);
        call_of_duty_see = view.findViewById(R.id.call_of_duty_see);
        soccer_see = view.findViewById(R.id.soccer_see);
        cutefunny_see = view.findViewById(R.id.cutefunny_see);
        modern_see = view.findViewById(R.id.modern_see);
        nature_see = view.findViewById(R.id.nature_see);
        animals_see = view.findViewById(R.id.animals_see);
        christmas_see = view.findViewById(R.id.christmas_see);
        trending_see = view.findViewById(R.id.trending_see);
        adsView = view.findViewById(R.id.adsView);
        adsView1 = view.findViewById(R.id.adsView1);
        adsView2 = view.findViewById(R.id.adsView2);
        adsView3 = view.findViewById(R.id.adsView3);
        adsView4 = view.findViewById(R.id.adsView4);
        adsView5 = view.findViewById(R.id.adsView5);

        kpop_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                        categoryIdentifier.add(new Images("LiveKpop"));
                        Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                        intent.putParcelableArrayListExtra("categoryIdentifier", categoryIdentifier);
                        startActivity(intent);
                    
            }
        });
        trending_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                        categoryIdentifier.add(new Images("LiveTrending"));
                        Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                        intent.putExtra("categoryIdentifier", categoryIdentifier);
                        startActivity(intent);
                    

            }
        });
        christmas_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                        categoryIdentifier.add(new Images("LiveChristmas"));
                        Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                        intent.putExtra("categoryIdentifier", categoryIdentifier);
                        startActivity(intent);
                    
            }
        });
        animals_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                        categoryIdentifier.add(new Images("LiveAnimal"));
                        Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                        intent.putExtra("categoryIdentifier", categoryIdentifier);
                        startActivity(intent);
                    
            }
        });
        nature_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                        categoryIdentifier.add(new Images("LiveNature"));
                        Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                        intent.putExtra("categoryIdentifier", categoryIdentifier);
                        startActivity(intent);
                    
            }
        });
        modern_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                        categoryIdentifier.add(new Images("LiveModern"));
                        Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                        intent.putExtra("categoryIdentifier", categoryIdentifier);
                        startActivity(intent);
                    
            }
        });
        cutefunny_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                        categoryIdentifier.add(new Images("LiveCuteFunny"));
                        Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                        intent.putExtra("categoryIdentifier", categoryIdentifier);
                        startActivity(intent);
                    

            }
        });
        soccer_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                        categoryIdentifier.add(new Images("LiveSoccer"));
                        Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                        intent.putExtra("categoryIdentifier", categoryIdentifier);
                        startActivity(intent);
                    
            }
        });
        neon_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                        categoryIdentifier.add(new Images("LiveNeon"));
                        Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                        intent.putExtra("categoryIdentifier", categoryIdentifier);
                        startActivity(intent);
                    

            }
        });
        love_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                        categoryIdentifier.add(new Images("LiveLove"));
                        Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                        intent.putExtra("categoryIdentifier", categoryIdentifier);
                        startActivity(intent);
                    
            }
        });
        call_of_duty_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                        categoryIdentifier.add(new Images("LiveCallOfDuty"));
                        Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                        intent.putExtra("categoryIdentifier", categoryIdentifier);
                        startActivity(intent);
                    
            }
        });
        anime_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                        categoryIdentifier.add(new Images("LiveAnime"));
                        Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                        intent.putExtra("categoryIdentifier", categoryIdentifier);
                        startActivity(intent);
                    
            }
        });
        kpop_recycler = view.findViewById(R.id.kpop_recycler);
        neon_recycler = view.findViewById(R.id.neon_recycler);
        love_recycler = view.findViewById(R.id.love_recycler);
        call_of_duty_recycler = view.findViewById(R.id.call_of_duty_recycler);
        anime_recycler = view.findViewById(R.id.anime_recycler);
        soccer_recycler = view.findViewById(R.id.soccer_recycler);
        cutefunny_recycler = view.findViewById(R.id.cutefunny_recycler);
        modern_recycler = view.findViewById(R.id.modern_recycler);
        nature_recycler = view.findViewById(R.id.nature_recycler);
        animals_recycler = view.findViewById(R.id.animals_recycler);
        christmas_recycler = view.findViewById(R.id.christmas_recycler);
        trending_recycler = view.findViewById(R.id.trending_recycler);

        kpop_recycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        kpop_recycler.setHasFixedSize(true);
        neon_recycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        neon_recycler.setHasFixedSize(true);
        love_recycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        love_recycler.setHasFixedSize(true);
        call_of_duty_recycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        call_of_duty_recycler.setHasFixedSize(true);
        anime_recycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        anime_recycler.setHasFixedSize(true);
        soccer_recycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        soccer_recycler.setHasFixedSize(true);
        cutefunny_recycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        cutefunny_recycler.setHasFixedSize(true);
        modern_recycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        modern_recycler.setHasFixedSize(true);
        nature_recycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        nature_recycler.setHasFixedSize(true);
        animals_recycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        animals_recycler.setHasFixedSize(true);
        christmas_recycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        christmas_recycler.setHasFixedSize(true);
        trending_recycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        christmas_recycler.setHasFixedSize(true);

        imagesList = new ArrayList<>();
        neonList = new ArrayList<>();
        loveList = new ArrayList<>();
        callofdutyList = new ArrayList<>();
        animeList = new ArrayList<>();
        soccerList = new ArrayList<>();
        cutefunnyList = new ArrayList<>();
        modernList = new ArrayList<>();
        natureList = new ArrayList<>();
        animalsList = new ArrayList<>();
        christmaslist = new ArrayList<>();
        trendingList = new ArrayList<>();
        categoryIdentifier = new ArrayList<>();

        LinearKpopVideoAdapter trendingAdapter = new LinearKpopVideoAdapter(getActivity(), trendingList);
        LinearKpopVideoAdapter christmasAdapter = new LinearKpopVideoAdapter(getActivity(), christmaslist);
        LinearKpopVideoAdapter kpopAdapter = new LinearKpopVideoAdapter(getActivity(), imagesList);
        LinearKpopVideoAdapter neonAdapter = new LinearKpopVideoAdapter(getActivity(), neonList);
        LinearKpopVideoAdapter loveAdapter = new LinearKpopVideoAdapter(getActivity(), loveList);
        LinearKpopVideoAdapter callofDutyAdapter = new LinearKpopVideoAdapter(getActivity(), callofdutyList);
        LinearKpopVideoAdapter animeAdapter = new LinearKpopVideoAdapter(getActivity(), animeList);
        LinearKpopVideoAdapter soccerAdapter = new LinearKpopVideoAdapter(getActivity(), soccerList);
        LinearKpopVideoAdapter cuteandFunnyAdapter = new LinearKpopVideoAdapter(getActivity(), cutefunnyList);
        LinearKpopVideoAdapter modernAdapter = new LinearKpopVideoAdapter(getActivity(), modernList);
        LinearKpopVideoAdapter natureAdapter = new LinearKpopVideoAdapter(getActivity(), natureList);
        LinearKpopVideoAdapter animalAdapter = new LinearKpopVideoAdapter(getActivity(), animalsList);

        kpop_recycler.setAdapter(kpopAdapter);
        trending_recycler.setAdapter(trendingAdapter);
        christmas_recycler.setAdapter(christmasAdapter);
        neon_recycler.setAdapter(neonAdapter);
        love_recycler.setAdapter(loveAdapter);
        call_of_duty_recycler.setAdapter(callofDutyAdapter);
        anime_recycler.setAdapter(animeAdapter);
        soccer_recycler.setAdapter(soccerAdapter);
        cutefunny_recycler.setAdapter(cuteandFunnyAdapter);
        modern_recycler.setAdapter(modernAdapter);
        nature_recycler.setAdapter(natureAdapter);
        animals_recycler.setAdapter(animalAdapter);
      /*  remoteConfig.setDefaultsAsync(defaultValues).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {


            }
        });*/
        // Schedule periodic fetches using a timer

                /*remoteConfig.fetchAndActivate()
                        .addOnCompleteListener(new OnCompleteListener<Boolean>() {
                            @Override
                            public void onComplete(@NonNull Task<Boolean> task) {
                                if (task.isSuccessful()) {

                                    remoteConfig.fetchAndActivate()
                                            .addOnCompleteListener(new OnCompleteListener<Boolean>() {
                                                @Override
                                                public void onComplete(@NonNull Task<Boolean> task) {
                                                    if (task.isSuccessful()) {
                                                        String jsonConfig = remoteConfig.getString("categories_parameter");
                                                        try {
                                                            JSONObject jsonObject = new JSONObject(jsonConfig);
                                                            JSONObject categoriesObject = jsonObject.getJSONObject("Categories");

                                                            processCategory(categoriesObject, "LiveTrending", trendingList);
                                                            processCategory(categoriesObject, "LiveChristmas", christmaslist);
                                                            processCategory(categoriesObject, "LiveKpop", imagesList);
                                                            processCategory(categoriesObject, "LiveNeon", neonList);
                                                            processCategory(categoriesObject, "LiveLove", loveList);
                                                            processCategory(categoriesObject, "LiveCallOfDuty", callofdutyList);
                                                            processCategory(categoriesObject, "LiveAnime", animeList);
                                                            processCategory(categoriesObject, "LiveSoccer", soccerList);
                                                            processCategory(categoriesObject, "LiveCuteAndFunny", cutefunnyList);
                                                            processCategory(categoriesObject, "LiveModern", modernList);
                                                            processCategory(categoriesObject, "LiveNature", natureList);
                                                            processCategory(categoriesObject, "LiveAnimal", animalsList);

                                                            trendingAdapter.notifyDataSetChanged();
                                                            christmasAdapter.notifyDataSetChanged();
                                                            kpopAdapter.notifyDataSetChanged();
                                                            neonAdapter.notifyDataSetChanged();
                                                            loveAdapter.notifyDataSetChanged();
                                                            callofDutyAdapter.notifyDataSetChanged();
                                                            animalAdapter.notifyDataSetChanged();
                                                            animeAdapter.notifyDataSetChanged();
                                                            soccerAdapter.notifyDataSetChanged();
                                                            cuteandFunnyAdapter.notifyDataSetChanged();
                                                            natureAdapter.notifyDataSetChanged();
                                                            modernAdapter.notifyDataSetChanged();
                                                        } catch (JSONException e) {
                                                            e.printStackTrace();
                                                        }
                                                    } else {
                                                    }
                                                }
                                            });
                                } else {

                                }
                            }
                        });*/
        return view;
    }

    private void processCategory(JSONObject categoriesObject, String categoryName, ArrayList<Images> categoryList) throws JSONException {
        if (categoriesObject.has(categoryName)) {
            JSONObject categoryObject = categoriesObject.getJSONObject(categoryName);
            JSONArray urlsArray = categoryObject.getJSONArray("urls");
            categoryList.clear();
            for (int i = 0; i < urlsArray.length(); i++) {
                String url = urlsArray.getString(i);
                Images images = new Images();
                images.setUrl(url);
                categoryList.add(images);
            }
        }
    }
    @Override
    public void onStop() {
        super.onStop();
        if (fetchTimer != null) {
            fetchTimer.cancel();
        }
    }

}