package com.marlim.marlim_email_sender.models;

import java.io.Serial;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.lang.NonNull;

public class EmailTemplate implements Serializable{
    @NonNull
    private String subject;
    @NonNull
    private String to;
    @NonNull
    private String text;
    private boolean offer;

    @Serial
    private static final Long serialVersionUID = 1L;
    
    public EmailTemplate(@JsonProperty String subject, 
                         @JsonProperty String to, 
                         @JsonProperty String text,
                         @JsonProperty boolean offer) {
        this.subject = subject;
        this.to = to;
        this.text = text;
        this.offer = offer;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isOffer() {
        return offer;
    }

    public void setOffer(boolean offer) {
        this.offer = offer;
    }
    
}
