package com.greatposterwall.ui.search.user;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;
import javax.inject.Inject;

import com.greatposterwall.data.DataManager;
import com.greatposterwall.data.model.UserSearch;
import com.greatposterwall.injection.ConfigPersistent;
import com.greatposterwall.ui.base.BasePresenter;

@ConfigPersistent public class UserSearchPresenter extends BasePresenter<UserSearchMvpView> {

	private final DataManager mDataManager;
	private CompositeDisposable mSubscription = new CompositeDisposable();

	@Inject public UserSearchPresenter(DataManager dataManager) {
		mDataManager = dataManager;
	}

	@Override public void attachView(UserSearchMvpView mvpView) {
		super.attachView(mvpView);
	}

	@Override public void detachView() {
		super.detachView();
		if (mSubscription != null) mSubscription.dispose();
	}

	public void loadUsers(String searchTerm) {
		checkViewAttached();
		getMvpView().showProgress(true);
		if (searchTerm.isEmpty() || searchTerm.equals("") || searchTerm.equals(null)){
			getMvpView().showError();
		}

		mSubscription.add(mDataManager.userSearch(searchTerm)
			.observeOn(AndroidSchedulers.mainThread())
			.subscribeOn(Schedulers.io())
			.subscribeWith(new DisposableSingleObserver<UserSearch>() {
				@Override
				public void onSuccess(UserSearch users) {
					if (users.response.results.size() == 0){
						getMvpView().showResultsEmpty();
						getMvpView().showProgress(false);
					} else {
						getMvpView().showResults(users.response.results);
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
