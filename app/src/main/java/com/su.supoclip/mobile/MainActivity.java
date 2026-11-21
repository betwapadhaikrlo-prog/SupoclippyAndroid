package com.supoclip.mobile;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends Activity {
  WebView web;
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    FrameLayout root = new FrameLayout(this);
    web = new WebView(this);
    WebSettings s = web.getSettings();
    s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setMediaPlaybackRequiresUserGesture(false);
    s.setSupportZoom(false); s.setLoadWithOverviewMode(true); s.setUseWideViewPort(true);
    CookieManager.getInstance().setAcceptCookie(true);
    web.setWebViewClient(new WebViewClient()); web.setWebChromeClient(new WebChromeClient());
    web.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
    root.addView(web); setContentView(root);
    if (savedInstanceState != null) web.restoreState(savedInstanceState); else web.loadUrl("https://www.supoclip.com");
  }
  @Override public void onSaveInstanceState(Bundle out) { super.onSaveInstanceState(out); if(web!=null) web.saveState(out); }
  @Override public void onBackPressed() { if(web!=null && web.canGoBack()) web.goBack(); else super.onBackPressed(); }
  @Override public void onDestroy() { if(web!=null) web.destroy(); super.onDestroy(); }
}
