package fi.harism.curl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.Toast;

public class WebViewImage extends FragmentActivity {
	ConvertHTMLToBitmap htmlToBitmap = null;

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.webview);
		final WebView view = (WebView) findViewById(R.id.web_view);
		htmlToBitmap = new ConvertHTMLToBitmap(view);
		view.loadUrl("file:///android_asset/webview.html");
		final ImageView imageView = (ImageView) findViewById(R.id.image_view);
		imageView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "FUCK",
						Toast.LENGTH_SHORT).show();
			}
		});

		ViewTreeObserver observer = view.getViewTreeObserver();
		observer.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {

			@Override
			public void onGlobalLayout() {
				// TODO Auto-generated method stub
				view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
				Bitmap bitmap = htmlToBitmap.getTexture();
				imageView.setImageBitmap(bitmap);
			}
		});
	}
}
