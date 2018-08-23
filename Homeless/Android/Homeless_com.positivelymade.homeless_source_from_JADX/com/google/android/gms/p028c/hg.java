package com.google.android.gms.p028c;

import android.app.Activity;
import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C0552d;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.C0608d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

@fn
public interface hg extends C1014w {
    void mo760a();

    void mo761a(int i);

    void mo762a(Context context, AdSizeParcel adSizeParcel);

    void mo763a(AdSizeParcel adSizeParcel);

    void mo764a(C0608d c0608d);

    void mo766a(String str);

    void mo767a(String str, String str2);

    void mo768a(String str, Map<String, ?> map);

    void mo769a(String str, JSONObject jSONObject);

    void mo770a(boolean z);

    void mo771b();

    void mo772b(C0608d c0608d);

    void mo773b(String str);

    void mo774b(String str, JSONObject jSONObject);

    void mo775b(boolean z);

    Activity mo776c();

    void mo777c(String str);

    void mo778c(boolean z);

    Context mo779d();

    void destroy();

    C0552d mo781e();

    C0608d mo782f();

    C0608d mo783g();

    Context getContext();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    String getRequestId();

    int getRequestedOrientation();

    WebView getWebView();

    AdSizeParcel mo787h();

    hh mo788i();

    boolean mo789j();

    C1141o mo790k();

    VersionInfoParcel mo791l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    boolean mo795m();

    void measure(int i, int i2);

    boolean mo796n();

    void mo797o();

    boolean mo798p();

    void mo799q();

    String mo800r();

    void setBackgroundColor(int i);

    void setContext(Context context);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebViewClient(WebViewClient webViewClient);

    void setWillNotDraw(boolean z);

    void stopLoading();

    boolean willNotDraw();
}
