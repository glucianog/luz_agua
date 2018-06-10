package pucminas.com.br.luz_agua.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import pucminas.com.br.luz_agua.R;
import pucminas.com.br.luz_agua.adapters.ListAdapter;
import pucminas.com.br.luz_agua.model.OurData;


public class HolderFragment extends Fragment {

    ListAdapter adapter;
    List<OurData> dataList;


    public HolderFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment HolderFragment.
     */
    public static HolderFragment newInstance() {
        return new HolderFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_holder, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recicler_holder);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataList = new ArrayList<>();
        addData();

        adapter = new ListAdapter(getContext(),dataList);
        recyclerView.setAdapter(adapter);

        return view;
    }


    /**
     * Aqui será feito a inserção dos dados buscados do Firebase
     */
    private void addData() {

        dataList.add(new OurData("Liu Yang","999.999.999-99"));
        dataList.add(new OurData("SCC Corpo", "80.699.229/0001-04"));
        dataList.add(new OurData("Zézin", "555.555.555-55"));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


}