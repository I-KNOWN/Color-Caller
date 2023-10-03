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


import com.adsmodule.api.adsModule.utils.Constants;
import com.themecolor.callerphone.wallpaper.R;
import com.themecolor.callerphone.wallpaper.callertheme.categoryui.Images;
import com.themecolor.callerphone.wallpaper.callertheme.categoryui.KpopCategoryActivity;
import com.themecolor.callerphone.wallpaper.callertheme.categoryui.linearCategory.kpopCategory.LinearKpopAdapter;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CallScreenThemeFragment extends Fragment {
    private Activity activity;

    public CallScreenThemeFragment() {

    }

    RecyclerView kpop_recycler, neon_recycler, love_recycler, call_of_duty_recycler, anime_recycler, soccer_recycler, cutefunny_recycler, modern_recycler, nature_recycler, animals_recycler, christmas_recycler, trending_recycler;
    private ArrayList<Images> categoryIdentifier;
    private ArrayList<String>  imagesList, neonList, loveList, callofdutyList, animeList, soccerList, cutefunnyList, modernList, natureList, animalsList, christmaslist, trendingList;
    TextView kpop_see, neon_see, love_see, call_of_duty_see, anime_see, soccer_see, cutefunny_see, modern_see, nature_see, animals_see, christmas_see, trending_see;
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


        ExecutorService service = Executors.newFixedThreadPool(12);
        Future<?> future = service.submit(() -> {
            kpop_see.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                            categoryIdentifier.add(new Images("Images"));
                            Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                            intent.putParcelableArrayListExtra("categoryIdentifier", categoryIdentifier);
                            startActivity(intent);

                }
            });
            trending_see.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                            categoryIdentifier.add(new Images("Trending"));
                            Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                            intent.putExtra("categoryIdentifier", categoryIdentifier);
                            startActivity(intent);

                }
            });
            christmas_see.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                            categoryIdentifier.add(new Images("Christmas"));
                            Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                            intent.putExtra("categoryIdentifier", categoryIdentifier);
                            startActivity(intent);

                }
            });
            animals_see.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                            categoryIdentifier.add(new Images("Animal"));
                            Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                            intent.putExtra("categoryIdentifier", categoryIdentifier);
                            startActivity(intent);

                }
            });
            nature_see.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                            categoryIdentifier.add(new Images("Nature"));
                            Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                            intent.putExtra("categoryIdentifier", categoryIdentifier);
                            startActivity(intent);

                }
            });
            modern_see.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                            categoryIdentifier.add(new Images("Nature"));
                            Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                            intent.putExtra("categoryIdentifier", categoryIdentifier);
                            startActivity(intent);

                }
            });
            cutefunny_see.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                            categoryIdentifier.add(new Images("CuteAndFunny"));
                            Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                            intent.putExtra("categoryIdentifier", categoryIdentifier);
                            startActivity(intent);

                }
            });
            soccer_see.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                            categoryIdentifier.add(new Images("Soccer"));
                            Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                            intent.putExtra("categoryIdentifier", categoryIdentifier);
                            startActivity(intent);

                }
            });
            neon_see.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                            categoryIdentifier.add(new Images("Neon"));
                            Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                            intent.putExtra("categoryIdentifier", categoryIdentifier);
                            startActivity(intent);

                }
            });
            love_see.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                            categoryIdentifier.add(new Images("Love"));
                            Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                            intent.putExtra("categoryIdentifier", categoryIdentifier);
                            startActivity(intent);

                }
            });
            call_of_duty_see.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                            categoryIdentifier.add(new Images("CallOfDuty"));
                            Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                            intent.putExtra("categoryIdentifier", categoryIdentifier);
                            startActivity(intent);


                }
            });
            anime_see.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                            categoryIdentifier.add(new Images("Anime"));
                            Intent intent = new Intent(getActivity(), KpopCategoryActivity.class);
                            intent.putExtra("categoryIdentifier", categoryIdentifier);
                            startActivity(intent);
                }
            });
        });
        service.shutdown();

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
        trending_recycler.setHasFixedSize(true);

        categoryIdentifier = new ArrayList<>();

        imagesList = new ArrayList<>();
        imagesList.clear();
        imagesList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getKpop().getUrls());
        neonList = new ArrayList<>();
        neonList.clear();
        neonList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getNeon().getUrls());
        loveList = new ArrayList<>();
        loveList.clear();
        loveList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getLove().getUrls());
        callofdutyList = new ArrayList<>();
        callofdutyList.clear();
        callofdutyList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getCallOfDuty().getUrls());
        animeList = new ArrayList<>();
        animeList.clear();
        animeList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getAnime().getUrls());
        soccerList = new ArrayList<>();
        soccerList.clear();
        soccerList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getSoccer().getUrls());
        cutefunnyList = new ArrayList<>();
        cutefunnyList.clear();
        cutefunnyList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getCuteAndFunny().getUrls());
        modernList = new ArrayList<>();
        modernList.clear();
        modernList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getModern().getUrls());
        natureList = new ArrayList<>();
        natureList.clear();
        natureList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getNature().getUrls());
        animalsList = new ArrayList<>();
        animalsList.clear();
        animalsList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getAnimal().getUrls());
        christmaslist = new ArrayList<>();
        christmaslist.clear();
        christmaslist.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getChristmas().getUrls());
        trendingList = new ArrayList<>();
        trendingList.clear();
        trendingList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getTrending().getUrls());

        LinearKpopAdapter trendingAdapter = new LinearKpopAdapter(getActivity(), trendingList);
        LinearKpopAdapter christmasAdapter = new LinearKpopAdapter(getActivity(), christmaslist);
        LinearKpopAdapter kpopAdapter = new LinearKpopAdapter(getActivity(), imagesList);
        LinearKpopAdapter neonAdapter = new LinearKpopAdapter(getActivity(), neonList);
        LinearKpopAdapter loveAdapter = new LinearKpopAdapter(getActivity(), loveList);
        LinearKpopAdapter callofDutyAdapter = new LinearKpopAdapter(getActivity(), callofdutyList);
        LinearKpopAdapter animeAdapter = new LinearKpopAdapter(getActivity(), animeList);
        LinearKpopAdapter soccerAdapter = new LinearKpopAdapter(getActivity(), soccerList);
        LinearKpopAdapter cuteandFunnyAdapter = new LinearKpopAdapter(getActivity(), cutefunnyList);
        LinearKpopAdapter modernAdapter = new LinearKpopAdapter(getActivity(), modernList);
        LinearKpopAdapter natureAdapter = new LinearKpopAdapter(getActivity(), natureList);
        LinearKpopAdapter animalAdapter = new LinearKpopAdapter(getActivity(), animalsList);

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
/*        fetchTimer = new Timer();
                remoteConfig.fetchAndActivate()
                        .addOnCompleteListener(new OnCompleteListener<Boolean>() {
                            @Override
                            public void onComplete(@NonNull Task<Boolean> task) {
                                if (task.isSuccessful()) {
                                    // Data fetched and activated successfully
                                    String jsonConfig = remoteConfig.getString("categories_parameter");
                                    try {
                                        JSONObject jsonObject = new JSONObject(jsonConfig);
                                        JSONObject categoriesObject = jsonObject.getJSONObject("Categories");

                                        // Process each category
                                        processCategory(categoriesObject, "Trending", trendingList);
                                        processCategory(categoriesObject, "Christmas", christmaslist);
                                        processCategory(categoriesObject, "Kpop", imagesList);
                                        processCategory(categoriesObject, "Neon", neonList);
                                        processCategory(categoriesObject, "Love", loveList);
                                        processCategory(categoriesObject, "CallOfDuty", callofdutyList);
                                        processCategory(categoriesObject, "Anime", animeList);
                                        processCategory(categoriesObject, "Soccer", soccerList);
                                        processCategory(categoriesObject, "CuteAndFunny", cutefunnyList);
                                        processCategory(categoriesObject, "Modern", modernList);
                                        processCategory(categoriesObject, "Nature", natureList);
                                        processCategory(categoriesObject, "Animal", animalsList);
                                        // Add more categories as needed

                                        // Notify adapter of data changes
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
                        });*/


        return view;
    }

    @Override
    public void onResume() {
        super.onResume();


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