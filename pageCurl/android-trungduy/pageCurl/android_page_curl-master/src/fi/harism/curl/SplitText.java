package fi.harism.curl;

import java.util.ArrayList;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextPaint;

public class SplitText {
	ArrayList<Page> mPages = new ArrayList<SplitText.Page>();

	public SplitText(ArrayList<Page> pages) {
		mPages = pages;
	}

	public ArrayList<Bitmap> getBitmap() {
		ArrayList<Bitmap> bitmaps = new ArrayList<Bitmap>();
		return bitmaps;
	}

	public class Line {
		int leftPadding;
		int rightPadding;
		int rowSpace;
		String text;
		TextPaint textPaint;

		public Line(String text, TextPaint textPaint, int rowSpace, int left,
				int right) {
			this.leftPadding = left;
			this.rightPadding = right;
			this.rowSpace = rowSpace;
			this.text = text;
			this.textPaint = textPaint;
		}

		public void drawLine(Canvas canvas, int x, int y) {
			canvas.drawText(text, x + leftPadding, y, textPaint);
		}
	}

	public class Page {
		ArrayList<Component> contents;
		int width, height;
		TextPaint textPaint;
		int textFontSize;
		Typeface textFontTypep;
		int textColor;
		int backgroundColor;
		int numPage;
		int topPadding, leftPadding, rightPadding, bottomPadding;

		public Page(int w, int h, Typeface fontType, int fontSize, int bgColor,
				int tColor, int topadd, int leftPad, int rightPad, int bottomPad) {
			width = w;
			height = h;

			textFontSize = fontSize;
			textFontTypep = fontType;
			textColor = tColor;
			backgroundColor = bgColor;
			topPadding = topadd;
			leftPadding = leftPad;
			rightPadding = rightPad;
			bottomPadding = bottomPad;

			textPaint = new TextPaint();
			textPaint.setTextSize(fontSize);
			textPaint.setTypeface(fontType);
			textPaint.setColor(tColor);
			textPaint.bgColor = bgColor;
			textPaint.setAntiAlias(true);
		}
	}
}
