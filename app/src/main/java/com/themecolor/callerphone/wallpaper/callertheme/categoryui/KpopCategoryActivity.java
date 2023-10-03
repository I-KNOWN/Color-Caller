package com.themecolor.callerphone.wallpaper.callertheme.categoryui;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;


import com.adsmodule.api.adsModule.utils.Constants;
import com.themecolor.callerphone.wallpaper.R;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class KpopCategoryActivity extends AppCompatActivity/* implements RecyclerInterface*/ {

    private RecyclerView recyclerView;
    private static final String TAG = "KpopCategoryActivity";
    private Timer fetchTimer;
    LinearLayout adsView0;
    ImagesAdapter trendingAdapter = null;
    ImagesVideoAdapter livetrendingAdapter = null;
    ImagesAdapter kpopAdapter = null;
    ImagesVideoAdapter livekpopAdapter = null;
    ImagesAdapter neonAdapter = null;
    ImagesVideoAdapter liveneonAdapter = null;
    ImagesAdapter loveAdapter = null;
    ImagesVideoAdapter liveloveAdapter = null;
    ImagesAdapter callAdapter = null;
    ImagesVideoAdapter livecallAdapter = null;
    ImagesAdapter animeAdapter = null;
    ImagesVideoAdapter liveanimeAdapter = null;
    ImagesAdapter soccerAdapter = null;
    ImagesVideoAdapter livesoccerAdapter = null;
    ImagesAdapter cuteAdapter = null;
    ImagesVideoAdapter livecuteAdapter = null;
    ImagesAdapter modernAdapter = null;
    ImagesVideoAdapter livemodernAdapter = null;
    ImagesAdapter natureAdapter = null;
    ImagesVideoAdapter livenatureAdapter = null;
    ImagesAdapter animalAdapter = null;
    ImagesVideoAdapter liveanimalAdapter = null;
    ImagesAdapter christmasAdapter = null;
    ImagesVideoAdapter livechristmasAdapter = null;
    private ArrayList<String> imagesList = new ArrayList<>();
    private ArrayList<String> trendingList = new ArrayList<>();
    private ArrayList<String> christmaslist = new ArrayList<>();
    private ArrayList<String> animalsList = new ArrayList<>();
    private ArrayList<String> natureList = new ArrayList<>();
    private ArrayList<String> modernList = new ArrayList<>();
    private ArrayList<String> cutefunnyList = new ArrayList<>();
    private ArrayList<String> soccerList = new ArrayList<>();
    private ArrayList<String> neonList = new ArrayList<>();
    private ArrayList<String> loveList = new ArrayList<>();
    private ArrayList<String> callofdutyList = new ArrayList<>();
    private ArrayList<String> animeList = new ArrayList<>();
    private ArrayList<String> imagesListLiveKpop = new ArrayList<>();
    private ArrayList<String> imagesListLiveChristmas = new ArrayList<>();
    private ArrayList<String> imagesListLiveAnimals = new ArrayList<>();
    private ArrayList<String> imagesListLiveNature = new ArrayList<>();
    private ArrayList<String> imagesListLiveModern = new ArrayList<>();
    private ArrayList<String> imagesListLiveCute = new ArrayList<>();
    private ArrayList<String> imagesListLiveSoccer = new ArrayList<>();
    private ArrayList<String> imagesListLiveNeon = new ArrayList<>();
    private ArrayList<String> imagesListLiveLove = new ArrayList<>();
    private ArrayList<String> imagesListLiveCall = new ArrayList<>();
    private ArrayList<String> imagesListLiveAnime = new ArrayList<>();
    private ArrayList<String> imagesListLiveTrending = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neon_category);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        Drawable background = getResources().getDrawable(R.drawable.status_gradient);
        getWindow().setBackgroundDrawable(background);


        Map<String, Object> defaultValues = new HashMap<>();
        defaultValues.put("categories_parameter", "new");
        recyclerView = findViewById(R.id.neon_recycler);
        adsView0 = findViewById(R.id.adsView0);

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);

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

        imagesListLiveKpop.clear();
        imagesListLiveKpop.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getLiveKpop().getUrls());
        imagesListLiveNeon.clear();
        imagesListLiveNeon.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getLiveNeon().getUrls());
        imagesListLiveLove.clear();
        imagesListLiveLove.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getLiveLove().getUrls());
        imagesListLiveCall.clear();
        imagesListLiveCall.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getLiveCallOfDuty().getUrls());
        imagesListLiveAnime.clear();
        imagesListLiveAnime.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getLiveAnime().getUrls());
        imagesListLiveSoccer.clear();
        imagesListLiveSoccer.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getLiveSoccer().getUrls());
        imagesListLiveCute.clear();
        imagesListLiveCute.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getLiveCuteAndFunny().getUrls());
        imagesListLiveModern.clear();
        imagesListLiveModern.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getLiveModern().getUrls());
        imagesListLiveNature.clear();
        imagesListLiveNature.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getLiveNature().getUrls());
        imagesListLiveAnimals.clear();
        imagesListLiveAnimals.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getLiveAnimal().getUrls());
        imagesListLiveChristmas.clear();
        imagesListLiveChristmas.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getLiveChristmas().getUrls());
        imagesListLiveTrending.clear();
        imagesListLiveTrending.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getLiveTrending().getUrls());

        ArrayList<Images> categoryIdentifier = getIntent().getParcelableArrayListExtra("categoryIdentifier");

        for (Images image : categoryIdentifier) {
            String category1 = image.getUrl();

            switch (category1) {
                case "Images":
                    ImagesAdapter kpopAdapter = new ImagesAdapter(KpopCategoryActivity.this, imagesList);
                    recyclerView.setAdapter(kpopAdapter);
                    break;
                case "Trending":
                    ImagesAdapter trendingAdapter = new ImagesAdapter(KpopCategoryActivity.this, trendingList);
                    recyclerView.setAdapter(trendingAdapter);
                    break;
                case "Animals":
                    ImagesAdapter animalAdapter = new ImagesAdapter(KpopCategoryActivity.this, animalsList);
                    recyclerView.setAdapter(animalAdapter);
                    break;
                case "Christmas":
                    ImagesAdapter christmasAdapter = new ImagesAdapter(KpopCategoryActivity.this, christmaslist);
                    recyclerView.setAdapter(christmasAdapter);
                    break;
                case "Nature":
                    ImagesAdapter natureAdapter = new ImagesAdapter(KpopCategoryActivity.this, natureList);
                    recyclerView.setAdapter(natureAdapter);
                    break;
                case "Modern":
                    ImagesAdapter modernAdapter = new ImagesAdapter(KpopCategoryActivity.this, modernList);
                    recyclerView.setAdapter(modernAdapter);
                    break;
                case "CuteFunny":
                    ImagesAdapter cuteAdapter = new ImagesAdapter(KpopCategoryActivity.this, cutefunnyList);
                    recyclerView.setAdapter(cuteAdapter);
                    break;
                case "Soccer":
                    ImagesAdapter soccerAdapter = new ImagesAdapter(KpopCategoryActivity.this, soccerList);
                    recyclerView.setAdapter(soccerAdapter);
                    break;
                case "Neon":
                    ImagesAdapter neonAdapter = new ImagesAdapter(KpopCategoryActivity.this, neonList);
                    recyclerView.setAdapter(neonAdapter);
                    break;
                case "Love":
                    ImagesAdapter loveAdapter = new ImagesAdapter(KpopCategoryActivity.this, loveList);
                    recyclerView.setAdapter(loveAdapter);
                    break;
                case "CallOfDuty":
                    ImagesAdapter callAdapter = new ImagesAdapter(KpopCategoryActivity.this, callofdutyList);
                    recyclerView.setAdapter(callAdapter);
                    break;
                case "Anime":
                    ImagesAdapter animeAdapter = new ImagesAdapter(KpopCategoryActivity.this, animeList);
                    recyclerView.setAdapter(animeAdapter);
                    break;
                case "LiveTrending":
                    ImagesVideoAdapter livetrendingAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveTrending);
                    recyclerView.setAdapter(livetrendingAdapter);

                    break;
                case "LiveKpop":
                    ImagesVideoAdapter livekpopAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveKpop);
                    recyclerView.setAdapter(livekpopAdapter);
                    break;
                case "LiveChristmas":
                    ImagesVideoAdapter livechristmasAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveChristmas);
                    recyclerView.setAdapter(livechristmasAdapter);
                    break;
                case "LiveAnimal":
                    ImagesVideoAdapter liveanimalAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveAnimals);
                    recyclerView.setAdapter(liveanimalAdapter);
                    break;
                case "LiveNature":
                    ImagesVideoAdapter livenatureAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveNature);
                    recyclerView.setAdapter(livenatureAdapter);
                    break;
                case "LiveModern":
                    ImagesVideoAdapter livemodernAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveModern);
                    recyclerView.setAdapter(livemodernAdapter);
                    break;
                case "LiveCuteFunny":
                    ImagesVideoAdapter livecuteAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveCute);
                    recyclerView.setAdapter(livecuteAdapter);
                    break;
                case "LiveSoccer":
                    ImagesVideoAdapter livesoccerAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveSoccer);
                    recyclerView.setAdapter(livesoccerAdapter);
                    break;
                case "LiveNeon":
                    ImagesVideoAdapter liveneonAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveNeon);
                    recyclerView.setAdapter(liveneonAdapter);
                    break;
                case "LiveLove":
                    ImagesVideoAdapter liveloveAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveLove);
                    recyclerView.setAdapter(liveloveAdapter);
                    break;
                case "LiveCallOfDuty":
                    ImagesVideoAdapter livecallAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveCall);
                    recyclerView.setAdapter(livecallAdapter);
                    break;
                case "LiveAnime":
                    ImagesVideoAdapter liveanimeAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveAnime);
                    recyclerView.setAdapter(liveanimeAdapter);
                    break;

            }
        }


        /*fetchTimer = new Timer();
        fetchTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                remoteConfig.fetchAndActivate()
                        .addOnCompleteListener(new OnCompleteListener<Boolean>() {
                            @Override
                            public void onComplete(@NonNull Task<Boolean> task) {
                                if (task.isSuccessful()) {
                                    String jsonConfig = remoteConfig.getString("categories_parameter");
                                    try {
                                        JSONObject jsonObject = new JSONObject(jsonConfig);
                                        JSONObject categoriesObject = jsonObject.getJSONObject("Categories");

                                        processCategory(categoriesObject, "Trending", trendingList);
                                        processCategory(categoriesObject, "LiveTrending", imagesListLiveTrending);
                                        processCategory(categoriesObject, "Christmas", christmaslist);
                                        processCategory(categoriesObject, "LiveChristmas", imagesListLiveChristmas);
                                        processCategory(categoriesObject, "Kpop", imagesList);
                                        processCategory(categoriesObject, "LiveKpop", imagesListLiveKpop);
                                        processCategory(categoriesObject, "Neon", neonList);
                                        processCategory(categoriesObject, "LiveNeon", imagesListLiveNeon);
                                        processCategory(categoriesObject, "Love", loveList);
                                        processCategory(categoriesObject, "LiveLove", imagesListLiveLove);
                                        processCategory(categoriesObject, "CallOfDuty", callofdutyList);
                                        processCategory(categoriesObject, "LiveCallOfDuty", imagesListLiveCall);
                                        processCategory(categoriesObject, "Anime", animeList);
                                        processCategory(categoriesObject, "LiveAnime", imagesListLiveAnime);
                                        processCategory(categoriesObject, "Soccer", soccerList);
                                        processCategory(categoriesObject, "LiveSoccer", imagesListLiveSoccer);
                                        processCategory(categoriesObject, "CuteAndFunny", cutefunnyList);
                                        processCategory(categoriesObject, "LiveCuteAndFunny", imagesListLiveCute);
                                        processCategory(categoriesObject, "Modern", modernList);
                                        processCategory(categoriesObject, "LiveModern", imagesListLiveModern);
                                        processCategory(categoriesObject, "Nature", natureList);
                                        processCategory(categoriesObject, "LiveNature", imagesListLiveNature);
                                        processCategory(categoriesObject, "Animal", animalsList);
                                        processCategory(categoriesObject, "LiveAnimal", imagesListLiveAnimals);
                                        // Add more categories as needed

                                        // Notify adapter of data changes
                                        ArrayList<Images> categoryIdentifier = getIntent().getParcelableArrayListExtra("categoryIdentifier");
                                        if (categoryIdentifier != null) {
                                            for (Images image : categoryIdentifier) {
                                                String category1 = image.getUrl();

                                                switch (category1) {
                                                    case "Images":
                                                        ImagesAdapter kpopAdapter = new ImagesAdapter(KpopCategoryActivity.this, imagesList);
                                                        recyclerView.setAdapter(kpopAdapter);
                                                        break;
                                                    case "Trending":
                                                        ImagesAdapter trendingAdapter = new ImagesAdapter(KpopCategoryActivity.this, trendingList);
                                                        recyclerView.setAdapter(trendingAdapter);
                                                        break;
                                                    case "Animals":
                                                        ImagesAdapter animalAdapter = new ImagesAdapter(KpopCategoryActivity.this, animalsList);
                                                        recyclerView.setAdapter(animalAdapter);
                                                        break;
                                                    case "Christmas":
                                                        ImagesAdapter christmasAdapter = new ImagesAdapter(KpopCategoryActivity.this, christmaslist);
                                                        recyclerView.setAdapter(christmasAdapter);
                                                        break;
                                                    case "Nature":
                                                        ImagesAdapter natureAdapter = new ImagesAdapter(KpopCategoryActivity.this, natureList);
                                                        recyclerView.setAdapter(natureAdapter);
                                                        break;
                                                    case "Modern":
                                                        ImagesAdapter modernAdapter = new ImagesAdapter(KpopCategoryActivity.this, modernList);
                                                        recyclerView.setAdapter(modernAdapter);
                                                        break;
                                                    case "CuteFunny":
                                                        ImagesAdapter cuteAdapter = new ImagesAdapter(KpopCategoryActivity.this, cutefunnyList);
                                                        recyclerView.setAdapter(cuteAdapter);
                                                        break;
                                                    case "Soccer":
                                                        ImagesAdapter soccerAdapter = new ImagesAdapter(KpopCategoryActivity.this, soccerList);
                                                        recyclerView.setAdapter(soccerAdapter);
                                                        break;
                                                    case "Neon":
                                                        ImagesAdapter neonAdapter = new ImagesAdapter(KpopCategoryActivity.this, neonList);
                                                        recyclerView.setAdapter(neonAdapter);
                                                        break;
                                                    case "Love":
                                                        ImagesAdapter loveAdapter = new ImagesAdapter(KpopCategoryActivity.this, loveList);
                                                        recyclerView.setAdapter(loveAdapter);
                                                        break;
                                                    case "CallOfDuty":
                                                        ImagesAdapter callAdapter = new ImagesAdapter(KpopCategoryActivity.this, callofdutyList);
                                                        recyclerView.setAdapter(callAdapter);
                                                        break;
                                                    case "Anime":
                                                        ImagesAdapter animeAdapter = new ImagesAdapter(KpopCategoryActivity.this, animeList);
                                                        recyclerView.setAdapter(animeAdapter);
                                                        break;
                                                    case "LiveTrending":
                                                        ImagesVideoAdapter livetrendingAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveTrending);
                                                        recyclerView.setAdapter(livetrendingAdapter);

                                                        break;
                                                    case "LiveKpop":
                                                        ImagesVideoAdapter livekpopAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveKpop);
                                                        recyclerView.setAdapter(livekpopAdapter);
                                                        break;
                                                    case "LiveChristmas":
                                                        ImagesVideoAdapter livechristmasAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveChristmas);
                                                        recyclerView.setAdapter(livechristmasAdapter);
                                                        break;
                                                    case "LiveAnimal":
                                                        ImagesVideoAdapter liveanimalAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveAnimals);
                                                        recyclerView.setAdapter(liveanimalAdapter);
                                                        break;
                                                    case "LiveNature":
                                                        ImagesVideoAdapter livenatureAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveNature);
                                                        recyclerView.setAdapter(livenatureAdapter);
                                                        break;
                                                    case "LiveModern":
                                                        ImagesVideoAdapter livemodernAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveModern);
                                                        recyclerView.setAdapter(livemodernAdapter);
                                                        break;
                                                    case "LiveCuteFunny":
                                                        ImagesVideoAdapter livecuteAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveCute);
                                                        recyclerView.setAdapter(livecuteAdapter);
                                                        break;
                                                    case "LiveSoccer":
                                                        ImagesVideoAdapter livesoccerAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveSoccer);
                                                        recyclerView.setAdapter(livesoccerAdapter);
                                                        break;
                                                    case "LiveNeon":
                                                        ImagesVideoAdapter liveneonAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveNeon);
                                                        recyclerView.setAdapter(liveneonAdapter);
                                                        break;
                                                    case "LiveLove":
                                                        ImagesVideoAdapter liveloveAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveLove);
                                                        recyclerView.setAdapter(liveloveAdapter);
                                                        break;
                                                    case "LiveCallOfDuty":
                                                        ImagesVideoAdapter livecallAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveCall);
                                                        recyclerView.setAdapter(livecallAdapter);
                                                        break;
                                                    case "LiveAnime":
                                                        ImagesVideoAdapter liveanimeAdapter = new ImagesVideoAdapter(KpopCategoryActivity.this, imagesListLiveAnime);
                                                        recyclerView.setAdapter(liveanimeAdapter);
                                                        break;

                                                }
                                            }
                                        }
                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                if (trendingAdapter != null) {
                                                    trendingAdapter.notifyDataSetChanged();
                                                }
                                                if (livetrendingAdapter != null) {
                                                    livetrendingAdapter.notifyDataSetChanged();
                                                }
                                                if (kpopAdapter != null) {
                                                    kpopAdapter.notifyDataSetChanged();
                                                }
                                                if (livekpopAdapter != null) {
                                                    livekpopAdapter.notifyDataSetChanged();
                                                } if (neonAdapter != null) {
                                                    neonAdapter.notifyDataSetChanged();
                                                }if (liveneonAdapter != null) {
                                                    liveneonAdapter.notifyDataSetChanged();
                                                }if (loveAdapter != null) {
                                                    loveAdapter.notifyDataSetChanged();
                                                }if (liveloveAdapter != null) {
                                                    liveloveAdapter.notifyDataSetChanged();
                                                }if (callAdapter != null) {
                                                    callAdapter.notifyDataSetChanged();
                                                }if (livecallAdapter != null) {
                                                    callAdapter.notifyDataSetChanged();
                                                }if (animeAdapter != null) {
                                                    animeAdapter.notifyDataSetChanged();
                                                }if (liveanimeAdapter != null) {
                                                    animeAdapter.notifyDataSetChanged();
                                                }if (soccerAdapter != null) {
                                                    soccerAdapter.notifyDataSetChanged();
                                                }if (livesoccerAdapter != null) {
                                                    livesoccerAdapter.notifyDataSetChanged();
                                                }if (cuteAdapter != null) {
                                                    cuteAdapter.notifyDataSetChanged();
                                                }if (livecuteAdapter != null) {
                                                    livecuteAdapter.notifyDataSetChanged();
                                                }if (modernAdapter != null) {
                                                    modernAdapter.notifyDataSetChanged();
                                                }if (livemodernAdapter != null) {
                                                    livemodernAdapter.notifyDataSetChanged();
                                                }if (natureAdapter != null) {
                                                    natureAdapter.notifyDataSetChanged();
                                                }if (livenatureAdapter != null) {
                                                    livenatureAdapter.notifyDataSetChanged();
                                                }if (animalAdapter != null) {
                                                    animalAdapter.notifyDataSetChanged();
                                                }if (liveanimalAdapter != null) {
                                                    liveanimalAdapter.notifyDataSetChanged();
                                                }if (christmasAdapter != null) {
                                                    christmasAdapter.notifyDataSetChanged();
                                                }if (livechristmasAdapter != null) {
                                                    livechristmasAdapter.notifyDataSetChanged();
                                                }
                                            }
                                        });
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                } else {

                                }
                            }
                        });
            }
        }, 0, 1000);*/


    }


    @Override
    public void onBackPressed() {
        KpopCategoryActivity.super.onBackPressed();

    }

    @Override
    protected void onResume() {
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
