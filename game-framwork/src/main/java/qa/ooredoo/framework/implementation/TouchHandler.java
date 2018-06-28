package qa.ooredoo.framework.implementation;

import android.view.View.OnTouchListener;

import java.util.List;

import qa.ooredoo.framework.Input;


public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);
   
    public int getTouchX(int pointer);
   
    public int getTouchY(int pointer);
   
    public List<Input.TouchEvent> getTouchEvents();
}
 