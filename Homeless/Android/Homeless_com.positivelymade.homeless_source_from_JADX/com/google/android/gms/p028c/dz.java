package com.google.android.gms.p028c;

import android.app.AlertDialog.Builder;
import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.C0455a.C0452a;
import com.google.android.gms.ads.internal.C0618p;
import java.util.Map;

@fn
public class dz extends ed {
    private final Map<String, String> f2827a;
    private final Context f2828b;

    class C09132 implements OnClickListener {
        final /* synthetic */ dz f2826a;

        C09132(dz dzVar) {
            this.f2826a = dzVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f2826a.m4425b("User canceled the download.");
        }
    }

    public dz(hg hgVar, Map<String, String> map) {
        super(hgVar, "storePicture");
        this.f2827a = map;
        this.f2828b = hgVar.mo776c();
    }

    Request m4447a(String str, String str2) {
        Request request = new Request(Uri.parse(str));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
        C0618p.m2798g().mo738a(request);
        return request;
    }

    String m4448a(String str) {
        return Uri.parse(str).getLastPathSegment();
    }

    public void m4449a() {
        if (this.f2828b == null) {
            m4425b("Activity context is not available");
        } else if (C0618p.m2796e().m4884e(this.f2828b).m3862c()) {
            final String str = (String) this.f2827a.get("iurl");
            if (TextUtils.isEmpty(str)) {
                m4425b("Image url cannot be empty.");
            } else if (URLUtil.isValidUrl(str)) {
                final String a = m4448a(str);
                if (C0618p.m2796e().m4878c(a)) {
                    Builder d = C0618p.m2796e().m4880d(this.f2828b);
                    d.setTitle(C0618p.m2799h().m4773a(C0452a.store_picture_title, "Save image"));
                    d.setMessage(C0618p.m2799h().m4773a(C0452a.store_picture_message, "Allow Ad to store image in Picture gallery?"));
                    d.setPositiveButton(C0618p.m2799h().m4773a(C0452a.accept, "Accept"), new OnClickListener(this) {
                        final /* synthetic */ dz f2825c;

                        public void onClick(DialogInterface dialogInterface, int i) {
                            try {
                                ((DownloadManager) this.f2825c.f2828b.getSystemService("download")).enqueue(this.f2825c.m4447a(str, a));
                            } catch (IllegalStateException e) {
                                this.f2825c.m4425b("Could not store picture.");
                            }
                        }
                    });
                    d.setNegativeButton(C0618p.m2799h().m4773a(C0452a.decline, "Decline"), new C09132(this));
                    d.create().show();
                    return;
                }
                m4425b("Image type not recognized: " + a);
            } else {
                m4425b("Invalid image url: " + str);
            }
        } else {
            m4425b("Feature is not supported by the device.");
        }
    }
}
