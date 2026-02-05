package com.greatposterwall.ui.artist;

import java.util.List;

import com.greatposterwall.data.model.Artist;
import com.greatposterwall.ui.base.MvpView;

public interface ArtistMvpView extends MvpView {

    void showArtist(Artist artist);

    void showLoadingProgress(boolean show);

    void showError(String message);

    void showBookmarked(boolean b);

    void showTorrents(List<Object> list);
}