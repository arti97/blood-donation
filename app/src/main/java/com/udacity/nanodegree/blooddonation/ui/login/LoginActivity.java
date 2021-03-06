package com.udacity.nanodegree.blooddonation.ui.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.udacity.nanodegree.blooddonation.R;
import com.udacity.nanodegree.blooddonation.base.BaseActivity;
import com.udacity.nanodegree.blooddonation.ui.login.presenter.LoginActivityPresenter;

/**
 * Created by riteshksingh on Apr, 2018
 */
public class LoginActivity extends BaseActivity {
  private LoginActivityPresenter loginActivityPresenter;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    loginActivityPresenter = new LoginActivityPresenter();
  }
}
