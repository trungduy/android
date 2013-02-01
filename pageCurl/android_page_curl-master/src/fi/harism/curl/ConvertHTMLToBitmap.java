package fi.harism.curl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ConvertHTMLToBitmap {
	private WebView mWebView;

	public ConvertHTMLToBitmap(WebView webView) {
		mWebView = webView;
		mWebView.getSettings().setSupportZoom(true);
		mWebView.getSettings().setDefaultFontSize(20);
		mWebView.setWebViewClient(new WebViewClient());
	}

	public WebView getWeb() {
		return mWebView;
	}

	public void loadUrl(String url) {
		mWebView.loadUrl(url);
	}

	public Bitmap getTexture() {
		mWebView.setDrawingCacheEnabled(true);
		Bitmap bitmap = Bitmap.createBitmap(mWebView.getWidth(),
				mWebView.getHeight(), Bitmap.Config.ARGB_8888);

		Canvas canvas = new Canvas(bitmap);
		canvas.drawBitmap(bitmap, 0, 0, null);

		Bitmap bitmap2 = mWebView.getDrawingCache();
		canvas.drawBitmap(bitmap2, 0, 0, null);
		mWebView.destroyDrawingCache();

		return bitmap;
	}

}
