package domain;

public class post {

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
    // + get/set на все поля

    public class header{
        private String authorImage;
        private String authorName;
        private String dateTime;
        // + get/set на все поля
    }

    public class body{
        private String text;
        private String postShare;

        public class geo{
            private String typeGeo;
            private String coordinate;
        }
        // + get/set на все поля
    }

    public class footer{
        public class comment{
            public int countComment;
            private int canPost;
            private int groupCanPost;
            private boolean canOpen;
            private boolean canClose;
        }

        public class like{
            public int countLike;
            public int authorLike;
            private int canLike;
            private int canPublish;
        }

        public class repost{
            public int countRepost;
            private int authorReposted;
        }

        public class view{
            public int countView;
        }
        // + get/set на все поля
    }
}
