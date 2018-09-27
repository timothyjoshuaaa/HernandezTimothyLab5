package timothy.hernandez.com.hernandeztimothylab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

        public void proc(View v){
            Intent i = null, chooser = null;
            if(v.getId() == R.id.btnActivity1){
                i = new Intent(this, Activity1.class);
                startActivity(i);
            }
            else if(v.getId() == R.id.btnMap2) {
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo://14.5889, 120.9753"));
                chooser = Intent.createChooser(i, "Choose a Map APP");
                startActivity(chooser);
            }
        }
    }

