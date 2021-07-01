package com.picojo.settings;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.picojo.R;

public class PlayersAdapter extends RecyclerView.Adapter<PlayersAdapter.PlayerViewHolder> {

    private Context context;
    private PlayersAdapter self;

    public PlayersAdapter(Context ct) {
        context = ct;
        self = this;
    }

    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.player_row, parent, false);
        return new PlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder holder, int position) {
        Log.d("DEBUG", "GETTING PLAYER TO DISPLAY AT INDEX: " + position + "player:" + Settings.getPlayer(position));
        holder.playerNameText.setText(Settings.getPlayer(position));

        holder.removePlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Settings.removePlayer(position);
                self.notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        Log.d("DEBUG", "GETTING PLAYER ITEM COUNT: " + Settings.getPlayerCount());
        return Settings.getPlayerCount();
    }

    public class PlayerViewHolder extends  RecyclerView.ViewHolder {

        TextView playerNameText;
        Button removePlayerButton;

        public PlayerViewHolder(@NonNull  View itemView) {
            super(itemView);
            playerNameText = itemView.findViewById(R.id.playerNameText);
            removePlayerButton = itemView.findViewById(R.id.removePlayerButton);
        }
    }
}
