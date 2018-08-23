package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.ads.internal.C0618p;
import java.util.List;

@fn
public final class az {
    public static final av<Boolean> f2449A = av.m3872a("gads:looper_for_gms_client:enabled", Boolean.valueOf(true));
    public static final av<Boolean> f2450B = av.m3872a("gads:sw_ad_request_service:enabled", Boolean.valueOf(true));
    public static final av<Boolean> f2451C = av.m3872a("gads:sw_dynamite:enabled", Boolean.valueOf(true));
    public static final av<String> f2452D = av.m3873a("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    public static final av<String> f2453E = av.m3873a("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    public static final av<String> f2454F = av.m3873a("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    public static final av<Boolean> f2455G = av.m3872a("gads:enabled_sdk_csi", Boolean.valueOf(false));
    public static final av<String> f2456H = av.m3873a("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    public static final av<Boolean> f2457I = av.m3872a("gads:sdk_csi_write_to_file", Boolean.valueOf(false));
    public static final av<Boolean> f2458J = av.m3872a("gads:enable_content_fetching", Boolean.valueOf(true));
    public static final av<Integer> f2459K = av.m3870a("gads:content_length_weight", 1);
    public static final av<Integer> f2460L = av.m3870a("gads:content_age_weight", 1);
    public static final av<Integer> f2461M = av.m3870a("gads:min_content_len", 11);
    public static final av<Integer> f2462N = av.m3870a("gads:fingerprint_number", 10);
    public static final av<Integer> f2463O = av.m3870a("gads:sleep_sec", 10);
    public static final av<Boolean> f2464P = av.m3872a("gad:app_index_enabled", Boolean.valueOf(true));
    public static final av<String> f2465Q = av.m3869a("gads:kitkat_interstitial_workaround:experiment_id");
    public static final av<Boolean> f2466R = av.m3872a("gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    public static final av<Boolean> f2467S = av.m3872a("gads:interstitial_follow_url", Boolean.valueOf(true));
    public static final av<Boolean> f2468T = av.m3872a("gads:interstitial_follow_url:register_click", Boolean.valueOf(true));
    public static final av<String> f2469U = av.m3869a("gads:interstitial_follow_url:experiment_id");
    public static final av<Boolean> f2470V = av.m3872a("gads:analytics_enabled", Boolean.valueOf(true));
    public static final av<Boolean> f2471W = av.m3872a("gads:ad_key_enabled", Boolean.valueOf(false));
    public static final av<Integer> f2472X = av.m3870a("gads:webview_cache_version", 0);
    public static final av<String> f2473Y = av.m3874b("gads:pan:experiment_id");
    public static final av<String> f2474Z = av.m3873a("gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final av<String> f2475a = av.m3869a("gads:sdk_core_experiment_id");
    public static final av<Boolean> aa = av.m3872a("gads:ad_manager_creator:enabled", Boolean.valueOf(true));
    public static final av<Boolean> ab = av.m3872a("gads:log:verbose_enabled", Boolean.valueOf(false));
    public static final av<Boolean> ac = av.m3872a("gads:device_info_caching:enabled", Boolean.valueOf(true));
    public static final av<Long> ad = av.m3871a("gads:device_info_caching_expiry_ms:expiry", 300000);
    public static final av<Boolean> ae = av.m3872a("gads:gen204_signals:enabled", Boolean.valueOf(false));
    public static final av<Boolean> af = av.m3872a("gads:webview:error_reporting_enabled", Boolean.valueOf(false));
    public static final av<Boolean> ag = av.m3872a("gads:adid_reporting:enabled", Boolean.valueOf(false));
    public static final av<Boolean> ah = av.m3872a("gads:request_pkg:enabled", Boolean.valueOf(true));
    public static final av<Boolean> ai = av.m3872a("gads:gmsg:disable_back_button:enabled", Boolean.valueOf(false));
    public static final av<Long> aj = av.m3871a("gads:network:cache_prediction_duration_s", 300);
    public static final av<String> f2476b = av.m3873a("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final av<Boolean> f2477c = av.m3872a("gads:request_builder:singleton_webview", Boolean.valueOf(false));
    public static final av<String> f2478d = av.m3869a("gads:request_builder:singleton_webview_experiment_id");
    public static final av<Boolean> f2479e = av.m3872a("gads:sdk_use_dynamic_module", Boolean.valueOf(false));
    public static final av<String> f2480f = av.m3869a("gads:sdk_use_dynamic_module_experiment_id");
    public static final av<Boolean> f2481g = av.m3872a("gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    public static final av<Boolean> f2482h = av.m3872a("gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    public static final av<Boolean> f2483i = av.m3872a("gads:block_autoclicks", Boolean.valueOf(false));
    public static final av<String> f2484j = av.m3869a("gads:block_autoclicks_experiment_id");
    public static final av<String> f2485k = av.m3874b("gads:prefetch:experiment_id");
    public static final av<String> f2486l = av.m3869a("gads:spam_app_context:experiment_id");
    public static final av<Boolean> f2487m = av.m3872a("gads:spam_app_context:enabled", Boolean.valueOf(false));
    public static final av<String> f2488n = av.m3869a("gads:video_stream_cache:experiment_id");
    public static final av<Integer> f2489o = av.m3870a("gads:video_stream_cache:limit_count", 5);
    public static final av<Integer> f2490p = av.m3870a("gads:video_stream_cache:limit_space", 8388608);
    public static final av<Integer> f2491q = av.m3870a("gads:video_stream_exo_cache:buffer_size", 8388608);
    public static final av<Long> f2492r = av.m3871a("gads:video_stream_cache:limit_time_sec", 300);
    public static final av<Long> f2493s = av.m3871a("gads:video_stream_cache:notify_interval_millis", 1000);
    public static final av<Integer> f2494t = av.m3870a("gads:video_stream_cache:connect_timeout_millis", 10000);
    public static final av<Boolean> f2495u = av.m3872a("gads:video:metric_reporting_enabled", Boolean.valueOf(false));
    public static final av<String> f2496v = av.m3873a("gads:video:metric_frame_hash_times", "");
    public static final av<Long> f2497w = av.m3871a("gads:video:metric_frame_hash_time_leniency", 500);
    public static final av<String> f2498x = av.m3874b("gads:spam_ad_id_decorator:experiment_id");
    public static final av<Boolean> f2499y = av.m3872a("gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
    public static final av<String> f2500z = av.m3874b("gads:looper_for_gms_client:experiment_id");

    public static List<String> m3894a() {
        return C0618p.m2804m().m3887a();
    }

    public static void m3895a(Context context) {
        C0618p.m2805n().m3893a(context);
    }
}
