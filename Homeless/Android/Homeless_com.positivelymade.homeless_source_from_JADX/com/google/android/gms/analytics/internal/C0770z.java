package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C1305x;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class C0770z extends C0717p {
    private volatile String f2257a;
    private Future<String> f2258b;

    class C07681 implements Callable<String> {
        final /* synthetic */ C0770z f2255a;

        C07681(C0770z c0770z) {
            this.f2255a = c0770z;
        }

        public String m3626a() {
            return this.f2255a.m3635d();
        }

        public /* synthetic */ Object call() {
            return m3626a();
        }
    }

    class C07692 implements Callable<String> {
        final /* synthetic */ C0770z f2256a;

        C07692(C0770z c0770z) {
            this.f2256a = c0770z;
        }

        public String m3627a() {
            return this.f2256a.m3630f();
        }

        public /* synthetic */ Object call() {
            return m3627a();
        }
    }

    protected C0770z(C0750r c0750r) {
        super(c0750r);
    }

    private boolean m3629a(Context context, String str) {
        boolean z = false;
        C1305x.m6619a(str);
        C1305x.m6628c("ClientId should be saved from worker thread");
        FileOutputStream fileOutputStream = null;
        try {
            m3195a("Storing clientId", str);
            fileOutputStream = context.openFileOutput("gaClientId", 0);
            fileOutputStream.write(str.getBytes());
            z = true;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    m3209e("Failed to close clientId writing stream", e);
                }
            }
        } catch (FileNotFoundException e2) {
            m3209e("Error creating clientId file", e2);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e3) {
                    m3209e("Failed to close clientId writing stream", e3);
                }
            }
        } catch (IOException e32) {
            m3209e("Error writing to clientId file", e32);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e322) {
                    m3209e("Failed to close clientId writing stream", e322);
                }
            }
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e3222) {
                    m3209e("Failed to close clientId writing stream", e3222);
                }
            }
        }
        return z;
    }

    private String m3630f() {
        String e = m3636e();
        try {
            return !m3629a(m3218r().m5381c(), e) ? "0" : e;
        } catch (Exception e2) {
            m3209e("Error saving clientId file", e2);
            return "0";
        }
    }

    protected String m3631a(Context context) {
        FileInputStream openFileInput;
        FileInputStream fileInputStream;
        Object e;
        Throwable th;
        C1305x.m6628c("ClientId should be loaded from worker thread");
        try {
            openFileInput = context.openFileInput("gaClientId");
            try {
                byte[] bArr = new byte[36];
                int read = openFileInput.read(bArr, 0, bArr.length);
                if (openFileInput.available() > 0) {
                    m3208e("clientId file seems corrupted, deleting it.");
                    openFileInput.close();
                    context.deleteFile("gaClientId");
                    if (openFileInput == null) {
                        return null;
                    }
                    try {
                        openFileInput.close();
                        return null;
                    } catch (IOException e2) {
                        m3209e("Failed to close client id reading stream", e2);
                        return null;
                    }
                } else if (read < 14) {
                    m3208e("clientId file is empty, deleting it.");
                    openFileInput.close();
                    context.deleteFile("gaClientId");
                    if (openFileInput == null) {
                        return null;
                    }
                    try {
                        openFileInput.close();
                        return null;
                    } catch (IOException e22) {
                        m3209e("Failed to close client id reading stream", e22);
                        return null;
                    }
                } else {
                    openFileInput.close();
                    String str = new String(bArr, 0, read);
                    m3195a("Read client id from disk", str);
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException e3) {
                            m3209e("Failed to close client id reading stream", e3);
                        }
                    }
                    return str;
                }
            } catch (FileNotFoundException e4) {
                fileInputStream = openFileInput;
                if (fileInputStream != null) {
                    return null;
                }
                try {
                    fileInputStream.close();
                    return null;
                } catch (IOException e222) {
                    m3209e("Failed to close client id reading stream", e222);
                    return null;
                }
            } catch (IOException e5) {
                e = e5;
                try {
                    m3209e("Error reading client id file, deleting it", e);
                    context.deleteFile("gaClientId");
                    if (openFileInput != null) {
                        return null;
                    }
                    try {
                        openFileInput.close();
                        return null;
                    } catch (IOException e2222) {
                        m3209e("Failed to close client id reading stream", e2222);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException e22222) {
                            m3209e("Failed to close client id reading stream", e22222);
                        }
                    }
                    throw th;
                }
            }
        } catch (FileNotFoundException e6) {
            fileInputStream = null;
            if (fileInputStream != null) {
                return null;
            }
            fileInputStream.close();
            return null;
        } catch (IOException e7) {
            e = e7;
            openFileInput = null;
            m3209e("Error reading client id file, deleting it", e);
            context.deleteFile("gaClientId");
            if (openFileInput != null) {
                return null;
            }
            openFileInput.close();
            return null;
        } catch (Throwable th3) {
            openFileInput = null;
            th = th3;
            if (openFileInput != null) {
                openFileInput.close();
            }
            throw th;
        }
    }

    protected void mo540a() {
    }

    public String m3633b() {
        String str;
        m3228D();
        synchronized (this) {
            if (this.f2257a == null) {
                this.f2258b = m3218r().m5376a(new C07681(this));
            }
            if (this.f2258b != null) {
                try {
                    this.f2257a = (String) this.f2258b.get();
                } catch (InterruptedException e) {
                    m3206d("ClientId loading or generation was interrupted", e);
                    this.f2257a = "0";
                } catch (ExecutionException e2) {
                    m3209e("Failed to load or generate client id", e2);
                    this.f2257a = "0";
                }
                if (this.f2257a == null) {
                    this.f2257a = "0";
                }
                m3195a("Loaded clientId", this.f2257a);
                this.f2258b = null;
            }
            str = this.f2257a;
        }
        return str;
    }

    String m3634c() {
        synchronized (this) {
            this.f2257a = null;
            this.f2258b = m3218r().m5376a(new C07692(this));
        }
        return m3633b();
    }

    String m3635d() {
        String a = m3631a(m3218r().m5381c());
        return a == null ? m3630f() : a;
    }

    protected String m3636e() {
        return UUID.randomUUID().toString().toLowerCase();
    }
}
