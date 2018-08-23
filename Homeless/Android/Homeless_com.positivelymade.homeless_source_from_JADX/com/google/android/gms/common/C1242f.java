package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.C0019e;
import android.support.v4.app.C0028i;
import com.google.android.gms.common.internal.C1305x;

public class C1242f extends C0019e {
    private Dialog aj = null;
    private OnCancelListener ak = null;

    public static C1242f m6294a(Dialog dialog, OnCancelListener onCancelListener) {
        C1242f c1242f = new C1242f();
        Dialog dialog2 = (Dialog) C1305x.m6618a((Object) dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c1242f.aj = dialog2;
        if (onCancelListener != null) {
            c1242f.ak = onCancelListener;
        }
        return c1242f;
    }

    public void mo900a(C0028i c0028i, String str) {
        super.mo900a(c0028i, str);
    }

    public Dialog mo901c(Bundle bundle) {
        if (this.aj == null) {
            m161b(false);
        }
        return this.aj;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.ak != null) {
            this.ak.onCancel(dialogInterface);
        }
    }
}
