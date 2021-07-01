package com.picojo.settings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.picojo.R;

public class PhrasesAdapter extends RecyclerView.Adapter<PhrasesAdapter.PlayerViewHolder> {

    private Context context;
    private PhrasesAdapter self;

    public PhrasesAdapter(Context ct) {
        context = ct;
        self = this;
    }

    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.phrase_row, parent, false);
        return new PlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder holder, int position) {
        holder.phraseText.setText(Settings.getPhrase(position));

        holder.removePhraseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Settings.removePhrase(position);
                self.notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return Settings.getPhraseCount();
    }

    public class PlayerViewHolder extends  RecyclerView.ViewHolder {

        TextView phraseText;
        Button removePhraseButton;

        public PlayerViewHolder(@NonNull  View itemView) {
            super(itemView);
            phraseText = itemView.findViewById(R.id.phraseText);
            removePhraseButton = itemView.findViewById(R.id.removePhraseButton);
        }
    }
}
