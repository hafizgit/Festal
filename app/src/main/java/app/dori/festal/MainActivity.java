package app.dori.festal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import app.dori.festal.activity.BaseAuthenticatedActivity;

public class MainActivity extends BaseAuthenticatedActivity {


    @Override
    protected void onFestalCreate(Bundle savedState) {
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Festal");
    }
}
