package fi.oulu.mobisocial.share;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.support.design.widget.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    Button aboutBtn;
    EditText textView;
    FloatingActionButton share_floatButn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutBtn = (Button) findViewById(R.id.about_btn);
        textView = (EditText) findViewById(R.id.editText);
        share_floatButn = (FloatingActionButton) findViewById(R.id.share_floatButn);


        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent about = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(about);

            }
        });

        share_floatButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, textView.getText().toString());
                shareIntent.setType("text/plain");
                Intent.createChooser(shareIntent, "Share Via");
                startActivity(shareIntent);
                Log.d("Asare", "Float button  Click");
            }
        });

    }
}
