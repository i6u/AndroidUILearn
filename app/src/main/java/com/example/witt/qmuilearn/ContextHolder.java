package com.example.witt.qmuilearn;

import android.app.Application;
import android.content.Context;

/**
 * Created by witt on 2017/12/25.
 */

public class ContextHolder {
    static Context ApplicationContext;

    public static void initial(Context context) {
        ApplicationContext = context;
    }

    public static Context getContext() {
        return ApplicationContext;
    }

    class App extends Application {
        @Override
        public void onCreate() {
            super.onCreate();
            ContextHolder.initial(this);
        }
    }
}


