package com.mountain.basicphrases;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.view.View;

public class Chinese extends AppCompatActivity {

    LanguageTemplate languageTemplate;

    public void buttonTapped(View view){

        LanguageTemplate.hello = "你好\n" +
                "Nǐ hǎo";
        LanguageTemplate.howareyou = "你好吗？\n" +
                "Nǐ hǎo ma?";
        LanguageTemplate.iamfrom = "我来自...\n" +
                "Wǒ láizì...";
        LanguageTemplate.whatsyourname = "请问你贵姓大名？\n" +
                "Qǐngwèn nǐ guìxìng dàmíng?";
        LanguageTemplate.mynameis = "我的名字是...\n" +
                "Wǒ de míngzì shì...";
        LanguageTemplate.ilivein = "我住在...\n" +
                "Wǒ zhù zài...";
        LanguageTemplate.please = "请\n" +
                "Qǐng";
        LanguageTemplate.yourewelcome = "别客气\n" +
                "Bié kèqì";
        LanguageTemplate.wheredoyoulive = "你住在哪里？\n" +
                "Nǐ zhù zài nǎlǐ?";
        LanguageTemplate.whereis =  "哪里...\n" +
                "Nǎlǐ... ";
        LanguageTemplate.doyouspakenglissh = "你会说英语吗？\n" +
                "Nǐ huì shuō yīngyǔ ma?";
        LanguageTemplate.thankyou = "谢谢\n" +
                "Xièxiè";

        LanguageTemplate.helloS = R.raw.hello_china;
        LanguageTemplate.howareyouS = R.raw.howareyou_china;
        LanguageTemplate.iamfromS = R.raw.imfrom_china;
        LanguageTemplate.whatsyournameS = R.raw.whatsyourname_china;
        LanguageTemplate.mynameisS = R.raw.mynameis_china;
        LanguageTemplate.iliveinS = R.raw.ilivein_chna;
        LanguageTemplate.pleaseS = R.raw.please_china;
        LanguageTemplate.yourewelcomeS = R.raw.yourewelcome_china;
        LanguageTemplate.wheredoyouliveS = R.raw.wheredoyoulive_china;
        LanguageTemplate.whereisS =  R.raw.whereis_china;
        LanguageTemplate.doyouspakenglisshS = R.raw.doyouspeakenglish_china;
        LanguageTemplate.thankyouS = R.raw.thankyou_china;

        languageTemplate.tapped(view);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);

        GridLayout gridLayout = findViewById(R.id.gridLayout);
        languageTemplate = new LanguageTemplate();

        LanguageTemplate.mContext = this;

    }
}
