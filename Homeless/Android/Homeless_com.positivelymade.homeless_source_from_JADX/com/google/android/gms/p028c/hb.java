package com.google.android.gms.p028c;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public class hb {

    public interface C0944a<D, R> {
        R mo725a(D d);
    }

    public static <A, B> hc<B> m4983a(final hc<A> hcVar, final C0944a<A, B> c0944a) {
        final hc gzVar = new gz();
        hcVar.mo758a(new Runnable() {
            public void run() {
                try {
                    gzVar.m4958b(c0944a.mo725a(hcVar.get()));
                    return;
                } catch (CancellationException e) {
                } catch (InterruptedException e2) {
                } catch (ExecutionException e3) {
                }
                gzVar.cancel(true);
            }
        });
        return gzVar;
    }
}
