package com.example.examen_4_t3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class detailActivity1 extends AppCompatActivity {



    static final int REQUEST_IMAGE_CAPTURE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);
        Log.i("MAIN_APP", "Iniciando detalle 1");
        Button button5 = findViewById(R.id.btnRegistrar);
        Button btnOpenCamera = findViewById(R.id.btnOpenCamera);

        TextView tv1 = findViewById(R.id.eTNombreEntrenador);
        TextView tv2 = findViewById(R.id.eTPueblo);

/*
        @Override
        public void onClick(View v)
        {
            if(v.getId()==R.id.button)
            {
                Intent intent=new Intent(getApplicationContext(),SignIn.class);
                startActivity(intent);
            }
            else if (v.getId()==R.id.button2)
            {
                Intent in=new Intent(getApplicationContext(),SignUpactivity.class);
                startActivity(in);
            }
        }
*/
        /*button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://upn.lumenes.tk/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

            }
        });
*/
    }

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
}