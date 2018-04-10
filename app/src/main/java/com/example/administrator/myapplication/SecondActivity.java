package com.example.administrator.myapplication;

import android.content.Intent;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.myapplication.com.examlpe.administrator.myapplication.model.ActivityCollector;
import com.example.administrator.myapplication.com.examlpe.administrator.myapplication.model.BaseActivity;

public class SecondActivity extends BaseActivity {

    private Button button2;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//        intent = getIntent();
//        String data = intent.getStringExtra("extra_data");
//        Toast.makeText(SecondActivity.this,data,Toast.LENGTH_SHORT).show();
        button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
//                intent = new Intent();
//                intent.putExtra("data_return","Hello FirstActivity");
//                setResult(RESULT_OK,intent);
//                finish();
                ActivityCollector.finishAll();
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }
}
