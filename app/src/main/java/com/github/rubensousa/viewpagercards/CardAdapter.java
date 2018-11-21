package com.github.rubensousa.viewpagercards;

//our first comment
import android.support.v7.widget.CardView;

public interface CardAdapter {

    int MAX_ELEVATION_FACTOR = 15;

    float getBaseElevation();

    CardView getCardViewAt(int position);

    int getCount();
}
