package com.greatposterwall.ui.announcements;

import java.util.List;

import com.greatposterwall.ui.base.MvpView;
import com.greatposterwall.data.model.Announcement;

public interface AnnouncementMvpView extends MvpView {

    void showAnnouncements(List<Announcement.Announcements> announcements);

    void showAnnouncementsEmpty();

    void showError();

    void showProgress(boolean show);
}
