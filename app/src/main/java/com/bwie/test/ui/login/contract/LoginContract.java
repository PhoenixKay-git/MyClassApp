package com.bwie.test.ui.login.contract;

import com.bwie.test.bean.UserBean;
import com.bwie.test.ui.base.BaseContract;

public interface LoginContract {
    interface View extends BaseContract.BaseView {
        void loginSuccess(UserBean userBean);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void login(String mobile, String password);
    }
}
