package qa.ooredoo.framework;

import android.graphics.Bitmap;

public interface Image {

	public int getWidth();
    public int getHeight();
    public Graphics.ImageFormat getFormat();
    public void dispose();
    public Bitmap getBitmap();
}
