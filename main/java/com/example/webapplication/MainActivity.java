package com.example.webapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText txturl;
    Button b;
    WebView wv;
    private WebSettings getString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txturl=(EditText)findViewById(R.id.editText1);
        b = (Button)findViewById(R.id.button1);
        wv = (WebView)findViewById(R.id.view1);
        //WebSettingswebSettings = wv.getSettings();
        //webSettings.setJavaScriptEnabled(true);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                wv.setWebViewClient(new WebViewClient());
                wv.loadUrl("http://"+txturl.getText().toString());
            }
        });
    }

    public WebSettings getGetString() {
        return getString;
    }

    public void setGetString(WebSettings getString) {
        this.getString = getString;
    }
}
