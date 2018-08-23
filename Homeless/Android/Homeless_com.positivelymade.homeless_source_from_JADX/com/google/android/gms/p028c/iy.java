package com.google.android.gms.p028c;

import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.metadata.C1048a;
import com.google.android.gms.drive.metadata.C1054c;
import com.google.android.gms.drive.metadata.C1060e;
import com.google.android.gms.drive.metadata.C1062g;
import com.google.android.gms.drive.metadata.internal.C1050a;
import com.google.android.gms.drive.metadata.internal.C1052h;
import com.google.android.gms.drive.metadata.internal.C1057k;
import com.google.android.gms.drive.metadata.internal.C1059e;
import com.google.android.gms.drive.metadata.internal.C1063g;
import com.google.android.gms.drive.metadata.internal.C1685i;
import com.google.android.gms.drive.metadata.internal.C1686j;
import com.google.android.gms.drive.metadata.internal.C1687l;
import java.util.Arrays;
import java.util.Collections;

public class iy {
    public static final C1687l f3617A = new C1687l("lastModifyingUser", 6000000);
    public static final C1687l f3618B = new C1687l("sharingUser", 6000000);
    public static final C1685i f3619C = new C1685i(4100000);
    public static final C1061d f3620D = new C1061d("quotaBytesUsed", 4300000);
    public static final C1065f f3621E = new C1065f("starred", 4100000);
    public static final C1048a<BitmapTeleporter> f3622F = new C1052h<BitmapTeleporter>("thumbnail", Collections.emptySet(), Collections.emptySet(), 4400000) {
    };
    public static final C1066g f3623G = new C1066g("title", 4100000);
    public static final C1067h f3624H = new C1067h("trashed", 4100000);
    public static final C1048a<String> f3625I = new C1057k("webContentLink", 4300000);
    public static final C1048a<String> f3626J = new C1057k("webViewLink", 4300000);
    public static final C1048a<String> f3627K = new C1057k("uniqueIdentifier", 5000000);
    public static final C1050a f3628L = new C1050a("writersCanShare", 6000000);
    public static final C1048a<String> f3629M = new C1057k("role", 6000000);
    public static final C1048a<String> f3630N = new C1057k("md5Checksum", 7000000);
    public static final C1064e f3631O = new C1064e(7000000);
    public static final C1048a<DriveId> f3632a = jb.f3727a;
    public static final C1048a<String> f3633b = new C1057k("alternateLink", 4300000);
    public static final C1055a f3634c = new C1055a(5000000);
    public static final C1048a<String> f3635d = new C1057k("description", 4300000);
    public static final C1048a<String> f3636e = new C1057k("embedLink", 4300000);
    public static final C1048a<String> f3637f = new C1057k("fileExtension", 4300000);
    public static final C1048a<Long> f3638g = new C1059e("fileSize", 4300000);
    public static final C1048a<String> f3639h = new C1057k("folderColorRgb", 7500000);
    public static final C1048a<Boolean> f3640i = new C1050a("hasThumbnail", 4300000);
    public static final C1048a<String> f3641j = new C1057k("indexableText", 4300000);
    public static final C1048a<Boolean> f3642k = new C1050a("isAppData", 4300000);
    public static final C1048a<Boolean> f3643l = new C1050a("isCopyable", 4300000);
    public static final C1048a<Boolean> f3644m = new C1050a("isEditable", 4100000);
    public static final C1048a<Boolean> f3645n = new C1050a("isExplicitlyTrashed", Collections.singleton("trashed"), Collections.emptySet(), 7000000) {
    };
    public static final C1048a<Boolean> f3646o = new C1050a("isLocalContentUpToDate", 7800000);
    public static final C1056b f3647p = new C1056b("isPinned", 4100000);
    public static final C1048a<Boolean> f3648q = new C1050a("isOpenable", 7200000);
    public static final C1048a<Boolean> f3649r = new C1050a("isRestricted", 4300000);
    public static final C1048a<Boolean> f3650s = new C1050a("isShared", 4300000);
    public static final C1048a<Boolean> f3651t = new C1050a("isGooglePhotosFolder", 7000000);
    public static final C1048a<Boolean> f3652u = new C1050a("isGooglePhotosRootFolder", 7000000);
    public static final C1048a<Boolean> f3653v = new C1050a("isTrashable", 4400000);
    public static final C1048a<Boolean> f3654w = new C1050a("isViewed", 4300000);
    public static final C1058c f3655x = new C1058c(4100000);
    public static final C1048a<String> f3656y = new C1057k("originalFilename", 4300000);
    public static final C1062g<String> f3657z = new C1686j("ownerNames", 4300000);

    public static class C1055a extends iz implements C1054c<Object> {
        public C1055a(int i) {
            super(i);
        }
    }

    public static class C1056b extends C1050a implements C1054c<Boolean> {
        public C1056b(String str, int i) {
            super(str, i);
        }
    }

    public static class C1058c extends C1057k implements C1054c<String> {
        public C1058c(int i) {
            super("mimeType", i);
        }
    }

    public static class C1061d extends C1059e implements C1060e<Long> {
        public C1061d(String str, int i) {
            super(str, i);
        }
    }

    public static class C1064e extends C1063g<DriveSpace> {
        public C1064e(int i) {
            super("spaces", Arrays.asList(new String[]{"inDriveSpace", "isAppData", "inGooglePhotosSpace"}), Collections.emptySet(), i);
        }
    }

    public static class C1065f extends C1050a implements C1054c<Boolean> {
        public C1065f(String str, int i) {
            super(str, i);
        }
    }

    public static class C1066g extends C1057k implements C1054c<String>, C1060e<String> {
        public C1066g(String str, int i) {
            super(str, i);
        }
    }

    public static class C1067h extends C1050a implements C1054c<Boolean> {
        public C1067h(String str, int i) {
            super(str, i);
        }
    }
}
