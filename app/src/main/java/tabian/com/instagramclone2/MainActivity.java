package tabian.com.instagramclone2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import tabian.com.instagramclone2.Login.LoginActivity;

public class MainActivity extends AppCompatActivity {
private TextView nextbut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        nextbut = (TextView) findViewById(R.id.nextpage);
//        nextbut.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//                startActivity(intent);
//            }
//        });

    new Handler().postDelayed(new Runnable(){
    @Override
    public void run(){

        Intent intent = new Intent(MainActivity.this,tabian.com.instagramclone2.Login.LoginActivity.class);
        startActivity(intent);
             }
        },4000);

    }

    @Override
    public void onBackPressed(){

    }
}
