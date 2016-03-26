package com.miaguicam.ejemplodagger2.modules;

import com.miaguicam.ejemplodagger2.NetworkApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Miguel on 26/03/2016.
 */

@Module
public class NetworkApiModule {
    @Provides
    @Singleton
    public NetworkApi getNetwork(){
        return new NetworkApi();
    }

}
