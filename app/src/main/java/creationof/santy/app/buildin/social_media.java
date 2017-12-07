package creationof.santy.app.buildin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class social_media extends AppCompatActivity implements View.OnClickListener{
    Button amazon, flipcart;
    WebView webView;
    WebSettings w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);
        amazon = (Button) findViewById(R.id.amazon);
        flipcart = (Button) findViewById(R.id.flipcart);
        webView = (WebView) findViewById(R.id.webview);
        w = webView.getSettings();
        w.setJavaScriptEnabled(true);
        amazon.setOnClickListener(this);
        flipcart.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.amazon):
                webView.loadUrl("https://www.facebook.com/");
                break;

            case (R.id.flipcart):
                webView.loadUrl("https://www.instagram.com/?hl=en");
                break;
        }

    }
}
