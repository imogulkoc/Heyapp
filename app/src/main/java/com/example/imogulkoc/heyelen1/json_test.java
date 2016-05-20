package com.example.imogulkoc.heyelen1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class json_test extends Activity {

    String il;
    String ilce;
    String mahalle;
    String sokak;
    String raportor;
    String kurum;
    String unvan;
    String tac_yuk;
    String top_yuk;
    String yat_gen;
    String yuk_fark;
    InputStream is = null;
    String result = null;
    String line = null;
    int code;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner e_il = (Spinner) findViewById(R.id.spinner);
        final Spinner e_ilce = (Spinner) findViewById(R.id.spinner2);
        final EditText e_mahalle = (EditText) findViewById(R.id.editText1);
        final EditText e_sokak = (EditText) findViewById(R.id.editText2);
        final EditText e_raportor = (EditText) findViewById(R.id.editText3);
        final EditText e_kurum = (EditText) findViewById(R.id.editText4);
        final EditText e_unvan = (EditText) findViewById(R.id.editText5);
        final EditText e_tac_yuk = (EditText) findViewById(R.id.editText6);
        final EditText e_top_yuk = (EditText) findViewById(R.id.editText7);
        final EditText e_yat_gen = (EditText) findViewById(R.id.editText8);
        final EditText e_yuk_fark = (EditText) findViewById(R.id.editText9);
        final Button insert = (Button) findViewById(R.id.button1);

        insert.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                il = e_il.getSelectedItem().toString();
                ilce = e_ilce.getSelectedItem().toString();
                mahalle = e_mahalle.getText().toString();
                sokak = e_sokak.getText().toString();
                raportor = e_raportor.getText().toString();
                kurum = e_kurum.getText().toString();
                unvan = e_unvan.getText().toString();
                tac_yuk = e_tac_yuk.getText().toString();
                top_yuk = e_top_yuk.getText().toString();
                yat_gen = e_yat_gen.getText().toString();
                yuk_fark = e_yuk_fark.getText().toString();

                insert();

            }
        });

    }

    private void insert() {

        ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
        nameValuePairs.add(new BasicNameValuePair("il", il));
        nameValuePairs.add(new BasicNameValuePair("ilce", ilce));
        nameValuePairs.add(new BasicNameValuePair("mahalle", mahalle));
        nameValuePairs.add(new BasicNameValuePair("sokak", sokak));
        nameValuePairs.add(new BasicNameValuePair("raportor", raportor));
        nameValuePairs.add(new BasicNameValuePair("kurum", kurum));
        nameValuePairs.add(new BasicNameValuePair("unvan", unvan));
        nameValuePairs.add(new BasicNameValuePair("tac_yuk", tac_yuk));
        nameValuePairs.add(new BasicNameValuePair("top_yuk", top_yuk));
        nameValuePairs.add(new BasicNameValuePair("yat_gen", yat_gen));
        nameValuePairs.add(new BasicNameValuePair("yuk_fark", yuk_fark));

        try {
            HttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost("http://127.0.0.1/heyapp/insert.php");
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            is = entity.getContent();
            Log.e("pass 1", "connection success");

        } catch (Exception e) {
            Log.e("Fail 1", e.toString());
            Toast.makeText(getApplicationContext(), "Invalid IP Adress",
                    Toast.LENGTH_LONG).show();

        }

        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(is, "iso-8859-1"), 8);
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }

            is.close();
            result = sb.toString();
            Log.e("pass 2", "connection success");
        } catch (Exception e) {
            Log.e("Fail 2", e.toString());
        }
        try {

            JSONObject json_data = new JSONObject(result);
            code = (json_data.getInt("code"));

            if (code == 1) {

                Toast.makeText(getBaseContext(), "Inserted Successfully",
                        Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            Log.e("Fail 3", e.toString());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}

