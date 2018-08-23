package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1305x;

public class C1163a extends DialogFragment {
    private Dialog f4090a = null;
    private OnCancelListener f4091b = null;

    public static C1163a m5964a(Dialog dialog, OnCancelListener onCancelListener) {
        C1163a c1163a = new C1163a();
        Dialog dialog2 = (Dialog) C1305x.m6618a((Object) dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c1163a.f4090a = dialog2;
        if (onCancelListener != null) {
            c1163a.f4091b = onCancelListener;
        }
        return c1163a;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f4091b != null) {
            this.f4091b.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f4090a == null) {
            setShowsDialog(false);
        }
        return this.f4090a;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
