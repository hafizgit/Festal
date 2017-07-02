package app.dori.festal.infrastructure;

import android.app.Application;

/**
 * Created by hafizaziz on 7/2/17.
 */

// Used for static services.

public class FestalApplication extends Application {

    private Auth auth;

    @Override
    public void onCreate() {
        super.onCreate();
        auth = new Auth(this);
    }

    public Auth getAuth() {
        return auth;
    }
}
