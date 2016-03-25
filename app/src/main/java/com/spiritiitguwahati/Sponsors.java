package com.spiritiitguwahati;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Aman on 9/24/2015.
 */
public class Sponsors extends Fragment {

    public Sponsors(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sponsors, container, false);
        return rootView;

    }
}
