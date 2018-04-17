package com.example.nikhiltrivedi.camera_component;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.hardware.camera2.CameraDevice ;
import android.util.Size;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;


public class CameraMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_main);



    }

    // initialize Texture View

    TextureView textureView = (TextView) findViewById(R.id.TextureView);

    //Camera Manager

    public class  {

    }

    // Camera Object
    /** A safe way to get an instance of the Camera object. */

    public static Camera getCameraInstance() {
        Camera c = null;
        try {
            c = Camera.open(); // attempt to get a Camera instance
        } catch (Exception e) {
            // Camera is not available (in use or does not exist)
        }
        return c; // returns null if camera is unavailable
    }

    /**
     * Check if this device has a camera
     */
    private boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
            // this device has a camera
            return true;
        } else {
            // no camera on this device
            return false;
        }
    }



    //Preview Class
    // must be passed to the Camera before the live image preview is started

    class Preview extends ViewGroup implements SurfaceHolder.Callback {
        // the surface holder callback allows us to get notified of when the
        // surface is created or destroyed
        SurfaceView mSurfaceView;
        SurfaceHolder mHolder;

        Preview(Context context) {
            super(context);

            mSurfaceView = new SurfaceView(context);
            addView(mSurfaceView);


            mHolder = mSurfaceView.getHolder();
            mHolder.addCallback(this);
            mHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
        }

        // Set and Start the Preview
        public void setCamera(Camera camera) {
            if (Camera mCamera == camera) {
                return;
            }

            stopPreviewAndFreeCamera();

            mCamera = camera;

            if (mCamera != null) {
                List<Size> localSizes = mCamera.getParameters().getSupportedPreviewSizes();
                requestLayout();
            }

            try {
                mCamera.setPreviewDisplay(mHolder);
            } catch (IOException e) {
                throw e;
            }


            mCamera.startPreview();


        }
    }


    }











