package joshuawink.nix;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView timeRemaining = (TextView)findViewById(R.id.timeRemaining);
        Button startButton = (Button)findViewById(R.id.startButton);






        final CountDownTimer countDown = new CountDownTimer(300000, 1000){

            @Override
            public void onTick(long millisUntilFinished) {

                timeRemaining.setText("Time Remaining until alerts are sent" +
                                       millisUntilFinished / 1000);
            };

            @Override
            public void onFinish() {
                timeRemaining.setText("finished");
            }
        };

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDown.start();
            }
        });


    }



}
