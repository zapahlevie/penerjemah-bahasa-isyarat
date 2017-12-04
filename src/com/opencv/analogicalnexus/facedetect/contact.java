package com.opencv.analogicalnexus.facedetect;



import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.opencv.analogicalnexus.facedetect.R;



public class contact extends Activity {
	
	Button buttonCatalog1;
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact);
		
		 buttonCatalog1=(Button)findViewById(R.id.buttonCat1);
	       
	        
	        buttonCatalog1.setOnClickListener(new View.OnClickListener() {
	        	public void onClick(View view) {
	        		finish();
	        	};
	        	});	
	}
}