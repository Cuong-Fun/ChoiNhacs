package dumv.com.choinhacs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Mactivity_main);
    }

    public void click(View view) {
        Toast.makeText(this,"mai yeu mit thy",Toast.LENGTH_SHORT).show();
    }
}
