package com.latihan.kalkulator_revisi;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("NewApi") public class MainActivity extends Activity implements OnClickListener {
	EditText angka1, angka2;
	Button btnHapus, btnHitung,btnkali,btnbagi,btnkurang;
	TextView txtHasil;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		angka1 = (EditText) findViewById(R.id.input1);
		angka2 = (EditText) findViewById(R.id.input2);
		btnHapus = (Button) findViewById(R.id.buttonHapus);
		btnHitung = (Button) findViewById(R.id.buttonHitung);
		btnkali = (Button) findViewById(R.id.buttonkali);
		btnbagi = (Button) findViewById(R.id.buttonbagi);
		btnkurang = (Button) findViewById(R.id.buttonkurang);
		txtHasil = (TextView) findViewById(R.id.textviewHasil);
		btnHapus.setOnClickListener(this);
		btnHitung.setOnClickListener(this);
		btnkali.setOnClickListener(this);
		btnbagi.setOnClickListener(this);
		btnkurang.setOnClickListener(this);
		
		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@SuppressLint("NewApi") @Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonHapus:
			angka1.setText("");
			angka2.setText("");
			txtHasil.setText("");
			break;
		case R.id.buttonHitung:
			String a = angka1.getText().toString();
			String b = angka2.getText().toString();

			if (a.isEmpty() | b.isEmpty()) {
			Toast.makeText(MainActivity.this, "Input masih kosong",
						Toast.LENGTH_SHORT).show();
			} else {
				int input1 = Integer.parseInt(a);
				int input2 = Integer.parseInt(b);
				int total = input1 + input2;
				txtHasil.setText("Hasil " + total);
			}
			break;
		case R.id.buttonbagi:
			String c = angka1.getText().toString();
			String d = angka2.getText().toString();

			if (c.isEmpty() | d.isEmpty()) {
			Toast.makeText(MainActivity.this, "Input masih kosong",
						Toast.LENGTH_SHORT).show();
			} else {
				int input1 = Integer.parseInt(c);
				int input2 = Integer.parseInt(d);
				int total = input1 / input2;
				txtHasil.setText("Hasil " + total);
			}
			break;
		case R.id.buttonkali:
			String e = angka1.getText().toString();
			String f = angka2.getText().toString();

			if (e.isEmpty() | f.isEmpty()) {
			Toast.makeText(MainActivity.this, "Input masih kosong",
						Toast.LENGTH_SHORT).show();
			} else {
				int input1 = Integer.parseInt(e);
				int input2 = Integer.parseInt(f);
				int total = input1 * input2;
				txtHasil.setText("Hasil " + total);
			}
			break;
		case R.id.buttonkurang:
			String g = angka1.getText().toString();
			String h = angka2.getText().toString();

			if (g.isEmpty() | h.isEmpty()) {
			Toast.makeText(MainActivity.this, "Input masih kosong",
						Toast.LENGTH_SHORT).show();
			} else {
				int input1 = Integer.parseInt(g);
				int input2 = Integer.parseInt(h);
				int total = input1 - input2;
				txtHasil.setText("Hasil " + total);
			}
			break;
		}
		
	}
}

