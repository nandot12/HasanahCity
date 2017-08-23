package com.krearive.hasanahnew.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.krearive.hasanahnew.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FasilitasFragment extends Fragment {

    int[] imageFasilitas = new int[]{
            R.drawable.fasilitas01,
            R.drawable.fasilitas02,
            R.drawable.fasilitas03,
            R.drawable.fasilitas04,
            R.drawable.fasilitas05,
            R.drawable.fasilitas06,
            R.drawable.fasilitas07,
            R.drawable.fasilitas08,
            R.drawable.fasilitas09,
            R.drawable.fasilitas10,
            R.drawable.fasilitas11
    };

    String[] judulFasilitas = new String[] {
            "Play Ground",
            "Danau Alami",
            "Rumah Sehat",
            "Kolam Renang",
            "Ruko Komersil",
            "Masjid",
            "Fasilitas Berkuda",
            "Fasilitas Memanah",
            "Sport Center & Gym",
            "Fasilitas Bhs Arab dan Tahfidz Quran",
            "Rumah Belajar dan Bermain"
    };

    private SliderLayout fasilitasSlider;
    private ListView listView;
    private ArrayAdapter adapter;

    public FasilitasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootview = inflater.inflate(R.layout.fragment_fasilitas, container, false);

        fasilitasSlider = (SliderLayout) rootview.findViewById(R.id.slider);
        for(int i = 0 ; i < imageFasilitas.length ; i++){
            TextSliderView textSliderView = new TextSliderView(getActivity());
            textSliderView
                    .image(imageFasilitas[i])
                    .setScaleType(BaseSliderView.ScaleType.Fit);
            fasilitasSlider.addSlider(textSliderView);
        }
        fasilitasSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        fasilitasSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        fasilitasSlider.setCustomAnimation(new DescriptionAnimation());
        fasilitasSlider.setDuration(5000);

        // https://github.com/daimajia/AndroidImageSlider

        listView = (ListView) rootview.findViewById(R.id.listView);
        adapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, judulFasilitas);
        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                fasilitasSlider.setCurrentPosition(position);
//            }
//        });

        return rootview;
    }

    @Override
    public void onStop() {
        fasilitasSlider.stopAutoCycle();
        super.onStop();
    }
}
