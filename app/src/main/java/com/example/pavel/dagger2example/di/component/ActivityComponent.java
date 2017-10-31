package com.example.pavel.dagger2example.di.component;

import com.example.pavel.dagger2example.MainActivity;
import com.example.pavel.dagger2example.di.PerActivity;
import com.example.pavel.dagger2example.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by pavel on 31.10.2017.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
