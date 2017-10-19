package com.example.sebastian.webserviceturismo.models;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sebastian.webserviceturismo.R;

import java.util.List;

/**
 * Created by sebastian on 19/10/17.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    public static class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView establecimiento , entidad;
        private CardView viewcard;


        public ViewHolder(View itemView) {
            super(itemView);

            establecimiento =(TextView)itemView.findViewById(R.id.txtvEsta);
            entidad =(TextView)itemView.findViewById(R.id.txtVEnti);
            viewcard=(CardView)itemView.findViewById(R.id.viewCard);
        }
    }

    public List<Turismo> lista;

    public Adaptador(List<Turismo> lista) {
        this.lista = lista;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_view,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.establecimiento.setText(lista.get(position).getTipoDeEstablecimiento());
        holder.entidad.setText(lista.get(position).getEntidadOCargo());

        //RollIn Landing DropOut BounceIn FadeIn FlipInX RotateIn SlideInLeft ZoomIn
        //YoYo.with(Techniques.ZoomIn).playOn(holder.card);

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
