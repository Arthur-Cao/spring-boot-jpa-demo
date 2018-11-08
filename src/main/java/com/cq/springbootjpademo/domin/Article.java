package com.cq.springbootjpademo.domin;
import javax.persistence.*;
import java.util.List;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    @OneToMany(mappedBy = "article",cascade = {CascadeType.PERSIST,CascadeType.REMOVE},fetch = FetchType.EAGER)
    private List<Comment> comments;

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    @ManyToMany(mappedBy = "articles")
    private List<Topic> topics;

    public Article() {
    }

    public Long getId() {
        return id;
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

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
