package com.example.wangyinbao.myapplication;

import android.widget.AbsListView;

/**
 * Created by wangyinbao on 2017/9/13.
 */

public abstract class EndlessScrollListener implements AbsListView.OnScrollListener{

    private int visibleThreshold = 5;
    private int currentPage = 0;

    private int previousTotalItemCount = 0;

    private boolean loading = true;

    private int startingPageIndex = 0;

    public EndlessScrollListener(){

    }

    public EndlessScrollListener(int visibleThreshold){
        this.visibleThreshold = visibleThreshold;
    }

    public EndlessScrollListener(int visibleThreshold, int startPage){
        this.visibleThreshold = visibleThreshold;
        this.startingPageIndex = startPage;
        this.currentPage = startPage;
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        if (totalItemCount < previousTotalItemCount){
            this.currentPage = this.startingPageIndex;
            this.previousTotalItemCount = totalItemCount;
            if (totalItemCount == 0){
                this.loading = true;
            }
        }

        if (loading && (totalItemCount > previousTotalItemCount)){
            loading =false;
            previousTotalItemCount = totalItemCount;
            currentPage++;
        }

        if (!loading && (firstVisibleItem +visibleItemCount + visibleThreshold) >= totalItemCount){
            loading = onLoadMore(currentPage+1, totalItemCount);
        }
    }

    public abstract boolean onLoadMore(int page, int totalItemCount);

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {

    }
}

