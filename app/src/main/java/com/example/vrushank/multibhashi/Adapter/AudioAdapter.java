package com.example.vrushank.multibhashi.Adapter;

import android.content.Context;
import android.provider.MediaStore;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vrushank.multibhashi.Model.Model;
import com.example.vrushank.multibhashi.R;

/**
 * Created by sid_k on 11-04-2017.
 */

public class AudioAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    Context context;
    Model list [];

    public AudioAdapter(Context c, Model l[]) {
        list = l;
        context = c;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case 1:
                return new AudioViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_audio_adapter, parent, false));
           case 0:
                return new BlankViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.blank_list, parent, false));

        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int itemType = getItemViewType(position);
        if (itemType == 1) {
            ((AudioViewHolder)holder).id.setText(list[position].getItemid());
            ((AudioViewHolder)holder).desc.setText(list[position].getDesc());
        } else if (itemType == 0) {

        }else {
            Log.d("AudioAdapter", "Invalid item type");
        }

    }

    @Override
    public int getItemCount() {
        if (list.length > 0)
            return list.length;
        else
            return 1;
    }

    @Override
    public int getItemViewType(int position) {

        if (list.length > 0) {
                return 1;
        } else {
            return 0;
        }
    }



    private class AudioViewHolder extends RecyclerView.ViewHolder {

        private TextView id, desc;

        public AudioViewHolder(View itemView) {
            super(itemView);
            id = (TextView) itemView.findViewById(R.id.itemID);
            desc = (TextView) itemView.findViewById(R.id.itemDesc);

        }
    }



    private class BlankViewHolder extends RecyclerView.ViewHolder {
        public BlankViewHolder(View itemView) {
            super(itemView);
        }
    }
}
