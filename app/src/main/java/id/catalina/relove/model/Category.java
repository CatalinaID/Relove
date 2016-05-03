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
            new Category(1, "Anak", "#800080", R.drawable.ic_category_childs),
            new Category(2, "Buku", "#c83737", R.drawable.ic_category_books),
            new Category(3, "Elektronik", "#00aa88", R.drawable.ic_category_computer),
            new Category(4, "Fashion Pria", "#006680", R.drawable.ic_category_men),
            new Category(5, "Fashion Wanita", "#d40055", R.drawable.ic_category_women),
            new Category(6, "Hobi", "#ffcc00", R.drawable.ic_category_hobbies),
            new Category(7, "Rumah Tangga", "#2ca02c", R.drawable.ic_category_houseware),
            new Category(8, "Lain-Lain", "#5a2ca0", R.drawable.ic_category_others),
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
