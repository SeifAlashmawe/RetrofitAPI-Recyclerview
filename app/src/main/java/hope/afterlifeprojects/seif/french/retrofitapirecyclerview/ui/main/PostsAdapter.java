package hope.afterlifeprojects.seif.french.retrofitapirecyclerview.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import hope.afterlifeprojects.seif.french.retrofitapirecyclerview.R;
import hope.afterlifeprojects.seif.french.retrofitapirecyclerview.pojo.PostModle;

import java.util.ArrayList;
import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder> {
    private List<PostModle> moviesList = new ArrayList<>();

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.titleTV.setText(moviesList.get(position).getTitle());
        holder.userTV.setText(moviesList.get(position).getUserId()+"");
        holder.bodyTV.setText(moviesList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public void setList(List<PostModle> moviesList) {
        this.moviesList = moviesList;
        notifyDataSetChanged();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        TextView titleTV, userTV, bodyTV;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTV = itemView.findViewById(R.id.titleTV);
            userTV = itemView.findViewById(R.id.userIDTV);
            bodyTV = itemView.findViewById(R.id.bodyTV);
        }
    }
}