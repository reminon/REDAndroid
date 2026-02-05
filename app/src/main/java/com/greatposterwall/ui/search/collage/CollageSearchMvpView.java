package com.greatposterwall.ui.search.collage;

import java.util.List;

import com.greatposterwall.data.model.CollageSearch;
import com.greatposterwall.ui.base.MvpView;

public interface CollageSearchMvpView extends MvpView {

    void showResults(List<CollageSearch.Response> results);

    void showResultsEmpty();

    void showError();

    void showProgress(boolean show);
}
