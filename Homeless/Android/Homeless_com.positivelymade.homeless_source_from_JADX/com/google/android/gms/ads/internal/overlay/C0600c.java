package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.go;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@fn
public class C0600c extends C0599i implements OnAudioFocusChangeListener, OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnVideoSizeChangedListener, SurfaceTextureListener {
    private static final Map<Integer, String> f1620a = new HashMap();
    private final C0616p f1621b;
    private int f1622c = 0;
    private int f1623d = 0;
    private MediaPlayer f1624e;
    private Uri f1625f;
    private int f1626g;
    private int f1627h;
    private int f1628i;
    private int f1629j;
    private int f1630k;
    private float f1631l = 1.0f;
    private boolean f1632m;
    private boolean f1633n;
    private int f1634o;
    private C0611h f1635p;

    class C05921 implements Runnable {
        final /* synthetic */ C0600c f1611a;

        C05921(C0600c c0600c) {
            this.f1611a = c0600c;
        }

        public void run() {
            if (this.f1611a.f1635p != null) {
                this.f1611a.f1635p.mo480b();
            }
        }
    }

    class C05932 implements Runnable {
        final /* synthetic */ C0600c f1612a;

        C05932(C0600c c0600c) {
            this.f1612a = c0600c;
        }

        public void run() {
            if (this.f1612a.f1635p != null) {
                this.f1612a.f1635p.mo483e();
            }
        }
    }

    class C05954 implements Runnable {
        final /* synthetic */ C0600c f1616a;

        C05954(C0600c c0600c) {
            this.f1616a = c0600c;
        }

        public void run() {
            if (this.f1616a.f1635p != null) {
                this.f1616a.f1635p.mo478a();
            }
        }
    }

    class C05965 implements Runnable {
        final /* synthetic */ C0600c f1617a;

        C05965(C0600c c0600c) {
            this.f1617a = c0600c;
        }

        public void run() {
            if (this.f1617a.f1635p != null) {
                this.f1617a.f1635p.mo482d();
                this.f1617a.f1635p.mo484f();
            }
        }
    }

    class C05976 implements Runnable {
        final /* synthetic */ C0600c f1618a;

        C05976(C0600c c0600c) {
            this.f1618a = c0600c;
        }

        public void run() {
            if (this.f1618a.f1635p != null) {
                this.f1618a.f1635p.mo481c();
            }
        }
    }

    class C05987 implements Runnable {
        final /* synthetic */ C0600c f1619a;

        C05987(C0600c c0600c) {
            this.f1619a = c0600c;
        }

        public void run() {
            if (this.f1619a.f1635p != null) {
                this.f1619a.f1635p.mo482d();
            }
        }
    }

    static {
        f1620a.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
        f1620a.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
        f1620a.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
        f1620a.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
        f1620a.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        f1620a.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        f1620a.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        f1620a.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        f1620a.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        f1620a.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        f1620a.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        f1620a.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        f1620a.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        f1620a.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        f1620a.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        f1620a.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public C0600c(Context context, C0616p c0616p) {
        super(context);
        setSurfaceTextureListener(this);
        this.f1621b = c0616p;
        this.f1621b.m2784a((C0599i) this);
    }

    private void m2674a(boolean z) {
        C0691b.m3101d("AdVideoView release");
        if (this.f1624e != null) {
            this.f1624e.reset();
            this.f1624e.release();
            this.f1624e = null;
            m2676b(0);
            if (z) {
                this.f1623d = 0;
                m2677c(0);
            }
            m2681j();
        }
    }

    private void m2675b(float f) {
        if (this.f1624e != null) {
            try {
                this.f1624e.setVolume(f, f);
                return;
            } catch (IllegalStateException e) {
                return;
            }
        }
        C0691b.m3103e("AdVideoView setMediaPlayerVolume() called before onPrepared().");
    }

    private void m2676b(int i) {
        if (i == 3) {
            this.f1621b.m2787c();
        } else if (this.f1622c == 3 && i != 3) {
            this.f1621b.m2788d();
        }
        this.f1622c = i;
    }

    private void m2677c(int i) {
        this.f1623d = i;
    }

    private void m2678g() {
        Throwable e;
        C0691b.m3101d("AdVideoView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f1625f != null && surfaceTexture != null) {
            m2674a(false);
            try {
                this.f1624e = new MediaPlayer();
                this.f1624e.setOnBufferingUpdateListener(this);
                this.f1624e.setOnCompletionListener(this);
                this.f1624e.setOnErrorListener(this);
                this.f1624e.setOnInfoListener(this);
                this.f1624e.setOnPreparedListener(this);
                this.f1624e.setOnVideoSizeChangedListener(this);
                this.f1628i = 0;
                this.f1624e.setDataSource(getContext(), this.f1625f);
                this.f1624e.setSurface(new Surface(surfaceTexture));
                this.f1624e.setAudioStreamType(3);
                this.f1624e.setScreenOnWhilePlaying(true);
                this.f1624e.prepareAsync();
                m2676b(1);
            } catch (IOException e2) {
                e = e2;
                C0691b.m3102d("Failed to initialize MediaPlayer at " + this.f1625f, e);
                onError(this.f1624e, 1, 0);
            } catch (IllegalArgumentException e3) {
                e = e3;
                C0691b.m3102d("Failed to initialize MediaPlayer at " + this.f1625f, e);
                onError(this.f1624e, 1, 0);
            }
        }
    }

    private void m2679h() {
        if (m2682k() && this.f1624e.getCurrentPosition() > 0 && this.f1623d != 3) {
            C0691b.m3101d("AdVideoView nudging MediaPlayer");
            m2675b(0.0f);
            this.f1624e.start();
            int currentPosition = this.f1624e.getCurrentPosition();
            long a = C0618p.m2800i().mo824a();
            while (m2682k() && this.f1624e.getCurrentPosition() == currentPosition) {
                if (C0618p.m2800i().mo824a() - a > 250) {
                    break;
                }
            }
            this.f1624e.pause();
            m2685n();
        }
    }

    private void m2680i() {
        AudioManager o = m2686o();
        if (o != null && !this.f1633n) {
            if (o.requestAudioFocus(this, 3, 2) == 1) {
                m2683l();
            } else {
                C0691b.m3103e("AdVideoView audio focus request failed");
            }
        }
    }

    private void m2681j() {
        C0691b.m3101d("AdVideoView abandon audio focus");
        AudioManager o = m2686o();
        if (o != null && this.f1633n) {
            if (o.abandonAudioFocus(this) == 1) {
                this.f1633n = false;
            } else {
                C0691b.m3103e("AdVideoView abandon audio focus failed");
            }
        }
    }

    private boolean m2682k() {
        return (this.f1624e == null || this.f1622c == -1 || this.f1622c == 0 || this.f1622c == 1) ? false : true;
    }

    private void m2683l() {
        C0691b.m3101d("AdVideoView audio focus gained");
        this.f1633n = true;
        m2685n();
    }

    private void m2684m() {
        C0691b.m3101d("AdVideoView audio focus lost");
        this.f1633n = false;
        m2685n();
    }

    private void m2685n() {
        if (this.f1632m || !this.f1633n) {
            m2675b(0.0f);
        } else {
            m2675b(this.f1631l);
        }
    }

    private AudioManager m2686o() {
        return (AudioManager) getContext().getSystemService("audio");
    }

    public String mo450a() {
        return "MediaPlayer";
    }

    public void mo451a(float f) {
        this.f1631l = f;
        m2685n();
    }

    public void mo452a(int i) {
        C0691b.m3101d("AdVideoView seek " + i);
        if (m2682k()) {
            this.f1624e.seekTo(i);
            this.f1634o = 0;
            return;
        }
        this.f1634o = i;
    }

    public void mo453a(C0611h c0611h) {
        this.f1635p = c0611h;
    }

    public void mo454b() {
        C0691b.m3101d("AdVideoView stop");
        if (this.f1624e != null) {
            this.f1624e.stop();
            this.f1624e.release();
            this.f1624e = null;
            m2676b(0);
            m2677c(0);
            m2681j();
        }
        this.f1621b.m2785b();
    }

    public void mo455c() {
        C0691b.m3101d("AdVideoView play");
        if (m2682k()) {
            this.f1624e.start();
            m2676b(3);
            go.f3361a.post(new C05976(this));
        }
        m2677c(3);
    }

    public void mo456d() {
        C0691b.m3101d("AdVideoView pause");
        if (m2682k() && this.f1624e.isPlaying()) {
            this.f1624e.pause();
            m2676b(4);
            go.f3361a.post(new C05987(this));
        }
        m2677c(4);
    }

    public void mo457e() {
        this.f1632m = true;
        m2685n();
    }

    public void mo458f() {
        this.f1632m = false;
        m2685n();
    }

    public int getCurrentPosition() {
        return m2682k() ? this.f1624e.getCurrentPosition() : 0;
    }

    public int getDuration() {
        return m2682k() ? this.f1624e.getDuration() : -1;
    }

    public int getVideoHeight() {
        return this.f1624e != null ? this.f1624e.getVideoHeight() : 0;
    }

    public int getVideoWidth() {
        return this.f1624e != null ? this.f1624e.getVideoWidth() : 0;
    }

    public void onAudioFocusChange(int i) {
        if (i > 0) {
            m2683l();
        } else if (i < 0) {
            m2684m();
        }
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f1628i = i;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        C0691b.m3101d("AdVideoView completion");
        m2676b(5);
        m2677c(5);
        go.f3361a.post(new C05932(this));
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        final String str = (String) f1620a.get(Integer.valueOf(i));
        final String str2 = (String) f1620a.get(Integer.valueOf(i2));
        C0691b.m3103e("AdVideoView MediaPlayer error: " + str + ":" + str2);
        m2676b(-1);
        m2677c(-1);
        go.f3361a.post(new Runnable(this) {
            final /* synthetic */ C0600c f1615c;

            public void run() {
                if (this.f1615c.f1635p != null) {
                    this.f1615c.f1635p.mo479a(str, str2);
                }
            }
        });
        return true;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f1620a.get(Integer.valueOf(i2));
        C0691b.m3101d("AdVideoView MediaPlayer info: " + ((String) f1620a.get(Integer.valueOf(i))) + ":" + str);
        return true;
    }

    protected void onMeasure(int i, int i2) {
        int defaultSize = C0600c.getDefaultSize(this.f1626g, i);
        int defaultSize2 = C0600c.getDefaultSize(this.f1627h, i2);
        if (this.f1626g > 0 && this.f1627h > 0) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            int mode2 = MeasureSpec.getMode(i2);
            defaultSize2 = MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                if (this.f1626g * defaultSize2 < this.f1627h * size) {
                    defaultSize = (this.f1626g * defaultSize2) / this.f1627h;
                } else if (this.f1626g * defaultSize2 > this.f1627h * size) {
                    defaultSize2 = (this.f1627h * size) / this.f1626g;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode == 1073741824) {
                defaultSize = (this.f1627h * size) / this.f1626g;
                if (mode2 != Integer.MIN_VALUE || defaultSize <= defaultSize2) {
                    defaultSize2 = defaultSize;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode2 == 1073741824) {
                defaultSize = (this.f1626g * defaultSize2) / this.f1627h;
                if (mode == Integer.MIN_VALUE && defaultSize > size) {
                    defaultSize = size;
                }
            } else {
                int i3 = this.f1626g;
                defaultSize = this.f1627h;
                if (mode2 != Integer.MIN_VALUE || defaultSize <= defaultSize2) {
                    defaultSize2 = defaultSize;
                    defaultSize = i3;
                } else {
                    defaultSize = (this.f1626g * defaultSize2) / this.f1627h;
                }
                if (mode == Integer.MIN_VALUE && r1 > size) {
                    defaultSize2 = (this.f1627h * size) / this.f1626g;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        if (VERSION.SDK_INT == 16) {
            if ((this.f1629j > 0 && this.f1629j != defaultSize) || (this.f1630k > 0 && this.f1630k != defaultSize2)) {
                m2679h();
            }
            this.f1629j = defaultSize;
            this.f1630k = defaultSize2;
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        C0691b.m3101d("AdVideoView prepared");
        m2676b(2);
        this.f1621b.m2783a();
        go.f3361a.post(new C05921(this));
        this.f1626g = mediaPlayer.getVideoWidth();
        this.f1627h = mediaPlayer.getVideoHeight();
        if (this.f1634o != 0) {
            mo452a(this.f1634o);
        }
        m2679h();
        C0691b.m3099c("AdVideoView stream dimensions: " + this.f1626g + " x " + this.f1627h);
        if (this.f1623d == 3) {
            mo455c();
        }
        m2680i();
        m2685n();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C0691b.m3101d("AdVideoView surface created");
        m2678g();
        go.f3361a.post(new C05954(this));
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0691b.m3101d("AdVideoView surface destroyed");
        if (this.f1624e != null && this.f1634o == 0) {
            this.f1634o = this.f1624e.getCurrentPosition();
        }
        go.f3361a.post(new C05965(this));
        m2674a(true);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Object obj = 1;
        C0691b.m3101d("AdVideoView surface changed");
        Object obj2 = this.f1623d == 3 ? 1 : null;
        if (!(this.f1626g == i && this.f1627h == i2)) {
            obj = null;
        }
        if (this.f1624e != null && obj2 != null && r1 != null) {
            if (this.f1634o != 0) {
                mo452a(this.f1634o);
            }
            mo455c();
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f1621b.m2786b(this);
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        C0691b.m3101d("AdVideoView size changed: " + i + " x " + i2);
        this.f1626g = mediaPlayer.getVideoWidth();
        this.f1627h = mediaPlayer.getVideoHeight();
        if (this.f1626g != 0 && this.f1627h != 0) {
            requestLayout();
        }
    }

    public void setMimeType(String str) {
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        this.f1625f = uri;
        this.f1634o = 0;
        m2678g();
        requestLayout();
        invalidate();
    }

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
