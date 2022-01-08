package domain;

public class post {

    private int id;
    private int ownerId;
    // + get/set на все поля

    public class header{
        private String authorImage;
        private String authorName;
        private String dateTime;
        // + get/set на все поля
    }

    public class body{
        private String text;
        private String postMedia;
        private String postShare;
        // + get/set на все поля
    }

    public class footer{
        private int countLike;
        private int countComment;
        private int countShare;
        private int countView;
        // + get/set на все поля
    }
}
