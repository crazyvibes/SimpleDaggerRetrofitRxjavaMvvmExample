package in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.repository;

import in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.remote.UserService;
import in.crazyvibes.simpledaggerretrofitrxjavamvvmexample.user_model.UserModel;
import io.reactivex.Single;

public class UserRepository {
    private UserService userService;

    public UserRepository(UserService userService) {
        this.userService = userService;
    }

    public Single<UserModel> modelSingle()
    {
        return userService.getUserModel();
    }
}
