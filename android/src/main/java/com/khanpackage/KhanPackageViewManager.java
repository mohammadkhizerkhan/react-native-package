package com.khanpackage;

import android.graphics.Color;

import androidx.annotation.Nullable;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.KhanPackageViewManagerDelegate;
import com.facebook.react.viewmanagers.KhanPackageViewManagerInterface;
import com.facebook.soloader.SoLoader;

@ReactModule(name = KhanPackageViewManager.NAME)
public class KhanPackageViewManager extends SimpleViewManager<KhanPackageView> implements KhanPackageViewManagerInterface<KhanPackageView> {

  public static final String NAME = "KhanPackageView";

  static {
    if (BuildConfig.CODEGEN_MODULE_REGISTRATION != null) {
      SoLoader.loadLibrary(BuildConfig.CODEGEN_MODULE_REGISTRATION);
    }
  }

  private final ViewManagerDelegate<KhanPackageView> mDelegate;

  public KhanPackageViewManager() {
    mDelegate = new KhanPackageViewManagerDelegate(this);
  }

  @Nullable
  @Override
  protected ViewManagerDelegate<KhanPackageView> getDelegate() {
    return mDelegate;
  }

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public KhanPackageView createViewInstance(ThemedReactContext context) {
    return new KhanPackageView(context);
  }

  @Override
  @ReactProp(name = "color")
  public void setColor(KhanPackageView view, String color) {
    view.setBackgroundColor(Color.parseColor(color));
  }
}
