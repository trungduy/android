package minh.app.bitmaptest;

import java.util.Vector;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class BitmapTest extends Activity {

	// Ná»™i dung cá»§a text
	String story = "NGÆ¯á»œI DÅ¨NG Cáº¢M\nCÄƒn phĂ²ng mĂ u tráº¯ng, chĂ¢n tÆ°á»�ng Ä‘Æ°á»£c quĂ©t thĂªm má»™t lá»›p sÆ¡n xanh ngá»�c cao gáº§n báº±ng Ä‘áº§u gá»‘i. SĂ n lĂ³t gáº¡ch tĂ u, lem nhem dáº¥u giĂ y - cá»© nhÆ° cáº£ thĂ¡ng rá»“i chÆ°a ai lau. Táº¥m rĂ¨m ngÄƒn cĂ¡ch pháº§n giÆ°á»�ng bá»‡nh cá»§a ná»¯ Ä‘Ă£ khĂ¡ cÅ©. Váº£i bá»‹ Ä‘á»• lĂ´ng, Ä‘áº§y mĂ¹i bá»¥i. \n\nTrĂªn tráº§n nhĂ , cĂ¡i quáº¡t cĂ³ tá»« tháº­p niĂªn 80 kĂªu rĂ¨ rĂ¨, lá»« nhá»« xoay nhá»¯ng cĂ¡nh quáº¡t dĂ i rá»‰ sĂ©t. Cá»­a sá»• chá»‰ má»Ÿ má»™t ná»­a, nhĂ¬n ra bĂ£i giá»¯ xe Ä‘áº¡p. Nhá»¯ng con ngá»±a sáº¯t Ä‘á»§ mĂ u, Ä‘á»©ng sĂ¡t ráº¡t, chen chĂºc dÆ°á»›i máº¥y bĂ³ng rĂ¢m Ă­t á»�i cá»§a cĂ¢y bĂ ng giĂ . GiĂ³ kĂªu xĂ o xáº¡c, ngĂ¡i ngá»§. BĂ¢y giá»� lĂ  máº¥y giá»� rá»“i nhá»‰? PhĂ²ng nĂ y khĂ´ng cĂ³ Ä‘á»“ng há»“. MĂ  cháº¯c lĂ  tá»«ng cĂ³, váº«n cĂ²n má»™t cĂ¡i Ä‘inh to, Ä‘en thĂ¹i trĂªn tÆ°á»�ng. Tiáº¿ng nháº¡c tá»« cĂ¡i cĂ¡t - sĂ©t vá»�ng ra tá»« phĂ²ng bĂªn. Má»™t y sÄ© Ä‘ang trá»±c á»Ÿ Ä‘Ă³. HĂ¬nh nhÆ° lĂ  bĂ i cá»§a Má»¹ TĂ¢m. Nghe hÆ¡i buá»“n. \n\nÄ�Ă¢y lĂ  trong phĂ²ng y táº¿ cá»§a trÆ°á»�ng. \n\nCĂ²n tĂ´i lĂ  cĂ´ há»�c sinh xin nghá»‰ má»™t tiáº¿t Ä‘ang náº±m trĂªn cĂ¡i giÆ°á»�ng bĂªn cáº¡nh cá»­a sá»•. \n\nTĂ´i luĂ´n nghÄ© mĂ¬nh lĂ  má»™t sinh váº­t tháº¥t báº¡i. VĂ¬ quĂ¡ yáº¿u á»›t. Há»“i nhá»�, má»™t láº§n Ä‘i chÆ¡i xa vá»›i gia Ä‘Ă¬nh, máº¹ dáº¯t tĂ´i vĂ o má»™t khu chá»£ Ä‘á»‹a phÆ°Æ¡ng. Pháº§n vĂ¬ Ä‘Ă´ng ngÆ°á»�i, láº¡i chÆ°a Äƒn sĂ¡ng, Ä‘i Ä‘Æ°á»£c má»™t lĂ¡t lĂ  tĂ´i lÄƒn ra xá»‰u. LĂºc Ä‘Ă³, ngÆ°á»�i tĂ´i má»�m nhÅ©n ra nhÆ° bĂºn, cĂ³ muá»‘n Ä‘á»™ng Ä‘áº­y má»™t ngĂ³n tay cÅ©ng khĂ´ng Ä‘Æ°á»£c. NgÆ°á»�i tĂ´i cháº¡m Ä‘áº¥t, tĂ´i nghe tiáº¿ng máº¹ gá»�i bĂªn tai rá»“i cĂ³ ai Ä‘Ă³ áºµm tĂ´i lĂªn. CĂ³ ráº¥t nhiá»�u ngÆ°á»�i vĂ¢y láº¡i, há»� nĂ³i chuyá»‡n lĂ o xĂ o, Ă­ á»›i vá»›i nhau. NgÆ°á»�i ta cáº¡o giĂ³ cho tĂ´i, giá»±t tĂ³c tĂ´i, xá»©c dáº§u nÆ°á»›c xanh ngay dÆ°á»›i mÅ©i tĂ´i. TĂ´i Ä‘au quĂ¡, muá»‘n hĂ©t lĂªn ráº±ng, Ä‘á»ƒ con yĂªn, con chá»‰ Ä‘Ă³i thĂ´i mĂ , Ä‘á»«ng lĂ m tháº¿ ná»¯a. Pháº£i Ä‘áº¿n khi cĂ³ má»™t ngÆ°á»�i cho nÆ°á»›c gĂ¬ ngĂ²n ngá»�t vĂ o miá»‡ng, tĂ´i má»›i dáº§n tá»‰nh láº¡i. Máº¹ tĂ´i má»«ng háº¿t biáº¿t. Tá»« Ä‘Ă³ máº¹ luĂ´n báº¯t tĂ´i Äƒn sĂ¡ng vĂ  cÅ©ng cháº³ng bao giá»� dĂ¡m dáº«n tĂ´i Ä‘i Ä‘Ă¢u xa. \n\nÄ�Ă³ lĂ  chuyá»‡n há»“i nhá»�. \n\nBĂ¢y giá»� tĂ´i Ä‘Ă£ 18 - Ä‘á»§ tuá»•i Ä‘i báº§u chá»© cháº³ng chÆ¡i. NhÆ°ng sá»©c khá»�e tĂ´i váº«n cá»© váº­y. TĂ´i khĂ´ng thá»ƒ xĂ¡ch ná»•i má»™t xĂ´ nÆ°á»›c tá»« nhĂ  vá»‡ sinh lĂªn lá»›p dĂ¹ quĂ£ng Ä‘Æ°á»�ng Ä‘Ă¢u cĂ³ bao xa. TĂ´i khĂ´ng Ä‘áº©y Ä‘Æ°á»£c quáº£ táº¡ 2kg xa hÆ¡n 3 mĂ©t trong giá»� thá»ƒ dá»¥c. Má»›i thĂ¡ng trÆ°á»›c, tĂ´i xá»‰u giá»¯a Ä‘Æ°á»�ng cháº¡y khi má»›i cháº¡y hÆ¡n 50 mĂ©t - trong khi báº¡n bĂ¨ tĂ´i Ä‘Ă£ cháº¡y xong 100 mĂ©t tá»« lĂ¢u. TĂ´i xáº¥u há»• Ä‘áº¿n cháº¿t Ä‘i Ä‘Æ°á»£c. Tá»« há»“i cáº¥p 2, tĂ´i luĂ´n tĂ¬m ra cĂ¡ch trá»‘n tiáº¿t Thá»ƒ dá»¥c. TĂ´i cá»‘ gáº¯ng Ä‘áº­u vĂ o lá»›p chuyĂªn Ä‘á»ƒ Ä‘Æ°á»£c miá»…n Thá»ƒ dá»¥c. LĂªn cáº¥p 3, tĂ´i giĂ nh Ä‘Æ°á»£c suáº¥t vĂ© Ä‘áº§u vĂ o Ä‘á»™i tuyá»ƒn cá»� vua. NhÆ°ng Ä‘áº¿n lá»›p 12, ba máº¹ muá»‘n tĂ´i chuyĂªn tĂ¢m há»�c hĂ nh nĂªn Ä‘Ă£ nĂ³i tĂ´i rĂºt khá»�i Ä‘á»™i tuyá»ƒn. TĂ´i quay vá»� vá»›i cÆ¡n Ă¡c má»™ng ngĂ y nĂ o, nhá»¯ng quáº£ táº¡, nhá»¯ng Ä‘Æ°á»�ng cháº¡y vĂ  nhá»¯ng sá»£i dĂ¢y giÄƒng cao hÆ¡n 1mĂ©t 3.";
	String story2;// = this.getResources().getString(R.string.vbmt);
	// ImageView sáº½ hiá»ƒn thá»‹ trang
	ImageView image;

	// index: trang hiá»‡n táº¡i; width, height: chiá»�u dĂ i, rá»™ng mĂ n hĂ¬nh
	int index = 0, width, height;

	// Vector lÆ°u ná»™i dung cá»§a tá»«ng trang
	Vector<String> listOfPages = new Vector<String>();

	// CĂ¡c thĂ´ng sá»‘ khĂ¡c
	int textSize = 20; // cá»¡ chá»¯
	int textColor = 0xffA7573E; // mĂ u chá»¯
	int pageColor = 0xffFDF8A6; // mĂ u ná»�n
	int topPadding = 30, leftPadding = 10; // cÄƒn trĂªn, cÄƒn dÆ°á»›i
	// Paint váº½ text
	TextPaint myTextPaint;

	//
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		//
		Display display = ((WindowManager) this
				.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
		width = display.getWidth();
		height = display.getHeight();
		//
		setContentView(R.layout.main);
		//
		// story = this.getResources().getString(R.string.vbmt);

		// XĂ¡c láº­p font chá»¯
		Typeface tf = Typeface.createFromAsset(this.getAssets(),
				"fonts/UVNDaLat_R.TTF");
		// XĂ¡c láº­p cĂ¡c thĂ´ng sá»‘ vá»� font chá»¯
		myTextPaint = new TextPaint();
		myTextPaint.setColor(textColor);
		myTextPaint.setTextSize(textSize);
		myTextPaint.bgColor = pageColor;
		myTextPaint.setAntiAlias(true);
		myTextPaint.setTypeface(tf);
		//
		image = (ImageView) findViewById(R.id.imgview);
		//
		image.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				//
				if (index > listOfPages.size() - 1) {
					index = 0;
				}
				// XĂ¡c láº­p áº£nh
				image.setImageBitmap(getPageBitmap());
				//
				index++;
				//

			}
		});
		//
		splitTextIntoPages();

	}

	//
	public void splitTextIntoPages() {

		// cĂ¡c chá»‰ má»¥c dĂ¹ng Ä‘á»ƒ cáº¯t text
		int offsetI = 0, offsetII = 0;
		// Táº¡o Static Layout cho toĂ n bá»™ text
		StaticLayout layout = new StaticLayout(story, myTextPaint, width
				- (leftPadding << 1), Layout.Alignment.ALIGN_NORMAL, 0.5f, 10f,
				false);
		// Tá»•ng sá»‘ dĂ²ng
		int totalLines = layout.getLineCount();
		// Sá»‘ dĂ²ng tá»«ng trang
		int linePerPage = layout.getLineForVertical(height - (topPadding << 1));

		// loop to the end
		int i = 0;

		do {
			//
			Log.i("Thong bao", "Dang chia...");
			//
			int line = Math.min(linePerPage * (i + 1), totalLines - 1);
			// vi tri cá»§a kĂ½ tá»± cuá»‘i trang
			offsetII = layout.getOffsetForHorizontal(line, width
					- (leftPadding << 1));
			// Láº¥y subString
			String sub = story.substring(offsetI, offsetII);
			//
			offsetI = offsetII;
			// ThĂªm vĂ o danh sĂ¡ch
			listOfPages.add(sub);
			//
			i++;

		} while (offsetII < story.length());
	}

	//

	//
	public Bitmap getPageBitmap() {
		Bitmap pageBitmap, pageContentBitmap;
		// Bitmap ná»�n
		pageBitmap = Bitmap
				.createBitmap(width, height, Bitmap.Config.ARGB_8888);
		// Bitmap chá»©a text
		pageContentBitmap = Bitmap.createBitmap(width - (leftPadding << 1),
				height - topPadding, Bitmap.Config.ARGB_8888);
		// Táº¡o canvas Ä‘á»ƒ váº½ lĂªn
		Canvas c = new Canvas(pageContentBitmap);
		// Táº¡o StaticLayout cho ná»™i dung text
		StaticLayout layout = new StaticLayout(listOfPages.elementAt(index),
				myTextPaint, width - (leftPadding << 1),
				Layout.Alignment.ALIGN_NORMAL, 0.5f, 10f, false);
		// Váº½ lĂªn canvas
		layout.draw(c);
		// Canvas cá»§a ná»�n cho váº½ áº£nh ná»™i dung lĂªn
		Canvas c2 = new Canvas(pageBitmap);
		// TĂ´ mĂ u ná»�n
		c2.drawColor(pageColor);
		// váº½ áº£nh ná»™i dung
		c2.drawBitmap(pageContentBitmap, leftPadding << 1, topPadding,
				myTextPaint);

		return pageBitmap;
	}
	//

}