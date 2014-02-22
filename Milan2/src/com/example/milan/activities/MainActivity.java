package com.example.milan.activities;

import com.example.milan.activities.R;
import com.example.milan.activities.utils.C;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;



public class MainActivity extends BaseActivity {

	private EditText mInputEditTextFirst;
	private EditText mInputEditTextLast;
	private EditText mInputEditTextThird;
	private Button mSubmitButton; 

	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main); 

		initUi(); 

		initListeners();

	}

	@Override
	public void initUi() {

		
		mInputEditTextFirst = (EditText) findViewById(R.id.editText1);
		mInputEditTextLast = (EditText) findViewById(R.id.editText2);
		mInputEditTextThird = (EditText) findViewById(R.id.editText3);
		mSubmitButton = (Button) findViewById(R.id.button1);

	}

	@Override
	public void initListeners() {
		mSubmitButton.setOnClickListener(mClickListener);
		mInputEditTextFirst.setOnClickListener(mClickListener);
		mInputEditTextLast.setOnClickListener(mClickListener);
		mInputEditTextThird.setOnClickListener(mClickListener);



	}

	private OnClickListener mClickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {

			switch (v.getId()) { 

			case R.id.button1:

				String prvoime = mInputEditTextFirst.getText().toString();
				String drugoime = mInputEditTextLast.getText().toString();
				String treceime = mInputEditTextThird.getText().toString();

				startSecondActivity(prvoime, drugoime, treceime);
				
				break;

			}

		}
	};
	
	private void startSecondActivity (String prvoime, String drugoime, String treceime) {
		Intent intent = new Intent (this, SecondActivity.class);
		intent.putExtra(C.MAIN_ACTIVITY_BUNDLE_FIRST_NAME, prvoime);
		intent.putExtra(C.MAIN_ACTIVITY_BUNDLE_LAST_NAME, drugoime);
		intent.putExtra(C.MAIN_ACTIVITY_BUNDLE_THIRD_NAME, treceime);

		
		startActivity(intent);
	}

}
