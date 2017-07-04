package app.dori.festal.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.dori.festal.R;
import app.dori.festal.fragments.LoginFragment;

public class LoginNarrowActivity extends BaseActivity implements LoginFragment.Callbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_narrow);
    }

    // This method will be invoked a user successfully logs in
    @Override
    public void onLoggedIn() {
        setResult(RESULT_OK);
        finish();
    }
}
