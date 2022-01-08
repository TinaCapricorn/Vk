package domain;

public class Post{

    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String postType;
    private int canPin;
    private int canDelete;
    private int canEdit;
    public int isPinned;
    public int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    private Header header;
    private Body body;
    private Footer footer;
    // + get/set на все поля
}
