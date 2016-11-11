package jbh.com.myzoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.yossi.zoo.Dolphin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("dsd","dsdsds");


        Dolphin d= new Dolphin();
        d.swim();



    }
}
