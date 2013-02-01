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
	
	// Nội dung của text
	String story = "NGƯỜI DŨNG CẢM\nCăn phòng màu trắng, chân tường được quét thêm một lớp sơn xanh ngọc cao gần bằng đầu gối. Sàn lót gạch tàu, lem nhem dấu giày - cứ như cả tháng rồi chưa ai lau. Tấm rèm ngăn cách phần giường bệnh của nữ đã khá cũ. Vải bị đổ lông, đầy mùi bụi. \n\nTrên trần nhà, cái quạt có từ thập niên 80 kêu rè rè, lừ nhừ xoay những cánh quạt dài rỉ sét. Cửa sổ chỉ mở một nửa, nhìn ra bãi giữ xe đạp. Những con ngựa sắt đủ màu, đứng sát rạt, chen chúc dưới mấy bóng râm ít ỏi của cây bàng già. Gió kêu xào xạc, ngái ngủ. Bây giờ là mấy giờ rồi nhỉ? Phòng này không có đồng hồ. Mà chắc là từng có, vẫn còn một cái đinh to, đen thùi trên tường. Tiếng nhạc từ cái cát - sét vọng ra từ phòng bên. Một y sĩ đang trực ở đó. Hình như là bài của Mỹ Tâm. Nghe hơi buồn. \n\nĐây là trong phòng y tế của trường. \n\nCòn tôi là cô học sinh xin nghỉ một tiết đang nằm trên cái giường bên cạnh cửa sổ. \n\nTôi luôn nghĩ mình là một sinh vật thất bại. Vì quá yếu ớt. Hồi nhỏ, một lần đi chơi xa với gia đình, mẹ dắt tôi vào một khu chợ địa phương. Phần vì đông người, lại chưa ăn sáng, đi được một lát là tôi lăn ra xỉu. Lúc đó, người tôi mềm nhũn ra như bún, có muốn động đậy một ngón tay cũng không được. Người tôi chạm đất, tôi nghe tiếng mẹ gọi bên tai rồi có ai đó ẵm tôi lên. Có rất nhiều người vây lại, họ nói chuyện lào xào, í ới với nhau. Người ta cạo gió cho tôi, giựt tóc tôi, xức dầu nước xanh ngay dưới mũi tôi. Tôi đau quá, muốn hét lên rằng, để con yên, con chỉ đói thôi mà, đừng làm thế nữa. Phải đến khi có một người cho nước gì ngòn ngọt vào miệng, tôi mới dần tỉnh lại. Mẹ tôi mừng hết biết. Từ đó mẹ luôn bắt tôi ăn sáng và cũng chẳng bao giờ dám dẫn tôi đi đâu xa. \n\nĐó là chuyện hồi nhỏ. \n\nBây giờ tôi đã 18 - đủ tuổi đi bầu chứ chẳng chơi. Nhưng sức khỏe tôi vẫn cứ vậy. Tôi không thể xách nổi một xô nước từ nhà vệ sinh lên lớp dù quãng đường đâu có bao xa. Tôi không đẩy được quả tạ 2kg xa hơn 3 mét trong giờ thể dục. Mới tháng trước, tôi xỉu giữa đường chạy khi mới chạy hơn 50 mét - trong khi bạn bè tôi đã chạy xong 100 mét từ lâu. Tôi xấu hổ đến chết đi được. Từ hồi cấp 2, tôi luôn tìm ra cách trốn tiết Thể dục. Tôi cố gắng đậu vào lớp chuyên để được miễn Thể dục. Lên cấp 3, tôi giành được suất vé đầu vào đội tuyển cờ vua. Nhưng đến lớp 12, ba mẹ muốn tôi chuyên tâm học hành nên đã nói tôi rút khỏi đội tuyển. Tôi quay về với cơn ác mộng ngày nào, những quả tạ, những đường chạy và những sợi dây giăng cao hơn 1mét 3.";
	String story2;// = this.getResources().getString(R.string.vbmt);
	// ImageView sẽ hiển thị trang
	ImageView image;
	
	// index: trang hiện tại; width, height: chiều dài, rộng màn hình
	int index = 0, width, height;	
	
	// Vector lưu nội dung của từng trang
	Vector<String> listOfPages = new Vector<String>();
	
	// Các thông số khác
	int textSize = 20; // cỡ chữ
	int textColor = 0xffA7573E; // màu chữ
	int pageColor = 0xffFDF8A6; // màu nền
	int topPadding = 30, leftPadding = 10; // căn trên, căn dưới
	// Paint vẽ text
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
		//story = this.getResources().getString(R.string.vbmt);
	
		
		// Xác lập font chữ
		Typeface tf = Typeface.createFromAsset(this.getAssets(),"fonts/UVNDaLat_R.TTF");
		// Xác lập các thông số về font chữ
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
				if (index > listOfPages.size()-1) {
					index = 0;
				}				
				// Xác lập ảnh
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
		
		// các chỉ mục dùng để cắt text
		int offsetI = 0, offsetII = 0;
		// Tạo Static Layout cho toàn bộ text
		StaticLayout layout = new StaticLayout(story, myTextPaint, width
				- (leftPadding << 1), Layout.Alignment.ALIGN_NORMAL, 0.5f, 10f, false);
		// Tổng số dòng
		int totalLines = layout.getLineCount();
		// Số dòng từng trang
		int linePerPage = layout.getLineForVertical(height - (topPadding << 1));
		
		// loop to the end
		int i = 0;
		
		do{
			//
			Log.i("Thong bao", "Dang chia...");
			//
			int line = Math.min(linePerPage * (i+1), totalLines-1);
			// vi tri của ký tự cuối trang
			offsetII = layout.getOffsetForHorizontal(line, width - (leftPadding << 1));	
			// Lấy subString			
			String sub = story.substring(offsetI, offsetII);
			//
			offsetI = offsetII;
			// Thêm vào danh sách
			listOfPages.add(sub);			
			//
			i++;
			
		}while (offsetII<story.length()); 			
	}
	//
	
	//
	public Bitmap getPageBitmap() {		
		Bitmap pageBitmap, pageContentBitmap;
		// Bitmap nền
		pageBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
		// Bitmap chứa text
		pageContentBitmap = Bitmap.createBitmap(width-(leftPadding<<1), height-topPadding, Bitmap.Config.ARGB_8888);
		// Tạo canvas để vẽ lên
		Canvas c = new Canvas(pageContentBitmap);
		// Tạo StaticLayout cho nội dung text
		StaticLayout layout = new StaticLayout(listOfPages.elementAt(index), myTextPaint, width
				- (leftPadding << 1), Layout.Alignment.ALIGN_NORMAL, 0.5f, 10f, false);
		// Vẽ lên canvas
		layout.draw(c);
		// Canvas của nền cho vẽ ảnh nội dung lên
		Canvas c2 = new Canvas(pageBitmap);
		// Tô màu nền
		c2.drawColor(pageColor);
		// vẽ ảnh nội dung
		c2.drawBitmap(pageContentBitmap, leftPadding<<1, topPadding, myTextPaint);

		return pageBitmap;
	}
	//
	

	
}