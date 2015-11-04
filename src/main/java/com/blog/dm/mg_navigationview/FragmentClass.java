package com.blog.dm.mg_navigationview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by axdesousa on 27/10/15.
 */
public class FragmentClass extends Fragment {

    public FragmentClass() {
        //construtor vazio
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_novo,container,false);
        //logica

        return view;
    }
}
