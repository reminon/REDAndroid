package com.greatposterwall.app;

import io.reactivex.Single;
import com.greatposterwall.app.util.RxSchedulersOverrideRule;
import com.greatposterwall.data.DataManager;
import com.greatposterwall.data.local.PreferencesHelper;
import com.greatposterwall.data.model.Index;
import com.greatposterwall.data.remote.ApiService;
import com.greatposterwall.ui.login.LoginMvpView;
import com.greatposterwall.ui.login.LoginPresenter;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    @Mock LoginMvpView mMockLoginMvpView;
    @Mock DataManager mMockDataManager;
    @Mock ApiService mMockApiservice;
    @Mock PreferencesHelper mMockPreferencesHelper;


    private LoginPresenter mLoginPresenter;

    @Rule
    public final RxSchedulersOverrideRule mOverrideSchedulersRule = new RxSchedulersOverrideRule();

    @Before
    public void setUp() {
        mLoginPresenter = new LoginPresenter(mMockDataManager, mMockPreferencesHelper);
        mLoginPresenter.attachView(mMockLoginMvpView);
    }

    @After
    public void tearDown() {
        mLoginPresenter.detachView();
    }

    @Test
    public void loginSuccess() {
        //Profile profile = TestDataFactory.makeProfile();
        //when(mMockDataManager.getProfile())
        //        .thenReturn(Observable.just(profile).toSingle());
		//
        //mLoginPresenter.login("test", "test");
        //verify(mMockCategoryMvpView).showLoginSuccess();
        //verify(mMockCategoryMvpView, never()).showCookieExpired();
    }

    @Test
    public void loginFails() {
        when(mMockDataManager.loginWithCookie())
                .thenReturn(Single.<Index>error(new RuntimeException()));

        mLoginPresenter.loginWithCookie();
        verify(mMockLoginMvpView).showError(null);
        verify(mMockLoginMvpView, never()).showLoginSuccess();
    }

    @Test
    public void loadIndexFails() {

    }

}