package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import e.wolfsoft1.fifa_ui_kit.Country;
import e.wolfsoft1.fifa_ui_kit.Facts;
import e.wolfsoft1.fifa_ui_kit.Groups;
import e.wolfsoft1.fifa_ui_kit.Lineups;
import e.wolfsoft1.fifa_ui_kit.R;
import e.wolfsoft1.fifa_ui_kit.Scorer;
import e.wolfsoft1.fifa_ui_kit.Statistics;
import e.wolfsoft1.fifa_ui_kit.Walkthrough_Acitivity;
import model.Model_FIFA_UI_Kit;


public class Adapter_FIFA_UI_kit_list extends RecyclerView.Adapter<Adapter_FIFA_UI_kit_list.MyViewHolder> {

    Context context;
    private List<Model_FIFA_UI_Kit> OfferList;

    public Adapter_FIFA_UI_kit_list(Context context, List<Model_FIFA_UI_Kit> offerList) {
        this.context = context;
        OfferList = offerList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);


        }

    }


    @Override
    public Adapter_FIFA_UI_kit_list.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_fifa_list, parent, false);


        return new Adapter_FIFA_UI_kit_list.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Model_FIFA_UI_Kit lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, Walkthrough_Acitivity.class);
                    context.startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(context, Country.class);
                    context.startActivity(i);
                } else if (position == 2) {
                    Intent i = new Intent(context, Scorer.class);
                    context.startActivity(i);
                } else if (position == 3) {
                    Intent i = new Intent(context, Statistics.class);
                    context.startActivity(i);
                } else if (position == 4) {
                    Intent i = new Intent(context, Lineups.class);
                    context.startActivity(i);
                } else if (position == 5) {
                    Intent i = new Intent(context, Facts.class);
                    context.startActivity(i);
                } else if (position == 6) {
                    Intent i = new Intent(context, Groups.class);
                    context.startActivity(i);
                }

            }

        });


    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


