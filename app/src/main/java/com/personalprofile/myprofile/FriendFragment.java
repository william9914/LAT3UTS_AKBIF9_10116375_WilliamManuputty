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

public class FriendFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<FriendView> FriendItemList = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_friend, container, false);
        initializeDailyItemList();

        RecyclerView dailyRecyclerView = (RecyclerView)view.findViewById(R.id.card_view_recycler_list);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),2);
        dailyRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        FriendAdapter FriendDataAdapter = new FriendAdapter(FriendItemList);
        // Set data adapter.
        dailyRecyclerView.setAdapter(FriendDataAdapter);
        return view;
    }
    private void initializeDailyItemList()
    {
        if(FriendItemList == null)
        {
            FriendItemList = new ArrayList<FriendView>();
            FriendItemList.add(new FriendView("Agam", R.drawable.agam));
            FriendItemList.add(new FriendView("Gilang", R.drawable.gilang));
            FriendItemList.add(new FriendView("Kiki", R.drawable.kiki));
            FriendItemList.add(new FriendView("Riyan", R.drawable.riyan));
            FriendItemList.add(new FriendView("Jen", R.drawable.zain));

        }
    }

}