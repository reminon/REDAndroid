package com.greatposterwall.ui.release;

import java.io.File;
import java.util.List;

import com.greatposterwall.data.model.TorrentComments;
import com.greatposterwall.data.model.TorrentGroup;
import com.greatposterwall.ui.base.MvpView;

public interface ReleaseMvpView extends MvpView {

    void showRelease(TorrentGroup torrentGroup);

    void showLoadingProgress(boolean show);

    void showError(String message);

    void showBookmarked(boolean b);

    void showDownloadComplete(File file);

    void showSendToServerComplete();

    void showTorrents(Object torrent);

	void showMessage(String message);

}