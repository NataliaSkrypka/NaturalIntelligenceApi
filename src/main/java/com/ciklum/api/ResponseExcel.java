package com.ciklum.api;

/**
 * Created by skn on 05/10/2015.
 */
public class ResponseExcel {

    private final long id;
    private final String text;

    public ResponseExcel(long id, String text) {
        this.id = id;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
