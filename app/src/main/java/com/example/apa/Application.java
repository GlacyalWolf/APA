package com.example.apa;

public class Application extends android.app.Application {
    @Override
    public void onCreate() {

        super.onCreate();
        Repository.get(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
