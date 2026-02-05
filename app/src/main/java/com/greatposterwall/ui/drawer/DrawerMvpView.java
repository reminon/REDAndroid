package com.greatposterwall.ui.drawer;

import com.greatposterwall.data.model.Profile;
import com.greatposterwall.ui.base.MvpView;

public interface DrawerMvpView extends MvpView {

    void showError();

    void setupDrawer();

    void showProgress(boolean show);

    void showProfileInfo(Profile profile);
}
