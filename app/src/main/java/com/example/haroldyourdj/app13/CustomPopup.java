package com.example.haroldyourdj.app13;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;

public class CustomPopup extends Dialog {

    // fields
    private String title_popup;
    private String sub_title_popup;
    private Button button1, button2;
    private TextView tv1, tv2;

    // constructor
    public CustomPopup(Activity activity) {
        super(activity, R.style.Theme_AppCompat_Dialog);
        setContentView(R.layout.template_popup);
        this.title_popup = "Mon titre";
        this.sub_title_popup = "Mon super sous titre";
        this.button1 = findViewById(R.id.button1);
        this.button2 = findViewById(R.id.button2);
        this.tv1 = findViewById(R.id.tv1);
        this.tv2 = findViewById(R.id.tv2);
    }

    // Méthods
    public void setTitle(String title) { this.title_popup = title; }

    public void setSubTitle(String sub_title_popup) { this.title_popup = sub_title_popup; }

    public Button getButton1() { return button1; };

    public Button getButton2() { return button2; };

    public void build (){
        show();
        tv1.setText(tv1);
        tv2.setText(tv2);
    }

}
