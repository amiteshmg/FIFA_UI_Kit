package e.wolfsoft1.fifa_ui_kit;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import com.nhaarman.supertooltips.ToolTip;
import com.nhaarman.supertooltips.ToolTipRelativeLayout;
import com.nhaarman.supertooltips.ToolTipView;
import com.tooltip.Tooltip;

public class Walkthrough_Acitivity extends AppCompatActivity {

    ToolTipView myToolTipView;

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.walkthrough_main_xml);

        image = findViewById(R.id.image);

//
//        image.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                @SuppressLint("ResourceType") Tooltip.Builder builder = new Tooltip.Builder(v, R.style.Tooltip2)
//                        .setCancelable(true)
//                        .setDismissOnClick(false)
//                        .setCornerRadius(20f)
//                        .setGravity(Gravity.BOTTOM);
//
//                builder.show();
//            }
//        });

//
//        ToolTipRelativeLayout toolTipRelativeLayout = (ToolTipRelativeLayout) findViewById(R.id.activity_main_tooltipRelativeLayout);
//
//        ToolTip toolTip = new ToolTip()
//                .withText("A beautiful View")
//                .withColor(Color.RED)
//                .withShadow();
//
//        myToolTipView = toolTipRelativeLayout.showToolTipForView(toolTip, findViewById(R.id.image));
//        myToolTipView.setOnToolTipViewClickedListener(Walkthrough_Acitivity.this);
    }





//    @Override
//    public void onToolTipViewClicked(ToolTipView toolTipView) {
//
//    }
}
