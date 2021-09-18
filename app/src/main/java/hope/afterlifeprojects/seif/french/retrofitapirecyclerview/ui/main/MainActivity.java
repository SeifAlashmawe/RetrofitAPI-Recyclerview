package hope.afterlifeprojects.seif.french.retrofitapirecyclerview.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import hope.afterlifeprojects.seif.french.retrofitapirecyclerview.R;
import hope.afterlifeprojects.seif.french.retrofitapirecyclerview.pojo.PostModle;

public class MainActivity extends AppCompatActivity {

    PostViewModle postViewModle ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        postViewModle = ViewModelProviders.of(this).get(PostViewModle.class);

        postViewModle.getPosts();

        RecyclerView recyclerView = findViewById(R.id.recycler);
        final PostsAdapter adapter = new PostsAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        postViewModle.PostsMutableLiveData.observe(this, new Observer<List<PostModle>>() {
            @Override
            public void onChanged(List<PostModle> postModles) {
                adapter.setList(postModles);
            }
        });
    }
}
