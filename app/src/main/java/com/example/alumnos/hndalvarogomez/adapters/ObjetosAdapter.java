package com.example.alumnos.hndalvarogomez.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alumnos.hndalvarogomez.R;
import com.example.alumnos.hndalvarogomez.beans.NaveBean;
import com.example.alumnos.hndalvarogomez.beans.ObjetoBean;

import java.util.List;

/**
 * Created by ALUMNOS on 30/03/2017.
 */

public class ObjetosAdapter  extends ArrayAdapter<ObjetoBean> {

    private Context context;
    private int resource;
    private List<ObjetoBean> objects;

    public ObjetosAdapter(Context context, int resource, List<ObjetoBean> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource = resource;
        this.objects=objects;
    }
    class ViewHolder{

        ImageView imgObjeto;
        TextView nombreObjeto;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ObjetosAdapter.ViewHolder viewHolder;

        if(view==null){
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(resource,null);
            viewHolder.imgObjeto = (ImageView) view.findViewById(R.id.imgObjeto);
            viewHolder.nombreObjeto = (TextView) view.findViewById(R.id.nombreObjeto);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ObjetosAdapter.ViewHolder) view.getTag();
        }

        ObjetoBean objetoBean = objects.get(position);

        viewHolder.imgObjeto.setImageDrawable(ContextCompat.getDrawable(context, objetoBean.getFoto()));
        viewHolder.nombreObjeto.setText(objetoBean.getNombre());




        return view;
    }
}
