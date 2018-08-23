package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.en.C0623a;
import com.google.android.gms.p028c.fn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@fn
public class C0624d extends C0623a {
    private String f1735a;
    private Context f1736b;
    private String f1737c;
    private ArrayList<String> f1738d;

    public C0624d(String str, ArrayList<String> arrayList, Context context, String str2) {
        this.f1737c = str;
        this.f1738d = arrayList;
        this.f1735a = str2;
        this.f1736b = context;
    }

    protected int m2845a(int i) {
        return i == 0 ? 1 : i == 1 ? 2 : i == 4 ? 3 : 0;
    }

    public String mo488a() {
        return this.f1737c;
    }

    protected String m2847a(String str, HashMap<String, String> hashMap) {
        Object obj;
        Object obj2 = "";
        try {
            obj = this.f1736b.getPackageManager().getPackageInfo(this.f1736b.getPackageName(), 0).versionName;
        } catch (Throwable e) {
            C0691b.m3102d("Error to retrieve app version", e);
            obj = obj2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - C0618p.m2799h().m4787d().m4798a();
        for (String str2 : hashMap.keySet()) {
            str = str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{str2}), String.format("$1%s$2", new Object[]{hashMap.get(str2)}));
        }
        return str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"sessionid"}), String.format("$1%s$2", new Object[]{C0618p.m2799h().m4772a()})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"appid"}), String.format("$1%s$2", new Object[]{r2})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"osversion"}), String.format("$1%s$2", new Object[]{String.valueOf(VERSION.SDK_INT)})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"sdkversion"}), String.format("$1%s$2", new Object[]{this.f1735a})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"appversion"}), String.format("$1%s$2", new Object[]{obj})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"timestamp"}), String.format("$1%s$2", new Object[]{String.valueOf(elapsedRealtime)})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"[^@]+"}), String.format("$1%s$2", new Object[]{""})).replaceAll("@@", "@");
    }

    void m2848b() {
        try {
            this.f1736b.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter").getDeclaredMethod("reportWithProductId", new Class[]{Context.class, String.class, String.class, Boolean.TYPE}).invoke(null, new Object[]{this.f1736b, this.f1737c, "", Boolean.valueOf(true)});
        } catch (ClassNotFoundException e) {
            C0691b.m3103e("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (NoSuchMethodException e2) {
            C0691b.m3103e("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (Throwable e3) {
            C0691b.m3102d("Fail to report a conversion.", e3);
        }
    }

    public void mo489b(int i) {
        if (i == 1) {
            m2848b();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("status", String.valueOf(i));
        hashMap.put("sku", this.f1737c);
        List linkedList = new LinkedList();
        Iterator it = this.f1738d.iterator();
        while (it.hasNext()) {
            linkedList.add(m2847a((String) it.next(), hashMap));
        }
        C0618p.m2796e().m4857a(this.f1736b, this.f1735a, linkedList);
    }

    public void mo490c(int i) {
        if (i == 0) {
            m2848b();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("google_play_status", String.valueOf(i));
        hashMap.put("sku", this.f1737c);
        hashMap.put("status", String.valueOf(m2845a(i)));
        List linkedList = new LinkedList();
        Iterator it = this.f1738d.iterator();
        while (it.hasNext()) {
            linkedList.add(m2847a((String) it.next(), hashMap));
        }
        C0618p.m2796e().m4857a(this.f1736b, this.f1735a, linkedList);
    }
}
