package com.google.android.gms.drive.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.common.C1241e;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.internal.C0655l;
import com.google.android.gms.common.internal.C1266h;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.C1656k.C1658a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bg extends C0655l<C1656k> {
    final C0650b f5261a;
    final Map<DriveId, Map<Object, Object>> f5262e = new HashMap();
    final Map<Object, Object> f5263f = new HashMap();
    final Map<DriveId, Map<Object, Object>> f5264g = new HashMap();
    final Map<DriveId, Map<Object, Object>> f5265h = new HashMap();
    private final String f5266i;
    private final Bundle f5267j;
    private final boolean f5268k;
    private DriveId f5269l;
    private DriveId f5270m;

    public bg(Context context, Looper looper, C1266h c1266h, C0650b c0650b, C0651c c0651c, Bundle bundle) {
        super(context, looper, 11, c1266h, c0650b, c0651c);
        this.f5266i = c1266h.m6372g();
        this.f5261a = c0650b;
        this.f5267j = bundle;
        Intent intent = new Intent("com.google.android.gms.drive.events.HANDLE_EVENT");
        intent.setPackage(context.getPackageName());
        List queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        switch (queryIntentServices.size()) {
            case 0:
                this.f5268k = false;
                return;
            case 1:
                ServiceInfo serviceInfo = ((ResolveInfo) queryIntentServices.get(0)).serviceInfo;
                if (serviceInfo.exported) {
                    this.f5268k = true;
                    return;
                }
                throw new IllegalStateException("Drive event service " + serviceInfo.name + " must be exported in AndroidManifest.xml");
            default:
                throw new IllegalStateException("AndroidManifest.xml can only define one service that handles the " + intent.getAction() + " action");
        }
    }

    protected C1656k m7669a(IBinder iBinder) {
        return C1658a.m7792a(iBinder);
    }

    protected String mo514a() {
        return "com.google.android.gms.drive.ApiService.START";
    }

    protected void mo1047a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.f5269l = (DriveId) bundle.getParcelable("com.google.android.gms.drive.root_id");
            this.f5270m = (DriveId) bundle.getParcelable("com.google.android.gms.drive.appdata_id");
        }
        super.mo1047a(i, iBinder, bundle, i2);
    }

    protected /* synthetic */ IInterface mo515b(IBinder iBinder) {
        return m7669a(iBinder);
    }

    protected String mo516b() {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    boolean mo517c() {
        return C1241e.m6277a(m2989k(), Process.myUid());
    }

    public void mo511d() {
        if (mo512e()) {
            try {
                ((C1656k) m2994p()).mo1066a(new DisconnectRequest());
            } catch (RemoteException e) {
            }
        }
        super.mo511d();
        synchronized (this.f5262e) {
            this.f5262e.clear();
        }
        synchronized (this.f5263f) {
            this.f5263f.clear();
        }
        synchronized (this.f5264g) {
            this.f5264g.clear();
        }
        synchronized (this.f5265h) {
            this.f5265h.clear();
        }
    }

    public boolean mo513f() {
        return (m2989k().getPackageName().equals(this.f5266i) && mo517c()) ? false : true;
    }

    protected Bundle mo1048n() {
        Object packageName = m2989k().getPackageName();
        C1305x.m6617a(packageName);
        C1305x.m6621a(!m2991m().m6370e().isEmpty());
        Bundle bundle = new Bundle();
        if (!packageName.equals(this.f5266i)) {
            bundle.putString("proxy_package_name", this.f5266i);
        }
        bundle.putAll(this.f5267j);
        return bundle;
    }

    public boolean mo1049r() {
        return true;
    }
}
