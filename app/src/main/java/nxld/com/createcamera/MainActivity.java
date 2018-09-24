package nxld.com.createcamera;

import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class MainActivity extends AppCompatActivity implements SurfaceHolder.Callback{
    private Camera mCamera;
    private SurfaceView mSurfaceView;
    private SurfaceHolder mSurfaceHolder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSurfaceView = findViewById(R.id.surface_view);
        mSurfaceHolder = mSurfaceView.getHolder();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mCamera==null){
            mCamera=getCamera();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        releaseCamera();
    }

    /**
     * 获取camera对象
     * @return
     */
    private Camera getCamera(){
        Camera camera = Camera.open();
        return camera;
    }

    /**
     * 开始预览相机
     */
    private void setStartPreview(){

    }

    /**
     * 释放资源
     */
    private void releaseCamera(){
        mCamera.release();
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
