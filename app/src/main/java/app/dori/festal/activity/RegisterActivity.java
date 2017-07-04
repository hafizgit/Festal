package app.dori.festal.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import app.dori.festal.R;

public class RegisterActivity extends BaseActivity implements View.OnClickListener {

    private EditText mUsernameText;
    private EditText mEmailText;
    private EditText mPasswordText;

    private Button mRegisterBtn;

    private View mProgessbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mUsernameText =(EditText) findViewById(R.id.activity_register_username);
        mEmailText = (EditText) findViewById(R.id.activity_register_email);
        mPasswordText = (EditText) findViewById(R.id.activity_register_password);
        mRegisterBtn = (Button) findViewById(R.id.activity_register_register_btn);
        mProgessbar = findViewById(R.id.activity_register_progressbar);

        mRegisterBtn.setOnClickListener(this);
        mProgessbar.setVisibility(View.GONE);

    }

    @Override
    public void onClick(View view) {
        if (view == mRegisterBtn) {
            application.getAuth().getUser().setLoggedIn(true);
            setResult(RESULT_OK);
            finish();
        }
    }
}
