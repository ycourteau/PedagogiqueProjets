package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.C0774g;
import com.google.android.gms.common.api.C1180c;
import com.google.android.gms.common.api.C1183k.C0783a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p028c.hw;
import com.google.android.gms.p028c.hx;
import java.util.List;

public class GetRecentContextCall {

    public static class Request implements SafeParcelable {
        public static final C0793f CREATOR = new C0793f();
        final int f2289a;
        public final Account f2290b;
        public final boolean f2291c;
        public final boolean f2292d;
        public final boolean f2293e;
        public final String f2294f;

        public static final class C0773a {
            private Account f2284a;
            private boolean f2285b;
            private boolean f2286c;
            private boolean f2287d;
            private String f2288e;

            public C0773a m3666a(String str) {
                this.f2288e = str;
                return this;
            }

            public C0773a m3667a(boolean z) {
                this.f2286c = z;
                return this;
            }

            public Request m3668a() {
                return new Request(this.f2284a, this.f2285b, this.f2286c, this.f2287d, this.f2288e);
            }
        }

        public Request() {
            this(null, false, false, false, null);
        }

        Request(int i, Account account, boolean z, boolean z2, boolean z3, String str) {
            this.f2289a = i;
            this.f2290b = account;
            this.f2291c = z;
            this.f2292d = z2;
            this.f2293e = z3;
            this.f2294f = str;
        }

        public Request(Account account, boolean z, boolean z2, boolean z3, String str) {
            this(1, account, z, z2, z3, str);
        }

        public int describeContents() {
            C0793f c0793f = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C0793f c0793f = CREATOR;
            C0793f.m3739a(this, parcel, i);
        }
    }

    public static class Response implements C0774g, SafeParcelable {
        public static final C0794g CREATOR = new C0794g();
        public Status f2295a;
        public List<UsageInfo> f2296b;
        public String[] f2297c;
        final int f2298d;

        public Response() {
            this.f2298d = 1;
        }

        Response(int i, Status status, List<UsageInfo> list, String[] strArr) {
            this.f2298d = i;
            this.f2295a = status;
            this.f2296b = list;
            this.f2297c = strArr;
        }

        public Status mo558a() {
            return this.f2295a;
        }

        public int describeContents() {
            C0794g c0794g = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C0794g c0794g = CREATOR;
            C0794g.m3742a(this, parcel, i);
        }
    }

    public static class C0784a extends C0783a<Response, hx> {
        private final Request f2313b;

        public C0784a(Request request, C1180c c1180c) {
            super(C0788a.f2342a, c1180c);
            this.f2313b = request;
        }

        protected Response m3714a(Status status) {
            Response response = new Response();
            response.f2295a = status;
            return response;
        }

        protected void m3715a(hx hxVar) {
            hxVar.mo517c().mo805a(this.f2313b, new hw<Response>(this, this) {
                final /* synthetic */ C0784a f2300a;

                public void mo559a(Response response) {
                    this.b.mo567a(response);
                }
            });
        }

        protected /* synthetic */ C0774g mo574b(Status status) {
            return m3714a(status);
        }
    }
}
