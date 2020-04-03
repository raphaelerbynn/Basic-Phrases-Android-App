package com.mountain.basicphrases;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.view.View;

public class German extends AppCompatActivity {

    LanguageTemplate languageTemplate;

    public void buttonTapped(View view){

        LanguageTemplate.hello = "Guten Tag ";
        LanguageTemplate.howareyou = "Wie geht es Ihnen?";
        LanguageTemplate.iamfrom = "Ich komme aus... .";
        LanguageTemplate.whatsyourname = "Wie heißen Sie?";
        LanguageTemplate.mynameis = "Ich heiße... ";
        LanguageTemplate.ilivein = "Ich wohne in...";
        LanguageTemplate.please = "Bitte ";
        LanguageTemplate.yourewelcome = "Bitte schön ";
        LanguageTemplate.wheredoyoulive = "Wo wohnst du? ";
        LanguageTemplate.whereis =  "Wo ist / Wo sind... ";
        LanguageTemplate.doyouspakenglissh = "Sprichst du englisch? ";
        LanguageTemplate.thankyou = "Danke \n Danke schön \n Danke sehr ";

        LanguageTemplate.helloS = R.raw.hello_german;
        LanguageTemplate.howareyouS = R.raw.howareyou_german;
        LanguageTemplate.iamfromS = R.raw.iamfrom_german;
        LanguageTemplate.whatsyournameS = R.raw.whatsyourname_german;
        LanguageTemplate.mynameisS = R.raw.mynameis_german;
        LanguageTemplate.iliveinS = R.raw.ilivein_german;
        LanguageTemplate.pleaseS = R.raw.please_german;
        LanguageTemplate.yourewelcomeS = R.raw.yourewelcome_german;
        LanguageTemplate.wheredoyouliveS = R.raw.wheredoyoulive_german;
        LanguageTemplate.whereisS =  R.raw.whereis_german;
        LanguageTemplate.doyouspakenglisshS = R.raw.doyouspeakenglish_german;
        LanguageTemplate.thankyouS = R.raw.thankyou_german;

        languageTemplate.tapped(view);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_german);

        GridLayout gridLayout = findViewById(R.id.gridLayout);
        languageTemplate = new LanguageTemplate();

        LanguageTemplate.mContext = this;

    }
}
