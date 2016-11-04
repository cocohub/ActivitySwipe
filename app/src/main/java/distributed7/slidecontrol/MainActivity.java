package distributed7.slidecontrol;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

import static distributed7.slidecontrol.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    private GestureDetectorCompat gestureObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        gestureObject = new GestureDetectorCompat(this, new swipeToActivity(MainActivity.this,SecondActivity.class,false,true,false,null));
    }

    public boolean onTouchEvent(MotionEvent event) {
        this.gestureObject.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}

