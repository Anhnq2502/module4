package com.example.blog.model;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "author", columnDefinition = "varchar(50)")
    private String author;
    @Column(name = "title", columnDefinition = "varchar(50)")
    private String title;
    @Column(name = "posts", columnDefinition = "text")
    private String posts;
    @Column(name = "date_created", columnDefinition = "varchar(45)")
    private String dateCreated;
    @Column(name = "status", columnDefinition = "varchar(50)")
    private String status;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Blog() {
    }

    public Blog(Integer id, String author, String title, String posts, String dateCreated, String status) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.posts = posts;
        this.dateCreated = dateCreated;
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosts() {
        return posts;
    }

    public void setPosts(String posts) {
        this.posts = posts;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
