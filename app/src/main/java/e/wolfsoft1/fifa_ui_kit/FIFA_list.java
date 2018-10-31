package e.wolfsoft1.fifa_ui_kit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.Adapter_FIFA_UI_kit_list;
import model.Model_FIFA_UI_Kit;


public class FIFA_list extends AppCompatActivity {

    private ArrayList<Model_FIFA_UI_Kit> cryptoListModelClasses;
    private RecyclerView recyclerView;
    private Adapter_FIFA_UI_kit_list bAdapter;


    private String title[] = {"1.Walkthrough", "2.Country", "3.Scorer", "4.Statistics", "5.Lineups", "6.Facts", "7.Groups"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifa_list_main);


        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(FIFA_list.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        cryptoListModelClasses = new ArrayList<>();

        for (int i = 0; i < title.length; i++) {
            Model_FIFA_UI_Kit beanClassForRecyclerView_contacts = new Model_FIFA_UI_Kit(title[i]);
            cryptoListModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new Adapter_FIFA_UI_kit_list(FIFA_list.this, cryptoListModelClasses);
        recyclerView.setAdapter(bAdapter);

    }
}
