package com.mountain.basicphrases;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class French extends AppCompatActivity {

    LanguageTemplate languageTemplate;

    public void buttonTapped(View view){

        LanguageTemplate.hello = "Bonjour";
        LanguageTemplate.howareyou = "Comment vas-tu?";
        LanguageTemplate.iamfrom = "Je suis de...";
        LanguageTemplate.whatsyourname = "Quel est votre nom?";
        LanguageTemplate.mynameis = "Mon nom est ...";
        LanguageTemplate.ilivein = "J'habite à ...";
        LanguageTemplate.please = "S'il vous plaît";
        LanguageTemplate.yourewelcome = "Bienvenue";
        LanguageTemplate.wheredoyoulive = "Où habites-tu?";
        LanguageTemplate.whereis =  "Où est ... ";
        LanguageTemplate.doyouspakenglissh = "Parlez vous anglais?";
        LanguageTemplate.thankyou = "Je vous remercie";

        LanguageTemplate.helloS = R.raw.hello;
        LanguageTemplate.howareyouS = R.raw.howareyou;
        LanguageTemplate.iamfromS = R.raw.iamfrom;
        LanguageTemplate.whatsyournameS = R.raw.whatsyourname;
        LanguageTemplate.mynameisS = R.raw.mynameis;
        LanguageTemplate.iliveinS = R.raw.ilivein;
        LanguageTemplate.pleaseS = R.raw.please;
        LanguageTemplate.yourewelcomeS = R.raw.yourewelcome;
        LanguageTemplate.wheredoyouliveS = R.raw.wheredoyoulive;
        LanguageTemplate.whereisS =  R.raw.whereis;
        LanguageTemplate.doyouspakenglisshS = R.raw.doyouspakenglissh;
        LanguageTemplate.thankyouS = R.raw.thankyou;

        languageTemplate.tapped(view);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french);

        GridLayout gridLayout = findViewById(R.id.gridLayout);
        languageTemplate = new LanguageTemplate();

        LanguageTemplate.mContext = this;

    }


}




