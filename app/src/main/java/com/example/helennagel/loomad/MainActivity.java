package com.example.helennagel.loomad;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button banaan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banaan=(Button)findViewById(R.id.link);
//see tegevus võimaldab sul nupule vajutamisel avada veebileht
        banaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://et.wikipedia.org/wiki/Android_(operatsioonis%C3%BCsteem)";

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
//see tegevus võimaldab sul liikuda edasi uue activity peale/lehele kus on näha pildid
    public void pildid(View view) {
        Intent intent = new Intent(MainActivity.this, PildidActivity.class);
        startActivity(intent);
    }
}
