package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.bi;
import com.google.android.gms.drive.metadata.C1048a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class MetadataBundle implements SafeParcelable {
    public static final Creator<MetadataBundle> CREATOR = new C1684f();
    final int f5284a;
    final Bundle f5285b;

    MetadataBundle(int i, Bundle bundle) {
        this.f5284a = i;
        this.f5285b = (Bundle) C1305x.m6617a((Object) bundle);
        this.f5285b.setClassLoader(getClass().getClassLoader());
        List<String> arrayList = new ArrayList();
        for (String str : this.f5285b.keySet()) {
            if (C1682c.m7883a(str) == null) {
                arrayList.add(str);
                bi.m7679a("MetadataBundle", "Ignored unknown metadata field in bundle: " + str);
            }
        }
        for (String str2 : arrayList) {
            this.f5285b.remove(str2);
        }
    }

    public <T> T m7881a(C1048a<T> c1048a) {
        return c1048a.mo827a(this.f5285b);
    }

    public Set<C1048a<?>> m7882a() {
        Set<C1048a<?>> hashSet = new HashSet();
        for (String a : this.f5285b.keySet()) {
            hashSet.add(C1682c.m7883a(a));
        }
        return hashSet;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetadataBundle)) {
            return false;
        }
        MetadataBundle metadataBundle = (MetadataBundle) obj;
        Set<String> keySet = this.f5285b.keySet();
        if (!keySet.equals(metadataBundle.f5285b.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!C1304w.m6615a(this.f5285b.get(str), metadataBundle.f5285b.get(str))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (String str : this.f5285b.keySet()) {
            i *= 31;
            i = this.f5285b.get(str).hashCode() + i;
        }
        return i;
    }

    public String toString() {
        return "MetadataBundle [values=" + this.f5285b + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1684f.m7887a(this, parcel, i);
    }
}
