package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentManagerState implements Parcelable {
    public static final Creator<FragmentManagerState> CREATOR = new C00051();
    FragmentState[] f19a;
    int[] f20b;
    BackStackState[] f21c;

    static class C00051 implements Creator<FragmentManagerState> {
        C00051() {
        }

        public FragmentManagerState m22a(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        public FragmentManagerState[] m23a(int i) {
            return new FragmentManagerState[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m22a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m23a(i);
        }
    }

    public FragmentManagerState(Parcel parcel) {
        this.f19a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f20b = parcel.createIntArray();
        this.f21c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f19a, i);
        parcel.writeIntArray(this.f20b);
        parcel.writeTypedArray(this.f21c, i);
    }
}
