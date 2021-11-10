package com.example.greeting;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

@SuppressLint("NewApi") public class MainActivity extends Activity implements OnClickListener {
	EditText nama;
	Button hapus, salam;
	TextView hasil;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		nama = (EditText) findViewById(R.id.nama);
		hapus = (Button) findViewById(R.id.hapus);
		salam = (Button) findViewById(R.id.salam);
		hasil = (TextView) findViewById(R.id.hasil);
		hapus.setOnClickListener(this);
		salam.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.hapus:
			nama.setText("");
			hasil.setText("");
			break;
		case R.id.salam:
			String input = nama.getText().toString();
			if (input.isEmpty()) {
				hasil.setText("Nama masih kosong!");
			} else {
				hasil.setText("Halo " + input + " :-) ");
			}
			break;
		}
	}
}
