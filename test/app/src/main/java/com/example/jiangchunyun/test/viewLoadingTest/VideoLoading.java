package com.example.jiangchunyun.test.viewLoadingTest;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * this view is to show progress when video downloading.
 *
 * @author jiangchunyun
 * @date 2019.9.5
 */
public class VideoLoading extends View {

    private Paint mCriclePaint;// Paint
    private int cricleWidth;
    private RectF rectF;
    private int progress;// video download progress
    private boolean visiable;// View show sign

    private void init() {
        mCriclePaint = new Paint();
        mCriclePaint.setColor(Color.RED);
        mCriclePaint.setStyle(Paint.Style.FILL);
        cricleWidth = 200;
        mCriclePaint.setStrokeWidth(cricleWidth);
        progress = 30;
        visiable = false;
    }

    public VideoLoading(Context context) {
        super(context);
        init();
    }

    public VideoLoading(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public VideoLoading(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public VideoLoading(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        rectF = new RectF(getX(), getY(), getX() + cricleWidth * 2, getY() + cricleWidth * 2);
        Log.i("x----:", String.valueOf(getX()));
        Log.i("y----:", String.valueOf(getY()));
        float endAngle = progress * 360 / 100;
        canvas.drawArc(rectF, 360, endAngle, true, mCriclePaint);
    }

    public void setProgress(int progress) {
        this.progress = progress;
        postInvalidate();
    }

    public void setVisiable(boolean visiable) {
        this.visiable = visiable;
        postInvalidate();
    }

    public boolean getVisiable() {
        return this.visiable;
    }
}
