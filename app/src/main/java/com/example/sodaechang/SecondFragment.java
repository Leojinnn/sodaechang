package com.example.sodaechang;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sodaechang.model.BrandInfo;

/**
 * A fragment representing a list of Items.
 */
public class SecondFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    RecyclerView recyclerView;
    BrandRecyclerViewAdapter adapter;
    Context context;


    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public SecondFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static SecondFragment newInstance(int columnCount) {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second_list, container, false);

        // Set the adapter
//        if (view instanceof RecyclerView) {
//            Context context = view.getContext();
//            RecyclerView recyclerView = (RecyclerView) view;
//            if (mColumnCount <= 1) {
//                recyclerView.setLayoutManager(new LinearLayoutManager(context));
//            } else {
//                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
//            }
//            recyclerView.setAdapter(new BrandRecyclerViewAdapter(PlaceholderContent.ITEMS));
//        }
//        return view;
//    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}