package id.catalina.relove.model;

import id.catalina.relove.R;

/**
 * Created by ichakid on 4/26/2016.
 */
public class FollowUp {
    private long id;
    private String title;
    private String content;
    private int image;

    public static String CONTENT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
            "Quisque nec fermentum orci. Sed metus turpis, mollis placerat consectetur nec, " +
            "pretium tempus odio.";
    public static final FollowUp[] FOLLOW_UPS = {
            new FollowUp(1, "Banjir Bandung", CONTENT, R.drawable.followup_1),
            new FollowUp(2, "Tanah Longsor", CONTENT, R.drawable.followup_2),
            new FollowUp(3, "Peduli Rohingya", CONTENT, R.drawable.followup_3),
            new FollowUp(4, "Asap Riau", CONTENT, R.drawable.followup_4),
            new FollowUp(5, "Bangun Sekolah Roboh", CONTENT, R.drawable.followup_5),
    };

    public FollowUp(long id, String title, String content, int image) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
