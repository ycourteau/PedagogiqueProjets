package com.google.android.gms.p028c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ix {
    private static final Method f3608a = ix.m5310a();
    private static final Method f3609b = ix.m5313b();
    private static final Method f3610c = ix.m5315c();
    private static final Method f3611d = ix.m5316d();
    private static final Method f3612e = ix.m5317e();

    public static int m5306a(WorkSource workSource) {
        if (f3610c != null) {
            try {
                return ((Integer) f3610c.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource");
            }
        }
        return 0;
    }

    public static WorkSource m5307a(int i, String str) {
        WorkSource workSource = new WorkSource();
        ix.m5311a(workSource, i, str);
        return workSource;
    }

    public static WorkSource m5308a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                return ix.m5307a(applicationInfo.uid, str);
            }
            Log.e("WorkSourceUtil", "Could not get applicationInfo from package: " + str);
            return null;
        } catch (NameNotFoundException e) {
            Log.e("WorkSourceUtil", "Could not find package: " + str);
            return null;
        }
    }

    public static String m5309a(WorkSource workSource, int i) {
        if (f3612e != null) {
            try {
                return (String) f3612e.invoke(workSource, new Object[]{Integer.valueOf(i)});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource");
            }
        }
        return null;
    }

    private static Method m5310a() {
        Method method = null;
        try {
            method = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception e) {
        }
        return method;
    }

    public static void m5311a(WorkSource workSource, int i, String str) {
        if (f3609b != null) {
            if (str == null) {
                str = "";
            }
            try {
                f3609b.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource");
            }
        } else if (f3608a != null) {
            try {
                f3608a.invoke(workSource, new Object[]{Integer.valueOf(i)});
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource");
            }
        }
    }

    public static boolean m5312a(Context context) {
        return context.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0;
    }

    private static Method m5313b() {
        Method method = null;
        if (is.m5291g()) {
            try {
                method = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
            } catch (Exception e) {
            }
        }
        return method;
    }

    public static List<String> m5314b(WorkSource workSource) {
        int i = 0;
        int a = workSource == null ? 0 : ix.m5306a(workSource);
        if (a == 0) {
            return Collections.EMPTY_LIST;
        }
        List<String> arrayList = new ArrayList();
        while (i < a) {
            String a2 = ix.m5309a(workSource, i);
            if (!iv.m5302a(a2)) {
                arrayList.add(a2);
            }
            i++;
        }
        return arrayList;
    }

    private static Method m5315c() {
        Method method = null;
        try {
            method = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception e) {
        }
        return method;
    }

    private static Method m5316d() {
        Method method = null;
        try {
            method = WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception e) {
        }
        return method;
    }

    private static Method m5317e() {
        Method method = null;
        if (is.m5291g()) {
            try {
                method = WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
            } catch (Exception e) {
            }
        }
        return method;
    }
}
