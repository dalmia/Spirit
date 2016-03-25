package com.spiritiitguwahati;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Aman on 9/24/2015.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class Merchandise extends Fragment {

    Button book;
    public Merchandise(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.merchandise, container, false);
        book = (Button) rootView.findViewById(R.id.book);
        book.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tinyurl.com/Spirit15T-shirts"));
                startActivity(intent);
            }
        });
        return rootView;

    }
}
