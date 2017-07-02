package app.dori.festal.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import app.dori.festal.infrastructure.FestalApplication;

/**
 * Created by hafizaziz on 7/2/17.
 */

public class BaseActivity extends AppCompatActivity{
    protected FestalApplication application;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);

        application = (FestalApplication) getApplication();

    }

}
