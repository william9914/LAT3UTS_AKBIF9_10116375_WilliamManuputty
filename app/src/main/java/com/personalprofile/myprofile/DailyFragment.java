package com.personalprofile.myprofile;
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


public class DailyFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<DailyList> DailyItemList = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_daily, container, false);
        initializeDailyItemList();

        // Create the recyclerview.
        RecyclerView dailyRecyclerView = (RecyclerView)view.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),1);
        // Set layout manager.
        dailyRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        DailyAdapter DailyDataAdapter = new DailyAdapter(DailyItemList);
        // Set data adapter.
        dailyRecyclerView.setAdapter(DailyDataAdapter);
        return view;
    }

    /* Initialise car items in list. */
    private void initializeDailyItemList()
    {
        if(DailyItemList == null)
        {
            DailyItemList = new ArrayList<DailyList>();
            DailyItemList.add(new DailyList("Sleep", R.drawable.icon_sleep_1));
            DailyItemList.add(new DailyList("Playing", R.drawable.controller_1784571_1280));
            DailyItemList.add(new DailyList("Watch Youtube", R.drawable.watching_a_video_on_a_tablet));
            DailyItemList.add(new DailyList("Eat", R.drawable.eating_icon_0));

        }
    }

}