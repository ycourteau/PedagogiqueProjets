package android.support.v4.widget;

import android.view.View;
import android.widget.ListView;

public class C0250f extends C0237a {
    private final ListView f469a;

    public C0250f(ListView listView) {
        super(listView);
        this.f469a = listView;
    }

    public void mo194a(int i, int i2) {
        ListView listView = this.f469a;
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1) {
            View childAt = listView.getChildAt(0);
            if (childAt != null) {
                listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i2);
            }
        }
    }

    public boolean mo195e(int i) {
        return false;
    }

    public boolean mo196f(int i) {
        ListView listView = this.f469a;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
