package com.example.rodrigobanegas.curso_android_acamica.adapters;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.rodrigobanegas.curso_android_acamica.R;

import java.util.LinkedList;

public class RecyclerViewExampleAdapter extends RecyclerView.Adapter<RecyclerViewExampleAdapter.RecyclerViewExampleViewHolder> {
    private LinkedList<String> lista;

    public RecyclerViewExampleAdapter(LinkedList<String> lista){
        this.lista=lista;
    }

    @Override
    public RecyclerViewExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    //        return new RecyclerViewExampleViewHolder(parent);
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_row,parent,false);
        RecyclerViewExampleViewHolder viewHolder=new RecyclerViewExampleViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewExampleViewHolder holder, int position) {
        //holder.getTextView().setText("My Text "+position);
        TextView x=(TextView) holder.getTextView().findViewById(R.id.row);
        ImageView avatar = (ImageView) holder.getTextView().findViewById(R.id.avatar);

        String texto =lista.get(position).toString();
        Glide.with(holder.avatar.getContext())
                .load(R.drawable.lupa)
                .centerCrop()
                .into(holder.avatar);

        x.setText(texto);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class RecyclerViewExampleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView textView;
        public ImageView avatar;
        private RelativeLayout parentBodyRl;

        public RecyclerViewExampleViewHolder(View v){
            super(v);
            v.setOnClickListener(this);
            this.textView=(TextView) v.findViewById(R.id.row);
            this.avatar = (ImageView) v.findViewById(R.id.avatar);
            this.parentBodyRl=(RelativeLayout)v.findViewById(R.id.parent_body_rl);
        }

        public RecyclerViewExampleViewHolder(ViewGroup parent){
            super(LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1,parent,false));
        }

        public TextView getTextView(){
            return textView;
        }

        public void onClick(View view) {
            System.out.println(textView.getText().toString());
        }
    }
}
