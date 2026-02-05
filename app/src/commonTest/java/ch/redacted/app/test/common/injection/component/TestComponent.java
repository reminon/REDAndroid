package com.greatposterwall.app.test.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import com.greatposterwall.app.test.common.injection.module.ApplicationTestModule;
import com.greatposterwall.injection.component.ApplicationComponent;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}
