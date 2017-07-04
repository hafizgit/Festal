package app.dori.festal.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import app.dori.festal.R;
import app.dori.festal.activity.LoginActivity;

/**
 * Created by hafizaziz on 7/2/17.
 */

public class LoginFragment extends BaseFragment implements View.OnClickListener {

    private Button btnLoginFragment;
    private Callbacks callbacks;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup root, Bundle savedState) {
        View view = inflater.inflate(R.layout.fragment_login, root, false);

        btnLoginFragment = (Button) view.findViewById(R.id.fragment_login_button);
        btnLoginFragment.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        if (view == btnLoginFragment)
            /* Notify parent activity */
            application.getAuth().getUser().setLoggedIn(true);
            callbacks.onLoggedIn();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callbacks = (Callbacks) context;
    }

    // Gets invoked when fragment is no longer attached to an activity
    @Override
    public void onDetach() {
        super.onDetach();
        callbacks = null;
    }

    public interface Callbacks {
        void onLoggedIn();
    }
}
