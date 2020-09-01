package in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.di.components;

import javax.inject.Singleton;

import dagger.Component;
import in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.MainActivity;
import in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.di.modules.ContextModule;
import in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.di.modules.NetworkModule;

@Singleton
@Component(modules = {NetworkModule.class, ContextModule.class})
public interface AppComponent {
//    void inject(MainActivity mainActivity);
}
