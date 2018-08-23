package com.google.android.gms.analytics.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1305x;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

class C0759v extends C0717p implements Closeable {
    private static final String f2224a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});
    private static final String f2225b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{"hit_time", "hits2"});
    private final C0758a f2226c;
    private final C0740k f2227d = new C0740k(m3214n());
    private final C0740k f2228e = new C0740k(m3214n());

    class C0758a extends SQLiteOpenHelper {
        final /* synthetic */ C0759v f2223a;

        C0758a(C0759v c0759v, Context context, String str) {
            this.f2223a = c0759v;
            super(context, str, null, 1);
        }

        private void m3551a(SQLiteDatabase sQLiteDatabase) {
            int i = 1;
            Set b = m3553b(sQLiteDatabase, "hits2");
            String[] strArr = new String[]{"hit_id", "hit_string", "hit_time", "hit_url"};
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                String str = strArr[i2];
                if (b.remove(str)) {
                    i2++;
                } else {
                    throw new SQLiteException("Database hits2 is missing required column: " + str);
                }
            }
            if (b.remove("hit_app_id")) {
                i = 0;
            }
            if (!b.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            } else if (i != 0) {
                sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        }

        private boolean m3552a(SQLiteDatabase sQLiteDatabase, String str) {
            Object e;
            Throwable th;
            Cursor cursor = null;
            Cursor query;
            try {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                try {
                    boolean moveToFirst = query.moveToFirst();
                    if (query == null) {
                        return moveToFirst;
                    }
                    query.close();
                    return moveToFirst;
                } catch (SQLiteException e2) {
                    e = e2;
                    try {
                        this.f2223a.m3204c("Error querying for table", str, e);
                        if (query != null) {
                            query.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                query = null;
                this.f2223a.m3204c("Error querying for table", str, e);
                if (query != null) {
                    query.close();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        private Set<String> m3553b(SQLiteDatabase sQLiteDatabase, String str) {
            Set<String> hashSet = new HashSet();
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
            try {
                String[] columnNames = rawQuery.getColumnNames();
                for (Object add : columnNames) {
                    hashSet.add(add);
                }
                return hashSet;
            } finally {
                rawQuery.close();
            }
        }

        private void m3554b(SQLiteDatabase sQLiteDatabase) {
            int i = 0;
            Set b = m3553b(sQLiteDatabase, "properties");
            String[] strArr = new String[]{"app_uid", "cid", "tid", "params", "adid", "hits_count"};
            int length = strArr.length;
            while (i < length) {
                String str = strArr[i];
                if (b.remove(str)) {
                    i++;
                } else {
                    throw new SQLiteException("Database properties is missing required column: " + str);
                }
            }
            if (!b.isEmpty()) {
                throw new SQLiteException("Database properties table has extra columns");
            }
        }

        public SQLiteDatabase getWritableDatabase() {
            if (this.f2223a.f2228e.m3445a(3600000)) {
                SQLiteDatabase writableDatabase;
                try {
                    writableDatabase = super.getWritableDatabase();
                } catch (SQLiteException e) {
                    this.f2223a.f2228e.m3444a();
                    this.f2223a.m3210f("Opening the database failed, dropping the table and recreating it");
                    this.f2223a.m3215o().getDatabasePath(this.f2223a.m3556G()).delete();
                    try {
                        writableDatabase = super.getWritableDatabase();
                        this.f2223a.f2228e.m3446b();
                    } catch (SQLiteException e2) {
                        this.f2223a.m3209e("Failed to open freshly created database", e2);
                        throw e2;
                    }
                }
                return writableDatabase;
            }
            throw new SQLiteException("Database open failed");
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            aj.m3332a(sQLiteDatabase.getPath());
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (VERSION.SDK_INT < 15) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
                try {
                    rawQuery.moveToFirst();
                } finally {
                    rawQuery.close();
                }
            }
            if (m3552a(sQLiteDatabase, "hits2")) {
                m3551a(sQLiteDatabase);
            } else {
                sQLiteDatabase.execSQL(C0759v.f2224a);
            }
            if (m3552a(sQLiteDatabase, "properties")) {
                m3554b(sQLiteDatabase);
            } else {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    C0759v(C0750r c0750r) {
        super(c0750r);
        this.f2226c = new C0758a(this, c0750r.m3490b(), m3556G());
    }

    private void m3555F() {
        int y = m3217q().m3306y();
        long e = m3579e();
        if (e > ((long) (y - 1))) {
            List a = m3566a((e - ((long) y)) + 1);
            m3206d("Store full, deleting hits to make room, count", Integer.valueOf(a.size()));
            m3572a(a);
        }
    }

    private String m3556G() {
        return !m3217q().m3282a() ? m3217q().m3275A() : m3217q().m3283b() ? m3217q().m3275A() : m3217q().m3276B();
    }

    private long m3557a(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = m3584i().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            m3207d("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private long m3558a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            cursor = m3584i().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
            } else if (cursor != null) {
                cursor.close();
            }
            return j;
        } catch (SQLiteException e) {
            m3207d("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private static String m3560a(Map<String, String> map) {
        C1305x.m6617a((Object) map);
        Builder builder = new Builder();
        for (Entry entry : map.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String encodedQuery = builder.build().getEncodedQuery();
        return encodedQuery == null ? "" : encodedQuery;
    }

    private String m3561b(C0727c c0727c) {
        return c0727c.m3371f() ? m3217q().m3296o() : m3217q().m3297p();
    }

    private static String m3563c(C0727c c0727c) {
        C1305x.m6617a((Object) c0727c);
        Builder builder = new Builder();
        for (Entry entry : c0727c.m3367b().entrySet()) {
            String str = (String) entry.getKey();
            if (!("ht".equals(str) || "qt".equals(str) || "AppUID".equals(str))) {
                builder.appendQueryParameter(str, (String) entry.getValue());
            }
        }
        String encodedQuery = builder.build().getEncodedQuery();
        return encodedQuery == null ? "" : encodedQuery;
    }

    public long m3565a(long j, String str, String str2) {
        C1305x.m6619a(str);
        C1305x.m6619a(str2);
        m3228D();
        m3213m();
        return m3558a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{String.valueOf(j), str, str2}, 0);
    }

    public List<Long> m3566a(long j) {
        Object e;
        Throwable th;
        Cursor cursor = null;
        m3213m();
        m3228D();
        if (j <= 0) {
            return Collections.emptyList();
        }
        SQLiteDatabase i = m3584i();
        List<Long> arrayList = new ArrayList();
        Cursor query;
        try {
            query = i.query("hits2", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", new Object[]{"hit_id"}), Long.toString(j));
            try {
                if (query.moveToFirst()) {
                    do {
                        arrayList.add(Long.valueOf(query.getLong(0)));
                    } while (query.moveToNext());
                }
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    m3206d("Error selecting hit ids", e);
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            m3206d("Error selecting hit ids", e);
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return arrayList;
    }

    Map<String, String> m3567a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                str = "?" + str;
            }
            List<NameValuePair> parse = URLEncodedUtils.parse(new URI(str), "UTF-8");
            Map<String, String> hashMap = new HashMap(parse.size());
            for (NameValuePair nameValuePair : parse) {
                hashMap.put(nameValuePair.getName(), nameValuePair.getValue());
            }
            return hashMap;
        } catch (URISyntaxException e) {
            m3209e("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    protected void mo540a() {
    }

    public void m3569a(long j, String str) {
        C1305x.m6619a(str);
        m3228D();
        m3213m();
        int delete = m3584i().delete("properties", "app_uid=? AND cid<>?", new String[]{String.valueOf(j), str});
        if (delete > 0) {
            m3195a("Deleted property records", Integer.valueOf(delete));
        }
    }

    public void m3570a(C0727c c0727c) {
        C1305x.m6617a((Object) c0727c);
        m3213m();
        m3228D();
        String c = C0759v.m3563c(c0727c);
        if (c.length() > 8192) {
            m3216p().m3391a(c0727c, "Hit length exceeds the maximum allowed size");
            return;
        }
        m3555F();
        SQLiteDatabase i = m3584i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_string", c);
        contentValues.put("hit_time", Long.valueOf(c0727c.m3369d()));
        contentValues.put("hit_app_id", Integer.valueOf(c0727c.m3366a()));
        contentValues.put("hit_url", m3561b(c0727c));
        try {
            long insert = i.insert("hits2", null, contentValues);
            if (insert == -1) {
                m3210f("Failed to insert a hit (got -1)");
            } else {
                m3200b("Hit saved to database. db-id, hit", Long.valueOf(insert), c0727c);
            }
        } catch (SQLiteException e) {
            m3209e("Error storing a hit", e);
        }
    }

    public void m3571a(C0752t c0752t) {
        C1305x.m6617a((Object) c0752t);
        m3228D();
        m3213m();
        SQLiteDatabase i = m3584i();
        String a = C0759v.m3560a(c0752t.m3534f());
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_uid", Long.valueOf(c0752t.m3528a()));
        contentValues.put("cid", c0752t.m3530b());
        contentValues.put("tid", c0752t.m3531c());
        contentValues.put("adid", Integer.valueOf(c0752t.m3532d() ? 1 : 0));
        contentValues.put("hits_count", Long.valueOf(c0752t.m3533e()));
        contentValues.put("params", a);
        try {
            if (i.insertWithOnConflict("properties", null, contentValues, 5) == -1) {
                m3210f("Failed to insert/update a property (got -1)");
            }
        } catch (SQLiteException e) {
            m3209e("Error storing a property", e);
        }
    }

    public void m3572a(List<Long> list) {
        C1305x.m6617a((Object) list);
        m3213m();
        m3228D();
        if (!list.isEmpty()) {
            int i;
            StringBuilder stringBuilder = new StringBuilder("hit_id");
            stringBuilder.append(" in (");
            for (i = 0; i < list.size(); i++) {
                Long l = (Long) list.get(i);
                if (l == null || l.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(l);
            }
            stringBuilder.append(")");
            String stringBuilder2 = stringBuilder.toString();
            try {
                SQLiteDatabase i2 = m3584i();
                m3195a("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                i = i2.delete("hits2", stringBuilder2, null);
                if (i != list.size()) {
                    m3201b("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(i), stringBuilder2);
                }
            } catch (SQLiteException e) {
                m3209e("Error deleting hits", e);
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.google.android.gms.analytics.internal.C0727c> m3573b(long r14) {
        /*
        r13 = this;
        r0 = 1;
        r1 = 0;
        r9 = 0;
        r2 = 0;
        r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x008f;
    L_0x0009:
        com.google.android.gms.common.internal.C1305x.m6625b(r0);
        r13.m3213m();
        r13.m3228D();
        r0 = r13.m3584i();
        r1 = "hits2";
        r2 = 5;
        r2 = new java.lang.String[r2];	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 0;
        r4 = "hit_id";
        r2[r3] = r4;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 1;
        r4 = "hit_time";
        r2[r3] = r4;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 2;
        r4 = "hit_string";
        r2[r3] = r4;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 3;
        r4 = "hit_url";
        r2[r3] = r4;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 4;
        r4 = "hit_app_id";
        r2[r3] = r4;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = "%s ASC";
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r10 = 0;
        r11 = "hit_id";
        r8[r10] = r11;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r7 = java.lang.String.format(r7, r8);	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r8 = java.lang.Long.toString(r14);	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r9 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r10 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r10.<init>();	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r0 = r9.moveToFirst();	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        if (r0 == 0) goto L_0x0089;
    L_0x0059:
        r0 = 0;
        r6 = r9.getLong(r0);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r0 = 1;
        r3 = r9.getLong(r0);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r0 = 2;
        r0 = r9.getString(r0);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r1 = 3;
        r1 = r9.getString(r1);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r2 = 4;
        r8 = r9.getInt(r2);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r2 = r13.m3567a(r0);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r5 = com.google.android.gms.analytics.internal.C0741l.m3461d(r1);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r0 = new com.google.android.gms.analytics.internal.c;	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r1 = r13;
        r0.<init>(r1, r2, r3, r5, r6, r8);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r10.add(r0);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r0 = r9.moveToNext();	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        if (r0 != 0) goto L_0x0059;
    L_0x0089:
        if (r9 == 0) goto L_0x008e;
    L_0x008b:
        r9.close();
    L_0x008e:
        return r10;
    L_0x008f:
        r0 = r1;
        goto L_0x0009;
    L_0x0092:
        r0 = move-exception;
        r1 = r9;
    L_0x0094:
        r2 = "Error loading hits from the database";
        r13.m3209e(r2, r0);	 Catch:{ all -> 0x009a }
        throw r0;	 Catch:{ all -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        r9 = r1;
    L_0x009c:
        if (r9 == 0) goto L_0x00a1;
    L_0x009e:
        r9.close();
    L_0x00a1:
        throw r0;
    L_0x00a2:
        r0 = move-exception;
        goto L_0x009c;
    L_0x00a4:
        r0 = move-exception;
        r1 = r9;
        goto L_0x0094;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.v.b(long):java.util.List<com.google.android.gms.analytics.internal.c>");
    }

    public void m3574b() {
        m3228D();
        m3584i().beginTransaction();
    }

    public void m3575c() {
        m3228D();
        m3584i().setTransactionSuccessful();
    }

    public void m3576c(long j) {
        m3213m();
        m3228D();
        List arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j));
        m3195a("Deleting hit, id", Long.valueOf(j));
        m3572a(arrayList);
    }

    public void close() {
        try {
            this.f2226c.close();
        } catch (SQLiteException e) {
            m3209e("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            m3209e("Error closing database", e2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.google.android.gms.analytics.internal.C0752t> m3577d(long r14) {
        /*
        r13 = this;
        r13.m3228D();
        r13.m3213m();
        r0 = r13.m3584i();
        r9 = 0;
        r1 = 5;
        r2 = new java.lang.String[r1];	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r1 = 0;
        r3 = "cid";
        r2[r1] = r3;	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r1 = 1;
        r3 = "tid";
        r2[r1] = r3;	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r1 = 2;
        r3 = "adid";
        r2[r1] = r3;	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r1 = 3;
        r3 = "hits_count";
        r2[r1] = r3;	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r1 = 4;
        r3 = "params";
        r2[r1] = r3;	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r1 = r13.m3217q();	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r10 = r1.m3307z();	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r8 = java.lang.String.valueOf(r10);	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r3 = "app_uid=?";
        r1 = 1;
        r4 = new java.lang.String[r1];	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r1 = 0;
        r5 = java.lang.String.valueOf(r14);	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r4[r1] = r5;	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r1 = "properties";
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r9 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
        r11 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r11.<init>();	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r0 = r9.moveToFirst();	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        if (r0 == 0) goto L_0x008b;
    L_0x0053:
        r0 = 0;
        r3 = r9.getString(r0);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r0 = 1;
        r4 = r9.getString(r0);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r0 = 2;
        r0 = r9.getInt(r0);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        if (r0 == 0) goto L_0x009c;
    L_0x0064:
        r5 = 1;
    L_0x0065:
        r0 = 3;
        r0 = r9.getInt(r0);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r6 = (long) r0;	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r0 = 4;
        r0 = r9.getString(r0);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r8 = r13.m3582g(r0);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r0 = android.text.TextUtils.isEmpty(r3);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        if (r0 != 0) goto L_0x0080;
    L_0x007a:
        r0 = android.text.TextUtils.isEmpty(r4);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        if (r0 == 0) goto L_0x009e;
    L_0x0080:
        r0 = "Read property with empty client id or tracker id";
        r13.m3204c(r0, r3, r4);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
    L_0x0085:
        r0 = r9.moveToNext();	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        if (r0 != 0) goto L_0x0053;
    L_0x008b:
        r0 = r11.size();	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        if (r0 < r10) goto L_0x0096;
    L_0x0091:
        r0 = "Sending hits to too many properties. Campaign report might be incorrect";
        r13.m3208e(r0);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
    L_0x0096:
        if (r9 == 0) goto L_0x009b;
    L_0x0098:
        r9.close();
    L_0x009b:
        return r11;
    L_0x009c:
        r5 = 0;
        goto L_0x0065;
    L_0x009e:
        r0 = new com.google.android.gms.analytics.internal.t;	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r1 = r14;
        r0.<init>(r1, r3, r4, r5, r6, r8);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        r11.add(r0);	 Catch:{ SQLiteException -> 0x00a8, all -> 0x00b8 }
        goto L_0x0085;
    L_0x00a8:
        r0 = move-exception;
        r1 = r9;
    L_0x00aa:
        r2 = "Error loading hits from the database";
        r13.m3209e(r2, r0);	 Catch:{ all -> 0x00b0 }
        throw r0;	 Catch:{ all -> 0x00b0 }
    L_0x00b0:
        r0 = move-exception;
        r9 = r1;
    L_0x00b2:
        if (r9 == 0) goto L_0x00b7;
    L_0x00b4:
        r9.close();
    L_0x00b7:
        throw r0;
    L_0x00b8:
        r0 = move-exception;
        goto L_0x00b2;
    L_0x00ba:
        r0 = move-exception;
        r1 = r9;
        goto L_0x00aa;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.v.d(long):java.util.List<com.google.android.gms.analytics.internal.t>");
    }

    public void m3578d() {
        m3228D();
        m3584i().endTransaction();
    }

    public long m3579e() {
        m3213m();
        m3228D();
        return m3557a("SELECT COUNT(*) FROM hits2", null);
    }

    boolean m3580f() {
        return m3579e() == 0;
    }

    public int m3581g() {
        m3213m();
        m3228D();
        if (!this.f2227d.m3445a(86400000)) {
            return 0;
        }
        this.f2227d.m3444a();
        m3198b("Deleting stale hits (if any)");
        int delete = m3584i().delete("hits2", "hit_time < ?", new String[]{Long.toString(m3214n().mo824a() - 2592000000L)});
        m3195a("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    Map<String, String> m3582g(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            List<NameValuePair> parse = URLEncodedUtils.parse(new URI("?" + str), "UTF-8");
            Map<String, String> hashMap = new HashMap(parse.size());
            for (NameValuePair nameValuePair : parse) {
                hashMap.put(nameValuePair.getName(), nameValuePair.getValue());
            }
            return hashMap;
        } catch (URISyntaxException e) {
            m3209e("Error parsing property parameters", e);
            return new HashMap(0);
        }
    }

    public long m3583h() {
        m3213m();
        m3228D();
        return m3558a(f2225b, null, 0);
    }

    SQLiteDatabase m3584i() {
        try {
            return this.f2226c.getWritableDatabase();
        } catch (SQLiteException e) {
            m3206d("Error opening database", e);
            throw e;
        }
    }
}
