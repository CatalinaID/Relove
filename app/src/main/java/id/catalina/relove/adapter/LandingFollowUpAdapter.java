package id.catalina.relove.adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import id.catalina.relove.R;
import id.catalina.relove.model.Category;
import id.catalina.relove.model.FollowUp;

/**
 * Created by ichakid on 4/26/2016.
 */
public class LandingFollowUpAdapter extends RecyclerView.Adapter<LandingFollowUpAdapter.ViewHolder> {
private FollowUp[] followUps;

public static class ViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView titleView;
    public TextView contentView;

    public ViewHolder(View v) {
        super(v);
        imageView = (ImageView) v.findViewById(R.id.landing_followup_image);
        titleView = (TextView) v.findViewById(R.id.landing_followup_title);
        contentView = (TextView) v.findViewById(R.id.landing_followup_content);
    }
}

    public LandingFollowUpAdapter(FollowUp[] followUps) {
        this.followUps = followUps;
    }

    @Override
    public LandingFollowUpAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_landing_followup, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.titleView.setText(followUps[position].getTitle());
        holder.contentView.setText(followUps[position].getContent());
        holder.imageView.setImageResource(followUps[position].getImage());
    }

    @Override
    public int getItemCount() {
        return followUps.length;
    }
}
