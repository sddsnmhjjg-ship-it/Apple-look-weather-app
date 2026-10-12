package com.ssnmhjjg.weather;

import android.content.Context;
import android.content.res.Configuration;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    protected void attachBaseContext(Context newBase) {
        Configuration config = new Configuration(newBase.getResources().getConfiguration());
        config.fontScale = 1.0f;
        super.attachBaseContext(newBase.createConfigurationContext(config));
    }

    @Override
    public void onResume() {
        super.onResume();
        if (getBridge() != null && getBridge().getWebView() != null) {
            WebView webView = getBridge().getWebView();
            WebSettings settings = webView.getSettings();
            settings.setTextZoom(100);
            settings.setStandardFontFamily("Inter");
            settings.setSansSerifFontFamily("Inter");
        }
    }
}
