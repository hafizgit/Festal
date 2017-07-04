package app.dori.festal.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import app.dori.festal.R;
import app.dori.festal.infrastructure.FestalApplication;

/**
 * Created by hafizaziz on 7/2/17.
 */

public class BaseActivity extends AppCompatActivity {
    protected FestalApplication application;
    protected Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);

        application = (FestalApplication) getApplication();

    }

    @Override
    public void setContentView (@LayoutRes int layoutResId) {
        super.setContentView(layoutResId);

        toolbar = (Toolbar)findViewById(R.id.toolbar);

        if (toolbar != null)
            setSupportActionBar(toolbar);
    }

}
