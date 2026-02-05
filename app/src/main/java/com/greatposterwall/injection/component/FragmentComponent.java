package com.greatposterwall.injection.component;

/**
 * Created by sxo on 27/12/16.
 */

import dagger.Subcomponent;
import com.greatposterwall.injection.PerFragment;
import com.greatposterwall.injection.module.FragmentModule;

/**
 * This component inject dependencies to all Fragments across the application
 */
@PerFragment
@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {
}