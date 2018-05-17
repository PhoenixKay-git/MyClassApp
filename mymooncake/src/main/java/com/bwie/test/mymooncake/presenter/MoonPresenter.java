package com.bwie.test.mymooncake.presenter;

import android.annotation.SuppressLint;

import com.bwie.test.bean.MoonBean;
import com.bwie.test.mymooncake.base.BasePresenter;
import com.bwie.test.mymooncake.contract.MoonContract;
import com.bwie.test.utils.MoonApi;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class MoonPresenter extends BasePresenter<MoonContract.View> implements MoonContract.Presenter{
    private MoonApi moonApi;

    public MoonPresenter(MoonApi moonApi) {
        this.moonApi = moonApi;
    }

    @Override
    public void getMoonCake(String pscid) {
        moonApi.getMoonCake(pscid)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<MoonBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(MoonBean moonBean) {
                        mView.onSuccess((List<MoonBean.DataBean>) moonBean);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
