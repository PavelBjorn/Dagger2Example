package com.example.pavel.dagger2example.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.pavel.dagger2example.di.ApplicationContext;
import com.example.pavel.dagger2example.di.DatabaseInfo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pavel on 31.10.2017.
 */

@Module
public class ApplicationModule {

    private final Application application;


    public ApplicationModule(Application application) {
        this.application = application;
    }


    @Provides
    @ApplicationContext
    public Context provideContext(){
        return application;
    }

    @Provides
    Application provideApplication() {
        return application;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return "demo-dagger.db";
    }

    @Provides
    @DatabaseInfo
    Integer provideDatabaseVersion() {
        return 2;
    }

    @Provides
    SharedPreferences provideSharedPrefs() {
        return application.getSharedPreferences("demo-prefs", Context.MODE_PRIVATE);
    }
}
