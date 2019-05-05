package com.personalprofile.myprofile;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FriendAdapter extends RecyclerView.Adapter<FriendHolder> {
    private List<FriendView> FriendItemList;

    public FriendAdapter(List<FriendView> FriendItemList) {
        this.FriendItemList = FriendItemList;
    }


    @Override
    public FriendHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View FriendItemView = layoutInflater.inflate(R.layout.friend_list, parent, false);

        final TextView FriendTitleView = (TextView)FriendItemView.findViewById(R.id.card_view_image_title);

        final ImageView FriendImageView = (ImageView)FriendItemView.findViewById(R.id.card_view_image);


        FriendHolder ret = new FriendHolder(FriendItemView);
        return ret;
    }


    @Override
    public void onBindViewHolder(@NonNull FriendHolder holder, int position) {
        if (FriendItemList != null) {
            // Get car item dto in list.
            FriendView FriendItem = FriendItemList.get(position);

            if (FriendItem != null) {
                // Set car item title.
                holder.getFriendTitleText().setText(FriendItem.getF_Name());
                // Set car image resource id.
                holder.getFriendImageView().setImageResource(FriendItem.getF_Image());
            }
        }
    }

    @Override
    public int getItemCount() {
        int ret = 0;
        if(FriendItemList!=null)
        {
            ret = FriendItemList.size();
        }
        return ret;
    }
}