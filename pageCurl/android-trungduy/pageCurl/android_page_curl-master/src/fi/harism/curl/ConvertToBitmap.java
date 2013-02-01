package fi.harism.curl;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

public class ConvertToBitmap {
	ArrayList<Component> components;
	Context context;

	public ConvertToBitmap(Context context, ArrayList<Component> list) {
		components = list;
		this.context = context;
	}

	public Bitmap getBitmap() {
		LinearLayout layout = new LinearLayout(context);
		LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.WRAP_CONTENT);
		layoutParams.leftMargin = 2;
		layoutParams.rightMargin = 2;
		layoutParams.topMargin = 2;
		layout.setLayoutParams(layoutParams);
		layout.setOrientation(LinearLayout.VERTICAL);
		layout.setBackgroundColor(Color.WHITE);

		for (Component component : components) {
			if (component instanceof TextComponent) {
				TextComponent tc = (TextComponent) component;
				TextView tv = new TextView(context);
				tv.setTextColor(Color.BLACK);
				tv.setTextSize(40);
				tv.setText(tc.text);
				LayoutParams params = new LayoutParams(
						LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
				params.bottomMargin = 2;
				tv.setLayoutParams(params);
				layout.addView(tv);
			} else if (component instanceof BitmapComponent) {
				BitmapComponent bc = (BitmapComponent) component;
				ImageView iv = new ImageView(context);
				iv.setScaleType(ScaleType.FIT_CENTER);
				LayoutParams params = new LayoutParams(
						LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
				iv.setLayoutParams(params);
				iv.setImageBitmap(bc.bitmap);
				layout.addView(iv);
			}
		}

		layout.measure(MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED),
				MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED));
		layout.layout(0, 0, layout.getMeasuredWidth(),
				layout.getMeasuredHeight());
		layout.setDrawingCacheEnabled(true);
		layout.buildDrawingCache(true);
		Bitmap bitmap = Bitmap.createBitmap(layout.getDrawingCache());
		layout.setDrawingCacheEnabled(false);
		layout.destroyDrawingCache();

		return bitmap;
	}
}
