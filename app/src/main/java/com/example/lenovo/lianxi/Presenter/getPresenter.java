package com.example.lenovo.lianxi.Presenter;

import com.example.lenovo.lianxi.Bean.Bean;
import com.example.lenovo.lianxi.Model.getModel;
import com.example.lenovo.lianxi.View.getView;

/**
 * Created by lenovo on 2018/4/9.
 */

public class getPresenter {
    private final getModel model;
    private getView view;
    public getPresenter(getView view) {
        this.view = view;
        model=new getModel();
    }

    public void getShu(){
        model.getShuJu(new getModel.getData() {
            @Override
            public void Data(Bean bean) {
                view.getShow(bean);
            }
        });
    }

}
