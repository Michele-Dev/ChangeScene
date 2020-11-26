package it.michele.changescene;

import android.os.AsyncTask;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class AsyncLoadFragment extends AsyncTask<String, String, Void> {

    private final Fragment fragment;
    private final Transitions transition;

    public AsyncLoadFragment(Fragment fragment, Transitions transition){
        this.fragment = fragment;
        this.transition = transition;
    }

    @Override
    protected Void doInBackground(String... strings) {
        FragmentTransaction fragmentTransaction =
                MainActivity.fragmentManager.beginTransaction();

        fragmentTransaction
                .setCustomAnimations(transition.getAnimIn(), transition.getAnimOut());

        fragmentTransaction.replace(R.id.container_fragment, fragment).commit();
        MainActivity.fragmentLoaded = fragment;
        return null;
    }
}
