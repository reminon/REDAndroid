package com.greatposterwall.ui.search.request;

import java.util.List;

import com.greatposterwall.data.model.RequestSearch;
import com.greatposterwall.ui.base.MvpView;

public interface RequestSearchMvpView extends MvpView {

    void showResults(List<RequestSearch.Results> results);

    void showResultsEmpty();

    void showError();

    void showProgress(boolean show);
}
