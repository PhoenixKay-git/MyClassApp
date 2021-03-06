package com.bwie.test.mymooncake.base;

public interface BaseContract {
    interface BasePresenter<T extends BaseView> {
        void attchView(T view);
        void detachView();
    }

    interface BaseView {
        void showLoading();
        void dismissLoading();
    }
}
