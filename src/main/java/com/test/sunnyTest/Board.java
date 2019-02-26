package com.test.sunnyTest;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Board {

    @Id
    @GeneratedValue
    Integer idx;

    @Column(length=50)
    String title;

    @Column(length=300)
    String content;

    String writer;
    Date insertDate;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
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

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Board() {
    }

    public Board(String title, String content, String writer, Date insertDate) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.insertDate = insertDate;
    }
}