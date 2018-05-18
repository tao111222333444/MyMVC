package com.hangzhou.mymvc.Controllers;

import com.hangzhou.mymvc.Views.TasksView;
import com.hangzhou.mymvc.bean.Data;
import com.hangzhou.mymvc.models.TasksRepository;
import com.hangzhou.mymvc.observers.Observer;
/**
 * 我是一个Controller  （控制器）
 * */
public class TasksController implements Observer {
    private TasksView tasksView;
    private TasksRepository tasksRepository;
    /**构造器   需要依赖注入view*/
    public TasksController(TasksView view){
        tasksView = view;
    }

    public void addModel(TasksRepository model){
        tasksRepository= model;
    }

    /**接收事件*/
    @Override
    public void onDataComplate(Data data) {
        //处理事件
    }

    public void loadNomData(){
        if(tasksRepository.getTaskCache() == null){
            //执行Modle
            tasksRepository.getTasks();
            //执行View
            tasksView.beginLoadData();
        }
    }
}
