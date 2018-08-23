package android.support.v4.p005d;

import android.os.AsyncTask;
import android.os.Build.VERSION;

public class C0071a {
    public static <Params, Progress, Result> AsyncTask<Params, Progress, Result> m412a(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        if (asyncTask == null) {
            throw new IllegalArgumentException("task can not be null");
        }
        if (VERSION.SDK_INT >= 11) {
            C0072b.m413a(asyncTask, paramsArr);
        } else {
            asyncTask.execute(paramsArr);
        }
        return asyncTask;
    }
}
