package com.example.doodleblue_project.adapters;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doodleblue_project.R;

import java.util.ArrayList;
import java.util.List;

public class AvailableFragment extends Fragment {

    private RecyclerView myrecyclerview;
    private List<AvailableListItem> availablelst;



    public AvailableFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_available, container, false);
        myrecyclerview = (RecyclerView) view.findViewById(R.id.availableView);
        AvailableAdapter availableAdapter = new AvailableAdapter(getContext(),availablelst);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(availableAdapter);
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        availablelst =new ArrayList<>();
        availablelst.add(new AvailableListItem("Linen Dress White no pattern","4.5","US","XS","$100","29 mar to 04 may","Alice Ray"));
        availablelst.add(new AvailableListItem("Grey Coat Wool","4","IN","XL","$199","29 mar to 04 may","Alice Ray"));
        availablelst.add(new AvailableListItem("Slim dress pink flower","5","US","XS","$100","29 mar to 04 may","Alice Ray"));
        availablelst.add(new AvailableListItem("Linen Dress Grey","4.5","US","XS","$100","29 mar to 04 may","Alice Ray"));
        availablelst.add(new AvailableListItem("Bottom Fit","4","US","XS","$100","29 mar to 04 may","Alice Ray"));
        availablelst.add(new AvailableListItem("Size Free","5","US","XS","$111","29 mar to 04 may","Alice Ray"));
        availablelst.add(new AvailableListItem("Pure Cotton","3","US","XS","$155","29 mar to 04 may","Alice Ray"));
        availablelst.add(new AvailableListItem("Synthrtic Fibre","1","UK","XL","$129","29 mar to 04 may","Alice Ray"));
        availablelst.add(new AvailableListItem("Wool Grey","5","US","XS","$199","29 mar to 04 may","Alice Ray"));
        availablelst.add(new AvailableListItem("Linen Dress Pink","4.5","US","XS","$100","29 mar to 04 may","Alice Ray"));
    }


}