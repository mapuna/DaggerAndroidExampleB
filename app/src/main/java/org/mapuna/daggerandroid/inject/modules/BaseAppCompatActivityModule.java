package org.mapuna.daggerandroid.inject.modules;

import org.mapuna.daggerandroid.ui.BaseAppCompatActivity;

import dagger.Binds;
import dagger.Module;

@Module
public interface BaseAppCompatActivityModule<A extends BaseAppCompatActivity> {
    @Binds
    BaseAppCompatActivity activity(A activity);
}
