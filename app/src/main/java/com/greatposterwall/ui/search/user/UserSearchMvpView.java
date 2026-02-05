package com.greatposterwall.ui.search.user;

import java.util.List;

import com.greatposterwall.data.model.UserSearch;
import com.greatposterwall.ui.base.MvpView;

public interface UserSearchMvpView extends MvpView {

    void showResults(List<UserSearch.Results> results);

    void showResultsEmpty();

    void showError();

    void showProgress(boolean show);
}
