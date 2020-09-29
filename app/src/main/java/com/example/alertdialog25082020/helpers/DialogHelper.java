package com.example.alertdialog25082020.helpers;

import android.app.Dialog;
import android.content.Context;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alertdialog25082020.R;

import java.util.regex.Pattern;

import javax.xml.validation.Validator;

public class DialogHelper {

    public void showLoginDialog(final Context context){
        final Dialog dialog = new Dialog(context, android.R.style.Theme_Material_Light_Dialog);
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.dialog_login,null,false);
        dialog.setContentView(v);

        final EditText edtEmail = v.findViewById(R.id.edittextEmail);
        final EditText edtPass = v.findViewById(R.id.edittextPassword);
        Button btnLogin = v.findViewById(R.id.buttonLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emai = edtEmail.getText().toString();
                String password = edtPass.getText().toString();
                if (Patterns.EMAIL_ADDRESS.matcher(emai).matches() && password.length() >= 6){
                    Toast.makeText(context, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }else{
                    Toast.makeText(context, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                }
            }
        });

        dialog.show();
    }
}

