package com.google.android.gms.p028c;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class bc {
    BlockingQueue<bf> f2516a;
    ExecutorService f2517b;
    LinkedHashMap<String, String> f2518c = new LinkedHashMap();
    String f2519d;
    final Context f2520e;
    final String f2521f;
    private AtomicBoolean f2522g;
    private File f2523h;

    class C08291 implements Runnable {
        final /* synthetic */ bc f2515a;

        C08291(bc bcVar) {
            this.f2515a = bcVar;
        }

        public void run() {
            this.f2515a.m3904a();
        }
    }

    public bc(Context context, String str, String str2, Map<String, String> map) {
        this.f2520e = context;
        this.f2521f = str;
        this.f2519d = str2;
        this.f2522g = new AtomicBoolean(false);
        this.f2522g.set(((Boolean) az.f2457I.m3878c()).booleanValue());
        if (this.f2522g.get()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                this.f2523h = new File(externalStorageDirectory, "sdk_csi_data.txt");
            }
        }
        for (Entry entry : map.entrySet()) {
            this.f2518c.put(entry.getKey(), entry.getValue());
        }
        this.f2516a = new ArrayBlockingQueue(30);
        this.f2517b = Executors.newSingleThreadExecutor();
        this.f2517b.execute(new C08291(this));
    }

    private void m3904a() {
        while (true) {
            try {
                bf bfVar = (bf) this.f2516a.take();
                String c = bfVar.m3922c();
                if (!TextUtils.isEmpty(c)) {
                    this.f2518c.putAll(bfVar.m3923d());
                    m3907a(this.f2518c, c);
                }
            } catch (Throwable e) {
                C0691b.m3102d("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    private void m3906a(File file, String str) {
        Throwable e;
        if (file != null) {
            FileOutputStream fileOutputStream;
            try {
                fileOutputStream = new FileOutputStream(file, true);
                try {
                    fileOutputStream.write(str.getBytes());
                    fileOutputStream.write(10);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            return;
                        } catch (Throwable e2) {
                            C0691b.m3102d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                            return;
                        }
                    }
                    return;
                } catch (IOException e3) {
                    e2 = e3;
                    try {
                        C0691b.m3102d("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e2);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                return;
                            } catch (Throwable e22) {
                                C0691b.m3102d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e22);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        e22 = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable e4) {
                                C0691b.m3102d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                            }
                        }
                        throw e22;
                    }
                }
            } catch (IOException e5) {
                e22 = e5;
                fileOutputStream = null;
                C0691b.m3102d("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e22);
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                    return;
                }
                return;
            } catch (Throwable th2) {
                e22 = th2;
                fileOutputStream = null;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw e22;
            }
        }
        C0691b.m3103e("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
    }

    private void m3907a(Map<String, String> map, String str) {
        String a = m3908a(this.f2519d, map, str);
        if (this.f2522g.get()) {
            m3906a(this.f2523h, a);
        } else {
            C0618p.m2796e().m4855a(this.f2520e, this.f2521f, a);
        }
    }

    String m3908a(String str, Map<String, String> map, String str2) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        StringBuilder stringBuilder = new StringBuilder(buildUpon.build().toString());
        stringBuilder.append("&").append("it").append("=").append(str2);
        return stringBuilder.toString();
    }

    public void m3909a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f2518c.put("e", TextUtils.join(",", list));
        }
    }

    public boolean m3910a(bf bfVar) {
        return this.f2516a.offer(bfVar);
    }
}
