package e.wolfsoft1.fifa_ui_kit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Groups extends AppCompatActivity  implements View.OnClickListener {
    LinearLayout linear1,linear2,linear3,linear4,linear5;
    TextView text1,text2,text3,text4,text5;
    ImageView image1,image2,image3,image4,image5;



    @Override
    protected void onCreate(Bundle savedInstanceState)   {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);


        linear1 = findViewById(R.id.linear1);
        linear2 = findViewById(R.id.linear2);
        linear3 = findViewById(R.id.linear3);
        linear4 = findViewById(R.id.linear4);
        linear5 = findViewById(R.id.linear5);


        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);



        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);



        linear1.setOnClickListener(this);
        linear2.setOnClickListener(this);
        linear3.setOnClickListener(this);
        linear4.setOnClickListener(this);
        linear5.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.linear1:

                text1.setTextColor(Color.parseColor("#d0be94"));
                text2.setTextColor(Color.parseColor("#ccd0dd"));
                text3.setTextColor(Color.parseColor("#ccd0dd"));
                text4.setTextColor(Color.parseColor("#ccd0dd"));
                text5.setTextColor(Color.parseColor("#ccd0dd"));

//                image1.setColorFilter(Color.parseColor("#d0be94"));
                image2.setColorFilter(Color.parseColor("#00000000"));
                image3.setColorFilter(Color.parseColor("#00000000"));
                image4.setColorFilter(Color.parseColor("#00000000"));
                image5.setColorFilter(Color.parseColor("#00000000"));

                break;

            case R.id.linear2:

                text1.setTextColor(Color.parseColor("#ccd0dd"));
                text2.setTextColor(Color.parseColor("#d0be94"));
                text3.setTextColor(Color.parseColor("#ccd0dd"));
                text4.setTextColor(Color.parseColor("#ccd0dd"));
                text5.setTextColor(Color.parseColor("#ccd0dd"));

                image1.setColorFilter(Color.parseColor("#00000000"));
                image2.setColorFilter(Color.parseColor("#d0be94"));
                image3.setColorFilter(Color.parseColor("#00000000"));
                image4.setColorFilter(Color.parseColor("#00000000"));
                image5.setColorFilter(Color.parseColor("#00000000"));

                break;

            case R.id.linear3:

                text1.setTextColor(Color.parseColor("#ccd0dd"));
                text2.setTextColor(Color.parseColor("#ccd0dd"));
                text3.setTextColor(Color.parseColor("#d0be94"));
                text4.setTextColor(Color.parseColor("#ccd0dd"));
                text5.setTextColor(Color.parseColor("#ccd0dd"));


                image1.setColorFilter(Color.parseColor("#00000000"));
                image2.setColorFilter(Color.parseColor("#00000000"));
                image3.setColorFilter(Color.parseColor("#d0be94"));
                image4.setColorFilter(Color.parseColor("#00000000"));
                image5.setColorFilter(Color.parseColor("#00000000"));

                break;

            case R.id.linear4:

                text1.setTextColor(Color.parseColor("#ccd0dd"));
                text2.setTextColor(Color.parseColor("#ccd0dd"));
                text3.setTextColor(Color.parseColor("#ccd0dd"));
                text4.setTextColor(Color.parseColor("#d0be94"));
                text5.setTextColor(Color.parseColor("#ccd0dd"));

                image1.setColorFilter(Color.parseColor("#00000000"));
                image2.setColorFilter(Color.parseColor("#00000000"));
                image3.setColorFilter(Color.parseColor("#00000000"));
                image4.setColorFilter(Color.parseColor("#d0be94"));
                image5.setColorFilter(Color.parseColor("#00000000"));

                break;

            case R.id.linear5:

                text1.setTextColor(Color.parseColor("#ccd0dd"));
                text2.setTextColor(Color.parseColor("#ccd0dd"));
                text3.setTextColor(Color.parseColor("#ccd0dd"));
                text4.setTextColor(Color.parseColor("#ccd0dd"));
                text5.setTextColor(Color.parseColor("#d0be94"));



                image1.setColorFilter(Color.parseColor("#00000000"));
                image2.setColorFilter(Color.parseColor("#00000000"));
                image3.setColorFilter(Color.parseColor("#00000000"));
                image4.setColorFilter(Color.parseColor("#00000000"));
                image5.setColorFilter(Color.parseColor("#d0be94"));

                break;

        }
    }

}
