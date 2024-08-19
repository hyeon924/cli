package org.example;

public class Article {
    private int id;
    private String subject;
    private String content;

    Article(int id, String subject, String content) {
        this.id = id;
        this.subject = subject;
        this.content = content;
    }

    public int getId () {
        return this.id;
    }
    public String getSubject () {
        return this.subject;
    }
    public String getContent () {
        return this.content;
    }

}