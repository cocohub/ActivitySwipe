package distributed7.slidecontrol;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class swipeToActivity extends GestureDetector.SimpleOnGestureListener {
    Context context; //the activity where you will change activity from
    Class firstClass, secondClass; //first class is the class you come to when sliding to right, second class when you slide left
    boolean left, right, both; //these enable sliding to left, right or both directions

    public swipeToActivity(Context context, Class firstClass, boolean left, boolean right, boolean both, Class secondClass) {
        this.context = context;
        this.firstClass = firstClass;
        this.left = left;
        this.right = right;
        this.both = both;
        this.secondClass = secondClass;
    }

    public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY) {
        if(event2.getX() > event1.getX()) {
            if(right || both && firstClass != null) {
                //TODO WHEN SWIPING TO RIGHT
                Intent intent = new Intent(context, firstClass);
                ((Activity) context).finish();
                context.startActivity(intent);
            }
        } else if (event2.getX() < event1.getX()) {
            if(left || both && secondClass != null) {
                //TODO WHEN SWIPING TO LEFT
                Intent intent = new Intent(context, secondClass);
                ((Activity) context).finish();
                context.startActivity(intent);
            }
        }
        return true;
    }
}