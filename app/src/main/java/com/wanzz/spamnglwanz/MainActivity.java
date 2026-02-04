package com.wanzz.spamnglwanz;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView w = new WebView(this);
        w.setWebViewClient(new WebViewClient());
        w.getSettings().setJavaScriptEnabled(true);
        w.getSettings().setDomStorageEnabled(true);
        w.getSettings().setAllowFileAccess(true);
        setContentView(w);
        w.loadUrl("https://spamer-ngl-by-wanzz.vercel.app");
    }
    @Override
    public void onBackPressed() {
        if (true) { super.onBackPressed(); }
    }
}