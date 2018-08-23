package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.fn;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

@fn
public class C0631h {
    private static final String f1759a = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", new Object[]{"InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time"});
    private static final Object f1760c = new Object();
    private static C0631h f1761d;
    private final C0630a f1762b;

    public class C0630a extends SQLiteOpenHelper {
        final /* synthetic */ C0631h f1758a;

        public C0630a(C0631h c0631h, Context context, String str) {
            this.f1758a = c0631h;
            super(context, str, null, 4);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(C0631h.f1759a);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C0691b.m3099c("Database updated from version " + i + " to version " + i2);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
            onCreate(sQLiteDatabase);
        }
    }

    C0631h(Context context) {
        this.f1762b = new C0630a(this, context, "google_inapp_purchase.db");
    }

    public static C0631h m2870a(Context context) {
        C0631h c0631h;
        synchronized (f1760c) {
            if (f1761d == null) {
                f1761d = new C0631h(context);
            }
            c0631h = f1761d;
        }
        return c0631h;
    }

    public SQLiteDatabase m2872a() {
        try {
            return this.f1762b.getWritableDatabase();
        } catch (SQLiteException e) {
            C0691b.m3103e("Error opening writable conversion tracking database");
            return null;
        }
    }

    public C0627f m2873a(Cursor cursor) {
        return cursor == null ? null : new C0627f(cursor.getLong(0), cursor.getString(1), cursor.getString(2));
    }

    public List<C0627f> m2874a(long j) {
        SQLiteException e;
        Throwable th;
        synchronized (f1760c) {
            List<C0627f> linkedList = new LinkedList();
            if (j <= 0) {
                return linkedList;
            }
            SQLiteDatabase a = m2872a();
            if (a == null) {
                return linkedList;
            }
            Cursor query;
            try {
                query = a.query("InAppPurchase", null, null, null, null, null, "record_time ASC", String.valueOf(j));
                try {
                    if (query.moveToFirst()) {
                        do {
                            linkedList.add(m2873a(query));
                        } while (query.moveToNext());
                    }
                    if (query != null) {
                        query.close();
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    try {
                        C0691b.m3103e("Error extracing purchase info: " + e.getMessage());
                        if (query != null) {
                            query.close();
                        }
                        return linkedList;
                    } catch (Throwable th2) {
                        th = th2;
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                query = null;
                C0691b.m3103e("Error extracing purchase info: " + e.getMessage());
                if (query != null) {
                    query.close();
                }
                return linkedList;
            } catch (Throwable th3) {
                th = th3;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
    }

    public void m2875a(C0627f c0627f) {
        if (c0627f != null) {
            synchronized (f1760c) {
                SQLiteDatabase a = m2872a();
                if (a == null) {
                    return;
                }
                a.delete("InAppPurchase", String.format(Locale.US, "%s = %d", new Object[]{"purchase_id", Long.valueOf(c0627f.f1748a)}), null);
            }
        }
    }

    public int m2876b() {
        Cursor cursor = null;
        int i = 0;
        synchronized (f1760c) {
            SQLiteDatabase a = m2872a();
            if (a == null) {
            } else {
                try {
                    cursor = a.rawQuery("select count(*) from InAppPurchase", null);
                    if (cursor.moveToFirst()) {
                        i = cursor.getInt(0);
                        if (cursor != null) {
                            cursor.close();
                        }
                    } else {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                } catch (SQLiteException e) {
                    C0691b.m3103e("Error getting record count" + e.getMessage());
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m2877b(com.google.android.gms.ads.internal.purchase.C0627f r7) {
        /*
        r6 = this;
        if (r7 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r1 = f1760c;
        monitor-enter(r1);
        r0 = r6.m2872a();	 Catch:{ all -> 0x000e }
        if (r0 != 0) goto L_0x0011;
    L_0x000c:
        monitor-exit(r1);	 Catch:{ all -> 0x000e }
        goto L_0x0002;
    L_0x000e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x000e }
        throw r0;
    L_0x0011:
        r2 = new android.content.ContentValues;	 Catch:{ all -> 0x000e }
        r2.<init>();	 Catch:{ all -> 0x000e }
        r3 = "product_id";
        r4 = r7.f1750c;	 Catch:{ all -> 0x000e }
        r2.put(r3, r4);	 Catch:{ all -> 0x000e }
        r3 = "developer_payload";
        r4 = r7.f1749b;	 Catch:{ all -> 0x000e }
        r2.put(r3, r4);	 Catch:{ all -> 0x000e }
        r3 = "record_time";
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x000e }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x000e }
        r2.put(r3, r4);	 Catch:{ all -> 0x000e }
        r3 = "InAppPurchase";
        r4 = 0;
        r2 = r0.insert(r3, r4, r2);	 Catch:{ all -> 0x000e }
        r7.f1748a = r2;	 Catch:{ all -> 0x000e }
        r0 = r6.m2876b();	 Catch:{ all -> 0x000e }
        r2 = (long) r0;	 Catch:{ all -> 0x000e }
        r4 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x0048;
    L_0x0045:
        r6.m2878c();	 Catch:{ all -> 0x000e }
    L_0x0048:
        monitor-exit(r1);	 Catch:{ all -> 0x000e }
        goto L_0x0002;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.purchase.h.b(com.google.android.gms.ads.internal.purchase.f):void");
    }

    public void m2878c() {
        SQLiteException e;
        Throwable th;
        synchronized (f1760c) {
            SQLiteDatabase a = m2872a();
            if (a == null) {
                return;
            }
            Cursor query;
            try {
                query = a.query("InAppPurchase", null, null, null, null, null, "record_time ASC", "1");
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            m2875a(m2873a(query));
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        try {
                            C0691b.m3103e("Error remove oldest record" + e.getMessage());
                            if (query != null) {
                                query.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (query != null) {
                                query.close();
                            }
                            throw th;
                        }
                    }
                }
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e3) {
                e = e3;
                query = null;
                C0691b.m3103e("Error remove oldest record" + e.getMessage());
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th3) {
                th = th3;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
    }
}
