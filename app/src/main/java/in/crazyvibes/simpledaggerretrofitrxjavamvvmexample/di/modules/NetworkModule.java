package in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.di.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.remote.UserService;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public abstract class NetworkModule {

    @Provides
    @Singleton
    static Retrofit provideRetrofit()
    {
        return new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    static UserService provideUserService(Retrofit retrofit)
    {
        return retrofit.create(UserService.class);
    }
}
