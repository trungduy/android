package com.example.convertview;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImageView imageView = (ImageView) findViewById(R.id.image_view);
		imageView.setImageBitmap(initBitmap());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	private Bitmap initBitmap() {
		LinearLayout layout = new LinearLayout(this);
		LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		layout.setLayoutParams(params);
		layout.setOrientation(LinearLayout.VERTICAL);
		// add text
		TextView textView = new TextView(this);
		LayoutParams textParams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		textView.setLayoutParams(textParams);
		textView.setText("What 's FUCK");
		textView.setTextSize(50);
		textView.setTextColor(Color.GREEN);
		textView.setBackgroundColor(Color.DKGRAY);

		layout.addView(textView);
		// add image
		ImageView imageView = new ImageView(this);
		imageView.setBackgroundResource(R.drawable.ic_launcher);
		LayoutParams imageParams = new LayoutParams(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
		imageView.setLayoutParams(imageParams);
		layout.addView(imageView);
		layout.setDrawingCacheEnabled(true);
		layout.measure(MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED),
				MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED));
		layout.layout(0, 0, layout.getMeasuredWidth(),
				layout.getMeasuredHeight());
		layout.setVisibility(View.VISIBLE);
		layout.setDrawingCacheEnabled(true);
		layout.buildDrawingCache(true);
		Bitmap bitmap = Bitmap.createBitmap(layout.getDrawingCache());
		layout.setDrawingCacheEnabled(false);

		return bitmap;
	}

}
