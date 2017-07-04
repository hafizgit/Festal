package app.dori.festal.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.dori.festal.MainActivity;
import app.dori.festal.R;
import app.dori.festal.fragments.LoginFragment;

public class LoginActivity extends BaseActivity implements View.OnClickListener, LoginFragment.Callbacks {

    private static final int REQUEST_NARROW_LOGIN = 1;
    private static final int REQUEST_REGISTER = 2;
    private Button mLoginBtn;
    private Button mRegisterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLoginBtn = (Button) findViewById(R.id.activity_login_btn);
        mRegisterBtn = (Button) findViewById(R.id.activity_register_btn);
        if (mLoginBtn != null) {
            mLoginBtn.setOnClickListener(this);
        }

        mRegisterBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == mLoginBtn)
            // This allows us to retrieve the result for the log in narrow activity when it's finished doing it's thing
            startActivityForResult(new Intent(this, LoginNarrowActivity.class), REQUEST_NARROW_LOGIN);
        else if (view == mRegisterBtn)
            startActivityForResult(new Intent(this, RegisterActivity.class), REQUEST_REGISTER);
    }

    // Android will invoke this method when an activity that we started for a result returns
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode != RESULT_OK)
            return;

        if (requestCode == REQUEST_NARROW_LOGIN || requestCode == REQUEST_REGISTER)
            finishLogin();
    }

    private void finishLogin() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }


    @Override
    public void onLoggedIn() {
        finishLogin();
    }
}
