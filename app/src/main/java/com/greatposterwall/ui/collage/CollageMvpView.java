package com.greatposterwall.ui.collage;

import com.greatposterwall.data.model.Collage;
import com.greatposterwall.ui.base.MvpView;

public interface CollageMvpView extends MvpView {

    void showCollage(Collage collage);

    void showLoadingProgress(boolean show);

    void showError(String message);

    void showBookmarked(boolean b);

    void showProgress(boolean show);
}
