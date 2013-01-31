package fi.harism.curl;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;

public class BitmapView extends FragmentActivity {

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.bitmap);

		Intent intent = getIntent();
		Bitmap b = (Bitmap) intent.getParcelableExtra("bitmap");
		ImageView imageView = (ImageView) findViewById(R.id.bitmap);
		imageView.setImageBitmap(b);
	}

}
