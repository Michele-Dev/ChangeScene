package it.michele.changescene;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import it.michele.changescene.fragments.FirstFragment;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    public static Fragment fragmentLoaded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        fragmentLoaded = new FirstFragment();
        fragmentManager.beginTransaction().add(R.id.container_fragment, fragmentLoaded)
                .commit();
    }
}