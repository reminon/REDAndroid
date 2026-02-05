package com.greatposterwall.ui.bookmark;

import java.util.List;

import com.greatposterwall.data.model.TorrentBookmark;
import com.greatposterwall.ui.base.MvpView;

public interface BookmarkMvpView extends MvpView {

    void showBookmarks(List<TorrentBookmark.Bookmarks> bookmark);

//    void showBookmarks(ArtistBookmark bookmark);

    void showBookmarksEmpty();

    void showError();

    void showProgress(boolean show);
}
