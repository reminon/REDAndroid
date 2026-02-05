package com.greatposterwall.ui.forum.thread;

import com.greatposterwall.data.model.ForumThread;
import com.greatposterwall.ui.base.MvpView;

public interface ThreadMvpView extends MvpView {

    void showSubscribed(boolean subscribed);

    void showPosts(ForumThread threads, boolean scrollToTop);

    void showPostsEmpty();

    void showError();

    void showProgress(boolean show);

    void showPostSuccessful();

    void showPostFailed();
}
