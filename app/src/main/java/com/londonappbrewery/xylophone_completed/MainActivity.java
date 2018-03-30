package com.londonappbrewery.xylophone_completed;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // Member Variables
    SoundPool mSoundPool;
    int mCSoundId;
    int mDSoundId;
    int mESoundId;
    int mFSoundId;
    int mGSoundId;
    int mASoundId;
    int mBSoundId;
    DinamicViews dnm;
    Context mContext;
    EditText mEditText;
    //RelativeLayout relativeLayout;
    int x=0;
    LinearLayout mLinearLayout;
    TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.londonappbrewery.xylophone_completed.R.layout.activity_main);

        // 	Updated way to create a SoundPool for API levels newer than Android Lollipop
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mSoundPool = new SoundPool.Builder()
                    .setMaxStreams(NR_OF_SIMULTANEOUS_SOUNDS).build();
        } else {
            // Deprecated way of creating a SoundPool before Android API 21.
            mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);
        }
        ///relativeLayout = findViewById(R.id.relative);
        //solPlay = findViewById(R.id.solPlay);
        mLinearLayout = findViewById(R.id.mLinearLayout);
        //mEditText=findViewById(R.id.editText);
        if (x==14){
            mLinearLayout = new LinearLayout(this);
       // mLinearLayout.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.MATCH_PARENT));
        mLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        x=0;}
        //relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT));

//        mLinearLayout.addView(mTextView);
//        if (x>0)
//        mLinearLayout.addView(solPlay);
//        relativeLayout.addView(mLinearLayout);


        // Get the resource IDs to identify the sounds and store them in variables
        mCSoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c, 1);
        mDSoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d, 1);
        mESoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e, 1);
        mFSoundId = mSoundPool.load(getApplicationContext(), com.londonappbrewery.xylophone_completed.R.raw.note4_f, 1);
        mGSoundId = mSoundPool.load(getApplicationContext(), com.londonappbrewery.xylophone_completed.R.raw.note5_g, 1);
        mASoundId = mSoundPool.load(getApplicationContext(), com.londonappbrewery.xylophone_completed.R.raw.note6_a, 1);
        mBSoundId = mSoundPool.load(getApplicationContext(), com.londonappbrewery.xylophone_completed.R.raw.note7_b, 1);

    }

    // Individual methods linked to onClick properties in the XML layout file

    public void playC(View v) {
        mSoundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE);
        //solPlay.setText("");
        dnm = new DinamicViews(mContext);
        mLinearLayout.addView(dnm.descriptionTextView(getApplicationContext(),"Do"));
        //mTextView.setText("Do-");
        //mEditText.setText(dnm.descriptionTextView(getApplicationContext(),"Do"));
        x++;

    }

    public void playD(View v) {
        mSoundPool.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        dnm = new DinamicViews(mContext);
        mLinearLayout.addView(dnm.descriptionTextView(getApplicationContext(),"Re"));
       // solPlay.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
        //solPlay.setText("Re-");
        //relativeLayout.addView(addText(getApplicationContext(),"Re-"),3,4);
        //mLinearLayout.addView(solPlay);
        x++;
    }

    public void playE(View v) {
        mSoundPool.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        dnm = new DinamicViews(mContext);
        mLinearLayout.addView(dnm.descriptionTextView(getApplicationContext(),"Mi"));
        x++;
    }

    public void playF(View v) {
        mSoundPool.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        dnm = new DinamicViews(mContext);
        mLinearLayout.addView(dnm.descriptionTextView(getApplicationContext(),"Fa"));
        x++;
    }

    public void playG(View v) {
        mSoundPool.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        dnm = new DinamicViews(mContext);
        mLinearLayout.addView(dnm.descriptionTextView(getApplicationContext(),"Sol"));
        x++;
    }

    public void playA(View v) {
        mSoundPool.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        dnm = new DinamicViews(mContext);
        mLinearLayout.addView(dnm.descriptionTextView(getApplicationContext(),"LA"));
        x++;
    }

    public void playB(View v) {
        mSoundPool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        dnm = new DinamicViews(mContext);
        mLinearLayout.addView(dnm.descriptionTextView(getApplicationContext(),"Si"));
        x++;
    }


}
