package com.hangzhou.mymvc.models;

import com.hangzhou.mymvc.Views.TasksView;
import com.hangzhou.mymvc.bean.Data;
import com.hangzhou.mymvc.observers.Observer;

import java.util.ArrayList;

/**我是一个model*/
public class TasksRepository {

    /**观察者集合*/
    public static ArrayList<Observer> observers = new ArrayList<Observer>();
    private TasksView tasksView;
    public TasksRepository(TasksView view){
        tasksView = view;
    }

    /**添加观察者*/
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    /**从服务器请求获取数据*/
    public void getTasks(){
        //访问服务器，  耗时。。。服务器返回时
        Data data = fromServer();

        //发送事件
        for(Observer observer:observers){
            observer.onDataComplate(data);
        }
    }

    /**从内存缓存获取数据*/
    public Data getTaskCache(){
        return null;
    }
    /**从磁盘缓存获取数据*/
    public Data getTaskDiskCache(){
        return null;
    }
    /**保存一条数据*/
    public boolean saveTask(Data data){
        return true;
    }
    /**对数据进行排序*/
    public Data orderData(Data data,int orderType){
        return data;
    }

    private Data fromServer() {
        return null;
    }

}
