package com.greatposterwall.ui.search.torrent;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;
import javax.inject.Inject;

import com.greatposterwall.data.DataManager;
import com.greatposterwall.data.model.TorrentSearch;
import com.greatposterwall.injection.ConfigPersistent;
import com.greatposterwall.ui.base.BasePresenter;

@ConfigPersistent public class TorrentSearchPresenter extends BasePresenter<TorrentSearchMvpView> {

	private final DataManager mDataManager;
	private CompositeDisposable mSubscription = new CompositeDisposable();

	@Inject public TorrentSearchPresenter(DataManager dataManager) {
		mDataManager = dataManager;
	}

	@Override public void attachView(TorrentSearchMvpView mvpView) {
		super.attachView(mvpView);
	}

	@Override public void detachView() {
		super.detachView();
		if (mSubscription != null) mSubscription.dispose();
	}

	public void loadTorrents(String searchTerm) {
		checkViewAttached();
		getMvpView().showProgress(true);
		if (searchTerm.isEmpty() || searchTerm.equals("") || searchTerm.equals(null)){
			getMvpView().showError();
		}

		mSubscription.add(mDataManager.torrentSearch(searchTerm)
			.observeOn(AndroidSchedulers.mainThread())
			.subscribeOn(Schedulers.io())
			.subscribeWith(new DisposableSingleObserver<TorrentSearch>() {
				@Override
				public void onSuccess(TorrentSearch torrents) {
					if (torrents.response.results.size() == 0){
						getMvpView().showResultsEmpty();
						getMvpView().showProgress(false);
					} else {
						getMvpView().showResults(torrents.response.results);
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
