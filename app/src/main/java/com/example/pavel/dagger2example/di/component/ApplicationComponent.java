package com.example.pavel.dagger2example.di.component;

import android.app.Application;
import android.content.Context;

import com.example.pavel.dagger2example.DemoApplication;
import com.example.pavel.dagger2example.data.DataManager;
import com.example.pavel.dagger2example.data.DbHelper;
import com.example.pavel.dagger2example.data.SharedPrefsHelper;
import com.example.pavel.dagger2example.di.ApplicationContext;
import com.example.pavel.dagger2example.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by pavel on 31.10.2017.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();
}
