package com.mountain.basicphrases;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.view.View;

public class Spanish extends AppCompatActivity {

    LanguageTemplate languageTemplate;

    public void buttonTapped(View view){

        LanguageTemplate.hello = "¡Buenos días! ";
        LanguageTemplate.howareyou = "¿Cómo está usted? ";
        LanguageTemplate.iamfrom = "Yo soy de...";
        LanguageTemplate.whatsyourname = "¿Cómo se llama usted? ";
        LanguageTemplate.mynameis = "Me llamo... ";
        LanguageTemplate.ilivein = "¿Puede ayudarme?";
        LanguageTemplate.please = "Por favor ";
        LanguageTemplate.yourewelcome = "Bienvenidos ";
        LanguageTemplate.wheredoyoulive = "¿Puede ayudarme?";
        LanguageTemplate.whereis =  "¿Dónde está / Dónde están... ";
        LanguageTemplate.doyouspakenglissh = "¿Hablas inglés?";
        LanguageTemplate.thankyou = "(Muchas) Gracias ";

        LanguageTemplate.helloS = R.raw.hello_spain;
        LanguageTemplate.howareyouS = R.raw.howareyou_spain;
        LanguageTemplate.iamfromS = R.raw.iamfrom_spain;
        LanguageTemplate.whatsyournameS = R.raw.whatsyourname_spain;
        LanguageTemplate.mynameisS = R.raw.mynameis_spain;
        LanguageTemplate.iliveinS = R.raw.whereareyoufrom_spain;
        LanguageTemplate.pleaseS = R.raw.please_spain;
        LanguageTemplate.yourewelcomeS = R.raw.welcome_spain;
        LanguageTemplate.wheredoyouliveS = R.raw.canyouhelpme_spain;
        LanguageTemplate.whereisS =  R.raw.whereis_spain;
        LanguageTemplate.doyouspakenglisshS = R.raw.doyouspeakenglish_spain;
        LanguageTemplate.thankyouS = R.raw.thankyou_spain;

        languageTemplate.tapped(view);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish);

        GridLayout gridLayout = findViewById(R.id.gridLayout);
        languageTemplate = new LanguageTemplate();

        LanguageTemplate.mContext = this;

    }
}
