package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class C1254g {
    public static final C1254g f4325a = C1254g.m6341a((CharSequence) "\t\n\u000b\f\r     　 ᠎ ").mo906a(C1254g.m6340a(' ', ' '));
    public static final C1254g f4326b = C1254g.m6341a((CharSequence) "\t\n\u000b\f\r     　").mo906a(C1254g.m6340a(' ', ' ')).mo906a(C1254g.m6340a(' ', ' '));
    public static final C1254g f4327c = C1254g.m6340a('\u0000', '');
    public static final C1254g f4328d;
    public static final C1254g f4329e = C1254g.m6340a('\t', '\r').mo906a(C1254g.m6340a('\u001c', ' ')).mo906a(C1254g.m6339a(' ')).mo906a(C1254g.m6339a('᠎')).mo906a(C1254g.m6340a(' ', ' ')).mo906a(C1254g.m6340a(' ', '​')).mo906a(C1254g.m6340a(' ', ' ')).mo906a(C1254g.m6339a(' ')).mo906a(C1254g.m6339a('　'));
    public static final C1254g f4330f = new C12551();
    public static final C1254g f4331g = new C12617();
    public static final C1254g f4332h = new C12628();
    public static final C1254g f4333i = new C12639();
    public static final C1254g f4334j = new C1254g() {
        public boolean mo905b(char c) {
            return Character.isLowerCase(c);
        }
    };
    public static final C1254g f4335k = C1254g.m6340a('\u0000', '\u001f').mo906a(C1254g.m6340a('', ''));
    public static final C1254g f4336l = C1254g.m6340a('\u0000', ' ').mo906a(C1254g.m6340a('', ' ')).mo906a(C1254g.m6339a('­')).mo906a(C1254g.m6340a('؀', '؃')).mo906a(C1254g.m6341a((CharSequence) "۝܏ ឴឵᠎")).mo906a(C1254g.m6340a(' ', '‏')).mo906a(C1254g.m6340a(' ', ' ')).mo906a(C1254g.m6340a(' ', '⁤')).mo906a(C1254g.m6340a('⁪', '⁯')).mo906a(C1254g.m6339a('　')).mo906a(C1254g.m6340a('?', '')).mo906a(C1254g.m6341a((CharSequence) "﻿￹￺￻"));
    public static final C1254g f4337m = C1254g.m6340a('\u0000', 'ӹ').mo906a(C1254g.m6339a('־')).mo906a(C1254g.m6340a('א', 'ת')).mo906a(C1254g.m6339a('׳')).mo906a(C1254g.m6339a('״')).mo906a(C1254g.m6340a('؀', 'ۿ')).mo906a(C1254g.m6340a('ݐ', 'ݿ')).mo906a(C1254g.m6340a('฀', '๿')).mo906a(C1254g.m6340a('Ḁ', '₯')).mo906a(C1254g.m6340a('℀', '℺')).mo906a(C1254g.m6340a('ﭐ', '﷿')).mo906a(C1254g.m6340a('ﹰ', '﻿')).mo906a(C1254g.m6340a('｡', 'ￜ'));
    public static final C1254g f4338n = new C1254g() {
        public C1254g mo906a(C1254g c1254g) {
            C1305x.m6617a((Object) c1254g);
            return this;
        }

        public boolean mo905b(char c) {
            return true;
        }

        public boolean mo907b(CharSequence charSequence) {
            C1305x.m6617a((Object) charSequence);
            return true;
        }
    };
    public static final C1254g f4339o = new C12562();

    static class C12551 extends C1254g {
        C12551() {
        }

        public boolean mo905b(char c) {
            return Character.isDigit(c);
        }
    }

    static class C12562 extends C1254g {
        C12562() {
        }

        public C1254g mo906a(C1254g c1254g) {
            return (C1254g) C1305x.m6617a((Object) c1254g);
        }

        public boolean mo905b(char c) {
            return false;
        }

        public boolean mo907b(CharSequence charSequence) {
            return charSequence.length() == 0;
        }
    }

    static class C12617 extends C1254g {
        C12617() {
        }

        public boolean mo905b(char c) {
            return Character.isLetter(c);
        }
    }

    static class C12628 extends C1254g {
        C12628() {
        }

        public boolean mo905b(char c) {
            return Character.isLetterOrDigit(c);
        }
    }

    static class C12639 extends C1254g {
        C12639() {
        }

        public boolean mo905b(char c) {
            return Character.isUpperCase(c);
        }
    }

    private static class C1264a extends C1254g {
        List<C1254g> f4346p;

        C1264a(List<C1254g> list) {
            this.f4346p = list;
        }

        public C1254g mo906a(C1254g c1254g) {
            List arrayList = new ArrayList(this.f4346p);
            arrayList.add(C1305x.m6617a((Object) c1254g));
            return new C1264a(arrayList);
        }

        public boolean mo905b(char c) {
            for (C1254g b : this.f4346p) {
                if (b.mo905b(c)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        C1254g a = C1254g.m6340a('0', '9');
        C1254g c1254g = a;
        for (char c : "٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray()) {
            c1254g = c1254g.mo906a(C1254g.m6340a(c, (char) (c + 9)));
        }
        f4328d = c1254g;
    }

    public static C1254g m6339a(final char c) {
        return new C1254g() {
            public C1254g mo906a(C1254g c1254g) {
                return c1254g.mo905b(c) ? c1254g : super.mo906a(c1254g);
            }

            public boolean mo905b(char c) {
                return c == c;
            }
        };
    }

    public static C1254g m6340a(final char c, final char c2) {
        C1305x.m6625b(c2 >= c);
        return new C1254g() {
            public boolean mo905b(char c) {
                return c <= c && c <= c2;
            }
        };
    }

    public static C1254g m6341a(CharSequence charSequence) {
        switch (charSequence.length()) {
            case 0:
                return f4339o;
            case 1:
                return C1254g.m6339a(charSequence.charAt(0));
            case 2:
                final char charAt = charSequence.charAt(0);
                final char charAt2 = charSequence.charAt(1);
                return new C1254g() {
                    public boolean mo905b(char c) {
                        return c == charAt || c == charAt2;
                    }
                };
            default:
                final char[] toCharArray = charSequence.toString().toCharArray();
                Arrays.sort(toCharArray);
                return new C1254g() {
                    public boolean mo905b(char c) {
                        return Arrays.binarySearch(toCharArray, c) >= 0;
                    }
                };
        }
    }

    public C1254g mo906a(C1254g c1254g) {
        return new C1264a(Arrays.asList(new C1254g[]{this, (C1254g) C1305x.m6617a((Object) c1254g)}));
    }

    public abstract boolean mo905b(char c);

    public boolean mo907b(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo905b(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }
}
