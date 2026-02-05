package com.greatposterwall.injection.component;

import com.greatposterwall.injection.PerActivity;
import com.greatposterwall.injection.module.ActivityModule;
import com.greatposterwall.ui.announcements.AnnouncementActivity;
import com.greatposterwall.ui.artist.ArtistActivity;
import com.greatposterwall.ui.bookmark.BookmarkActivity;
import com.greatposterwall.ui.collage.CollageActivity;
import com.greatposterwall.ui.forum.category.CategoryActivity;
import com.greatposterwall.ui.forum.thread.ThreadActivity;
import com.greatposterwall.ui.forum.threadList.ThreadListActivity;
import com.greatposterwall.ui.inbox.InboxActivity;
import com.greatposterwall.ui.inbox.conversation.ConversationActivity;
import com.greatposterwall.ui.login.LoginActivity;
import com.greatposterwall.ui.profile.ProfileActivity;
import com.greatposterwall.ui.release.ReleaseActivity;
import com.greatposterwall.ui.reply.ReplyActivity;
import com.greatposterwall.ui.request.RequestActivity;
import com.greatposterwall.ui.search.artist.ArtistSearchActivity;
import com.greatposterwall.ui.search.collage.CollageSearchActivity;
import com.greatposterwall.ui.search.request.RequestSearchActivity;
import com.greatposterwall.ui.search.torrent.TorrentSearchActivity;
import com.greatposterwall.ui.search.user.UserSearchActivity;
import com.greatposterwall.ui.subscriptions.SubscriptionsActivity;
import com.greatposterwall.ui.top10.Top10Activity;
import dagger.Subcomponent;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(ProfileActivity profileActivity);
    void inject(LoginActivity loginActivity);
    void inject(AnnouncementActivity announcementActivity);
    void inject(CategoryActivity categoryActivity);
    void inject(ThreadListActivity threadActivity);
    void inject(ThreadActivity threadActivity);
    void inject(Top10Activity top10Activity);
    void inject(ReleaseActivity releaseActivity);
    void inject(UserSearchActivity userSearchActivity);
    void inject(TorrentSearchActivity torrentSearchActivity);
    void inject(RequestSearchActivity requestSearchActivity);

    void inject(CollageSearchActivity collageSearchActivity);
    void inject(ArtistSearchActivity artistSearchActivity);
    void inject(ArtistActivity artistActivity);

    void inject(CollageActivity collageActivity);
    void inject(RequestActivity requestActivity);
    void inject(BookmarkActivity bookmarkActivity);
    void inject(InboxActivity inboxActivity);
    void inject(ConversationActivity conversationActivity);
    void inject(ReplyActivity replyActivity);
    void inject(SubscriptionsActivity subscriptionActivity);
}
