package com.greatposterwall.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import com.greatposterwall.data.DataManager;
import com.greatposterwall.data.local.PreferencesHelper;
import com.greatposterwall.data.remote.ApiService;
import com.greatposterwall.injection.ApplicationContext;
import com.greatposterwall.injection.module.ApplicationModule;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    @ApplicationContext
    Context context();
    Application application();
    ApiService apiService();
    PreferencesHelper preferencesHelper();
    DataManager dataManager();
    //RxEventBus eventBus();
}
