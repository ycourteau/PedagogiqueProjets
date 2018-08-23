package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.C1253f;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.ia;

public final class ak {
    public static C0724a<Integer> f2078A = C0724a.m3335a("analytics.max_batch_post_length", 8192);
    public static C0724a<String> f2079B = C0724a.m3339a("analytics.fallback_responses.k", "404,502");
    public static C0724a<Integer> f2080C = C0724a.m3335a("analytics.batch_retry_interval.seconds.k", 3600);
    public static C0724a<Long> f2081D = C0724a.m3337a("analytics.service_monitor_interval", 86400000);
    public static C0724a<Integer> f2082E = C0724a.m3335a("analytics.http_connection.connect_timeout_millis", 60000);
    public static C0724a<Integer> f2083F = C0724a.m3335a("analytics.http_connection.read_timeout_millis", 61000);
    public static C0724a<Long> f2084G = C0724a.m3337a("analytics.campaigns.time_limit", 86400000);
    public static C0724a<String> f2085H = C0724a.m3339a("analytics.first_party_experiment_id", "");
    public static C0724a<Integer> f2086I = C0724a.m3335a("analytics.first_party_experiment_variant", 0);
    public static C0724a<Boolean> f2087J = C0724a.m3341a("analytics.test.disable_receiver", false);
    public static C0724a<Long> f2088K = C0724a.m3338a("analytics.service_client.idle_disconnect_millis", 10000, 10000);
    public static C0724a<Long> f2089L = C0724a.m3337a("analytics.service_client.connect_timeout_millis", 5000);
    public static C0724a<Long> f2090M = C0724a.m3337a("analytics.service_client.second_connect_delay_millis", 5000);
    public static C0724a<Long> f2091N = C0724a.m3337a("analytics.service_client.unexpected_reconnect_millis", 60000);
    public static C0724a<Long> f2092O = C0724a.m3337a("analytics.service_client.reconnect_throttle_millis", 1800000);
    public static C0724a<Long> f2093P = C0724a.m3337a("analytics.monitoring.sample_period_millis", 86400000);
    public static C0724a<Long> f2094Q = C0724a.m3337a("analytics.initialization_warning_threshold", 5000);
    public static C0724a<Boolean> f2095a = C0724a.m3341a("analytics.service_enabled", false);
    public static C0724a<Boolean> f2096b = C0724a.m3341a("analytics.service_client_enabled", true);
    public static C0724a<String> f2097c = C0724a.m3340a("analytics.log_tag", "GAv4", "GAv4-SVC");
    public static C0724a<Long> f2098d = C0724a.m3337a("analytics.max_tokens", 60);
    public static C0724a<Float> f2099e = C0724a.m3333a("analytics.tokens_per_sec", 0.5f);
    public static C0724a<Integer> f2100f = C0724a.m3336a("analytics.max_stored_hits", 2000, 20000);
    public static C0724a<Integer> f2101g = C0724a.m3335a("analytics.max_stored_hits_per_app", 2000);
    public static C0724a<Integer> f2102h = C0724a.m3335a("analytics.max_stored_properties_per_app", 100);
    public static C0724a<Long> f2103i = C0724a.m3338a("analytics.local_dispatch_millis", 1800000, 120000);
    public static C0724a<Long> f2104j = C0724a.m3338a("analytics.initial_local_dispatch_millis", 5000, 5000);
    public static C0724a<Long> f2105k = C0724a.m3337a("analytics.min_local_dispatch_millis", 120000);
    public static C0724a<Long> f2106l = C0724a.m3337a("analytics.max_local_dispatch_millis", 7200000);
    public static C0724a<Long> f2107m = C0724a.m3337a("analytics.dispatch_alarm_millis", 7200000);
    public static C0724a<Long> f2108n = C0724a.m3337a("analytics.max_dispatch_alarm_millis", 32400000);
    public static C0724a<Integer> f2109o = C0724a.m3335a("analytics.max_hits_per_dispatch", 20);
    public static C0724a<Integer> f2110p = C0724a.m3335a("analytics.max_hits_per_batch", 20);
    public static C0724a<String> f2111q = C0724a.m3339a("analytics.insecure_host", "http://www.google-analytics.com");
    public static C0724a<String> f2112r = C0724a.m3339a("analytics.secure_host", "https://ssl.google-analytics.com");
    public static C0724a<String> f2113s = C0724a.m3339a("analytics.simple_endpoint", "/collect");
    public static C0724a<String> f2114t = C0724a.m3339a("analytics.batching_endpoint", "/batch");
    public static C0724a<Integer> f2115u = C0724a.m3335a("analytics.max_get_length", 2036);
    public static C0724a<String> f2116v = C0724a.m3340a("analytics.batching_strategy.k", C0767y.BATCH_BY_COUNT.name(), C0767y.BATCH_BY_COUNT.name());
    public static C0724a<String> f2117w = C0724a.m3339a("analytics.compression_strategy.k", aa.GZIP.name());
    public static C0724a<Integer> f2118x = C0724a.m3335a("analytics.max_hits_per_request.k", 20);
    public static C0724a<Integer> f2119y = C0724a.m3335a("analytics.max_hit_length.k", 8192);
    public static C0724a<Integer> f2120z = C0724a.m3335a("analytics.max_post_length.k", 8192);

    public static final class C0724a<V> {
        private final V f2075a;
        private final ia<V> f2076b;
        private V f2077c;

        private C0724a(ia<V> iaVar, V v) {
            C1305x.m6617a((Object) iaVar);
            this.f2076b = iaVar;
            this.f2075a = v;
        }

        static C0724a<Float> m3333a(String str, float f) {
            return C0724a.m3334a(str, f, f);
        }

        static C0724a<Float> m3334a(String str, float f, float f2) {
            return new C0724a(ia.m5177a(str, Float.valueOf(f2)), Float.valueOf(f));
        }

        static C0724a<Integer> m3335a(String str, int i) {
            return C0724a.m3336a(str, i, i);
        }

        static C0724a<Integer> m3336a(String str, int i, int i2) {
            return new C0724a(ia.m5178a(str, Integer.valueOf(i2)), Integer.valueOf(i));
        }

        static C0724a<Long> m3337a(String str, long j) {
            return C0724a.m3338a(str, j, j);
        }

        static C0724a<Long> m3338a(String str, long j, long j2) {
            return new C0724a(ia.m5179a(str, Long.valueOf(j2)), Long.valueOf(j));
        }

        static C0724a<String> m3339a(String str, String str2) {
            return C0724a.m3340a(str, str2, str2);
        }

        static C0724a<String> m3340a(String str, String str2, String str3) {
            return new C0724a(ia.m5180a(str, str3), str2);
        }

        static C0724a<Boolean> m3341a(String str, boolean z) {
            return C0724a.m3342a(str, z, z);
        }

        static C0724a<Boolean> m3342a(String str, boolean z, boolean z2) {
            return new C0724a(ia.m5181a(str, z2), Boolean.valueOf(z));
        }

        public V m3343a() {
            return this.f2077c != null ? this.f2077c : (C1253f.f4324a && ia.m5182b()) ? this.f2076b.m5186d() : this.f2075a;
        }
    }
}
