package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.followButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(button.getText().equals("Follow")){
                    button.setText("Unfollow");
                    Toast.makeText(MainActivity.this,"Follow",Toast.LENGTH_SHORT).show();
            }
                else{
                    button.setText("Follow");
                    Toast.makeText(MainActivity.this,"Unfollow",Toast.LENGTH_SHORT).show();
                }
        }});
    }
}
