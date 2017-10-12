package com.example.vudinhai.project_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img;
    Button btn_previous, btn_next;
    TextView txtContent, txtNumber, txtArticle;

    ArrayList<Integer> arrImage = new ArrayList<>();

    ArrayList<String> arrContent = new ArrayList<>();
    int position;
    int p_number;

    int pos = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        addControl();
        addEvent();
    }



    private void addEvent() {
        img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(arrImage.get(position));

        txtArticle = (TextView) findViewById(R.id.textView3);
        txtArticle.setText(arrContent.get(position));

        txtContent = (TextView) findViewById(R.id.textView);
        txtContent.setText(arrContent.get(position));

        txtNumber = (TextView) findViewById(R.id.textView2);
        txtNumber.setText(p_number + " of " + arrImage.size());


    }


    private void initData() {
        arrImage.add(R.drawable.a01);
        arrImage.add(R.drawable.a02);
        arrImage.add(R.drawable.a03);
        arrImage.add(R.drawable.a04);
        arrImage.add(R.drawable.a05);
        arrImage.add(R.drawable.a06);
        arrImage.add(R.drawable.a07);
        arrImage.add(R.drawable.a08);
        arrImage.add(R.drawable.a09);
        arrImage.add(R.drawable.a10);
        arrImage.add(R.drawable.a11);

        arrContent.add("Android 1.5 announced on April 27, 2009 was the first release to officially use a codename based on a dessert and it was called Cupcake. It included several new UI features (Source: Google)");
        arrContent.add("Android 1.6 codenamed Donut was announced on September 15, 2009 introduced voice and text entry search with multi-lingual speech synthesizer and support for WVGA screen (Source: Android)");
        arrContent.add("Android called version 2.0 - 2.1 as Eclair which brought in support for Microsoft Exchange and Bluetooth 2.1 (Source: Google)");
        arrContent.add("Android released version 2.2 called Froyo (or Frozen Yogurt) on May 20, 2010 with speed, memory and performance optimizations. It included support for upto 320 ppi displays and introduced Wi-Fi tethering (Source: Google)");
        arrContent.add("Android version 2.3 was released on December 6, 2010 and Google called it Gingerbread. Gingerbread supported large screens and resolutions WXGA and higher. It had an improved Download Manager and improved virtual keyboard. Google launched Nexus S running Gingerbread as the platform reference device (Source: Google)");
        arrContent.add("Android version 3.0 was called Honeycomb and it served as a first tablet only update. Motorola Xoom tablet was the first device to feature the new OS. It has a holographic user interface and simplified multitasking feature (Source: Google)");
        arrContent.add("Android 4.0 released on October 19, 2011 was named Ice Cream Sandwich it brought backward compatibility with any device running version 2.3 Gingerbread. It supported Robonto font and drag-and-drop functionality. The major addition being the ability to access apps from lock screen (Source: Google)");
        arrContent.add("Android 4.1 was announced at Google I/O on June 27, 2012 as Jelly Bean. It projected Google's 'Project Butter' effort aimed to smoothen the functionality and performance of user interface. Android version 4.1 - 4.3.1 was called Jelly Bean (Source: Google)");
        arrContent.add("Android version 4.4 initially known as Key Lime Pie was later released on September 3, 2013 as KitKat. Google released Nexus 5 based on Android KitKat on October 31, 2013. It supported native IR blaster, Wi-Fi and mobile data activity indicators and Android runtime which replaced Dalvik virtual engine (Source: Google)");
        arrContent.add("Android 5.0 Lollipop was initially shown as 'Android L' on June 25, 2014 and officially made available on November 12, 2014. It introduced material design with OpenGL ES 3.1 support and refreshed lock screen (Source: Google)");
        arrContent.add("Android M was initially announced as developer preview at Google I/O on May 28, 2015. Now Google has officially confirmed the name as Marshmallow. Marshmallow brings battery improverment with Doze, native support for fingerprint scanner and Google Now on Tap will give users information without leaving an app (Source: Google)");

        position = 0;
        p_number = position + 1;

    }


    private void addControl() {



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_next:
                position += 1;
                p_number = position + 1;
                if (position > 10) {
                    position = 0;
                    p_number = position + 1;
                }

                img.setImageResource(arrImage.get(position));
                txtContent.setText(arrContent.get(position));
                txtArticle.setText(arrContent.get(position));
                txtNumber.setText(p_number + " of " + arrImage.size());

                break;
            case R.id.btn_previous:
                position -= 1;
                p_number = position + 1;
                if (position < 0) {
                    position = 10;
                    p_number = position + 1;
                }
                img.setImageResource(arrImage.get(position));
                txtContent.setText(arrContent.get(position));
                txtArticle.setText(arrContent.get(position));
                txtNumber.setText(p_number + " of " + arrImage.size());
                break;
        }
    }
}
