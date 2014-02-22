package com.example.milan.activities;


import com.example.milan.activities.R;
import com.example.milan.activities.utils.C;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends BaseActivity{
	
	private TextView mTextViewFirst;
	private TextView mTextViewLast;
	private TextView mTextViewThird;

	
	private String textFromMainAcitvityFirst;
	private String textFromMainAcitvityLast;
	private String textFromMainAcitvityThird;

	
	
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second); 

		initUi(); 
		
		Bundle extras = getIntent().getExtras();
		
		if (extras !=null){
			initExtras(extras);
		}
		
		setTextView();
		
		initListeners();

	}
	

	@Override
	public void initUi() {

		mTextViewFirst = (TextView) findViewById(R.id.text_view_first);
		mTextViewLast = (TextView) findViewById(R.id.text_view_last);
		mTextViewThird = (TextView) findViewById(R.id.text_view_third);

	}

	private void initExtras (Bundle extras){
		textFromMainAcitvityFirst = extras.getString (C.MAIN_ACTIVITY_BUNDLE_FIRST_NAME);
		textFromMainAcitvityLast = extras.getString (C.MAIN_ACTIVITY_BUNDLE_LAST_NAME);
		textFromMainAcitvityThird = extras.getString (C.MAIN_ACTIVITY_BUNDLE_THIRD_NAME);

	}
	
	private void setTextView (){
		mTextViewFirst.setText(textFromMainAcitvityFirst);
		mTextViewLast.setText(textFromMainAcitvityLast);
		mTextViewThird.setText(textFromMainAcitvityThird);

	}
	
	
	@Override
	public void initListeners() {
			

	}
	
	

}
