package id.catalina.relove.model;

import id.catalina.relove.R;

/**
 * Created by ichakid on 4/26/2016.
 */
public class Category {
    private long id;
    private String name;
    private String color;
    private int icon;

    public static final Category[] CATEGORIES = {
            new Category(1, "Anak", "#2196F3", R.drawable.ic_category_childs),
            new Category(2, "Elektronik", "#E91E63", R.drawable.ic_category_computer),
            new Category(3, "Kendaraan", "#FFD600", R.drawable.ic_category_motor),
            new Category(4, "Hewan Peliharaan", "#B71C1C", R.drawable.ic_category_pets),
            new Category(5, "Jam", "#673AB7", R.drawable.ic_category_watches),
            new Category(6, "Hobi", "#009688", R.drawable.ic_category_hobbies),
            new Category(7, "Pakaian", "#795548", R.drawable.ic_drawable_kitchen),
            new Category(8, "Tas", "#FF9800", R.drawable.ic_category_bags),
            new Category(9, "Rumah Tangga", "#00BCD4", R.drawable.ic_category_houseware),
    };

    public Category(long id, String name, String color, int icon) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.icon = icon;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
