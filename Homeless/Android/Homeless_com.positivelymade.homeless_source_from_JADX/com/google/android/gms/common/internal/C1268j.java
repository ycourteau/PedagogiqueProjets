package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.C0018f;
import android.util.Log;

public class C1268j implements OnClickListener {
    private final Activity f4359a;
    private final C0018f f4360b;
    private final Intent f4361c;
    private final int f4362d;

    public C1268j(Activity activity, Intent intent, int i) {
        this.f4359a = activity;
        this.f4360b = null;
        this.f4361c = intent;
        this.f4362d = i;
    }

    public C1268j(C0018f c0018f, Intent intent, int i) {
        this.f4359a = null;
        this.f4360b = c0018f;
        this.f4361c = intent;
        this.f4362d = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (this.f4361c != null && this.f4360b != null) {
                this.f4360b.m103a(this.f4361c, this.f4362d);
            } else if (this.f4361c != null) {
                this.f4359a.startActivityForResult(this.f4361c, this.f4362d);
            }
            dialogInterface.dismiss();
        } catch (ActivityNotFoundException e) {
            Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        }
    }
}
