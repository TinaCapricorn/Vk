package domain;

public class Post{

    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private String postType;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    public int isPinned;
    public boolean markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    private Header header;
    private Body body;
    private Comment comment;
    private Like like;
    private Repost repost;
    private View view;
    private Geo geo;
    // + get/set на все поля
}
