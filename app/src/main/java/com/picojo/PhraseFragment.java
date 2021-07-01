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

import com.picojo.databinding.PhraseFragmentBinding;
import com.picojo.settings.PhrasesAdapter;
import com.picojo.settings.Settings;

public class PhraseFragment extends Fragment {

    private PhraseFragmentBinding binding;
    private TextView customPhraseInput;
    private RecyclerView phrasesView;
    private PhrasesAdapter phrasesAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = PhraseFragmentBinding.inflate(inflater, container, false);

        phrasesAdapter = new PhrasesAdapter(getContext());
        phrasesView = binding.getRoot().findViewById(R.id.phrasesView);
        phrasesView.setAdapter(phrasesAdapter);
        phrasesView.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        customPhraseInput = (TextView) binding.getRoot().findViewById(R.id.customPhraseText);
        binding.backToGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(PhraseFragment.this).navigate(R.id.action_to_GameFragment);
            }
        });

        binding.addPhraseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Settings.addPhrase(customPhraseInput.getText().toString());
                customPhraseInput.setText("");
                Log.d("Added custom rule: ", customPhraseInput.getText().toString());
                phrasesAdapter.notifyDataSetChanged();
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}