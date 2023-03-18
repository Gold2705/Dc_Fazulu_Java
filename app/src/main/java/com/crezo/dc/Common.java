package com.crezo.dc;

import android.app.Activity;
import android.widget.Toast;

public class Common {

    public void toast(Activity context, String msg){
        Toast.makeText(context, ""+msg, Toast.LENGTH_SHORT).show();
    }

}
