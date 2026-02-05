package com.greatposterwall.ui.top10;

import java.util.List;
import com.greatposterwall.data.model.Top10;
import com.greatposterwall.ui.base.MvpView;

public interface Top10MvpView extends MvpView {

    void showTop10(List<Top10.Results> categories);

    void showTop10Empty();

    void showError();

    void showProgress(boolean show);
}
