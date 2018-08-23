package android.support.v4.p005d;

import android.os.AsyncTask;

class C0072b {
    static <Params, Progress, Result> void m413a(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
    }
}
