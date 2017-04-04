package com.example.alumnos.hndalvarogomez.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.alumnos.hndalvarogomez.R;
import com.example.alumnos.hndalvarogomez.beans.ObjetoBean;
import com.example.alumnos.hndalvarogomez.beans.TipsBean;

import java.util.List;

/**
 * Created by ALUMNOS on 30/03/2017.
 */

public class TipsAdapter  extends ArrayAdapter<TipsBean> {
    private Context context;
    private int resource;
    private List<TipsBean> objects;

    public TipsAdapter(Context context, int resource, List<TipsBean> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource = resource;
        this.objects=objects;
    }

    class ViewHolder{
        TextView txtTips;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder;

        if (view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(resource, null);
            viewHolder.txtTips = (TextView) view.findViewById(R.id.txtTips);

            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        TipsBean tipsBean = objects.get(position);

        viewHolder.txtTips.setText(tipsBean.getTitulo());

        return view;
    }
}
