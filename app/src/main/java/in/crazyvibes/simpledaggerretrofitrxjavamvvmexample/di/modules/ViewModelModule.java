package in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.di.modules;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;



import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.di.ViewModelKey;
import in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.view_model.UserViewModel;
import in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.view_model.ViewModelFactory;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(UserViewModel.class)
    abstract ViewModel bindViewModel(UserViewModel userViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindFactory(ViewModelFactory factory);

}