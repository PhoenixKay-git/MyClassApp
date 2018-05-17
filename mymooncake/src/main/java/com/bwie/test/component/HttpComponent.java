package com.bwie.test.component;

import com.bwie.test.module.HttpModule;
import com.bwie.test.mymooncake.MoonCakeActivity;

import dagger.Component;

@Component(modules = HttpModule.class)
public interface HttpComponent {
    void inject(MoonCakeActivity moonCakeActivity);
}
