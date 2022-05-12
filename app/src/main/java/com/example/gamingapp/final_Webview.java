package com.example.gamingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class final_Webview extends AppCompatActivity {

    WebView game_web_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_webview);
        binding();

        String m = getIntent().getStringExtra("checkers");

        game_web_view.getSettings().setJavaScriptEnabled(true);
        game_web_view.clearCache(true);

        game_web_view.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        game_web_view.loadUrl(m);


    }
    private void binding(){
        game_web_view = (WebView) findViewById(R.id.game_web_view);
    }
}