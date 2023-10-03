package com.themecolor.callerphone.wallpaper.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.themecolor.callerphone.wallpaper.R;
import com.themecolor.callerphone.wallpaper.databinding.FragmentStartUpBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StartUpFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StartUpFragment extends Fragment {


    private FragmentStartUpBinding binding;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public StartUpFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment StartUpFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StartUpFragment newInstance(String param1, String param2) {
        StartUpFragment fragment = new StartUpFragment();
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

        binding = FragmentStartUpBinding.inflate(inflater, container, false);
        View view = binding.getRoot();




        return view;
    }
}