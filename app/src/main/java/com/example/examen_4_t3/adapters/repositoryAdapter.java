package com.example.examen_4_t3.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examen_4_t3.R;
import com.example.examen_4_t3.entities.Entrenador;
import com.example.examen_4_t3.R;
import com.example.examen_4_t3.entities.Entrenador;

import java.util.List;
/*
public class repositoryAdapter extends RecyclerView.Adapter<repositoryAdapter.NameViewHolder> {

    private Entrenador data;

    public repositoryAdapter(Entrenador data) {
        this.data = data;
    }

    @Override
    public NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_name,parent,false);

        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(repositoryAdapter.NameViewHolder holder, int position) {
        TextView tvNames = holder.itemView.findViewById(R.id.tvNames);
        TextView tvType = holder.itemView.findViewById(R.id.tvType);
        Entrenador value = data.get(position);

        tvNames.setText(String.valueOf(value.getNombre()));
        tvType.setText(String.valueOf(value.getTipo()));



        Button btnClick  = holder.itemView.findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), value, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return data;
    }

    class NameViewHolder extends RecyclerView.ViewHolder {

        public NameViewHolder(View itemView) {
            super(itemView);
        }
    }

}
*/