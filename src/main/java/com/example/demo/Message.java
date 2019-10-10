package com.example.demo;

import com.sun.istack.NotNull;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity

public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=10,max=40)
    private String content;

    @NotNull
    private int posteddate;

    @NotNull
    @Size(min=3)
    private String postedby;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPosteddate() {
        return posteddate;
    }

    public void setPosteddate(int posteddate) {
        this.posteddate = posteddate;
    }

    public String getPostedby() {
        return postedby;
    }

    public void setPostedby(String postedby) {
        this.postedby = postedby;
    }
}
