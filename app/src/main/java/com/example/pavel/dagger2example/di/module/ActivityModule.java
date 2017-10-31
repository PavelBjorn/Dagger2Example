package com.example.pavel.dagger2example.di.module;

import android.app.Activity;
import android.content.Context;

import com.example.pavel.dagger2example.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pavel on 31.10.2017.
 */
@Module
public class ActivityModule {

    private Activity activity;


    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return activity;
    }

    @Provides
    Activity provideActivity() {
        return activity;
    }
}
