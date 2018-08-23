package com.google.android.gms.common.stats;

import com.google.android.gms.p028c.ia;

public final class C1533c {
    public static ia<Integer> f4604a = ia.m5178a("gms:common:stats:max_num_of_events", Integer.valueOf(100));

    public static final class C1531a {
        public static ia<Integer> f4596a = ia.m5178a("gms:common:stats:connections:level", Integer.valueOf(C1534d.f4605a));
        public static ia<String> f4597b = ia.m5180a("gms:common:stats:connections:ignored_calling_processes", "");
        public static ia<String> f4598c = ia.m5180a("gms:common:stats:connections:ignored_calling_services", "");
        public static ia<String> f4599d = ia.m5180a("gms:common:stats:connections:ignored_target_processes", "");
        public static ia<String> f4600e = ia.m5180a("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
        public static ia<Long> f4601f = ia.m5179a("gms:common:stats:connections:time_out_duration", Long.valueOf(600000));
    }

    public static final class C1532b {
        public static ia<Integer> f4602a = ia.m5178a("gms:common:stats:wakeLocks:level", Integer.valueOf(C1534d.f4605a));
        public static ia<Long> f4603b = ia.m5179a("gms:common:stats:wakelocks:time_out_duration", Long.valueOf(600000));
    }
}
