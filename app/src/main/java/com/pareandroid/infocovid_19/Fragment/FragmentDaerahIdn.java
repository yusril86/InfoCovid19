package com.pareandroid.infocovid_19.Fragment;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.pareandroid.infocovid_19.Model.ModelDaerahIdn;
import com.pareandroid.infocovid_19.R;
import com.pareandroid.infocovid_19.view.ViewDaerah;

import java.util.ArrayList;
import java.util.List;

public class FragmentDaerahIdn extends Fragment {
    private ProgressDialog progressDialog;
    public FragmentDaerahIdn() {
        // Required empty public constructo
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view =inflater.inflate(R.layout.fragment_daerah_idn, container, false);

        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setTitle("Mohon Tunggu...");
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Sedang Menampilkan Data...");
        progressDialog.show();

//        ModelDaerahIdn modelDaerahIdn = new ModelDaerahIdn();


        final PieChart pieChart =  view.findViewById(R.id.idnSummaryPie);
        ViewDaerah viewmodelDaerahIdn = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(ViewDaerah.class);
        viewmodelDaerahIdn.setDataDaerah();
        viewmodelDaerahIdn.getDataDaerah().observe(this, new Observer<ModelDaerahIdn>() {
            @Override
            public void onChanged(ModelDaerahIdn modelDaerahIdn) {
                progressDialog.dismiss();

                List<PieEntry> pieEntries= new ArrayList<>();
                pieEntries.add(new PieEntry(Integer.parseInt(modelDaerahIdn.getPositif()),getResources().getString(R.string.confirmed)));
                pieEntries.add(new PieEntry(Integer.parseInt(modelDaerahIdn.getPositif()),getResources().getString(R.string.confirmed)));
                pieEntries.add(new PieEntry(Integer.parseInt(modelDaerahIdn.getSembuh()),getResources().getString(R.string.recovered)));

//                pieEntries.add(new PieEntry(modelDaerahIdn.getIdnConfirmed().getValue(),getResources().getString(R.string.confirmed)));
//                pieEntries.add(new PieEntry(modelDaerahIdn.getIdnDeaths().getValue(),getResources().getString(R.string.deaths)));

                PieDataSet pieDataSet = new PieDataSet(pieEntries,getResources().getString(R.string.from_corona));
                pieDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
                pieDataSet.setValueTextColor(Color.WHITE);
                pieDataSet.setValueTextSize(14);

                Description description = new Description();
                description.setText(getResources().getString(R.string.last_update)+" : "  );
                description.setTextColor(Color.BLACK);
                description.setTextSize(12);

                Legend legend = pieChart.getLegend();
                legend.setTextColor(Color.BLACK);
                legend.setTextSize(12);
                legend.setForm(Legend.LegendForm.SQUARE);

                PieData pieData = new PieData(pieDataSet);
                pieChart.setVisibility(View.VISIBLE);
                pieChart.animateXY(2000, 2000);
                pieChart.setDescription(description);
                pieChart.setHoleRadius(60);
                pieChart.setRotationAngle(130);
                pieChart.setHoleColor(Color.TRANSPARENT);
                pieChart.setData(pieData);
            }
        });


        return view;
    }
}
