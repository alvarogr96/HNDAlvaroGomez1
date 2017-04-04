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

import java.util.List;

/**
 * Created by ALUMNOS on 30/03/2017.
 */

public class NavesAdapter extends ArrayAdapter<NaveBean>{

    private Context context;
    private int resource;
    private List<NaveBean> objects;

    public NavesAdapter(Context context, int resource, List<NaveBean> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource = resource;
        this.objects=objects;
    }
    class ViewHolder{

        ImageView imgNave;
        TextView nombreNave;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder;

        if(view==null){
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(resource,null);
            viewHolder.imgNave = (ImageView) view.findViewById(R.id.imgNave);
            viewHolder.nombreNave = (TextView) view.findViewById(R.id.nombreNave);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }

       NaveBean naveBean = objects.get(position);

        viewHolder.imgNave.setImageDrawable(ContextCompat.getDrawable(context, naveBean.getFoto()));
        viewHolder.nombreNave.setText(naveBean.getNombre());




    return view;
    }

}
