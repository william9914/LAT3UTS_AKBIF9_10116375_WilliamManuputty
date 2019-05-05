package com.personalprofile.myprofile;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DailyHolder extends RecyclerView.ViewHolder {
    private TextView DailyTitleText = null;
    private ImageView DailyImageView = null;

    public DailyHolder(View itemView) {
        super(itemView);

        if(itemView != null)
        {
            DailyTitleText = (TextView)itemView.findViewById(R.id.card_view_image_title);

            DailyImageView = (ImageView)itemView.findViewById(R.id.card_view_image);
        }
    }

    public TextView getDailyTitleText() {
        return DailyTitleText;
    }

    public ImageView getDailyImageView() {
        return DailyImageView;
    }
}