package com.padcmyanmar.padc9.my_hotel_booking_application.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.padcmyanmar.padc9.my_hotel_booking_application.Adapters.RecyclerItemViewAdapter;
import com.padcmyanmar.padc9.my_hotel_booking_application.R;

public class NearByFragment extends Fragment {

    public NearByFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_nearby,container,false) ;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.rvNearBy);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));

        RecyclerItemViewAdapter recyclerItemViewAdapter = new RecyclerItemViewAdapter();
        recyclerView.setAdapter(recyclerItemViewAdapter);

    }
}
