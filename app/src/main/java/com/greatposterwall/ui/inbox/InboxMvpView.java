package com.greatposterwall.ui.inbox;

import java.util.List;

import com.greatposterwall.data.model.Conversations;
import com.greatposterwall.ui.base.MvpView;

public interface InboxMvpView extends MvpView {

    void showInbox(List<Conversations.Messages> messages);

    void showInboxEmpty();

    void showLoadingProgress(boolean show);

    void showError(String message);

	void showSnackbar(String message);
}