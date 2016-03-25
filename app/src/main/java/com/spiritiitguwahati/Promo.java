package com.spiritiitguwahati;

import android.app.Fragment;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by Aman on 9/24/2015.
 */
public class Promo extends Fragment {

    LinearLayout layoutmain, layout;

    public Promo() {
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.promo, container, false);
        VideoView v = (VideoView) rootView.findViewById(R.id.videoView);
        MediaController controller = new MediaController(getActivity());
        //Uri uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.promo);
        String path1="https://youtu.be/ZaOeFmCX8gU";
        Uri uri=Uri.parse(path1);
        v.setVideoURI(uri);
        v.setMediaController(controller);
        controller.setAnchorView(controller);
        v.requestFocus();
        v.start();
        /*try {
            layout = new LinearLayout(getActivity());
            LinearLayout.LayoutParams viewparam2 = new LinearLayout.LayoutParams(600, 600);
            viewparam2.setMargins(10, 10, 0, 0);
            layout.setLayoutParams(viewparam2);
            layout.setBackgroundColor(Color.BLACK);
            layout.addView(v);
            layout.addView(controller);
        } catch (Exception e) {
            e.printStackTrace();
        }
        layoutmain.addView(layout);*/
        return rootView;

    }
}
