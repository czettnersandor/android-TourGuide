package com.czettner.tourguide;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.czettner.tourguide.ItemTriptargetFragment.OnListFragmentInteractionListener;

import java.util.ArrayList;

public class MyItemTriptargetRecyclerViewAdapter extends RecyclerView.Adapter<MyItemTriptargetRecyclerViewAdapter.ViewHolder> {

    private final ArrayList<Triptarget> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyItemTriptargetRecyclerViewAdapter(ArrayList<Triptarget> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_itemtriptarget, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mNameView.setText(mValues.get(position).getName());
        holder.mContentView.setText(mValues.get(position).getDescription());
        holder.mImageView.setImageResource(mValues.get(position).getImageResource());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mNameView;
        public final TextView mContentView;
        public final ImageView mImageView;
        public Triptarget mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            // TODO: phone number, web address, etc if available
            mNameView = (TextView) view.findViewById(R.id.name);
            mContentView = (TextView) view.findViewById(R.id.description);
            mImageView = (ImageView) view.findViewById(R.id.list_image);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
