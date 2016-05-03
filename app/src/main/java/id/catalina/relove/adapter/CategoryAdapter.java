package id.catalina.relove.adapter;

import android.graphics.Color;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import id.catalina.relove.R;
import id.catalina.relove.model.Category;

/**
 * Created by ichakid on 4/26/2016.
 */
public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    private Category[] categories;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView icon;
        public TextView name;
        public View container;

        public ViewHolder(View v) {
            super(v);
            icon = (ImageView) v.findViewById(R.id.landing_category_item_icon);
            name = (TextView) v.findViewById(R.id.landing_category_item_name);
            container = (View) v.findViewById(R.id.landing_category_item);
        }
    }

    public CategoryAdapter(Category[] categories) {
        this.categories = categories;
    }

    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_landing_category, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.icon.setImageResource(categories[position].getIcon());
        holder.name.setText(categories[position].getName());
        holder.container.setBackgroundColor(Color.parseColor(categories[position].getColor()));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return categories.length;
    }
}
