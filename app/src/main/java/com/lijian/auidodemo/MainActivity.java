package com.lijian.auidodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "MainActivity";

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-audio");
    }

    private Button mPlayButton;
    private Button mPauseButton;
    private Button mStopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mPauseButton= (Button) findViewById(R.id.pause);
        mPlayButton= (Button) findViewById(R.id.play);
        mStopButton= (Button) findViewById(R.id.stop);
        mPauseButton.setOnClickListener(this);
        mPlayButton.setOnClickListener(this);
        mStopButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.play:
                nativePlay("123.mp3");
                break;
            case R.id.pause:
                nativePause();
                break;
            case R.id.stop:
                nativeStop();
                break;
        }
    }

    /**
     * A native method that is implemented by the 'audio-player' native library,
     * which is packaged with this application.
     */
    public native boolean nativePlay(String mp3File);

    /**
     * A native method that is implemented by the 'audio-player' native library,
     * which is packaged with this application.
     */
    public native boolean nativeStop();

    /**
     * A native method that is implemented by the 'audio-player' native library,
     * which is packaged with this application.
     */
    public native boolean nativePause();

}
