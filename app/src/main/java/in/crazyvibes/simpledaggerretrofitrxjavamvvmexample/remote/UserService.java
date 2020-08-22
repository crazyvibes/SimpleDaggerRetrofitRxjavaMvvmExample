package in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.remote;

import in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.user_model.UserModel;
import io.reactivex.Single;
import retrofit2.http.GET;

public interface UserService {

    @GET("/users/2")
    Single<UserModel> getUserModel();
}
