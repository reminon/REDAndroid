package com.greatposterwall.ui.forum.threadList;

import com.greatposterwall.ui.base.MvpView;
import com.greatposterwall.data.model.ForumView;

public interface ThreadListMvpView extends MvpView {

    void showThreads(ForumView threads);

    void showThreadsEmpty();

    void showError();

    void showProgress(boolean show);
}
