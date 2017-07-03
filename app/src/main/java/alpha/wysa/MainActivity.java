package alpha.wysa;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView titleText = (TextView)findViewById(R.id.titleText);
        TextView midText = (TextView)findViewById(R.id.midText);
        TextView belowtext = (TextView)findViewById(R.id.belowText);


        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Handwritten_Crystal_v2.ttf");

        titleText.setTypeface(custom_font);
        midText.setTypeface(custom_font);
        belowtext.setTypeface(custom_font);



    }
}
