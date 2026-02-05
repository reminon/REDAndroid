package com.greatposterwall.ui.search.artist;

import com.greatposterwall.data.model.Artist;
import com.greatposterwall.ui.base.MvpView;

public interface ArtistSearchMvpView extends MvpView {

    void showResults(Artist.Response artist);

    void showResultsEmpty();

    void showError();
}
