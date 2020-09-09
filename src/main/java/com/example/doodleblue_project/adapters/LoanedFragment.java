package com.example.doodleblue_project.adapters;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.doodleblue_project.R;

import java.util.ArrayList;
import java.util.List;


public class LoanedFragment extends Fragment {
private RecyclerView myrecyclerview;
private List<LoanedListItems> loanedLst;
    public LoanedFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_loaned, container, false);
        myrecyclerview = (RecyclerView) view.findViewById(R.id.loanedRecycleView);
        LoanedAdapter loanedAdapter = new LoanedAdapter(getContext(),loanedLst);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));



        myrecyclerview.setAdapter(loanedAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loanedLst =new ArrayList<>();
        loanedLst.add(new LoanedListItems("Linen Dress White no pattern","4.5","US","XS","$100","29 mar to 04 may","Alice Ray"));
        loanedLst.add(new LoanedListItems("Grey Coat Wool","4","IN","XL","$199","29 mar to 04 may","Alice Ray"));
        loanedLst.add(new LoanedListItems("slim dress pink flower","5","US","XS","$100","29 mar to 04 may","Alice Ray"));
        loanedLst.add(new LoanedListItems("Linen Dress Grey","4.5","US","XS","$100","29 mar to 04 may","Alice Ray"));
    }
}