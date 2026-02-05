package com.greatposterwall.ui.inbox.conversation;

import java.util.List;

import com.greatposterwall.data.model.Conversation;
import com.greatposterwall.ui.base.MvpView;

public interface ConversationMvpView extends MvpView {

    void showMessages(List<Conversation.Messages> messages);

    void showMessagesEmpty();

    void showLoadingProgress(boolean show);

    void showError(String message);

    void showSnackbar(String message);

    void setConversationInfo(int convId, String subject, String user);

    void showSuccess();
}