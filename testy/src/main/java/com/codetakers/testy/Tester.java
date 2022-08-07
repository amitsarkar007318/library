package com.codetakers.testy;

import android.content.Context;
import android.widget.Toast;

public class Tester {
    public static void shortToast(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
