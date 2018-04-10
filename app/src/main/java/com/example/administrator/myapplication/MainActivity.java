package com.example.administrator.myapplication;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    private Intent intent;
    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        button = (Button)findViewById(R.id.button_1);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                String data = "hello secdond";
////                intent = new Intent(MainActivity.this,SecondActivity.class);
//////                intent.putExtra("extra_data",data);
////                startActivityForResult(intent,1);
//            }
//        });


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_1:
//                dialog = new AlertDialog.Builder(MainActivity.this);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                if (resultCode == RESULT_OK){
                    String data1 = data.getStringExtra("data_return");
                    Toast.makeText(MainActivity.this,data1,Toast.LENGTH_SHORT).show();
                }
                break;
            default:
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"you clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"you clicked remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}
