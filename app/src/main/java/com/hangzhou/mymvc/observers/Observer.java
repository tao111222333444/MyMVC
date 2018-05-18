package com.hangzhou.mymvc.observers;

import com.hangzhou.mymvc.bean.Data;

/**观察者  */
public interface Observer {
    /**数据ok
     * @param data 数据
     * */
    void onDataComplate(Data data);
}
