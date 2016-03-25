package com.spiritiitguwahati;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Aman on 9/24/2015.
 */
public class Events extends Fragment {

    ImageView cricket, football, basketball, hockey, athletics, badminton, chess,
            squash, tabletennis, tennis, volleyball, weightlifting;


    public Events() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.events, container, false);
        cricket = (ImageView) rootView.findViewById(R.id.cricket);
        football = (ImageView) rootView.findViewById(R.id.football);
        hockey = (ImageView) rootView.findViewById(R.id.hockey);
        basketball = (ImageView) rootView.findViewById(R.id.basketball);
        athletics = (ImageView) rootView.findViewById(R.id.athletics);
        chess = (ImageView) rootView.findViewById(R.id.chess);
        volleyball = (ImageView) rootView.findViewById(R.id.volleyball);
        tennis = (ImageView) rootView.findViewById(R.id.tennis);
        tabletennis = (ImageView) rootView.findViewById(R.id.tabletennis);
        squash = (ImageView) rootView.findViewById(R.id.squash);
        weightlifting = (ImageView) rootView.findViewById(R.id.weightlifting);
        badminton = (ImageView) rootView.findViewById(R.id.badminton);
        cricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Cricket.class));
            }
        });

        football.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Football.class));
            }
        });
        basketball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), BasketBall.class));
            }
        });
        hockey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Hockey.class));
            }
        });
        chess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Chess.class));
            }
        });
        athletics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Athletics.class));
            }
        });
        badminton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Badminton.class));
            }
        });
        tennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Tennis.class));
            }
        });
        tabletennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TableTennis.class));
            }
        });
        squash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Squash.class));
            }
        });
        volleyball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), VolleyBall.class));
            }
        });
        weightlifting.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), WeightLifting.class));
            }
        });


        return rootView;

    }


}
