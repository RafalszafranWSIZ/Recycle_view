package com.example.stud.recycle_view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by W56998 on 2018-04-12.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {

    @Override
    public ListViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        return null ;
    }
    @Override
    public void onBindViewHolder( ListViewHolder holder, int position) {
    }
    @Override
    public int getItemCount() {
        return 0 ;
    }
    public class ListViewHolder extends RecyclerView.ViewHolder {
        public ListViewHolder(View itemView) {
            super (itemView);
        }
    }
}