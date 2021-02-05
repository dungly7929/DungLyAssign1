/*
 * Dung Ly N01327929 Section C
 * */
package dung.ly.n1327929;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class DungActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bnt = (Button) findViewById(R.id.button2);
        EditText eText = (EditText) findViewById(R.id.editText);
        Intent intent = new Intent(DungActivity.this, LyActivity.class);
        bnt.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View view)
            {
                String text = eText.getText().toString();
                intent.putExtra("Key1", text);
                startActivity(intent);

            }
        });

    }

    public void ShowToast(View view)
    {
        Intent intent = null;
        Toast toast = Toast.makeText(DungActivity.this,"DUNG LY Moving to Site: CBC",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.LEFT | Gravity.TOP,20,30);
        switch (view.getId())
        {
            case R.id.button:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cbc.ca/"));
                startActivity(intent);
                toast.show();
        }
    }



    }
