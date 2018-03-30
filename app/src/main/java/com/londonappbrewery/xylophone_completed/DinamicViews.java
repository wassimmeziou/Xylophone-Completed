package com.londonappbrewery.xylophone_completed;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by wassi on 30/03/2018.
 */

public class DinamicViews {
    Context ctx;
    public DinamicViews(Context ctx){
        this.ctx=ctx;
    }
    public EditText descriptionTextView(Context context, String text){
        final EditText editText= new EditText(context);
        final ViewGroup.LayoutParams lparams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        editText.setLayoutParams(lparams);
        editText.setTextSize(14);
        editText.setTextColor(Color.rgb(239, 7, 235));
        editText.setText(text+"-");
        //editText.setMaxEms(2);
        return editText;
    }
}
