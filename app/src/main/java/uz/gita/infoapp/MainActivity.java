package uz.gita.infoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("O'zbekiston");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.pele).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("INFO", 1);
            startActivity(intent);
        });
        findViewById(R.id.maradona).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("INFO", 2);
            startActivity(intent);
        });
        findViewById(R.id.ronaldinho).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("INFO", 3);
            startActivity(intent);

        });
        findViewById(R.id.ronaldo1).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("INFO", 4);
            startActivity(intent);

        });
        findViewById(R.id.ronaldo2).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("INFO", 5);
            startActivity(intent);

        });
        findViewById(R.id.messi).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("INFO", 6);
            startActivity(intent);

        });
        findViewById(R.id.neymar).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("INFO", 7);
            startActivity(intent);

        });
        findViewById(R.id.Salah).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("INFO", 8);
            startActivity(intent);

        });
        findViewById(R.id.mbappe).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("INFO", 9);
            startActivity(intent);

        });
        findViewById(R.id.haaland).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("INFO", 10);
            startActivity(intent);

        });
        findViewById(R.id.surxondaro).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("INFO", 11);
            startActivity(intent);
        });
        findViewById(R.id.tashkent).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("INFO", 12);
            startActivity(intent);
        });
        findViewById(R.id.qoraqalppoq).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("INFO", 13);
            startActivity(intent);
        });



    }
}