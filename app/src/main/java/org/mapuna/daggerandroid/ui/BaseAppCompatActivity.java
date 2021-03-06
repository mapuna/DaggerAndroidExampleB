package org.mapuna.daggerandroid.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import org.mapuna.daggerandroid.BundleService;

import dagger.android.support.DaggerAppCompatActivity;

public abstract class BaseAppCompatActivity extends DaggerAppCompatActivity {
    private BundleService bundleService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        bundleService = new BundleService(savedInstanceState, getIntent().getExtras());
        super.onCreate(savedInstanceState);
    }

    public BundleService getBundleService() {
        return bundleService;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putAll(bundleService.getAll());
        super.onSaveInstanceState(outState);
    }
}
