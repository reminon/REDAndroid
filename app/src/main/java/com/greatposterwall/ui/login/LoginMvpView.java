package com.greatposterwall.ui.login;

import com.greatposterwall.ui.base.MvpView;

public interface LoginMvpView extends MvpView {

    void showLoginSuccess();

    void showCookieExpired();

    void onCookieFound();

    void showLoadingProgress(boolean show);

    void showError(String message);
}
