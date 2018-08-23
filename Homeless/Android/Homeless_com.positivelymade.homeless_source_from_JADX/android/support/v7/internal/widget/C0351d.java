package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.support.v4.p005d.C0071a;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public class C0351d extends DataSetObservable {
    private static final String f902a = C0351d.class.getSimpleName();
    private static final Object f903b = new Object();
    private static final Map<String, C0351d> f904c = new HashMap();
    private final Object f905d;
    private final List<C0346a> f906e;
    private final List<C0348c> f907f;
    private final Context f908g;
    private final String f909h;
    private Intent f910i;
    private C0347b f911j;
    private int f912k;
    private boolean f913l;
    private boolean f914m;
    private boolean f915n;
    private boolean f916o;
    private C0349d f917p;

    public final class C0346a implements Comparable<C0346a> {
        public final ResolveInfo f895a;
        public float f896b;
        final /* synthetic */ C0351d f897c;

        public C0346a(C0351d c0351d, ResolveInfo resolveInfo) {
            this.f897c = c0351d;
            this.f895a = resolveInfo;
        }

        public int m1634a(C0346a c0346a) {
            return Float.floatToIntBits(c0346a.f896b) - Float.floatToIntBits(this.f896b);
        }

        public /* synthetic */ int compareTo(Object obj) {
            return m1634a((C0346a) obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(this.f896b) == Float.floatToIntBits(((C0346a) obj).f896b);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f896b) + 31;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append("resolveInfo:").append(this.f895a.toString());
            stringBuilder.append("; weight:").append(new BigDecimal((double) this.f896b));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public interface C0347b {
        void m1635a(Intent intent, List<C0346a> list, List<C0348c> list2);
    }

    public static final class C0348c {
        public final ComponentName f898a;
        public final long f899b;
        public final float f900c;

        public C0348c(ComponentName componentName, long j, float f) {
            this.f898a = componentName;
            this.f899b = j;
            this.f900c = f;
        }

        public C0348c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            C0348c c0348c = (C0348c) obj;
            if (this.f898a == null) {
                if (c0348c.f898a != null) {
                    return false;
                }
            } else if (!this.f898a.equals(c0348c.f898a)) {
                return false;
            }
            return this.f899b != c0348c.f899b ? false : Float.floatToIntBits(this.f900c) == Float.floatToIntBits(c0348c.f900c);
        }

        public int hashCode() {
            return (((((this.f898a == null ? 0 : this.f898a.hashCode()) + 31) * 31) + ((int) (this.f899b ^ (this.f899b >>> 32)))) * 31) + Float.floatToIntBits(this.f900c);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append("; activity:").append(this.f898a);
            stringBuilder.append("; time:").append(this.f899b);
            stringBuilder.append("; weight:").append(new BigDecimal((double) this.f900c));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public interface C0349d {
        boolean m1636a(C0351d c0351d, Intent intent);
    }

    private final class C0350e extends AsyncTask<Object, Void, Void> {
        final /* synthetic */ C0351d f901a;

        private C0350e(C0351d c0351d) {
            this.f901a = c0351d;
        }

        public Void m1637a(Object... objArr) {
            int i = 0;
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                OutputStream openFileOutput = this.f901a.f908g.openFileOutput(str, 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.valueOf(true));
                    newSerializer.startTag(null, "historical-records");
                    int size = list.size();
                    while (i < size) {
                        C0348c c0348c = (C0348c) list.remove(0);
                        newSerializer.startTag(null, "historical-record");
                        newSerializer.attribute(null, "activity", c0348c.f898a.flattenToString());
                        newSerializer.attribute(null, "time", String.valueOf(c0348c.f899b));
                        newSerializer.attribute(null, "weight", String.valueOf(c0348c.f900c));
                        newSerializer.endTag(null, "historical-record");
                        i++;
                    }
                    newSerializer.endTag(null, "historical-records");
                    newSerializer.endDocument();
                    this.f901a.f913l = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (Throwable e2) {
                    Log.e(C0351d.f902a, "Error writing historical recrod file: " + this.f901a.f909h, e2);
                    this.f901a.f913l = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e3) {
                        }
                    }
                } catch (Throwable e22) {
                    Log.e(C0351d.f902a, "Error writing historical recrod file: " + this.f901a.f909h, e22);
                    this.f901a.f913l = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e4) {
                        }
                    }
                } catch (Throwable e222) {
                    Log.e(C0351d.f902a, "Error writing historical recrod file: " + this.f901a.f909h, e222);
                    this.f901a.f913l = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e5) {
                        }
                    }
                } catch (Throwable th) {
                    this.f901a.f913l = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e6) {
                        }
                    }
                }
            } catch (Throwable e2222) {
                Log.e(C0351d.f902a, "Error writing historical recrod file: " + str, e2222);
            }
            return null;
        }

        public /* synthetic */ Object doInBackground(Object[] objArr) {
            return m1637a(objArr);
        }
    }

    private boolean m1639a(C0348c c0348c) {
        boolean add = this.f907f.add(c0348c);
        if (add) {
            this.f915n = true;
            m1648i();
            m1643d();
            m1645f();
            notifyChanged();
        }
        return add;
    }

    private void m1643d() {
        if (!this.f914m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f915n) {
            this.f915n = false;
            if (!TextUtils.isEmpty(this.f909h)) {
                C0071a.m412a(new C0350e(), this.f907f, this.f909h);
            }
        }
    }

    private void m1644e() {
        int g = m1646g() | m1647h();
        m1648i();
        if (g != 0) {
            m1645f();
            notifyChanged();
        }
    }

    private boolean m1645f() {
        if (this.f911j == null || this.f910i == null || this.f906e.isEmpty() || this.f907f.isEmpty()) {
            return false;
        }
        this.f911j.m1635a(this.f910i, this.f906e, Collections.unmodifiableList(this.f907f));
        return true;
    }

    private boolean m1646g() {
        if (!this.f916o || this.f910i == null) {
            return false;
        }
        this.f916o = false;
        this.f906e.clear();
        List queryIntentActivities = this.f908g.getPackageManager().queryIntentActivities(this.f910i, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f906e.add(new C0346a(this, (ResolveInfo) queryIntentActivities.get(i)));
        }
        return true;
    }

    private boolean m1647h() {
        if (!this.f913l || !this.f915n || TextUtils.isEmpty(this.f909h)) {
            return false;
        }
        this.f913l = false;
        this.f914m = true;
        m1649j();
        return true;
    }

    private void m1648i() {
        int size = this.f907f.size() - this.f912k;
        if (size > 0) {
            this.f915n = true;
            for (int i = 0; i < size; i++) {
                C0348c c0348c = (C0348c) this.f907f.remove(0);
            }
        }
    }

    private void m1649j() {
        try {
            InputStream openFileInput = this.f908g.openFileInput(this.f909h);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, null);
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List list = this.f907f;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            break;
                        } else if (!(next == 3 || next == 4)) {
                            if ("historical-record".equals(newPullParser.getName())) {
                                list.add(new C0348c(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                            } else {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                        }
                    }
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                            return;
                        } catch (IOException e) {
                            return;
                        }
                    }
                    return;
                }
                throw new XmlPullParserException("Share records file does not start with historical-records tag.");
            } catch (Throwable e2) {
                Log.e(f902a, "Error reading historical recrod file: " + this.f909h, e2);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e3) {
                    }
                }
            } catch (Throwable e22) {
                Log.e(f902a, "Error reading historical recrod file: " + this.f909h, e22);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e4) {
                    }
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e5) {
                    }
                }
            }
        } catch (FileNotFoundException e6) {
        }
    }

    public int m1650a() {
        int size;
        synchronized (this.f905d) {
            m1644e();
            size = this.f906e.size();
        }
        return size;
    }

    public int m1651a(ResolveInfo resolveInfo) {
        synchronized (this.f905d) {
            m1644e();
            List list = this.f906e;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C0346a) list.get(i)).f895a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public ResolveInfo m1652a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f905d) {
            m1644e();
            resolveInfo = ((C0346a) this.f906e.get(i)).f895a;
        }
        return resolveInfo;
    }

    public Intent m1653b(int i) {
        synchronized (this.f905d) {
            if (this.f910i == null) {
                return null;
            }
            m1644e();
            C0346a c0346a = (C0346a) this.f906e.get(i);
            ComponentName componentName = new ComponentName(c0346a.f895a.activityInfo.packageName, c0346a.f895a.activityInfo.name);
            Intent intent = new Intent(this.f910i);
            intent.setComponent(componentName);
            if (this.f917p != null) {
                if (this.f917p.m1636a(this, new Intent(intent))) {
                    return null;
                }
            }
            m1639a(new C0348c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public ResolveInfo m1654b() {
        synchronized (this.f905d) {
            m1644e();
            if (this.f906e.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((C0346a) this.f906e.get(0)).f895a;
            return resolveInfo;
        }
    }

    public void m1655c(int i) {
        synchronized (this.f905d) {
            m1644e();
            C0346a c0346a = (C0346a) this.f906e.get(i);
            C0346a c0346a2 = (C0346a) this.f906e.get(0);
            m1639a(new C0348c(new ComponentName(c0346a.f895a.activityInfo.packageName, c0346a.f895a.activityInfo.name), System.currentTimeMillis(), c0346a2 != null ? (c0346a2.f896b - c0346a.f896b) + 5.0f : 1.0f));
        }
    }
}
