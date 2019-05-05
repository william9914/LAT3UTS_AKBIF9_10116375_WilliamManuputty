package com.personalprofile.myprofile;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryHolder> {
    private List<GalleryView> GalleryItemList;

    public GalleryAdapter(List<GalleryView> GalleryItemList) {
        this.GalleryItemList = GalleryItemList;
    }


    @Override
    public GalleryHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View GaleryItemView = layoutInflater.inflate(R.layout.gallerylist, parent, false);
        final ImageView GaleryImageView = (ImageView)GaleryItemView.findViewById(R.id.card_view_image);
        GalleryHolder ret = new GalleryHolder(GaleryItemView);
        return ret;
    }


    @Override
    public void onBindViewHolder(@NonNull GalleryHolder holder, int position) {
        if (GalleryItemList != null) {
            // Get car item dto in list.
            GalleryView GaleryItem = GalleryItemList.get(position);

            if (GaleryItem != null) {
                // Set car item title.

                // Set car image resource id.
                holder.getGaleryImageView().setImageResource(GaleryItem.getG_Image());
            }
        }
    }

    @Override
    public int getItemCount() {
        int ret = 0;
        if(GalleryItemList!=null)
        {
            ret = GalleryItemList.size();
        }
        return ret;
    }
}