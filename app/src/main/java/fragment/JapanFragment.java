package fragment;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.nhaarman.supertooltips.ToolTip;
import com.nhaarman.supertooltips.ToolTipRelativeLayout;
import com.nhaarman.supertooltips.ToolTipView;

import e.wolfsoft1.fifa_ui_kit.MainActivity;
import e.wolfsoft1.fifa_ui_kit.R;
import e.wolfsoft1.fifa_ui_kit.Walkthrough_Acitivity;

public class JapanFragment extends android.support.v4.app.Fragment implements  View.OnClickListener {



    LinearLayout player1,player2,player3,player4,player5,player6,player7,player8,player9,player10,player11;

//    FrameLayout frame;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.temp, container, false);


        player1 = view.findViewById(R.id.player1);
        player2 = view.findViewById(R.id.player2);
        player3 = view.findViewById(R.id.player3);
        player4 = view.findViewById(R.id.player4);
        player5 = view.findViewById(R.id.player5);

        player6 = view.findViewById(R.id.player6);
        player7 = view.findViewById(R.id.player7);
        player8 = view.findViewById(R.id.player8);
        player9 = view.findViewById(R.id.player9);
        player10 = view.findViewById(R.id.player10);
        player11 = view.findViewById(R.id.player11);

//        frame = view.findViewById(R.id.frame);
//        frame.setVisibility(View.VISIBLE);
//



        player1.setOnClickListener(this);
        player2.setOnClickListener(this);
        player3.setOnClickListener(this);
        player4.setOnClickListener(this);
        player5.setOnClickListener(this);
        player6.setOnClickListener(this);
        player7.setOnClickListener(this);
        player8.setOnClickListener(this);
        player9.setOnClickListener(this);
        player10.setOnClickListener(this);
        player11.setOnClickListener(this);




        return view;
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.player1:


                final Dialog myDialog = new Dialog(getActivity(), R.style.NewDialog);
                myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog.setCancelable(true);
                myDialog.setContentView(R.layout.france);
                myDialog.show();
                myDialog.setCanceledOnTouchOutside(true);


                break;

            case R.id.player2:

                final Dialog myDialog1 = new Dialog(getActivity(), R.style.NewDialog);
                myDialog1.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog1.setCancelable(true);
                myDialog1.setContentView(R.layout.france);
                myDialog1.show();
                myDialog1.setCanceledOnTouchOutside(true);


                break;

            case R.id.player3:

                final Dialog myDialog2 = new Dialog(getActivity(), R.style.NewDialog);
                myDialog2.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog2.setCancelable(true);
                myDialog2.setContentView(R.layout.france);
                myDialog2.show();
                myDialog2.setCanceledOnTouchOutside(true);

                break;

            case R.id.player4:


                final Dialog myDialog3 = new Dialog(getActivity(), R.style.NewDialog);
                myDialog3.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog3.setCancelable(true);
                myDialog3.setContentView(R.layout.france);
                myDialog3.show();
                myDialog3.setCanceledOnTouchOutside(true);


                break;

            case R.id.player5:

                final Dialog myDialog4 = new Dialog(getActivity(), R.style.NewDialog);
                myDialog4.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog4.setCancelable(true);
                myDialog4.setContentView(R.layout.france);
                myDialog4.show();
                myDialog4.setCanceledOnTouchOutside(true);


                break;

            case R.id.player6:

                final Dialog myDialog5 = new Dialog(getActivity(), R.style.NewDialog);
                myDialog5.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog5.setCancelable(true);
                myDialog5.setContentView(R.layout.france);
                myDialog5.show();
                myDialog5.setCanceledOnTouchOutside(true);

                break;


            case R.id.player7:


                final Dialog myDialog6 = new Dialog(getActivity(), R.style.NewDialog);
                myDialog6.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog6.setCancelable(true);
                myDialog6.setContentView(R.layout.france);
                myDialog6.show();
                myDialog6.setCanceledOnTouchOutside(true);



                break;

            case R.id.player8:

                final Dialog myDialog7 = new Dialog(getActivity(), R.style.NewDialog);
                myDialog7.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog7.setCancelable(true);
                myDialog7.setContentView(R.layout.france);
                myDialog7.show();
                myDialog7.setCanceledOnTouchOutside(true);


                break;

            case R.id.player9:

                final Dialog myDialog8 = new Dialog(getActivity(), R.style.NewDialog);
                myDialog8.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog8.setCancelable(true);
                myDialog8.setContentView(R.layout.france);
                myDialog8.show();
                myDialog8.setCanceledOnTouchOutside(true);

                break;


            case R.id.player10:


                final Dialog myDialog9 = new Dialog(getActivity(), R.style.NewDialog);
                myDialog9.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog9.setCancelable(true);
                myDialog9.setContentView(R.layout.france);
                myDialog9.show();
                myDialog9.setCanceledOnTouchOutside(true);


                break;

            case R.id.player11:

                final Dialog myDialog10 = new Dialog(getActivity(), R.style.NewDialog);
                myDialog10.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog10.setCancelable(true);
                myDialog10.setContentView(R.layout.france);
                myDialog10.show();
                myDialog10.setCanceledOnTouchOutside(true);


                break;




        }
    }
}
