package com.greatposterwall.ui.search.torrent;

import java.util.List;

import com.greatposterwall.data.model.TorrentSearch;
import com.greatposterwall.ui.base.MvpView;

public interface TorrentSearchMvpView extends MvpView {

    void showResults(List<TorrentSearch.Results> results);

    void showResultsEmpty();

    void showError();

    void showProgress(boolean show);
}
