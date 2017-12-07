package creationof.santy.app.buildin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class shoping_cart extends AppCompatActivity implements View.OnClickListener {
    Button amazon, flipcart, ebay, snapdeal;
    WebView webView;
    WebSettings w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoping_cart);
        amazon = (Button) findViewById(R.id.amazon);
        flipcart = (Button) findViewById(R.id.flipcart);
        ebay = (Button) findViewById(R.id.ebay);
        snapdeal = (Button) findViewById(R.id.snapdeal);
        webView = (WebView) findViewById(R.id.webview);
        w = webView.getSettings();
        w.setJavaScriptEnabled(true);

        amazon.setOnClickListener(this);
        flipcart.setOnClickListener(this);
        ebay.setOnClickListener(this);
        snapdeal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.amazon):
                webView.loadUrl("https://www.amazon.in");
                break;

            case (R.id.flipcart):
                webView.loadUrl("https://www.flipkart.com");
                break;

            case (R.id.ebay):
                webView.loadUrl("www.ebay.in");
                break;

            case (R.id.snapdeal):
                webView.loadUrl("https://www.snapdeal.com");
                break;
        }
    }
}
