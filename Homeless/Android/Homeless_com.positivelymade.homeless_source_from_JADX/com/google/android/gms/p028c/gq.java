package com.google.android.gms.p028c;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.Map;

@fn
public class gq {
    private final Context f3375a;
    private String f3376b;
    private final float f3377c;
    private float f3378d;
    private float f3379e;
    private float f3380f;
    private int f3381g;

    class C09972 implements OnClickListener {
        final /* synthetic */ gq f3374a;

        C09972(gq gqVar) {
            this.f3374a = gqVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public gq(Context context) {
        this.f3381g = 0;
        this.f3375a = context;
        this.f3377c = context.getResources().getDisplayMetrics().density;
    }

    public gq(Context context, String str) {
        this(context);
        this.f3376b = str;
    }

    private void m4932a() {
        if (this.f3375a instanceof Activity) {
            final Object b = gq.m4933b(this.f3376b);
            Builder builder = new Builder(this.f3375a);
            builder.setMessage(b);
            builder.setTitle("Ad Information");
            builder.setPositiveButton("Share", new OnClickListener(this) {
                final /* synthetic */ gq f3373b;

                public void onClick(DialogInterface dialogInterface, int i) {
                    this.f3373b.f3375a.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", b), "Share via"));
                }
            });
            builder.setNegativeButton("Close", new C09972(this));
            builder.create().show();
            return;
        }
        C0691b.m3099c("Can not create dialog without Activity Context");
    }

    static String m4933b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "No debug information";
        }
        Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
        StringBuilder stringBuilder = new StringBuilder();
        Map a = C0618p.m2796e().m4849a(build);
        for (String str2 : a.keySet()) {
            stringBuilder.append(str2).append(" = ").append((String) a.get(str2)).append("\n\n");
        }
        Object trim = stringBuilder.toString().trim();
        return TextUtils.isEmpty(trim) ? "No debug information" : trim;
    }

    void m4934a(int i, float f, float f2) {
        if (i == 0) {
            this.f3381g = 0;
            this.f3378d = f;
            this.f3379e = f2;
            this.f3380f = f2;
        } else if (this.f3381g == -1) {
        } else {
            if (i == 2) {
                if (f2 > this.f3379e) {
                    this.f3379e = f2;
                } else if (f2 < this.f3380f) {
                    this.f3380f = f2;
                }
                if (this.f3379e - this.f3380f > 30.0f * this.f3377c) {
                    this.f3381g = -1;
                    return;
                }
                if (this.f3381g == 0 || this.f3381g == 2) {
                    if (f - this.f3378d >= 50.0f * this.f3377c) {
                        this.f3378d = f;
                        this.f3381g++;
                    }
                } else if ((this.f3381g == 1 || this.f3381g == 3) && f - this.f3378d <= -50.0f * this.f3377c) {
                    this.f3378d = f;
                    this.f3381g++;
                }
                if (this.f3381g == 1 || this.f3381g == 3) {
                    if (f > this.f3378d) {
                        this.f3378d = f;
                    }
                } else if (this.f3381g == 2 && f < this.f3378d) {
                    this.f3378d = f;
                }
            } else if (i == 1 && this.f3381g == 4) {
                m4932a();
            }
        }
    }

    public void m4935a(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            m4934a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        m4934a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }

    public void m4936a(String str) {
        this.f3376b = str;
    }
}
