package android.support.v7.internal.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.p003c.p004a.C0069b;
import android.support.v4.view.C0174d.C0173b;
import android.support.v7.internal.view.menu.C0308g.C0304a;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

@TargetApi(16)
class C0310h extends C0308g {

    class C0309a extends C0304a implements VisibilityListener {
        C0173b f648c;
        final /* synthetic */ C0310h f649d;

        public C0309a(C0310h c0310h, Context context, ActionProvider actionProvider) {
            this.f649d = c0310h;
            super(c0310h, context, actionProvider);
        }

        public View mo239a(MenuItem menuItem) {
            return this.a.onCreateActionView(menuItem);
        }

        public void mo240a(C0173b c0173b) {
            VisibilityListener visibilityListener;
            this.f648c = c0173b;
            ActionProvider actionProvider = this.a;
            if (c0173b == null) {
                visibilityListener = null;
            }
            actionProvider.setVisibilityListener(visibilityListener);
        }

        public boolean mo241b() {
            return this.a.overridesItemVisibility();
        }

        public boolean mo242c() {
            return this.a.isVisible();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.f648c != null) {
                this.f648c.mo230a(z);
            }
        }
    }

    C0310h(Context context, C0069b c0069b) {
        super(context, c0069b);
    }

    C0304a mo243a(ActionProvider actionProvider) {
        return new C0309a(this, this.a, actionProvider);
    }
}
