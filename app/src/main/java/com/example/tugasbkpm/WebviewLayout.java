package com.example.tugasbkpm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebviewLayout extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_layout);

        webView = findViewById(R.id.wv);
        webView.loadUrl("https://elearning-jti.polije.ac.id/");
    }
}