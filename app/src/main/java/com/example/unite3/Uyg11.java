package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Uyg11 extends AppCompatActivity {
    private final String TAG = "Etiket";
    private int sayi = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg11);
        Log.d(TAG, "debug(hata ayıkama)");

    }

    public void islemYap(View view) {
        Log.i(TAG, "Düğmeye Tıklandı");
        EditText editText;
        editText = (EditText) findViewById(R.id.editTextTextPersonName);

        Log.i(TAG,"Edit Text tanımlandı");
        String s1 = editText.getText().toString();
        Log.i(TAG,"Edit Text içindeki yazı alındı");

        sayi = Integer.parseInt(s1);
        Log.i(TAG,"Yazı sayıya çevrildi");

        sayi += 2;
        Log.i(TAG,"sayıya 2 eklendi");
    }


}