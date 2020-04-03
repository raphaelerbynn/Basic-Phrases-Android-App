package com.mountain.basicphrases;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.view.View;

public class Italian extends AppCompatActivity {

    LanguageTemplate languageTemplate;

    public void buttonTapped(View view){

        LanguageTemplate.hello = "Buongiorno";
        LanguageTemplate.howareyou = "Come sta?";
        LanguageTemplate.iamfrom = "Sono di...";
        LanguageTemplate.whatsyourname = "Come si chiama?";
        LanguageTemplate.mynameis = "Mi chiamo...";
        LanguageTemplate.ilivein = "Può aiutarmi? / Puoi aiutarmi?";
        LanguageTemplate.please = "Per favore / Per piacere";
        LanguageTemplate.yourewelcome = "Benvenuti!";
        LanguageTemplate.wheredoyoulive = "Di dov'è?";
        LanguageTemplate.whereis =  "Dov'è ... ";
        LanguageTemplate.doyouspakenglissh = "Parli inglese?";
        LanguageTemplate.thankyou = "Grazie (mille)";

        LanguageTemplate.helloS = R.raw.hello_italy;
        LanguageTemplate.howareyouS = R.raw.howareyou_italy;
        LanguageTemplate.iamfromS = R.raw.iamfrom_italy;
        LanguageTemplate.whatsyournameS = R.raw.whatsyourname_italy;
        LanguageTemplate.mynameisS = R.raw.mynameis_italy;
        LanguageTemplate.iliveinS = R.raw.canyouhelpme_italy;
        LanguageTemplate.pleaseS = R.raw.please_italy;
        LanguageTemplate.yourewelcomeS = R.raw.yourewelcome_italy;
        LanguageTemplate.wheredoyouliveS = R.raw.wheredoyoulive_italy;
        LanguageTemplate.whereisS =  R.raw.whereis_italy;
        LanguageTemplate.doyouspakenglisshS = R.raw.doyouspeakenglish_italy;
        LanguageTemplate.thankyouS = R.raw.thankyou_italy;

        languageTemplate.tapped(view);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian);

        GridLayout gridLayout = findViewById(R.id.gridLayout);
        languageTemplate = new LanguageTemplate();

        LanguageTemplate.mContext = this;

    }
}
