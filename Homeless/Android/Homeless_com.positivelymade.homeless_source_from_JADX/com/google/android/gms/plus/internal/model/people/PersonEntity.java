package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.support.v7.p010b.C0275a.C0274i;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.p043a.p044a.C1886a;
import com.google.android.gms.plus.p043a.p044a.C1886a.C1885a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PersonEntity extends FastSafeParcelableJsonResponse implements C1886a {
    private static final HashMap<String, Field<?, ?>> f5828A = new HashMap();
    public static final C1899a CREATOR = new C1899a();
    final Set<Integer> f5829a;
    final int f5830b;
    String f5831c;
    AgeRangeEntity f5832d;
    String f5833e;
    String f5834f;
    int f5835g;
    CoverEntity f5836h;
    String f5837i;
    String f5838j;
    int f5839k;
    String f5840l;
    ImageEntity f5841m;
    boolean f5842n;
    String f5843o;
    NameEntity f5844p;
    String f5845q;
    int f5846r;
    List<OrganizationsEntity> f5847s;
    List<PlacesLivedEntity> f5848t;
    int f5849u;
    int f5850v;
    String f5851w;
    String f5852x;
    List<UrlsEntity> f5853y;
    boolean f5854z;

    public static final class AgeRangeEntity extends FastSafeParcelableJsonResponse {
        public static final C1900b CREATOR = new C1900b();
        private static final HashMap<String, Field<?, ?>> f5769e = new HashMap();
        final Set<Integer> f5770a;
        final int f5771b;
        int f5772c;
        int f5773d;

        static {
            f5769e.put("max", Field.m6859a("max", 2));
            f5769e.put("min", Field.m6859a("min", 3));
        }

        public AgeRangeEntity() {
            this.f5771b = 1;
            this.f5770a = new HashSet();
        }

        AgeRangeEntity(Set<Integer> set, int i, int i2, int i3) {
            this.f5770a = set;
            this.f5771b = i;
            this.f5772c = i2;
            this.f5773d = i3;
        }

        public /* synthetic */ Map mo969a() {
            return m9526d();
        }

        protected boolean mo1651a(Field field) {
            return this.f5770a.contains(Integer.valueOf(field.m6874g()));
        }

        protected Object mo1652b(Field field) {
            switch (field.m6874g()) {
                case 2:
                    return Integer.valueOf(this.f5772c);
                case 3:
                    return Integer.valueOf(this.f5773d);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.m6874g());
            }
        }

        public HashMap<String, Field<?, ?>> m9526d() {
            return f5769e;
        }

        public int describeContents() {
            C1900b c1900b = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof AgeRangeEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            AgeRangeEntity ageRangeEntity = (AgeRangeEntity) obj;
            for (Field field : f5769e.values()) {
                if (mo1651a(field)) {
                    if (!ageRangeEntity.mo1651a(field)) {
                        return false;
                    }
                    if (!mo1652b(field).equals(ageRangeEntity.mo1652b(field))) {
                        return false;
                    }
                } else if (ageRangeEntity.mo1651a(field)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            for (Field field : f5769e.values()) {
                int hashCode;
                if (mo1651a(field)) {
                    hashCode = mo1652b(field).hashCode() + (i + field.m6874g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1900b c1900b = CREATOR;
            C1900b.m9571a(this, parcel, i);
        }
    }

    public static final class CoverEntity extends FastSafeParcelableJsonResponse {
        public static final C1901c CREATOR = new C1901c();
        private static final HashMap<String, Field<?, ?>> f5785f = new HashMap();
        final Set<Integer> f5786a;
        final int f5787b;
        CoverInfoEntity f5788c;
        CoverPhotoEntity f5789d;
        int f5790e;

        public static final class CoverInfoEntity extends FastSafeParcelableJsonResponse {
            public static final C1902d CREATOR = new C1902d();
            private static final HashMap<String, Field<?, ?>> f5774e = new HashMap();
            final Set<Integer> f5775a;
            final int f5776b;
            int f5777c;
            int f5778d;

            static {
                f5774e.put("leftImageOffset", Field.m6859a("leftImageOffset", 2));
                f5774e.put("topImageOffset", Field.m6859a("topImageOffset", 3));
            }

            public CoverInfoEntity() {
                this.f5776b = 1;
                this.f5775a = new HashSet();
            }

            CoverInfoEntity(Set<Integer> set, int i, int i2, int i3) {
                this.f5775a = set;
                this.f5776b = i;
                this.f5777c = i2;
                this.f5778d = i3;
            }

            public /* synthetic */ Map mo969a() {
                return m9530d();
            }

            protected boolean mo1651a(Field field) {
                return this.f5775a.contains(Integer.valueOf(field.m6874g()));
            }

            protected Object mo1652b(Field field) {
                switch (field.m6874g()) {
                    case 2:
                        return Integer.valueOf(this.f5777c);
                    case 3:
                        return Integer.valueOf(this.f5778d);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + field.m6874g());
                }
            }

            public HashMap<String, Field<?, ?>> m9530d() {
                return f5774e;
            }

            public int describeContents() {
                C1902d c1902d = CREATOR;
                return 0;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof CoverInfoEntity)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                CoverInfoEntity coverInfoEntity = (CoverInfoEntity) obj;
                for (Field field : f5774e.values()) {
                    if (mo1651a(field)) {
                        if (!coverInfoEntity.mo1651a(field)) {
                            return false;
                        }
                        if (!mo1652b(field).equals(coverInfoEntity.mo1652b(field))) {
                            return false;
                        }
                    } else if (coverInfoEntity.mo1651a(field)) {
                        return false;
                    }
                }
                return true;
            }

            public int hashCode() {
                int i = 0;
                for (Field field : f5774e.values()) {
                    int hashCode;
                    if (mo1651a(field)) {
                        hashCode = mo1652b(field).hashCode() + (i + field.m6874g());
                    } else {
                        hashCode = i;
                    }
                    i = hashCode;
                }
                return i;
            }

            public void writeToParcel(Parcel parcel, int i) {
                C1902d c1902d = CREATOR;
                C1902d.m9577a(this, parcel, i);
            }
        }

        public static final class CoverPhotoEntity extends FastSafeParcelableJsonResponse {
            public static final C1903e CREATOR = new C1903e();
            private static final HashMap<String, Field<?, ?>> f5779f = new HashMap();
            final Set<Integer> f5780a;
            final int f5781b;
            int f5782c;
            String f5783d;
            int f5784e;

            static {
                f5779f.put("height", Field.m6859a("height", 2));
                f5779f.put("url", Field.m6865c("url", 3));
                f5779f.put("width", Field.m6859a("width", 4));
            }

            public CoverPhotoEntity() {
                this.f5781b = 1;
                this.f5780a = new HashSet();
            }

            CoverPhotoEntity(Set<Integer> set, int i, int i2, String str, int i3) {
                this.f5780a = set;
                this.f5781b = i;
                this.f5782c = i2;
                this.f5783d = str;
                this.f5784e = i3;
            }

            public /* synthetic */ Map mo969a() {
                return m9534d();
            }

            protected boolean mo1651a(Field field) {
                return this.f5780a.contains(Integer.valueOf(field.m6874g()));
            }

            protected Object mo1652b(Field field) {
                switch (field.m6874g()) {
                    case 2:
                        return Integer.valueOf(this.f5782c);
                    case 3:
                        return this.f5783d;
                    case 4:
                        return Integer.valueOf(this.f5784e);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + field.m6874g());
                }
            }

            public HashMap<String, Field<?, ?>> m9534d() {
                return f5779f;
            }

            public int describeContents() {
                C1903e c1903e = CREATOR;
                return 0;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof CoverPhotoEntity)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                CoverPhotoEntity coverPhotoEntity = (CoverPhotoEntity) obj;
                for (Field field : f5779f.values()) {
                    if (mo1651a(field)) {
                        if (!coverPhotoEntity.mo1651a(field)) {
                            return false;
                        }
                        if (!mo1652b(field).equals(coverPhotoEntity.mo1652b(field))) {
                            return false;
                        }
                    } else if (coverPhotoEntity.mo1651a(field)) {
                        return false;
                    }
                }
                return true;
            }

            public int hashCode() {
                int i = 0;
                for (Field field : f5779f.values()) {
                    int hashCode;
                    if (mo1651a(field)) {
                        hashCode = mo1652b(field).hashCode() + (i + field.m6874g());
                    } else {
                        hashCode = i;
                    }
                    i = hashCode;
                }
                return i;
            }

            public void writeToParcel(Parcel parcel, int i) {
                C1903e c1903e = CREATOR;
                C1903e.m9580a(this, parcel, i);
            }
        }

        static {
            f5785f.put("coverInfo", Field.m6861a("coverInfo", 2, CoverInfoEntity.class));
            f5785f.put("coverPhoto", Field.m6861a("coverPhoto", 3, CoverPhotoEntity.class));
            f5785f.put("layout", Field.m6860a("layout", 4, new StringToIntConverter().m6844a("banner", 0), false));
        }

        public CoverEntity() {
            this.f5787b = 1;
            this.f5786a = new HashSet();
        }

        CoverEntity(Set<Integer> set, int i, CoverInfoEntity coverInfoEntity, CoverPhotoEntity coverPhotoEntity, int i2) {
            this.f5786a = set;
            this.f5787b = i;
            this.f5788c = coverInfoEntity;
            this.f5789d = coverPhotoEntity;
            this.f5790e = i2;
        }

        public /* synthetic */ Map mo969a() {
            return m9538d();
        }

        protected boolean mo1651a(Field field) {
            return this.f5786a.contains(Integer.valueOf(field.m6874g()));
        }

        protected Object mo1652b(Field field) {
            switch (field.m6874g()) {
                case 2:
                    return this.f5788c;
                case 3:
                    return this.f5789d;
                case 4:
                    return Integer.valueOf(this.f5790e);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.m6874g());
            }
        }

        public HashMap<String, Field<?, ?>> m9538d() {
            return f5785f;
        }

        public int describeContents() {
            C1901c c1901c = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CoverEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            CoverEntity coverEntity = (CoverEntity) obj;
            for (Field field : f5785f.values()) {
                if (mo1651a(field)) {
                    if (!coverEntity.mo1651a(field)) {
                        return false;
                    }
                    if (!mo1652b(field).equals(coverEntity.mo1652b(field))) {
                        return false;
                    }
                } else if (coverEntity.mo1651a(field)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            for (Field field : f5785f.values()) {
                int hashCode;
                if (mo1651a(field)) {
                    hashCode = mo1652b(field).hashCode() + (i + field.m6874g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1901c c1901c = CREATOR;
            C1901c.m9574a(this, parcel, i);
        }
    }

    public static final class ImageEntity extends FastSafeParcelableJsonResponse implements C1885a {
        public static final C1904f CREATOR = new C1904f();
        private static final HashMap<String, Field<?, ?>> f5791d = new HashMap();
        final Set<Integer> f5792a;
        final int f5793b;
        String f5794c;

        static {
            f5791d.put("url", Field.m6865c("url", 2));
        }

        public ImageEntity() {
            this.f5793b = 1;
            this.f5792a = new HashSet();
        }

        ImageEntity(Set<Integer> set, int i, String str) {
            this.f5792a = set;
            this.f5793b = i;
            this.f5794c = str;
        }

        public /* synthetic */ Map mo969a() {
            return m9542d();
        }

        protected boolean mo1651a(Field field) {
            return this.f5792a.contains(Integer.valueOf(field.m6874g()));
        }

        protected Object mo1652b(Field field) {
            switch (field.m6874g()) {
                case 2:
                    return this.f5794c;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.m6874g());
            }
        }

        public HashMap<String, Field<?, ?>> m9542d() {
            return f5791d;
        }

        public int describeContents() {
            C1904f c1904f = CREATOR;
            return 0;
        }

        public String mo1653e() {
            return this.f5794c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ImageEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            ImageEntity imageEntity = (ImageEntity) obj;
            for (Field field : f5791d.values()) {
                if (mo1651a(field)) {
                    if (!imageEntity.mo1651a(field)) {
                        return false;
                    }
                    if (!mo1652b(field).equals(imageEntity.mo1652b(field))) {
                        return false;
                    }
                } else if (imageEntity.mo1651a(field)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            for (Field field : f5791d.values()) {
                int hashCode;
                if (mo1651a(field)) {
                    hashCode = mo1652b(field).hashCode() + (i + field.m6874g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1904f c1904f = CREATOR;
            C1904f.m9583a(this, parcel, i);
        }
    }

    public static final class NameEntity extends FastSafeParcelableJsonResponse {
        public static final C1905g CREATOR = new C1905g();
        private static final HashMap<String, Field<?, ?>> f5795i = new HashMap();
        final Set<Integer> f5796a;
        final int f5797b;
        String f5798c;
        String f5799d;
        String f5800e;
        String f5801f;
        String f5802g;
        String f5803h;

        static {
            f5795i.put("familyName", Field.m6865c("familyName", 2));
            f5795i.put("formatted", Field.m6865c("formatted", 3));
            f5795i.put("givenName", Field.m6865c("givenName", 4));
            f5795i.put("honorificPrefix", Field.m6865c("honorificPrefix", 5));
            f5795i.put("honorificSuffix", Field.m6865c("honorificSuffix", 6));
            f5795i.put("middleName", Field.m6865c("middleName", 7));
        }

        public NameEntity() {
            this.f5797b = 1;
            this.f5796a = new HashSet();
        }

        NameEntity(Set<Integer> set, int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f5796a = set;
            this.f5797b = i;
            this.f5798c = str;
            this.f5799d = str2;
            this.f5800e = str3;
            this.f5801f = str4;
            this.f5802g = str5;
            this.f5803h = str6;
        }

        public /* synthetic */ Map mo969a() {
            return m9547d();
        }

        protected boolean mo1651a(Field field) {
            return this.f5796a.contains(Integer.valueOf(field.m6874g()));
        }

        protected Object mo1652b(Field field) {
            switch (field.m6874g()) {
                case 2:
                    return this.f5798c;
                case 3:
                    return this.f5799d;
                case 4:
                    return this.f5800e;
                case 5:
                    return this.f5801f;
                case 6:
                    return this.f5802g;
                case 7:
                    return this.f5803h;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.m6874g());
            }
        }

        public HashMap<String, Field<?, ?>> m9547d() {
            return f5795i;
        }

        public int describeContents() {
            C1905g c1905g = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof NameEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            NameEntity nameEntity = (NameEntity) obj;
            for (Field field : f5795i.values()) {
                if (mo1651a(field)) {
                    if (!nameEntity.mo1651a(field)) {
                        return false;
                    }
                    if (!mo1652b(field).equals(nameEntity.mo1652b(field))) {
                        return false;
                    }
                } else if (nameEntity.mo1651a(field)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            for (Field field : f5795i.values()) {
                int hashCode;
                if (mo1651a(field)) {
                    hashCode = mo1652b(field).hashCode() + (i + field.m6874g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1905g c1905g = CREATOR;
            C1905g.m9586a(this, parcel, i);
        }
    }

    public static final class OrganizationsEntity extends FastSafeParcelableJsonResponse {
        public static final C1906h CREATOR = new C1906h();
        private static final HashMap<String, Field<?, ?>> f5804l = new HashMap();
        final Set<Integer> f5805a;
        final int f5806b;
        String f5807c;
        String f5808d;
        String f5809e;
        String f5810f;
        String f5811g;
        boolean f5812h;
        String f5813i;
        String f5814j;
        int f5815k;

        static {
            f5804l.put("department", Field.m6865c("department", 2));
            f5804l.put("description", Field.m6865c("description", 3));
            f5804l.put("endDate", Field.m6865c("endDate", 4));
            f5804l.put("location", Field.m6865c("location", 5));
            f5804l.put("name", Field.m6865c("name", 6));
            f5804l.put("primary", Field.m6863b("primary", 7));
            f5804l.put("startDate", Field.m6865c("startDate", 8));
            f5804l.put("title", Field.m6865c("title", 9));
            f5804l.put("type", Field.m6860a("type", 10, new StringToIntConverter().m6844a("work", 0).m6844a("school", 1), false));
        }

        public OrganizationsEntity() {
            this.f5806b = 1;
            this.f5805a = new HashSet();
        }

        OrganizationsEntity(Set<Integer> set, int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i2) {
            this.f5805a = set;
            this.f5806b = i;
            this.f5807c = str;
            this.f5808d = str2;
            this.f5809e = str3;
            this.f5810f = str4;
            this.f5811g = str5;
            this.f5812h = z;
            this.f5813i = str6;
            this.f5814j = str7;
            this.f5815k = i2;
        }

        public /* synthetic */ Map mo969a() {
            return m9551d();
        }

        protected boolean mo1651a(Field field) {
            return this.f5805a.contains(Integer.valueOf(field.m6874g()));
        }

        protected Object mo1652b(Field field) {
            switch (field.m6874g()) {
                case 2:
                    return this.f5807c;
                case 3:
                    return this.f5808d;
                case 4:
                    return this.f5809e;
                case 5:
                    return this.f5810f;
                case 6:
                    return this.f5811g;
                case 7:
                    return Boolean.valueOf(this.f5812h);
                case 8:
                    return this.f5813i;
                case 9:
                    return this.f5814j;
                case 10:
                    return Integer.valueOf(this.f5815k);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.m6874g());
            }
        }

        public HashMap<String, Field<?, ?>> m9551d() {
            return f5804l;
        }

        public int describeContents() {
            C1906h c1906h = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OrganizationsEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            OrganizationsEntity organizationsEntity = (OrganizationsEntity) obj;
            for (Field field : f5804l.values()) {
                if (mo1651a(field)) {
                    if (!organizationsEntity.mo1651a(field)) {
                        return false;
                    }
                    if (!mo1652b(field).equals(organizationsEntity.mo1652b(field))) {
                        return false;
                    }
                } else if (organizationsEntity.mo1651a(field)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            for (Field field : f5804l.values()) {
                int hashCode;
                if (mo1651a(field)) {
                    hashCode = mo1652b(field).hashCode() + (i + field.m6874g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1906h c1906h = CREATOR;
            C1906h.m9589a(this, parcel, i);
        }
    }

    public static final class PlacesLivedEntity extends FastSafeParcelableJsonResponse {
        public static final C1907i CREATOR = new C1907i();
        private static final HashMap<String, Field<?, ?>> f5816e = new HashMap();
        final Set<Integer> f5817a;
        final int f5818b;
        boolean f5819c;
        String f5820d;

        static {
            f5816e.put("primary", Field.m6863b("primary", 2));
            f5816e.put("value", Field.m6865c("value", 3));
        }

        public PlacesLivedEntity() {
            this.f5818b = 1;
            this.f5817a = new HashSet();
        }

        PlacesLivedEntity(Set<Integer> set, int i, boolean z, String str) {
            this.f5817a = set;
            this.f5818b = i;
            this.f5819c = z;
            this.f5820d = str;
        }

        public /* synthetic */ Map mo969a() {
            return m9555d();
        }

        protected boolean mo1651a(Field field) {
            return this.f5817a.contains(Integer.valueOf(field.m6874g()));
        }

        protected Object mo1652b(Field field) {
            switch (field.m6874g()) {
                case 2:
                    return Boolean.valueOf(this.f5819c);
                case 3:
                    return this.f5820d;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.m6874g());
            }
        }

        public HashMap<String, Field<?, ?>> m9555d() {
            return f5816e;
        }

        public int describeContents() {
            C1907i c1907i = CREATOR;
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof PlacesLivedEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            PlacesLivedEntity placesLivedEntity = (PlacesLivedEntity) obj;
            for (Field field : f5816e.values()) {
                if (mo1651a(field)) {
                    if (!placesLivedEntity.mo1651a(field)) {
                        return false;
                    }
                    if (!mo1652b(field).equals(placesLivedEntity.mo1652b(field))) {
                        return false;
                    }
                } else if (placesLivedEntity.mo1651a(field)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            for (Field field : f5816e.values()) {
                int hashCode;
                if (mo1651a(field)) {
                    hashCode = mo1652b(field).hashCode() + (i + field.m6874g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1907i c1907i = CREATOR;
            C1907i.m9592a(this, parcel, i);
        }
    }

    public static final class UrlsEntity extends FastSafeParcelableJsonResponse {
        public static final C1908j CREATOR = new C1908j();
        private static final HashMap<String, Field<?, ?>> f5821f = new HashMap();
        final Set<Integer> f5822a;
        final int f5823b;
        String f5824c;
        int f5825d;
        String f5826e;
        private final int f5827g;

        static {
            f5821f.put("label", Field.m6865c("label", 5));
            f5821f.put("type", Field.m6860a("type", 6, new StringToIntConverter().m6844a("home", 0).m6844a("work", 1).m6844a("blog", 2).m6844a("profile", 3).m6844a("other", 4).m6844a("otherProfile", 5).m6844a("contributor", 6).m6844a("website", 7), false));
            f5821f.put("value", Field.m6865c("value", 4));
        }

        public UrlsEntity() {
            this.f5827g = 4;
            this.f5823b = 1;
            this.f5822a = new HashSet();
        }

        UrlsEntity(Set<Integer> set, int i, String str, int i2, String str2, int i3) {
            this.f5827g = 4;
            this.f5822a = set;
            this.f5823b = i;
            this.f5824c = str;
            this.f5825d = i2;
            this.f5826e = str2;
        }

        public /* synthetic */ Map mo969a() {
            return m9559d();
        }

        protected boolean mo1651a(Field field) {
            return this.f5822a.contains(Integer.valueOf(field.m6874g()));
        }

        protected Object mo1652b(Field field) {
            switch (field.m6874g()) {
                case 4:
                    return this.f5826e;
                case 5:
                    return this.f5824c;
                case 6:
                    return Integer.valueOf(this.f5825d);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + field.m6874g());
            }
        }

        public HashMap<String, Field<?, ?>> m9559d() {
            return f5821f;
        }

        public int describeContents() {
            C1908j c1908j = CREATOR;
            return 0;
        }

        @Deprecated
        public int m9560e() {
            return 4;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof UrlsEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            UrlsEntity urlsEntity = (UrlsEntity) obj;
            for (Field field : f5821f.values()) {
                if (mo1651a(field)) {
                    if (!urlsEntity.mo1651a(field)) {
                        return false;
                    }
                    if (!mo1652b(field).equals(urlsEntity.mo1652b(field))) {
                        return false;
                    }
                } else if (urlsEntity.mo1651a(field)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            for (Field field : f5821f.values()) {
                int hashCode;
                if (mo1651a(field)) {
                    hashCode = mo1652b(field).hashCode() + (i + field.m6874g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1908j c1908j = CREATOR;
            C1908j.m9595a(this, parcel, i);
        }
    }

    static {
        f5828A.put("aboutMe", Field.m6865c("aboutMe", 2));
        f5828A.put("ageRange", Field.m6861a("ageRange", 3, AgeRangeEntity.class));
        f5828A.put("birthday", Field.m6865c("birthday", 4));
        f5828A.put("braggingRights", Field.m6865c("braggingRights", 5));
        f5828A.put("circledByCount", Field.m6859a("circledByCount", 6));
        f5828A.put("cover", Field.m6861a("cover", 7, CoverEntity.class));
        f5828A.put("currentLocation", Field.m6865c("currentLocation", 8));
        f5828A.put("displayName", Field.m6865c("displayName", 9));
        f5828A.put("gender", Field.m6860a("gender", 12, new StringToIntConverter().m6844a("male", 0).m6844a("female", 1).m6844a("other", 2), false));
        f5828A.put("id", Field.m6865c("id", 14));
        f5828A.put("image", Field.m6861a("image", 15, ImageEntity.class));
        f5828A.put("isPlusUser", Field.m6863b("isPlusUser", 16));
        f5828A.put("language", Field.m6865c("language", 18));
        f5828A.put("name", Field.m6861a("name", 19, NameEntity.class));
        f5828A.put("nickname", Field.m6865c("nickname", 20));
        f5828A.put("objectType", Field.m6860a("objectType", 21, new StringToIntConverter().m6844a("person", 0).m6844a("page", 1), false));
        f5828A.put("organizations", Field.m6864b("organizations", 22, OrganizationsEntity.class));
        f5828A.put("placesLived", Field.m6864b("placesLived", 23, PlacesLivedEntity.class));
        f5828A.put("plusOneCount", Field.m6859a("plusOneCount", 24));
        f5828A.put("relationshipStatus", Field.m6860a("relationshipStatus", 25, new StringToIntConverter().m6844a("single", 0).m6844a("in_a_relationship", 1).m6844a("engaged", 2).m6844a("married", 3).m6844a("its_complicated", 4).m6844a("open_relationship", 5).m6844a("widowed", 6).m6844a("in_domestic_partnership", 7).m6844a("in_civil_union", 8), false));
        f5828A.put("tagline", Field.m6865c("tagline", 26));
        f5828A.put("url", Field.m6865c("url", 27));
        f5828A.put("urls", Field.m6864b("urls", 28, UrlsEntity.class));
        f5828A.put("verified", Field.m6863b("verified", 29));
    }

    public PersonEntity() {
        this.f5830b = 1;
        this.f5829a = new HashSet();
    }

    PersonEntity(Set<Integer> set, int i, String str, AgeRangeEntity ageRangeEntity, String str2, String str3, int i2, CoverEntity coverEntity, String str4, String str5, int i3, String str6, ImageEntity imageEntity, boolean z, String str7, NameEntity nameEntity, String str8, int i4, List<OrganizationsEntity> list, List<PlacesLivedEntity> list2, int i5, int i6, String str9, String str10, List<UrlsEntity> list3, boolean z2) {
        this.f5829a = set;
        this.f5830b = i;
        this.f5831c = str;
        this.f5832d = ageRangeEntity;
        this.f5833e = str2;
        this.f5834f = str3;
        this.f5835g = i2;
        this.f5836h = coverEntity;
        this.f5837i = str4;
        this.f5838j = str5;
        this.f5839k = i3;
        this.f5840l = str6;
        this.f5841m = imageEntity;
        this.f5842n = z;
        this.f5843o = str7;
        this.f5844p = nameEntity;
        this.f5845q = str8;
        this.f5846r = i4;
        this.f5847s = list;
        this.f5848t = list2;
        this.f5849u = i5;
        this.f5850v = i6;
        this.f5851w = str9;
        this.f5852x = str10;
        this.f5853y = list3;
        this.f5854z = z2;
    }

    public static PersonEntity m9561a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        PersonEntity a = CREATOR.m9569a(obtain);
        obtain.recycle();
        return a;
    }

    public /* synthetic */ Map mo969a() {
        return m9565d();
    }

    protected boolean mo1651a(Field field) {
        return this.f5829a.contains(Integer.valueOf(field.m6874g()));
    }

    protected Object mo1652b(Field field) {
        switch (field.m6874g()) {
            case 2:
                return this.f5831c;
            case 3:
                return this.f5832d;
            case 4:
                return this.f5833e;
            case 5:
                return this.f5834f;
            case 6:
                return Integer.valueOf(this.f5835g);
            case 7:
                return this.f5836h;
            case 8:
                return this.f5837i;
            case 9:
                return this.f5838j;
            case 12:
                return Integer.valueOf(this.f5839k);
            case 14:
                return this.f5840l;
            case 15:
                return this.f5841m;
            case 16:
                return Boolean.valueOf(this.f5842n);
            case 18:
                return this.f5843o;
            case 19:
                return this.f5844p;
            case 20:
                return this.f5845q;
            case 21:
                return Integer.valueOf(this.f5846r);
            case 22:
                return this.f5847s;
            case 23:
                return this.f5848t;
            case 24:
                return Integer.valueOf(this.f5849u);
            case 25:
                return Integer.valueOf(this.f5850v);
            case 26:
                return this.f5851w;
            case C0274i.Theme_actionModeStyle /*27*/:
                return this.f5852x;
            case C0274i.Theme_actionModeCloseButtonStyle /*28*/:
                return this.f5853y;
            case C0274i.Theme_actionModeBackground /*29*/:
                return Boolean.valueOf(this.f5854z);
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + field.m6874g());
        }
    }

    public HashMap<String, Field<?, ?>> m9565d() {
        return f5828A;
    }

    public int describeContents() {
        C1899a c1899a = CREATOR;
        return 0;
    }

    public String mo1654e() {
        return this.f5838j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PersonEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PersonEntity personEntity = (PersonEntity) obj;
        for (Field field : f5828A.values()) {
            if (mo1651a(field)) {
                if (!personEntity.mo1651a(field)) {
                    return false;
                }
                if (!mo1652b(field).equals(personEntity.mo1652b(field))) {
                    return false;
                }
            } else if (personEntity.mo1651a(field)) {
                return false;
            }
        }
        return true;
    }

    public C1885a mo1655f() {
        return this.f5841m;
    }

    public int hashCode() {
        int i = 0;
        for (Field field : f5828A.values()) {
            int hashCode;
            if (mo1651a(field)) {
                hashCode = mo1652b(field).hashCode() + (i + field.m6874g());
            } else {
                hashCode = i;
            }
            i = hashCode;
        }
        return i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1899a c1899a = CREATOR;
        C1899a.m9568a(this, parcel, i);
    }
}
