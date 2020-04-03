package com.mountain.basicphrases;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LanguageTemplate extends AppCompatActivity {


    static String hello;
    static String howareyou;
    static String iamfrom;
    static String whatsyourname;
    static String mynameis;
    static String ilivein;
    static String please;
    static String yourewelcome;
    static String wheredoyoulive;
    static String whereis;
    static String doyouspakenglissh;
    static String thankyou;

    static int helloS;
    static int howareyouS;
    static int iamfromS;
    static int whatsyournameS;
    static int mynameisS;
    static int iliveinS;
    static int pleaseS;
    static int yourewelcomeS;
    static int wheredoyouliveS;
    static int whereisS;
    static int doyouspakenglisshS;
    static int thankyouS;

    static Context mContext;



    public boolean tapped(View view){

        int id = view.getId();
        String ourId = "";
        ourId =  view.getResources().getResourceEntryName(id);

        switch (ourId){

            case "hello":
                audioPlay(mContext,helloS, hello);
                return true;

            case "howareyou":
                audioPlay(mContext,howareyouS, howareyou);
                return true;

            case "iamfrom":
                audioPlay(mContext,iamfromS, iamfrom);
                return true;

            case "whatsyourname":
                audioPlay(mContext,whatsyournameS, whatsyourname);
                return true;

            case "mynameis":
                audioPlay(mContext,mynameisS, mynameis);
                return true;

            case "ilivein":
                audioPlay(mContext,iliveinS, ilivein);
                return true;

            case "please":
                audioPlay(mContext,pleaseS, please);
                return true;

            case "welcome":
                audioPlay(mContext,yourewelcomeS, yourewelcome);
                return true;

            case "wheredoyoulive":
                audioPlay(mContext, wheredoyouliveS, wheredoyoulive);
                return true;

            case "whereis":
                audioPlay(mContext, whereisS, whereis);
                return true;

            case "doyouspeakenglish":
                audioPlay(mContext,doyouspakenglisshS, doyouspakenglissh);
                return true;

            case "thankyou":
                audioPlay(mContext,thankyouS, thankyou);
                return true;

            default:
                return false;


        }

    }


    public void audioPlay(Context context, int soundFile, String TranslatedPhrase){

        MediaPlayer mplayer = MediaPlayer.create(context, soundFile);
        mplayer.start();

        Toast.makeText(context, TranslatedPhrase, Toast.LENGTH_SHORT).show();

        Log.i("soundId", String.valueOf(soundFile));
        Log.i("phrase", TranslatedPhrase);
    }








}

