package com.picojo;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.picojo.databinding.PlayerFragmentBinding;
import com.picojo.settings.PlayersAdapter;
import com.picojo.settings.Settings;

public class PlayerFragment extends Fragment {

    private PlayerFragmentBinding binding;
    private TextView nameInput;
    private RecyclerView playersView;
    private PlayersAdapter playersAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = PlayerFragmentBinding.inflate(inflater, container, false);

        playersView = binding.getRoot().findViewById(R.id.playersView);
        playersAdapter = new PlayersAdapter(getContext());
        playersView.setAdapter(playersAdapter);
        playersView.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        nameInput = (TextView) binding.getRoot().findViewById(R.id.nameInput);
        binding.backToGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(PlayerFragment.this).navigate(R.id.action_to_GameFragment);
            }
        });

        binding.addNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Settings.addPlayer(nameInput.getText().toString());
                nameInput.setText("");
                Log.d("Added player: ", nameInput.getText().toString());
                playersAdapter.notifyDataSetChanged();
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}