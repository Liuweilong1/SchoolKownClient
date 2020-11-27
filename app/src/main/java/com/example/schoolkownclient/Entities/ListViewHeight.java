package com.example.schoolkownclient.Entities;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ListViewHeight {
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return;
        }

        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);  // 获取item高度
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        // 最后再加上分割线的高度和padding高度，否则显示不完整。
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1))+listView.getPaddingTop()+listView.getPaddingBottom();
        listView.setLayoutParams(params);
    }
    public static int setListViewHeightBasedOnChildrenTwo(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return 0;
        }

        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);  // 获取item高度
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        // 最后再加上分割线的高度和padding高度，否则显示不完整。
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1))+listView.getPaddingTop()+listView.getPaddingBottom();
        listView.setLayoutParams(params);
        return params.height;
    }
}
