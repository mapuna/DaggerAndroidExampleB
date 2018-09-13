package org.mapuna.daggerandroid.inject;

import org.mapuna.daggerandroid.DAApplication;
import org.mapuna.daggerandroid.inject.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;


@Singleton
@Component(modules = {ApplicationModule.class, AndroidSupportInjectionModule.class})
public interface ApplicationComponent extends AndroidInjector<DAApplication> {
    @Component.Builder abstract class Builder extends AndroidInjector.Builder<DAApplication> {}
}
