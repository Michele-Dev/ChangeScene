package it.michele.changescene.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import it.michele.changescene.AsyncLoadFragment;
import it.michele.changescene.R;
import it.michele.changescene.Transitions;

public class SecondFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment, container, false);

        Button button = view.findViewById(R.id.load_fragment1);
        button.setOnClickListener((v) -> {
            /*MainActivity.fragmentLoaded = new FirstFragment();
            MainActivity.fragmentManager.beginTransaction()
                    .replace(R.id.container_fragment, MainActivity.fragmentLoaded).commit();*/
            new AsyncLoadFragment(new FirstFragment(), Transitions.SLIDE_DOWN).execute();
        });

        return view;
    }
}
