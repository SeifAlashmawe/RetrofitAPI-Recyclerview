package hope.afterlifeprojects.seif.french.retrofitapirecyclerview.data;

import java.util.List;

import hope.afterlifeprojects.seif.french.retrofitapirecyclerview.pojo.PostModle;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PostInterface {

    @GET("posts")

    public Call<List<PostModle>> getPosts();
}
