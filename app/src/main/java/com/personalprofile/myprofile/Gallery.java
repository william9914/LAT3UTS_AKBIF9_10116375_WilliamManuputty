package com.personalprofile.myprofile;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Gallery extends Fragment {
    private List<GalleryView> GalleryItemList = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        initializeDailyItemList();

        // Create the recyclerview.
        RecyclerView GalleryRecyclerView = (RecyclerView)view.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),2);
        // Set layout manager.
        GalleryRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        GalleryAdapter GaleryDataAdapter = new GalleryAdapter(GalleryItemList);
        // Set data adapter.
        GalleryRecyclerView.setAdapter(GaleryDataAdapter);
        return view;
    }
    private void initializeDailyItemList()
    {
        if(GalleryItemList == null)
        {
            GalleryItemList = new ArrayList<GalleryView>();
            GalleryItemList.add(new GalleryView(R.drawable.will1));
            GalleryItemList.add(new GalleryView(R.drawable.will2));
            GalleryItemList.add(new GalleryView(R.drawable.will3));
            GalleryItemList.add(new GalleryView(R.drawable.will4));
            GalleryItemList.add(new GalleryView(R.drawable.will5));
            GalleryItemList.add(new GalleryView(R.drawable.will6));
        }
    }

}