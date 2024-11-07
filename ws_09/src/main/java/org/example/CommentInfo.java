package org.example;

public class CommentInfo {
    private String text;
    private String author;

    // 생성자
    public CommentInfo() {
        this.text = text;
        this.author = author;
    }

    // Getter와 Setter
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "CommentInfo{" +
                "text='" + text + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}

