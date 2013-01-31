package fi.harism.curl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ConvertHTMLToBitmap {
	private WebView mWebView;
	private Bitmap mBitmap;

	public ConvertHTMLToBitmap(WebView webView) {
		mWebView = webView;
		mWebView.getSettings().setSupportZoom(true);
		mWebView.getSettings().setDefaultFontSize(20);
		mWebView.setWebViewClient(new WebViewClient() {

			@Override
			public void onPageFinished(WebView view, String url) {
				// TODO Auto-generated method stub
				view.setDrawingCacheEnabled(true);
				Picture picture = view.capturePicture();
				int w = picture.getWidth();
				int h = picture.getHeight();
				Bitmap bitmap = Bitmap.createBitmap(w, h,
						Bitmap.Config.ARGB_8888);
				Canvas canvas = new Canvas(bitmap);
				picture.draw(canvas);

				mBitmap = bitmap;
			}

		});
	}

	public WebView getWeb() {
		return mWebView;
	}

	public void loadUrl(String url) {
		mWebView.loadUrl(url);
	}

	public Bitmap getTexture() {
		// mWebView.setDrawingCacheEnabled(true);
		// Bitmap bitmap = Bitmap.createBitmap(mWebView.getWidth(),
		// mWebView.getHeight(), Bitmap.Config.ARGB_8888);
		//
		// bitmap.eraseColor(Color.BLUE);
		// Canvas canvas = new Canvas(bitmap);
		// Paint paint = new Paint();
		// canvas.drawBitmap(bitmap, 0, 0, paint);
		// mWebView.draw(canvas);
		//
		// return bitmap;
		return mBitmap;
	}
}
