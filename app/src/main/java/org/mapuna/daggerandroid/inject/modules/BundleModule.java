package org.mapuna.daggerandroid.inject.modules;

import org.mapuna.daggerandroid.BundleService;
import org.mapuna.daggerandroid.inject.SomeInput;
import org.mapuna.daggerandroid.inject.scopes.ScopeActivity;
import org.mapuna.daggerandroid.ui.BaseAppCompatActivity;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class BundleModule {

    public static final String EXTRA_SOME_INPUT = "org.mapuna.daggerandroid.SOME_INPUT";

    @Provides @ScopeActivity static BundleService providesBundleService(BaseAppCompatActivity context) {
        return context.getBundleService();
    }

    @Provides @ScopeActivity @SomeInput static String providesSomeInput(BundleService bundleService) {
        String style = (String) bundleService.get(EXTRA_SOME_INPUT);
        return style != null ? style : "";
    }
}
