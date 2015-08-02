package com.alienske.bababa;


import android.app.Application;

import com.parse.Parse;




public class MyApplication extends Application {
    @Override
    public void onCreate() {
        Parse.initialize(this, "iW8TLva03JlTlmuHMJBLxi6wV72yxhhjGYgi4upB", "6eYKdnoQhV6zCaUlVIATI3psmDyYIaQt65dCoCCR");
    }


}