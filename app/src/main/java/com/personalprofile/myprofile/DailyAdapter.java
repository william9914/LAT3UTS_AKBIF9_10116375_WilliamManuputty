package com.personalprofile.myprofile;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DailyAdapter extends RecyclerView.Adapter<DailyHolder> {
    private List<DailyList> DailyItemList;

    public DailyAdapter(List<DailyList> DailyItemList) {
        this.DailyItemList = DailyItemList;
    }


    @Override
    public DailyHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View DailyItemView = layoutInflater.inflate(R.layout.dailylist, parent, false);

        final TextView DailyTitleView = (TextView)DailyItemView.findViewById(R.id.card_view_image_title);
        final ImageView DailyImageView = (ImageView)DailyItemView.findViewById(R.id.card_view_image);


        DailyHolder ret = new DailyHolder(DailyItemView);
        return ret;
    }


    @Override
    public void onBindViewHolder(@NonNull DailyHolder holder, int position) {
        if (DailyItemList != null) {
            DailyList dailyItem = DailyItemList.get(position);

            if (dailyItem != null) {
                holder.getDailyTitleText().setText(dailyItem.getDailyName());
                holder.getDailyImageView().setImageResource(dailyItem.getDailyImageId());
            }
        }
    }

    @Override
    public int getItemCount() {
        int ret = 0;
        if(DailyItemList!=null)
        {
            ret = DailyItemList.size();
        }
        return ret;
    }
}