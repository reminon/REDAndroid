package com.greatposterwall.ui.forum.category;

import java.util.List;

import com.greatposterwall.ui.base.MvpView;

public interface CategoryMvpView extends MvpView {

    void showCategories(List<Object> categories);

    void showCategoriesEmpty();

    void showError();

    void showProgress(boolean show);
}
