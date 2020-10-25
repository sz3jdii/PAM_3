package com.example.pam2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragMan;

    private Fragment f1, f2, f3, f4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = new f1();
        f2 = new f2();
        f3 = new f3();
        f4 = new f4();

        fragMan = getSupportFragmentManager();

        FragmentTransaction trans = fragMan.beginTransaction();
        trans.add(R.id.f1, f1);
        trans.add(R.id.f2, f2);
        trans.add(R.id.f3, f3);
        trans.add(R.id.f4, f4);
        trans.addToBackStack(null);
        trans.commit();
    }
}