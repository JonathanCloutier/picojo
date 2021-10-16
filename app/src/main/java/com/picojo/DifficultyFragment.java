package com.picojo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.picojo.databinding.DifficultyFragmentBinding;
import com.picojo.settings.Settings;

public class DifficultyFragment extends Fragment {

    private static final float PROGRESS_FACTOR = 5f;

    private DifficultyFragmentBinding binding;
    private TextView difficultyDisplay;
    private SeekBar difficultyBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DifficultyFragmentBinding.inflate(inflater, container, false);

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        difficultyDisplay = (TextView) binding.getRoot().findViewById(R.id.difficultyDisplay);
        difficultyDisplay.setText("x" + Settings.getDifficulty());

        difficultyBar = (SeekBar) binding.getRoot().findViewById(R.id.difficultyBar);
        difficultyBar.setProgress(Math.round((Settings.getDifficulty()-1f)*PROGRESS_FACTOR));
        difficultyBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float difficulty = 1f + (progress / PROGRESS_FACTOR);
                Settings.setDifficulty(difficulty);
                difficultyDisplay.setText("x" + difficulty);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        binding.backToGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(DifficultyFragment.this).navigate(R.id.action_to_GameFragment);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}