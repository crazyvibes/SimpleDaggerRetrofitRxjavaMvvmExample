package in.crazyvibes.simpledaggerretrofitrxjavamvvmexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.databinding.ActivityMainBinding;
import in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.user_model.UserModel;
import in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.view_model.UserViewModel;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Inject
    ViewModelProvider.Factory viewModelFactory;

    private UserViewModel userViewModel;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

       // ((BaseApplication) getApplication()).getAppComponent().inject(this);

        userViewModel = ViewModelProviders.of(this, viewModelFactory).get(UserViewModel.class);

        userViewModel.getModelMutableLiveData().observe(this, new Observer<UserModel>() {
            @Override
            public void onChanged(UserModel userModel) {
                activityMainBinding.setUser(userModel);
                Log.d(TAG, "onChanged: " + userModel.getPhone());
            }
        });

        userViewModel.getIsLoading().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                Log.d(TAG, aBoolean.toString());
            }
        });

        userViewModel.getError().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.d(TAG, s);
            }
        });
    }
}