package my.tutorial.tutorial5part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void part1(View view)
    {
        startActivity(new Intent(MainActivity.this, Part1.class));

    }

    public void part2(View view)
    {
        startActivity(new Intent(MainActivity.this, Part2.class));

    }
}