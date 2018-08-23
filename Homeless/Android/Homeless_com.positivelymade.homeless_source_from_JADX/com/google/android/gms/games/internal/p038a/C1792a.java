package com.google.android.gms.games.internal.p038a;

import android.content.Intent;
import com.google.android.gms.common.api.C0774g;
import com.google.android.gms.common.api.C0777e;
import com.google.android.gms.common.api.C1180c;
import com.google.android.gms.common.api.C1183k.C0781b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.C1776b;
import com.google.android.gms.games.C1776b.C1771a;
import com.google.android.gms.games.achievement.C1767b;
import com.google.android.gms.games.achievement.C1767b.C1766a;
import com.google.android.gms.games.internal.C1852c;

public final class C1792a implements C1767b {

    private static abstract class C1789a extends C1771a<C1766a> {
        private final String f5550b;

        public C1789a(String str, C1180c c1180c) {
            super(c1180c);
            this.f5550b = str;
        }

        public C1766a m8405a(final Status status) {
            return new C1766a(this) {
                final /* synthetic */ C1789a f5554b;

                public Status mo558a() {
                    return status;
                }
            };
        }

        public /* synthetic */ C0774g mo574b(Status status) {
            return m8405a(status);
        }
    }

    public Intent mo1253a(C1180c c1180c) {
        return C1776b.m8387a(c1180c).mo1342s();
    }

    public C0777e<C1766a> mo1254a(C1180c c1180c, final String str) {
        return c1180c.mo882b(new C1789a(this, c1180c, str) {
            final /* synthetic */ C1792a f5552c;

            public void m8408a(C1852c c1852c) {
                c1852c.m8633a((C0781b) this, str);
            }
        });
    }
}
