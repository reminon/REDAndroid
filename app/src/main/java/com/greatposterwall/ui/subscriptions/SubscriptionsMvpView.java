package com.greatposterwall.ui.subscriptions;

import java.util.List;

import com.greatposterwall.data.model.Subscription;
import com.greatposterwall.ui.base.MvpView;

public interface SubscriptionsMvpView extends MvpView {

    void showSubscriptionsEmpty();

    void showLoadingProgress(boolean show);

    void showError(String message);

	void showSnackbar(String message);

    void showSubscriptions(List<Subscription.Threads> threads);
}