package com.example.mesatatica;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class LoginWebViewActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_webview);

        webView = findViewById(R.id.webViewLogin);
        webView.getSettings().setJavaScriptEnabled(true);

        // Load your local HTML file or your server login page
        // Example: local asset
        // webView.loadUrl("file:///android_asset/index.html");

        // Or remote server
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://YOUR_SERVER_IP:3000/index.html");
    }
}