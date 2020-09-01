package in.crazyvibes.simpledaggerretrofitrxjavamvvmexample;

import android.app.Application;

import in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.di.components.AppComponent;



public class BaseApplication extends Application {

    private AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();

        //appComponent= DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}