package app.dori.festal.activity;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by hafizaziz on 7/2/17.
 */

public abstract class BaseAuthenticatedActivity extends BaseActivity {

    // The final keyword simply means that sub-classes cannot override this method
    @Override
    protected final void onCreate(Bundle savedState) {
        super.onCreate(savedState);

        //Returns a user to the logging activity, when they are not logged in
        if (!application.getAuth().getUser().isLoggedIn()) {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
            return;
        }

        onFestalCreate(savedState);
    }


    // This method gets invoked during onCreate, if we logged in, if we are not logged in this method does not get invoked
    protected abstract void onFestalCreate(Bundle savedState);
}