package org.mapuna.daggerandroid.inject.modules;


import org.mapuna.daggerandroid.inject.scopes.ScopeActivity;
import org.mapuna.daggerandroid.ui.InputActivity;
import org.mapuna.daggerandroid.ui.OutputActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ApplicationModule {
    @ScopeActivity @ContributesAndroidInjector(modules = { InputActivityModule.class, BundleModule.class })
    abstract InputActivity contributeInputActivityInjector();

    @ScopeActivity @ContributesAndroidInjector(modules = { OutputActivityModule.class, BundleModule.class })
    abstract OutputActivity contributeOutputActivityInjector();
}
