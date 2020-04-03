package com.mountain.basicphrases;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.view.View;

public class Twi extends AppCompatActivity {

    LanguageTemplate languageTemplate;

    public void buttonTapped(View view){

        LanguageTemplate.hello = "Agoo";
        LanguageTemplate.howareyou = "ɛte sɛn?";
        LanguageTemplate.iamfrom = "Me firi ...";
        LanguageTemplate.whatsyourname = "Yɛferɛ wo sɛn?";
        LanguageTemplate.mynameis = "Yɛferɛ me ...";
        LanguageTemplate.ilivein = "Mi tii ...";
        LanguageTemplate.please = "Mepa wo kyɛw";
        LanguageTemplate.yourewelcome = "Akwaaba";
        LanguageTemplate.wheredoyoulive = "Wo ti hinfa?";
        LanguageTemplate.whereis =  "Mente aseɛ";
        LanguageTemplate.doyouspakenglissh = "Woka borɔfo kasa?";
        LanguageTemplate.thankyou = "Meda wo ase pii";

        LanguageTemplate.helloS = R.raw.hello_twi;
        LanguageTemplate.howareyouS = R.raw.howareyou_twi;
        LanguageTemplate.iamfromS = R.raw.iamfrom_twi;
        LanguageTemplate.whatsyournameS = R.raw.whatsyourname_twi;
        LanguageTemplate.mynameisS = R.raw.mynameis_twi;
        LanguageTemplate.iliveinS = R.raw.ilivein_twi;
        LanguageTemplate.pleaseS = R.raw.please_twi;
        LanguageTemplate.yourewelcomeS = R.raw.welcome_twi;
        LanguageTemplate.wheredoyouliveS = R.raw.wheredoyoulive_twi;
        LanguageTemplate.whereisS =  R.raw.idontunderstand_twi;
        LanguageTemplate.doyouspakenglisshS = R.raw.doyouspeakenglish_twi;
        LanguageTemplate.thankyouS = R.raw.thankyou_twi;

        languageTemplate.tapped(view);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twi);

        GridLayout gridLayout = findViewById(R.id.gridLayout);
        languageTemplate = new LanguageTemplate();

        LanguageTemplate.mContext = this;

    }
}
