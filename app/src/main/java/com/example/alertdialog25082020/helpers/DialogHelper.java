package com.example.alertdialog25082020.helpers;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.example.alertdialog25082020.R;

public class DialogHelper {

    public void showLoginDialog(Context context){
        Dialog dialog = new Dialog(context, android.R.style.Theme_DeviceDefault_Dialog_Alert);
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.dialog_login,null,false);
        dialog.setContentView(v);
    }
}

