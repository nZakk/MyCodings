import enitities.Comment;
import enitities.Post;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome");

        Post p1 = new Post(LocalDateTime.parse("2018-06-21T13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country", 12);
        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good Night");
        Comment c4 = new Comment("may the force be with you!");

        Post p2 = new Post(LocalDateTime.parse("2018-07-27T23:55:44"), "Good night guys!", "See you guys tomorrow", 8);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}