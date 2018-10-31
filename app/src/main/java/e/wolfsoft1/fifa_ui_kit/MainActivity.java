package e.wolfsoft1.fifa_ui_kit;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }




    @Override
    public void onClick(View v) {


        switch(v.getId()){

            case R.id.btn1:


                final Dialog myDialog = new Dialog(MainActivity.this, R.style.NewDialog);
                myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog.setCancelable(true);
                myDialog.setContentView(R.layout.france);
                myDialog.show();
                myDialog.setCanceledOnTouchOutside(true);


                break;

            case R.id.btn2:

                final Dialog myDialog1 = new Dialog(MainActivity.this, R.style.NewDialog);
                myDialog1.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog1.setCancelable(true);
                myDialog1.setContentView(R.layout.france);
                myDialog1.show();


                break;

            case R.id.btn3:

                final Dialog myDialog2 = new Dialog(MainActivity.this, R.style.NewDialog);
                myDialog2.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog2.setCancelable(true);
                myDialog2.setContentView(R.layout.france);
                myDialog2.show();

                break;



        }
    }
}
