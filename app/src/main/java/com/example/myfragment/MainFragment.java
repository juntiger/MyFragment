package com.example.myfragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {

    Button btn_main;
    MainActivity mainActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //mainActivity = new MainActivity();
        View view = inflater.inflate(R.layout.fragment_main, container,false);
        btn_main = view.findViewById(R.id.button_main);
        btn_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.changeFragment(0);
            }
        });

        return view;
    }

    //생명주기에서 가장 먼저 실행됨
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        mainActivity = (MainActivity)getActivity();
    }
}
