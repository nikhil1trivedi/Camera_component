package com.example.nikhiltrivedi.camera_component;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Camera;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.Size;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraAccessException;
import android.view.ViewGroup;
import android.widget.Button;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class camera_open extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_open);

         //Preview Class
            // must be passed to the amera before the live image preview is started



        class Preview extends ViewGroup implements SurfaceHolder.Callback {
            // the surface holder callback allows us to get notified of when the
            // surface is created or destroyed
            SurfaceView mSurfaceView;
            SurfaceHolder mHolder ;

            Preview(Context context) {
                super(context);

                mSurfaceView = new SurfaceView(context);
                addView(mSurfaceView);



                mHolder= mSurfaceView.getHolder();
                mHolder.addCallback(this);
                mHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
            }


            //Hello this is making sure that there is an updated version 








        }











    }
}





