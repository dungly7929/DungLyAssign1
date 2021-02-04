/*
 * Dung Ly N01327929 Section C
 * */
package dung.ly.n1327929;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class LyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ly);

    }
    @Override
    protected  void onStart()
    {
        super.onStart();
        String value = "";
        TextView tv =  (TextView) findViewById(R.id.textView2);
        Snackbar snackbar = Snackbar.make(findViewById(R.id.secondactivity), "DUNG LY", Snackbar.LENGTH_LONG);
        Intent intent = getIntent();
        value = intent.getStringExtra("Key1");
        snackbar.show();
        tv.setText(value);
    }
}