package org.mapuna.daggerandroid;

import org.mapuna.daggerandroid.inject.DaggerApplicationComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class DAApplication extends DaggerApplication {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<DAApplication> applicationInjector() {
        return DaggerApplicationComponent.builder()
                // .build();
                .create(this);
    }
}
