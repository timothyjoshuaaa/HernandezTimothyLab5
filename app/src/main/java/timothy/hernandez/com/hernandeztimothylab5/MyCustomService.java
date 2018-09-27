package timothy.hernandez.com.hernandeztimothylab5;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;
public class MyCustomService extends IntentService{
    public MyCustomService(){
        super("MyCustomService");
    }
    @Override
    protected void onHandleIntent(@Nullable Intent intent){
        Log.d("Service", "SERVICE RUNNING AT THE SPEED OF SOUND");
    }
}
