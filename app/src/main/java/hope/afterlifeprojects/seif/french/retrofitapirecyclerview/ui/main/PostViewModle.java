package hope.afterlifeprojects.seif.french.retrofitapirecyclerview.ui.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import hope.afterlifeprojects.seif.french.retrofitapirecyclerview.data.PostClient;
import hope.afterlifeprojects.seif.french.retrofitapirecyclerview.pojo.PostModle;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostViewModle extends ViewModel {

    MutableLiveData<List<PostModle>> PostsMutableLiveData = new MutableLiveData<>();

    public void getPosts(){
        PostClient.getINSTANCE().getPosts().enqueue(new Callback<List<PostModle>>() {
            @Override
            public void onResponse(Call<List<PostModle>> call, Response<List<PostModle>> response) {
                PostsMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<PostModle>> call, Throwable t) {

            }
        });
    }
}
