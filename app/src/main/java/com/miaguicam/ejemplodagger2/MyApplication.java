package com.miaguicam.ejemplodagger2;

import android.app.Application;

import com.miaguicam.ejemplodagger2.components.DaggerDiComponent;
import com.miaguicam.ejemplodagger2.components.DiComponent;

/**
 * Created by Miguel on 26/03/2016.
 */
public class MyApplication extends Application {
    DiComponent component;

    @Override
    public void onCreate(){
        super.onCreate();
        component = DaggerDiComponent.builder().build();
    }

    public DiComponent getComponent(){
        return component;
    }
}
