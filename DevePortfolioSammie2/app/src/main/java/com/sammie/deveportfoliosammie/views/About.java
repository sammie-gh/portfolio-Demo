package com.sammie.deveportfoliosammie.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sammie.deveportfoliosammie.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class About extends Fragment {


    public About() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View aboutView = inflater.inflate(R.layout.fragment_about, container, false);
        // Inflate the layout for this fragment
        return aboutView;
    }

}
