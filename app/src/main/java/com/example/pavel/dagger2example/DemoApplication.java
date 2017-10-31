package com.example.pavel.dagger2example;

import android.app.Application;
import android.content.Context;

import com.example.pavel.dagger2example.data.DataManager;
import com.example.pavel.dagger2example.di.component.ApplicationComponent;
import com.example.pavel.dagger2example.di.component.DaggerApplicationComponent;
import com.example.pavel.dagger2example.di.module.ApplicationModule;

import javax.inject.Inject;

/**
 * Created by pavel on 31.10.2017.
 */

public class DemoApplication extends Application {

    protected ApplicationComponent component;

    @Inject
    DataManager dataManager;


    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        component.inject(this);
    }

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
