package com.example.lenovo.lianxi.Utils;

import android.database.Observable;

import com.example.lenovo.lianxi.Bean.Bean;

import io.reactivex.Flowable;
import retrofit2.http.GET;

/**
 * Created by lenovo on 2018/4/9.
 */

public interface APIService {
    @GET(Api.TAG_URL)
    Flowable<Bean> bean();

}
