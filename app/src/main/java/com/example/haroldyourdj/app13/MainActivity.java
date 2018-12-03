package com.example.haroldyourdj.app13;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MainActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.activity = this;

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                myPopup.setTitle("Salut");
                myPopup.setMessage("Salut les gens c'est ton téléphone qui te parle");
                myPopup.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Vous avez cliquez sur Oui", Toast.LENGTH_SHORT).show();
                    }
                });

                myPopup.setNegativeButton("Non", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Vous avez cliquez sur Non", Toast.LENGTH_SHORT).show();
                    }

                });

                myPopup.show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                myPopup.setTitle("Salut 2");
                myPopup.setMessage("Salut les gens c'est encore ton téléphone qui te parle");
                myPopup.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Vous avez encore cliqué sur Oui", Toast.LENGTH_SHORT).show();
                    }
                });

                myPopup.setNegativeButton("Non", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Vous avez encore cliqué sur Non", Toast.LENGTH_SHORT).show();
                    }

                });

                myPopup.show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomPopup customPopup = new CustomPopup(activity);
                customPopup.setTitle("Bonne année 2019");
                customPopup.setSubTitle("Abonnez vous");
                customPopup.build();
            }
        });
    }
}


        /*
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myPopup = new AlertDialog.Builder(activity);
                myPopup.setTitle("3 ème salut");
                myPopup.setMessage("3 ème fois que ton téléphone te parle");
                myPopup.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Troisème Oui", Toast.LENGTH_SHORT).show();
                    }
                });

                myPopup.setNegativeButton("Non", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Troisième Non", Toast.LENGTH_SHORT).show();
                    }

                });

                myPopup.show();
            }
        });
        */