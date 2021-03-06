package my.edu.tarc.lab2intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //define local variable
        TextView textViewMessage;
        textViewMessage = findViewById(R.id.textViewMessage);

        //Retrieve intent data
        Intent intent = getIntent();//Who called me?
        //check
        if(intent.hasExtra(MainActivity.TAG_MESSAGE)){
            String stringMsg = intent.getStringExtra(MainActivity.TAG_MESSAGE);
            textViewMessage.setText(stringMsg);
        }


    }
    public void closeActivity(View view){
        finish();
    }
}
