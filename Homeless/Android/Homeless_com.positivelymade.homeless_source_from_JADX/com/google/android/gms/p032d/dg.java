package com.google.android.gms.p032d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.p028c.ik;
import com.google.android.gms.p028c.il;
import com.google.android.gms.p032d.C1585c.C1579c;
import com.google.android.gms.p032d.C1585c.C1579c.C1581a;
import com.google.android.gms.p032d.C1585c.C1583a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class dg implements C1579c {
    private static final String f4943a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[]{"datalayer", "ID", "key", "value", "expires"});
    private final Executor f4944b;
    private final Context f4945c;
    private C1605a f4946d;
    private ik f4947e;
    private int f4948f;

    class C1605a extends SQLiteOpenHelper {
        final /* synthetic */ dg f4940a;

        C1605a(dg dgVar, Context context, String str) {
            this.f4940a = dgVar;
            super(context, str, null, 1);
        }

        private void m7427a(SQLiteDatabase sQLiteDatabase) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
            Set hashSet = new HashSet();
            try {
                String[] columnNames = rawQuery.getColumnNames();
                for (Object add : columnNames) {
                    hashSet.add(add);
                }
                if (!hashSet.remove("key") || !hashSet.remove("value") || !hashSet.remove("ID") || !hashSet.remove("expires")) {
                    throw new SQLiteException("Database column missing");
                } else if (!hashSet.isEmpty()) {
                    throw new SQLiteException("Database has extra columns");
                }
            } finally {
                rawQuery.close();
            }
        }

        private boolean m7428a(String str, SQLiteDatabase sQLiteDatabase) {
            Cursor cursor;
            Throwable th;
            Cursor cursor2 = null;
            try {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                Cursor query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                try {
                    boolean moveToFirst = query.moveToFirst();
                    if (query == null) {
                        return moveToFirst;
                    }
                    query.close();
                    return moveToFirst;
                } catch (SQLiteException e) {
                    cursor = query;
                    try {
                        aj.m7038b("Error querying for table " + str);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        cursor2 = cursor;
                        th = th2;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor2 = query;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                cursor = null;
                aj.m7038b("Error querying for table " + str);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        }

        public SQLiteDatabase getWritableDatabase() {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = super.getWritableDatabase();
            } catch (SQLiteException e) {
                this.f4940a.f4945c.getDatabasePath("google_tagmanager.db").delete();
            }
            return sQLiteDatabase == null ? super.getWritableDatabase() : sQLiteDatabase;
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C1618p.m7488a(sQLiteDatabase.getPath());
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
            if (m7428a("datalayer", sQLiteDatabase)) {
                m7427a(sQLiteDatabase);
            } else {
                sQLiteDatabase.execSQL(dg.f4943a);
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    private static class C1606b {
        final String f4941a;
        final byte[] f4942b;

        C1606b(String str, byte[] bArr) {
            this.f4941a = str;
            this.f4942b = bArr;
        }

        public String toString() {
            return "KeyAndSerialized: key = " + this.f4941a + " serialized hash = " + Arrays.hashCode(this.f4942b);
        }
    }

    public dg(Context context) {
        this(context, il.m5268d(), "google_tagmanager.db", 2000, Executors.newSingleThreadExecutor());
    }

    dg(Context context, ik ikVar, String str, int i, Executor executor) {
        this.f4945c = context;
        this.f4947e = ikVar;
        this.f4948f = i;
        this.f4944b = executor;
        this.f4946d = new C1605a(this, this.f4945c, str);
    }

    private Object m7429a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Object readObject;
        Throwable th;
        ObjectInputStream objectInputStream2 = null;
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                readObject = objectInputStream.readObject();
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e) {
                    }
                }
                byteArrayInputStream.close();
            } catch (IOException e2) {
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e3) {
                    }
                }
                byteArrayInputStream.close();
                return readObject;
            } catch (ClassNotFoundException e4) {
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e5) {
                    }
                }
                byteArrayInputStream.close();
                return readObject;
            } catch (Throwable th2) {
                th = th2;
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e6) {
                        throw th;
                    }
                }
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IOException e7) {
            objectInputStream = objectInputStream2;
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            byteArrayInputStream.close();
            return readObject;
        } catch (ClassNotFoundException e8) {
            objectInputStream = objectInputStream2;
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            byteArrayInputStream.close();
            return readObject;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            objectInputStream = objectInputStream2;
            th = th4;
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            byteArrayInputStream.close();
            throw th;
        }
        return readObject;
    }

    private List<C1583a> m7432a(List<C1606b> list) {
        List<C1583a> arrayList = new ArrayList();
        for (C1606b c1606b : list) {
            arrayList.add(new C1583a(c1606b.f4941a, m7429a(c1606b.f4942b)));
        }
        return arrayList;
    }

    private void m7433a(int i) {
        int d = (m7448d() - this.f4948f) + i;
        if (d > 0) {
            List b = m7441b(d);
            aj.m7040c("DataLayer store full, deleting " + b.size() + " entries to make room.");
            m7437a((String[]) b.toArray(new String[0]));
        }
    }

    private void m7434a(long j) {
        SQLiteDatabase c = m7445c("Error opening database for deleteOlderThan.");
        if (c != null) {
            try {
                aj.m7041d("Deleted " + c.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)}) + " expired items");
            } catch (SQLiteException e) {
                aj.m7038b("Error deleting old entries.");
            }
        }
    }

    private void m7437a(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            SQLiteDatabase c = m7445c("Error opening database for deleteEntries.");
            if (c != null) {
                try {
                    c.delete("datalayer", String.format("%s in (%s)", new Object[]{"ID", TextUtils.join(",", Collections.nCopies(strArr.length, "?"))}), strArr);
                } catch (SQLiteException e) {
                    aj.m7038b("Error deleting entries " + Arrays.toString(strArr));
                }
            }
        }
    }

    private byte[] m7438a(Object obj) {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        byte[] bArr = null;
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(obj);
                bArr = byteArrayOutputStream.toByteArray();
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e) {
                    }
                }
                byteArrayOutputStream.close();
            } catch (IOException e2) {
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e3) {
                    }
                }
                byteArrayOutputStream.close();
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e4) {
                        throw th;
                    }
                }
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException e5) {
            objectOutputStream = bArr;
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            byteArrayOutputStream.close();
            return bArr;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            objectOutputStream = bArr;
            th = th4;
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            byteArrayOutputStream.close();
            throw th;
        }
        return bArr;
    }

    private List<C1583a> m7440b() {
        try {
            m7434a(this.f4947e.mo824a());
            List<C1583a> a = m7432a(m7446c());
            return a;
        } finally {
            m7449e();
        }
    }

    private List<String> m7441b(int i) {
        Cursor query;
        SQLiteException e;
        Throwable th;
        List<String> arrayList = new ArrayList();
        if (i <= 0) {
            aj.m7038b("Invalid maxEntries specified. Skipping.");
            return arrayList;
        }
        SQLiteDatabase c = m7445c("Error opening database for peekEntryIds.");
        if (c == null) {
            return arrayList;
        }
        try {
            query = c.query("datalayer", new String[]{"ID"}, null, null, null, null, String.format("%s ASC", new Object[]{"ID"}), Integer.toString(i));
            try {
                if (query.moveToFirst()) {
                    do {
                        arrayList.add(String.valueOf(query.getLong(0)));
                    } while (query.moveToNext());
                }
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    aj.m7038b("Error in peekEntries fetching entryIds: " + e.getMessage());
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
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
            aj.m7038b("Error in peekEntries fetching entryIds: " + e.getMessage());
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
        return arrayList;
    }

    private List<C1606b> m7442b(List<C1583a> list) {
        List<C1606b> arrayList = new ArrayList();
        for (C1583a c1583a : list) {
            arrayList.add(new C1606b(c1583a.f4787a, m7438a(c1583a.f4788b)));
        }
        return arrayList;
    }

    private void m7443b(String str) {
        SQLiteDatabase c = m7445c("Error opening database for clearKeysWithPrefix.");
        if (c != null) {
            try {
                aj.m7041d("Cleared " + c.delete("datalayer", "key = ? OR key LIKE ?", new String[]{str, str + ".%"}) + " items");
            } catch (SQLiteException e) {
                aj.m7038b("Error deleting entries with key prefix: " + str + " (" + e + ").");
            } finally {
                m7449e();
            }
        }
    }

    private synchronized void m7444b(List<C1606b> list, long j) {
        try {
            long a = this.f4947e.mo824a();
            m7434a(a);
            m7433a(list.size());
            m7447c(list, a + j);
            m7449e();
        } catch (Throwable th) {
            m7449e();
        }
    }

    private SQLiteDatabase m7445c(String str) {
        try {
            return this.f4946d.getWritableDatabase();
        } catch (SQLiteException e) {
            aj.m7038b(str);
            return null;
        }
    }

    private List<C1606b> m7446c() {
        SQLiteDatabase c = m7445c("Error opening database for loadSerialized.");
        List<C1606b> arrayList = new ArrayList();
        if (c == null) {
            return arrayList;
        }
        Cursor query = c.query("datalayer", new String[]{"key", "value"}, null, null, null, null, "ID", null);
        while (query.moveToNext()) {
            try {
                arrayList.add(new C1606b(query.getString(0), query.getBlob(1)));
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    private void m7447c(List<C1606b> list, long j) {
        SQLiteDatabase c = m7445c("Error opening database for writeEntryToDatabase.");
        if (c != null) {
            for (C1606b c1606b : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("expires", Long.valueOf(j));
                contentValues.put("key", c1606b.f4941a);
                contentValues.put("value", c1606b.f4942b);
                c.insert("datalayer", null, contentValues);
            }
        }
    }

    private int m7448d() {
        Cursor cursor = null;
        int i = 0;
        SQLiteDatabase c = m7445c("Error opening database for getNumStoredEntries.");
        if (c != null) {
            try {
                cursor = c.rawQuery("SELECT COUNT(*) from datalayer", null);
                if (cursor.moveToFirst()) {
                    i = (int) cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLiteException e) {
                aj.m7038b("Error getting numStoredEntries");
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return i;
    }

    private void m7449e() {
        try {
            this.f4946d.close();
        } catch (SQLiteException e) {
        }
    }

    public void mo1023a(final C1581a c1581a) {
        this.f4944b.execute(new Runnable(this) {
            final /* synthetic */ dg f4937b;

            public void run() {
                c1581a.mo1026a(this.f4937b.m7440b());
            }
        });
    }

    public void mo1024a(final String str) {
        this.f4944b.execute(new Runnable(this) {
            final /* synthetic */ dg f4939b;

            public void run() {
                this.f4939b.m7443b(str);
            }
        });
    }

    public void mo1025a(List<C1583a> list, final long j) {
        final List b = m7442b((List) list);
        this.f4944b.execute(new Runnable(this) {
            final /* synthetic */ dg f4935c;

            public void run() {
                this.f4935c.m7444b(b, j);
            }
        });
    }
}
