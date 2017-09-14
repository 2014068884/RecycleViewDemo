package com.example.recycleviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aseba on 14/09/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.AndroidViewHolder>{
    ArrayList<AndroidVersion> androidVersionArrayList;

    public CustomAdapter(ArrayList<AndroidVersion> amdroidVersionArrayList) {
        this.androidVersionArrayList = amdroidVersionArrayList;
    }

    @Override
    public AndroidViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_layout, parent, false);
        AndroidViewHolder androidViewHolder = new AndroidViewHolder(view);
        return androidViewHolder;
    }

    @Override
    public void onBindViewHolder(AndroidViewHolder holder, int position) {
        AndroidVersion version =  androidVersionArrayList.get(position);
        holder.logo.setImageResource(version.getLogo());
        holder.codename.setText(version.getCodename());
        holder.version.setText(version.getVersion());
        holder.api.setText(version.getVersion());
        holder.date.setText(version.getDate());
    }

    @Override
    public int getItemCount() {
        return androidVersionArrayList.size();
    }

    public static class AndroidViewHolder extends RecyclerView.ViewHolder {
        ImageView logo;
        TextView codename, version, api, date;

        public AndroidViewHolder(View view) {
            super(view);
            logo = (ImageView) view.findViewById(R.id.iv_logo);
            codename = (TextView) view.findViewById(R.id.tv_codename);
            version = (TextView) view.findViewById(R.id.tv_version);
            api = (TextView) view.findViewById(R.id.tv_api);
            date = (TextView) view.findViewById(R.id.tv_date);
        }
    }
}
