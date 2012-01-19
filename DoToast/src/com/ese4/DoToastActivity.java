package com.ese4;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class DoToastActivity extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	EditText et;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		LinearLayout l1 = new LinearLayout(DoToastActivity.this);

		l1.setOrientation(LinearLayout.VERTICAL);
		l1.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,
				LayoutParams.FILL_PARENT));

		et = new EditText(DoToastActivity.this);
		et.setLayoutParams(new LinearLayout.LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		l1.addView(et);

		Button btn = new Button(DoToastActivity.this);
		btn.setText("SALUTA");
		btn.setLayoutParams(new LinearLayout.LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		btn.setOnClickListener(this);

		l1.addView(btn);

		setContentView(l1);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		Toast.makeText(getApplicationContext(), et.getText().toString(),
				Toast.LENGTH_SHORT).show();
	}

}