package distributed7.slidecontrol;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

import static distributed7.slidecontrol.R.layout.activity_second;

public class SecondActivity extends AppCompatActivity {
    private GestureDetectorCompat gestureObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_second);

        gestureObject = new GestureDetectorCompat(this, new swipeToActivity(SecondActivity.this,null,true,false,false,MainActivity.class));
    }

    public boolean onTouchEvent(MotionEvent event) {
        this.gestureObject.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}