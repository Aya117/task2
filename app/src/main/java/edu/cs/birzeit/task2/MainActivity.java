package edu.cs.birzeit.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText edtName;
private EditText edtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName=findViewById(R.id.edtName);
        edtPassword=findViewById(R.id.edtPassword);
    }

    public void btnSubmetOnClick(View view) {
        String name=edtName.getText().toString();
        String pass=edtPassword.getText().toString();
        String msg= "name :" + name + ", pass: "+ pass;
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }
}