package com.example.alumnos.hndalvarogomez.activities;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alumnos.hndalvarogomez.R;
import com.example.alumnos.hndalvarogomez.beans.ObjetoBean;
import com.example.alumnos.hndalvarogomez.beans.TipsBean;
import com.example.alumnos.hndalvarogomez.fragments.ObjetosFragment;
import com.example.alumnos.hndalvarogomez.fragments.TipsFragment;

public class TipsActivity extends AppCompatActivity {

    private TextView txtTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        TipsBean tipsBean = (TipsBean) getIntent().getSerializableExtra(TipsFragment.TIPS_KEY);


        txtTips = (TextView) findViewById(R.id.txtTips);

        txtTips.setText(tipsBean.getDescripcion());


    }
}
