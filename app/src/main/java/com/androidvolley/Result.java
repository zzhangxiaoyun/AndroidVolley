package com.androidvolley;

import java.util.List;

/**
 * Created by xiaoyun on 17-5-9.
 */

public class Result {
    private List<Movie> list;
    private int pageCount;

    public List<Movie> getList() {
        return list;
    }

    public void setList(List<Movie> list) {
        this.list = list;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
