package com.personalprofile.myprofile;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public class GalleryHolder extends RecyclerView.ViewHolder {

    private ImageView GaleryImageView = null;

    public GalleryHolder(View itemView) {
        super(itemView);

        if(itemView != null)
        {
            GaleryImageView = (ImageView)itemView.findViewById(R.id.card_view_image);
        }
    }

    public ImageView getGaleryImageView() {
        return GaleryImageView;
    }
}

