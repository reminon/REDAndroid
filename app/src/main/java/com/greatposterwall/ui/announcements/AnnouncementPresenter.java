package com.greatposterwall.ui.announcements;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;
import javax.inject.Inject;

import com.greatposterwall.ui.base.BasePresenter;
import com.greatposterwall.data.DataManager;
import com.greatposterwall.data.model.Announcement;
import com.greatposterwall.injection.ConfigPersistent;

@ConfigPersistent public class AnnouncementPresenter extends BasePresenter<AnnouncementMvpView> {

	private final DataManager mDataManager;
	private CompositeDisposable mSubscription = new CompositeDisposable();

	@Inject public AnnouncementPresenter(DataManager dataManager) {
		mDataManager = dataManager;
	}

	@Override public void attachView(AnnouncementMvpView mvpView) {
		super.attachView(mvpView);
	}

	@Override public void detachView() {
		super.detachView();
		if (mSubscription != null) mSubscription.dispose();
	}

	public void loadAnnouncements() {
		checkViewAttached();
		getMvpView().showProgress(true);

		mSubscription.add(mDataManager.getAnnouncements()
			.observeOn(AndroidSchedulers.mainThread())
			.subscribeOn(Schedulers.io())
			.subscribeWith(new DisposableSingleObserver<Announcement>() {
				@Override
				public void onSuccess(Announcement announcements) {
					if (announcements.response.announcements.size() == 0){
						getMvpView().showAnnouncementsEmpty();
						getMvpView().showProgress(false);
					} else {
						getMvpView().showAnnouncements(announcements.response.announcements);
						getMvpView().showProgress(false);
					}
				}

				@Override
				public void onError(Throwable error) {
					getMvpView().showError();
					error.printStackTrace();
					getMvpView().showProgress(false);
				}
			}));
	}
}
