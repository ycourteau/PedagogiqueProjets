package com.google.android.gms.p028c;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.C1052h;
import java.util.Arrays;

public class jb extends C1052h<DriveId> {
    public static final jb f3727a = new jb();

    private jb() {
        super("driveId", Arrays.asList(new String[]{"sqlId", "resourceId", "mimeType"}), Arrays.asList(new String[]{"dbInstanceId"}), 4100000);
    }
}
