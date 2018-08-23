package com.google.android.gms.p028c;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.C0455a.C0452a;
import com.google.android.gms.ads.internal.C0618p;
import java.util.Map;

@fn
public class dw extends ed {
    private final Map<String, String> f2793a;
    private final Context f2794b;
    private String f2795c;
    private long f2796d;
    private long f2797e;
    private String f2798f;
    private String f2799g;

    class C09091 implements OnClickListener {
        final /* synthetic */ dw f2789a;

        C09091(dw dwVar) {
            this.f2789a = dwVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f2789a.f2794b.startActivity(this.f2789a.m4433b());
        }
    }

    class C09102 implements OnClickListener {
        final /* synthetic */ dw f2790a;

        C09102(dw dwVar) {
            this.f2790a = dwVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f2790a.m4425b("Operation denied by user.");
        }
    }

    public dw(hg hgVar, Map<String, String> map) {
        super(hgVar, "createCalendarEvent");
        this.f2793a = map;
        this.f2794b = hgVar.mo776c();
        m4430c();
    }

    private String m4429a(String str) {
        return TextUtils.isEmpty((CharSequence) this.f2793a.get(str)) ? "" : (String) this.f2793a.get(str);
    }

    private void m4430c() {
        this.f2795c = m4429a("description");
        this.f2798f = m4429a("summary");
        this.f2796d = m4431e("start_ticks");
        this.f2797e = m4431e("end_ticks");
        this.f2799g = m4429a("location");
    }

    private long m4431e(String str) {
        String str2 = (String) this.f2793a.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void m4432a() {
        if (this.f2794b == null) {
            m4425b("Activity context is not available.");
        } else if (C0618p.m2796e().m4884e(this.f2794b).m3864f()) {
            Builder d = C0618p.m2796e().m4880d(this.f2794b);
            d.setTitle(C0618p.m2799h().m4773a(C0452a.create_calendar_title, "Create calendar event"));
            d.setMessage(C0618p.m2799h().m4773a(C0452a.create_calendar_message, "Allow Ad to create a calendar event?"));
            d.setPositiveButton(C0618p.m2799h().m4773a(C0452a.accept, "Accept"), new C09091(this));
            d.setNegativeButton(C0618p.m2799h().m4773a(C0452a.decline, "Decline"), new C09102(this));
            d.create().show();
        } else {
            m4425b("This feature is not available on the device.");
        }
    }

    Intent m4433b() {
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra("title", this.f2795c);
        data.putExtra("eventLocation", this.f2799g);
        data.putExtra("description", this.f2798f);
        if (this.f2796d > -1) {
            data.putExtra("beginTime", this.f2796d);
        }
        if (this.f2797e > -1) {
            data.putExtra("endTime", this.f2797e);
        }
        data.setFlags(268435456);
        return data;
    }
}
