package app.dori.festal.fragments;

import android.app.Fragment;
import android.os.Bundle;

import app.dori.festal.infrastructure.FestalApplication;

/**
 * Created by hafizaziz on 7/2/17.
 */

public abstract class BaseFragment extends Fragment {
    protected FestalApplication application;

    @Override
    public void onCreate(Bundle savedState) {
        super.onCreate(savedState);

        application = (FestalApplication) getActivity().getApplication();
    }
}
