package essths.li3.finalapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class ActivityTwo extends AppCompatActivity {
    TextView time;
    Button b;
    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();*/
        setContentView(R.layout.activity_two);



        time= findViewById(R.id.time);
        b = findViewById(R.id.btn_next);
        handler = new Handler();
        runnable=new Runnable() {
            @Override
            public void run() {
                updateTime();
                handler.postDelayed(this, 1000); // Répétez la mise à jour toutes les secondes
            }
        };
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwo.this, ActivityThree.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        handler.postDelayed(runnable, 0);
    }

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable);
    }

    private void updateTime() {
        // Obtenez l'heure actuelle
        long currentTimeMillis = System.currentTimeMillis();
        Date date = new Date(currentTimeMillis);

        // Formatez l'heure dans le format souhaité (par exemple, "HH:mm:ss")
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm", Locale.getDefault());
        String tm = sdf.format(date);

        // Mettez à jour le TextView avec l'heure actuelle
        time.setText(tm);
    }
}