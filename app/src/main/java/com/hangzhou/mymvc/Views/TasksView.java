package com.hangzhou.mymvc.Views;

import com.hangzhou.mymvc.bean.Data;

/**我是一个View,我本身就是观察者*/
public interface TasksView {
    void onDataBack(Data data);
    /**当列表初始化后，告诉控制器该加载数据了*/
    void viewCreate();
    /**更新列表*/
    void upDataList();
    /**just for ui*/
    void beginLoadData();
}
