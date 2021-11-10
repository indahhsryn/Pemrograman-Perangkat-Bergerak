package com.latihan.biodata;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
public class MainActivity extends Activity {
String[] kelas = {
//“pilih”,
//“ASilahkan ”,
//“B”,
//“C”,
//“D”,
//“E”,
};
Spinner s1;
String[] prodi = {
//“Silahkan pilih”,
//“Teknik Informatika (TI)”,
//“Teknologi Hasil Pertanian (THP)”,
//“Mesin Peralatan Pertanian (MPP)”,
};
Spinner s2;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
s1 = (Spinner) findViewById(R.id.action_settings);
ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
android.R.layout.simple_spinner_item, kelas);
s1.setAdapter(adapter);
s1.setOnItemSelectedListener(new OnItemSelectedListener()
{
public void onItemSelected(AdapterView<?> arg0,
View arg1, int arg2, long arg3)
{
int index = s1.getSelectedItemPosition();
Toast.makeText(getBaseContext(),
 kelas[index],
Toast.LENGTH_SHORT).show();
}
public void onNothingSelected(AdapterView<?> arg0) {}
});
s2 = (Spinner) findViewById(R.id.action_settings);
ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
android.R.layout.simple_spinner_item, prodi);
s2.setAdapter(adapter2);
s2.setOnItemSelectedListener(new OnItemSelectedListener()
{
public void onItemSelected(AdapterView<?> arg0,
View arg1, int arg2, long arg3)
{
int index = s2.getSelectedItemPosition();
Toast.makeText(getBaseContext(),
 prodi[index],
Toast.LENGTH_SHORT).show();
}
public void onNothingSelected(AdapterView<?> arg0) {}
});
}
}
