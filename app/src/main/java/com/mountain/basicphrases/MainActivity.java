package com.mountain.basicphrases;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    ListView listView;

    String[] maintitle = {

            "Translates to French",
            "Translates to German",
            "Translates to Chinese",
            "Translates to Spanish",
            "Translates to Italian",
            "Translates to Twi"

    };
    String[] subtitle = {

            "from English",
            "from English",
            "from English",
            "from English",
            "from English",
            "from English"

    };
    Integer[] imageId = {

            R.drawable.french,
            R.drawable.german,
            R.drawable.chinese,
            R.drawable.spain,
            R.drawable.italian,
            R.drawable.twi

    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId()){

            case R.id.help:
                intent = new Intent(getApplicationContext(), Help.class);
                startActivity(intent);
                return true;

            case R.id.about:
                intent = new Intent(getApplicationContext(), About.class);
                startActivity(intent);
                return true;

            default:
                return false;

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyLisAdapter myLisAdapter = new MyLisAdapter(this, maintitle, subtitle, imageId);
        listView.setAdapter(myLisAdapter);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        intent = new Intent(getApplicationContext(), French.class);
                        startActivity(intent);
                        return;
                    case 1:
                        intent = new Intent(getApplicationContext(), German.class);
                        startActivity(intent);
                        return;
                    case 2:
                        intent = new Intent(getApplicationContext(), Chinese.class);
                        startActivity(intent);
                        return;
                    case 3:
                        intent = new Intent(getApplicationContext(), Spanish.class);
                        startActivity(intent);
                        return;
                    case 4:
                        intent = new Intent(getApplicationContext(), Italian.class);
                        startActivity(intent);
                        return;
                    case 5:
                        intent = new Intent(getApplicationContext(), Twi.class);
                        startActivity(intent);
                        return;
                    default:
                        Toast.makeText(MainActivity.this, "Hmmm...", Toast.LENGTH_SHORT).show();



                }

            }
        });




    }


}




class MyLisAdapter extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imageId;


    public MyLisAdapter(Activity context, String[] maintitle, String[] subtitle, Integer[] imageId){
        super(context, R.layout.activity_mylist, maintitle);

        this.context = context;
        this.maintitle = maintitle;
        this.subtitle = subtitle;
        this.imageId = imageId;


    }


    public View getView(int pos, View view, ViewGroup parent){

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_mylist, null, true);

        TextView toLang = rowView.findViewById(R.id.toLang);
        TextView fromLang = rowView.findViewById(R.id.fromLang);
        ImageView imageView = rowView.findViewById(R.id.langIcon);

        toLang.setText(maintitle[pos]);
        fromLang.setText(subtitle[pos]);
        imageView.setImageResource(imageId[pos]);

        return rowView;

    };


}
