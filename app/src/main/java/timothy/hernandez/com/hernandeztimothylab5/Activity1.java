package timothy.hernandez.com.hernandeztimothylab5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Intent i = new Intent(this, MyCustomService.class);
        startService(i);
    }
    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.btnActivity2){
        i = new Intent(this, SecondActivity.class);
        startActivity(i);
        }
        else if(v.getId() == R.id.btnMap) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setType("message/rfc822");
            i.setData(Uri.parse("geo://14.5869, 120.9812"));
            chooser = Intent.createChooser(i, "Choose a Map APP");
            startActivity(chooser);
        }
    }
}
