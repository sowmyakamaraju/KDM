package com.example.kdmlab4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MuraliActivity extends Activity {

	WebView web;
	Button bt;
	EditText et;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.murali_layout);
		
		et = (EditText)findViewById(R.id.editText1);
		
		bt = (Button)findViewById(R.id.button1);
		
		web = (WebView)findViewById(R.id.webView1);
		
		
		
		bt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
			String	url = "http://10.205.0.48:8080/FirstRestWebService/rest/json/metallica/" +et.getText().toString().trim(); 
				
			web.loadUrl(url);
			
			}
		});
		
	}
}
