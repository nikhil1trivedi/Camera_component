package com.example.nikhiltrivedi.camera_component;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Camera;
import android.graphics.SurfaceTexture;
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
import android.view.TextureView;
import android.view.View;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraMetadata;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image ;
import android.media.ImageReader;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.Surface;
import android.view.View;
import android.widget.Button;



import java.io.File;
import java.io.IOException;
import java.util.List;

public class camera_open extends AppCompatActivity
    private Button takePictureButton ;
    private TextureView textureView;

    //SparseIntArray is similar to a hashmap but with integers
        // Surface.ROTATION is a function with the camera device
    private static final SparseIntArray ORIENTATIONS = new SparseIntArray() {
        static {
            ORIENTATIONS.append(Surface.ROTATION_0, int 90);
            ORIENTATIONS.append(Surface.ROTATION_90, int 0);
            ORIENTATIONS.append(Surface.ROTATION_180, int 270);
            ORIENTATIONS.append(Surface.ROTATION_270, int 180);

        }
    };
    private String cameraId;
    protected CameraDevice cameraDevice;
    protected CameraCaptureSession cameraCaptureSessions;
    protected CaptureRequest captureRequest ;
    protected CaptureRequest.Builder captureRequestBuilder;
    private Size imageDimension;
    private ImageReader imageReader;
    private File file;
    private static final int REQUEST_CAMERA_PERMISSION = 200;
    private boolean mFlashSupported;
    private Handler mBackgroundHandler;
    private HandlerThread mBackgroundThread;


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_open);

        //initalize the texture view

        textureView = (TextureView) findViewById(R.id.camera_preview) ;
        //assert is used to declare an expected boolean condition in a program
        assert textureView != null ;
        //set listener for the textview
        textureView.setSurfaceTextureListener(textureListener) ;

        //initialize the capture button
        takePictureButton = (Button) findViewById(R.id.button_capture) ;
        assert textureView != null ;
        takePictureButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                takePicture() ;
            });

        });
    }


    //1. On Surface Texture Available
TextureView.SurfaceTextureListener textureListener = new TextureView.SurfaceTextureListener(){
@Override
    public void onSurfaceTextureAvailable(SurfaceTexture surface,int height,int width){
            openCamera();
            }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surface,int height,int width){
            // transform the texture view into specified
            }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface){
            return false;
            };


    public void onSurfaceTextureUpdated(SurfaceTexture surface){

            }
}:

// the state callback will recieve  updates about the state of the camera
private final CameraDevice.StateCallback stateCallback = new CameraDevice.StateCallback(){
    @Override
        public void onOpened(CameraDevice camera){

        Log.e(TAG, "onOpened")
        cameraDevice = camera ;
        createCameraPreview() ;

        }
    @Override
        public void onDisconnected(CameraDevice camera){
            cameraDevice.close() ;


        }

        public void onError(CameraDevice camera, int error){
            cameraDevice.close() ;
            cameraDevice = null ;
        }
    }


    final CameraCaptureSession.CaptureCallback captureCallbackListener = new CameraCaptureSession.CaptureCallback(){
        @Override
        public void onCaptureCompleted(CameraCaptureSession session,CaptureRequest request,TotalCaptureResult result){
                super.onCamptureCompleted(session,request,result);
                // Toast - provides simple feedback about an operature
                    // in a small popup
                    //automatically disappear after a timeout
                Toast.makeText(camera_open.this,"Saved:"+file,Toast.LENGTH_SHORT).show();
                createCameraPreview();

                }
        // add a on capture failure just in case it fails

        @Override
        public void onCaptureFailure(CameraCaptureSession session, CaptureRequest request, CaptureFailure failure){
        console.log('ON CAPTURE FAILURE');
        }

    };

        // Background Threads are used to run code in a seperate thread to prevent overflow and loss of speed
        protected void startBackgroundThread(){
            mBackgroundThread = new HandlerThread("Camera Background");
            mBackgroundThread.start();
            mBackgroundHandler = new Handler (mBackgroundThread.getLooper());


        }

        protected void stopBackgroundThread(){
            mBackgroundThread.quitSafely();
            try{
                mBackgroundThread.join();
                mBackgroundThread = null;
                mBackgroundHandler = null ;
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }

        protected void takePicture(){
            if(cameraDevice==null){
            console.log("CAMERA DEVICE IS NULL")
            return;
            }


            //Camera Characteristics
        CameraManager manager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
            try{

            }catch(CameraAccessException e){
                e.printStackTrace(); 

            }
            // Image Reader listener
            ImageReader.OnImageAvailable


            private void save(){

            }

        }

     private void createCameraPreview(){
            try{

        }catch (){

        }

        }


        private void openCamera() {


        }


        protected void updatePreview(){

        }


        private void closeCamera(){

        }


        protected void onResume(){

        }


        protected void onPause(){

        }











}






