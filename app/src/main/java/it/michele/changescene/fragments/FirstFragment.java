package it.michele.changescene.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import it.michele.changescene.AsyncLoadFragment;
import it.michele.changescene.MainActivity;
import it.michele.changescene.R;
import it.michele.changescene.Transitions;

public class FirstFragment extends Fragment {

    private Button button;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);

        button = view.findViewById(R.id.load_fragment2);
        button.setOnClickListener((v) -> {
            /*MainActivity.fragmentLoaded = new SecondFragment();
            MainActivity.fragmentManager.beginTransaction()
                    .replace(R.id.container_fragment, MainActivity.fragmentLoaded).commit();*/
            new AsyncLoadFragment(new SecondFragment(), Transitions.SLIDE_DOWN).execute();
        });

        return view;
    }

    public Button getButton(){
        return button;
    }
}
