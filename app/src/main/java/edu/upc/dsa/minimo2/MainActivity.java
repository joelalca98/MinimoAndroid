package edu.upc.dsa.minimo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    Bundle bundle = new Bundle();
    String user;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = findViewById(R.id.buscarNombre);
       // cargarSharedPreference();



    }

    //private void cargarSharedPreference() {
    //    SharedPreferences preferences = getSharedPreferences("credenciales",Context.MODE_PRIVATE);
    //    user = preferences.getString("user","error");
    //    Intent intent = new Intent(this,InfoActivity.class);
    //    bundle.putString("username",user);
    //    intent.putExtras(bundle);
    //    startActivity(intent);


    //}

    public void getInfo(View view) {
        Intent intent = new Intent(this,InfoActivity.class);

        String username = userName.getText().toString();
       // SharedPreferences preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
       // SharedPreferences.Editor editor = preferences.edit();
       // editor.putString("user",username);
       // editor.commit();
        bundle.putString("username",username);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}