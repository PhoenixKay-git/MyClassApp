package com.bwie.test.mymooncake.contract;

import com.bwie.test.bean.MoonBean;
import com.bwie.test.mymooncake.base.BaseContract;

import java.util.List;

public interface MoonContract {
    interface View extends BaseContract.BaseView{
        void onSuccess(List<MoonBean.DataBean> list);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void getMoonCake(String pscid);
    }
}
