package com.miaguicam.ejemplodagger2.components;

import com.miaguicam.ejemplodagger2.MainActivity;
import com.miaguicam.ejemplodagger2.modules.NetworkApiModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Miguel on 26/03/2016.
 */
@Singleton
@Component(modules = {NetworkApiModule.class})

public interface DiComponent {
    void inject(MainActivity activity);
}
