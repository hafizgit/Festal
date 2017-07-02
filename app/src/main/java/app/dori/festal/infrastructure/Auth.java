package app.dori.festal.infrastructure;

import android.content.Context;

/**
 * Created by hafizaziz on 7/2/17.
 */


public class Auth {
    private User user;
    private final Context context;

    public Auth(Context context) {
        this.context = context;
        user = new User();
    }

    public User getUser() {
        return user;
    }
}