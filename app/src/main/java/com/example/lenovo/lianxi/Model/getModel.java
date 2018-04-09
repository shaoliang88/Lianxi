package com.example.lenovo.lianxi.Model;

import android.database.Observable;

import com.example.lenovo.lianxi.Bean.Bean;
import com.example.lenovo.lianxi.Utils.RetrofitHelp;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by lenovo on 2018/4/9.
 */

public class getModel {
    public void getShuJu(final  getData data){
        Flowable<Bean> bean = RetrofitHelp.getAPI().bean();
        bean.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io())
                .subscribe(new Consumer<Bean>() {
                    @Override
                    public void accept(Bean bean) throws Exception {
                         data.Data(bean);
                    }
                });
    }
    public interface getData{
        void Data(Bean bean);
    }
}
