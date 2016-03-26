package com.miaguicam.ejemplodagger2;

/**
 * Created by Miguel on 26/03/2016.
 */
public class NetworkApi {

    public boolean validateUser(String username, String password){
        if(username == null || username.length() == 0){
            return false;
        }else{
            return true;
        }
    }
}
