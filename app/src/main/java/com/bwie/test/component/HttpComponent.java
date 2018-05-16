package com.bwie.test.component;

import com.bwie.test.module.HttpModule;
import com.bwie.test.ui.classify.ClassifyFragment;
import com.bwie.test.ui.classify.ListActivity;
import com.bwie.test.ui.homepage.HomePageFragment;
import com.bwie.test.ui.login.LoginActivity;

import dagger.Component;

@Component(modules = HttpModule.class)
public interface HttpComponent {
    void inject(LoginActivity loginActivity);

    void inject(HomePageFragment homePageFragment);

    void inject(ClassifyFragment classifyFragment);

   void inject(ListActivity listActivity);
}
