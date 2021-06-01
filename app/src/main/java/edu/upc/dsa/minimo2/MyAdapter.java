package edu.upc.dsa.minimo2;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<User> users;
    private Context context;
    private List<Repositorio> repositorios;

    public void setData (List<Repositorio> repositorios ){
        this.repositorios = repositorios;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new MyAdapter.ViewHolder(LayoutInflater.from(context).inflate(R.layout.rowuser_layout,parent,false));
    }
    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        Repositorio repositorio = repositorios.get(position);
        String nombre = repositorio.getName();
        String lenguage = repositorio.getLanguage();
        Log.i("G4",""+repositorio.getLanguage());
        Log.i("G4",""+repositorio.getName());
        holder.lenguage.setText(lenguage);
        holder.nombre.setText(nombre);
        

    }

    @Override
    public int getItemCount() {
        return repositorios.size();
    }



    public class ViewHolder extends  RecyclerView.ViewHolder{
        TextView lenguage;
        TextView nombre;
        public View layout;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            layout = itemView;

            lenguage = itemView.findViewById(R.id.lenguage);
            nombre = itemView.findViewById(R.id.nombre);

        }
    }

}
