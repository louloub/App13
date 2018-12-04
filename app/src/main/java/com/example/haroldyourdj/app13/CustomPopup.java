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
    private Button button_popup_1, button_popup_2;
    private TextView tv1, tv2;

    // constructor
    public CustomPopup(Activity activity) {
        super(activity, R.style.Theme_AppCompat_DayNight_Dialog_Alert);
        setContentView(R.layout.template_popup);
        this.title_popup = "Mon titre";
        this.sub_title_popup = "Mon super sous titre";

        // ---- SOUCIS AVEC LES BOUTONS EN DEBUGEUR ----
        this.button_popup_1 = findViewById(R.id.button_popup_1);
        this.button_popup_2 = findViewById(R.id.button_popup_2);
        this.tv1 = findViewById(R.id.tv1);
        this.tv2 = findViewById(R.id.tv2);
    }

    // Méthods
    // on affecte la valeur de title à title_popup
    public void setTitle(String title) {
        this.title_popup = title;
    }

    public void setSubTitle(String sub_title_popup) {

        this.sub_title_popup = sub_title_popup;
    }

    public Button getButton1()

    {
        return button_popup_1;
    }

    ;

    public Button getButton2() {
        return button_popup_2;
    }

    ;

    public void build() {
        show();

        tv1.setText(title_popup);
        tv2.setText(sub_title_popup);
    }
}
