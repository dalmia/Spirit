package com.spiritiitguwahati;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Aman on 9/24/2015.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class Home extends Fragment {

    TextView heading;
    LinearLayout day0, day1, day2, day3;

    public Home() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home, container, false);
        heading = (TextView) rootView.findViewById(R.id.heading);
        day0 = (LinearLayout) rootView.findViewById(R.id.day0);
        day1 = (LinearLayout) rootView.findViewById(R.id.day1);
        day2 = (LinearLayout) rootView.findViewById(R.id.day2);
        day3 = (LinearLayout) rootView.findViewById(R.id.day3);
        String currentDate = DateFormat.getDateInstance().format(new Date());

       if(currentDate.equals("30 Sep 2015")){
            heading.setText("Next Event On 2nd October.");

        }
        else if(currentDate.equals("1 Oct 2015")){
            heading.setText("Today's Schedule");
            day0.setVisibility(View.VISIBLE);
        }
       else if(currentDate.equals("Oct 1, 2015")){
           heading.setText("Today's Schedule");
           day0.setVisibility(View.VISIBLE);
       }
        else if(currentDate.equals("2 Oct 2015")){
            heading.setText("Some of today's Events");
           day0.setVisibility(View.GONE);
            day1.setVisibility(View.VISIBLE);
        }
       else if(currentDate.equals("3 Oct 2015")){
           heading.setText("Some of today's Events");
           day1.setVisibility(View.GONE);
           day2.setVisibility(View.VISIBLE);
       }
       else if(currentDate.equals("4 Oct 2015")){
           heading.setText("Some of today's Events");
           day2.setVisibility(View.GONE);
           day3.setVisibility(View.VISIBLE);
       }
       else if(currentDate.equals("Oct 2, 2015")){
           heading.setText("Some of today's Events");
           day0.setVisibility(View.GONE);
           day1.setVisibility(View.VISIBLE);
       }
        else if(currentDate.equals("Oct 3, 2015")){
            heading.setText("Some of today's Events");
            day1.setVisibility(View.GONE);
            day2.setVisibility(View.VISIBLE);
        }
        else if(currentDate.equals("Oct 4, 2015")){
            heading.setText("Some of today's Events");
            day2.setVisibility(View.GONE);
            day3.setVisibility(View.VISIBLE);
        }





        return rootView;

    }
}
