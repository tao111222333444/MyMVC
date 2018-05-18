package com.hangzhou.mymvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hangzhou.mymvc.Controllers.TasksController;
import com.hangzhou.mymvc.Views.TasksView;
import com.hangzhou.mymvc.bean.Data;
import com.hangzhou.mymvc.models.TasksRepository;

/**
 * @author 29794
 */
public class MainActivity extends AppCompatActivity implements TasksView{
    private TasksController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化Controller,this就是View,通过构造器注入
        controller = new TasksController(this);
        //初始化Model, 将View通过构造器注入Model
        TasksRepository model = new TasksRepository(this);
        //将Controller的观察者注入Model
        model.addObserver(controller);
        //将model注入到Controller
        controller.addModel(model);
        viewCreate();
    }

    /**接收Controller的事件，并处理*/
    @Override
    public void onDataBack(Data data) {
        //处理事件
    }


    @Override
    public void viewCreate() {
        controller.loadNomData();
    }

    @Override
    public void upDataList() {

    }

    @Override
    public void beginLoadData() {

    }
}
