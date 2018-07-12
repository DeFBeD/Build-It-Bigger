package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.android.jokedisplay.DisplayJoke;



/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ProgressBar progressBar = null;
    public String loadedJoke = null;
    private Button mButton;
    public boolean isThisATest = false;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);


        mButton = root.findViewById(R.id.initiateJoke);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                getAGoodJoke();
            }
        });

        progressBar = root.findViewById(R.id.progressBar);
        progressBar.setVisibility(View.GONE);

        return root;

    }


    public void getAGoodJoke() {
        new EndpointsAsyncTask().execute(this);
    }

    public void launchDisplayJokeActivity() {

        if (!isThisATest){
            Context context = getActivity();
            Intent intent = new Intent(context, DisplayJoke.class);
            intent.putExtra(context.getString(R.string.chosenJoke), loadedJoke);
            context.startActivity(intent);
            progressBar.setVisibility(View.GONE);
            }

    }
}
