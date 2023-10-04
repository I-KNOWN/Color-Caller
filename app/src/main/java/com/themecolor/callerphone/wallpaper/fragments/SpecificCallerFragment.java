package com.themecolor.callerphone.wallpaper.fragments;

import static com.themecolor.callerphone.wallpaper.SingletonClasses.AppOpenAds.activity;
import static com.themecolor.callerphone.wallpaper.utils.GifDrawableUtil.pxFromDp;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adsmodule.api.adsModule.AdUtils;
import com.adsmodule.api.adsModule.utils.Constants;
import com.themecolor.callerphone.wallpaper.R;
import com.themecolor.callerphone.wallpaper.StartupActivity;
import com.themecolor.callerphone.wallpaper.callertheme.categoryui.ImagesAdapter;
import com.themecolor.callerphone.wallpaper.callertheme.categoryui.KpopCategoryActivity;
import com.themecolor.callerphone.wallpaper.databinding.FragmentSpecificCallerBinding;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SpecificCallerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SpecificCallerFragment extends Fragment {


    private FragmentSpecificCallerBinding binding;

    private String category;

    private ArrayList<String> imagesList = new ArrayList<>();
    private ArrayList<String> trendingList = new ArrayList<>();
    private ArrayList<String> animalsList = new ArrayList<>();
    private ArrayList<String> cutefunnyList = new ArrayList<>();
    private ArrayList<String> neonList = new ArrayList<>();
    private ArrayList<String> loveList = new ArrayList<>();
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SpecificCallerFragment() {
        // Required empty public constructor
    }

    public SpecificCallerFragment(String category){
        this.category = category;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SpecificCallerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SpecificCallerFragment newInstance(String param1, String param2) {
        SpecificCallerFragment fragment = new SpecificCallerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentSpecificCallerBinding.inflate(inflater, container, false);
        View view= binding.getRoot();
        imagesList = new ArrayList<>();
        imagesList.clear();
        imagesList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getKpop().getUrls());
        neonList = new ArrayList<>();
        neonList.clear();
        neonList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getNeon().getUrls());
        loveList = new ArrayList<>();
        loveList.clear();
        loveList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getLove().getUrls());
        cutefunnyList = new ArrayList<>();
        cutefunnyList.clear();
        cutefunnyList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getCuteAndFunny().getUrls());
        animalsList = new ArrayList<>();
        animalsList.clear();
        animalsList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getAnimal().getUrls());
        trendingList = new ArrayList<>();
        trendingList.clear();
        trendingList.addAll(Constants.adsResponseModel.getExtra_data_field().getCategories().getTrending().getUrls());
        GridLayoutManager layoutManager = new GridLayoutManager(requireContext(), 2);
        binding.rvCat.setLayoutManager(layoutManager);
        binding.rvCat.setHasFixedSize(true);
        binding.rvCat.setNestedScrollingEnabled(false);
        setFromSwitch();
        initBtn();



        return view;
    }

    private void initBtn() {

        binding.ivBgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                    category = "Trending";
                    setFromSwitch();
                });


            }
        });

        binding.ivBgBtnAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                    category = "Animal";
                    setFromSwitch();
                });

            }
        });

        binding.ivBgBtnCute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                    category = "Cute";
                    setFromSwitch();
                });

            }
        });

        binding.ivBgBtnKpop.setOnClickListener(view -> {
            AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                category = "Kpop";
                setFromSwitch();
            });

        });

        binding.ivBgBtnLove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                    category = "Love";
                    setFromSwitch();
                });

            }
        });

        binding.ivBgBtnNeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                    category = "Neon";
                    setFromSwitch();
                });

            }
        });

    }

    private void setFromSwitch() {
        switch (category){
            case "Trending":
                unselecteAll();
                binding.ivBgBtn.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.gradient_back));
                binding.ivBgBtn.setPadding(0, 0,0,0);
                setUpRecyclerView();
                break;
            case "Animal":
                unselecteAll();
                binding.ivBgBtnAnimal.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.gradient_back));
                binding.ivBgBtnAnimal.setPadding(0, 0,0,0);
                setUpRecyclerView();
                break;
            case "Cute":
                unselecteAll();
                binding.ivBgBtnCute.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.gradient_back));
                binding.ivBgBtnCute.setPadding(0, 0,0,0);
                setUpRecyclerView();
                break;
            case "Kpop":
                unselecteAll();
                binding.ivBgBtnKpop.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.gradient_back));
                binding.ivBgBtnKpop.setPadding(0, 0,0,0);
                setUpRecyclerView();
                break;
            case "Love":
                unselecteAll();
                binding.ivBgBtnLove.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.gradient_back));
                binding.ivBgBtnLove.setPadding(0, 0,0,0);
                setUpRecyclerView();
                break;
            case "Neon":
                unselecteAll();
                binding.ivBgBtnNeon.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.gradient_back));
                binding.ivBgBtnNeon.setPadding(0, 0,0,0);
                setUpRecyclerView();
                break;
        }
    }

    private void setUpRecyclerView() {

//        String category1 = getActivity().getIntent().getStringExtra("Category");

        switch (category) {
            case "Kpop":
                ImagesAdapter kpopAdapter = new ImagesAdapter(requireContext(), imagesList);
                binding.rvCat.setAdapter(kpopAdapter);
                kpopAdapter.notifyDataSetChanged();
                break;
            case "Trending":
                ImagesAdapter trendingAdapter = new ImagesAdapter(requireContext(), trendingList);
                binding.rvCat.setAdapter(trendingAdapter);
                break;
            case "Animal":
                ImagesAdapter animalAdapter = new ImagesAdapter(requireContext(), animalsList);
                binding.rvCat.setAdapter(animalAdapter);
                break;
            case "Cute":
                ImagesAdapter cuteAdapter = new ImagesAdapter(requireContext(), cutefunnyList);
                binding.rvCat.setAdapter(cuteAdapter);
                break;
            case "Neon":
                ImagesAdapter neonAdapter = new ImagesAdapter(requireContext(), neonList);
                binding.rvCat.setAdapter(neonAdapter);
                break;
            case "Love":
                ImagesAdapter loveAdapter = new ImagesAdapter(requireContext(), loveList);
                binding.rvCat.setAdapter(loveAdapter);
                break;

        }
    }


    private void unselecteAll() {
        binding.ivBgBtn.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.unselected_back));
        binding.ivBgBtn.setPadding(0, (int) pxFromDp(getActivity(), 6),0,(int) pxFromDp(getActivity(), 6));
        binding.ivBgBtnAnimal.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.unselected_back));
        binding.ivBgBtnAnimal.setPadding(0, (int) pxFromDp(getActivity(), 6),0,(int) pxFromDp(getActivity(), 6));
        binding.ivBgBtnCute.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.unselected_back));
        binding.ivBgBtnCute.setPadding(0, (int) pxFromDp(getActivity(), 6),0,(int) pxFromDp(getActivity(), 6));
        binding.ivBgBtnKpop.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.unselected_back));
        binding.ivBgBtnKpop.setPadding(0, (int) pxFromDp(getActivity(), 6),0,(int) pxFromDp(getActivity(), 6));
        binding.ivBgBtnLove.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.unselected_back));
        binding.ivBgBtnLove.setPadding(0, (int) pxFromDp(getActivity(), 6),0,(int) pxFromDp(getActivity(), 6));
        binding.ivBgBtnNeon.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.unselected_back));
        binding.ivBgBtnNeon.setPadding(0, (int) pxFromDp(getActivity(), 6),0,(int) pxFromDp(getActivity(), 6));

    }
}