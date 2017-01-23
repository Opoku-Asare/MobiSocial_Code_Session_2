package fi.oulu.mobisocial.share;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.about_btn).setOnClickListener(new EventHandlers());
        findViewById(R.id.share_floatButn).setOnClickListener(new EventHandlers());

    }

    private class EventHandlers implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.about_btn:
                    Intent about = new Intent(MainActivity.this, AboutActivity.class);
                    startActivity(about);
                    Log.d("Asare", "button Click");
                    break;
                case R.id.share_floatButn:
                    Intent shareIntent = new Intent();
                    shareIntent.setAction(Intent.ACTION_SEND);
                    shareIntent.putExtra(Intent.EXTRA_TEXT, ((TextView) findViewById(R.id.editText)).getText().toString());
                    shareIntent.setType("text/plain");
                    startActivity(shareIntent);
                    Log.d("Asare", "Float button  Click");
                    break;
            }

        }
    }
}
