package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.TextureView;

public abstract class C0599i extends TextureView {
    public C0599i(Context context) {
        super(context);
    }

    public abstract String mo450a();

    public abstract void mo451a(float f);

    public abstract void mo452a(int i);

    public abstract void mo453a(C0611h c0611h);

    public abstract void mo454b();

    public abstract void mo455c();

    public abstract void mo456d();

    public abstract void mo457e();

    public abstract void mo458f();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setMimeType(String str);

    public abstract void setVideoPath(String str);
}
