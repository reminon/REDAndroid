package com.greatposterwall.ui.request;

import com.greatposterwall.data.model.Request;
import com.greatposterwall.ui.base.MvpView;

public interface RequestMvpView extends MvpView {

    void showRequest(Request request);

    void showLoadingProgress(boolean show);

    void showError(String message);

    void showBookmarked(boolean b);
}