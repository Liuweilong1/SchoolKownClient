package com.example.teachers.Activity.TeacherFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.teachers.Mine.MineActivity_help;
import com.example.teachers.Mine.MineActivity_setup;
import com.example.teachers.Mine.MineGoodActivity;
import com.example.teachers.Mine.MinePersonActivity;
import com.example.teachers.R;

public class PersonalFragment extends Fragment {

    private Button btnGood;
    private Button btnMine;
    private Button btnSignin;
    private Button btnSet;
    private Button btnHelp;
    private Button btnGetback;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_mine,container,false);

        btnMine = view.findViewById(R.id.btn_mine);
        btnMine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(),MinePersonActivity.class);
                startActivity(intent);
            }
        });

        btnSignin = view.findViewById(R.id.btn_signIn);
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), MineActivity_setup.class);
                startActivity(intent);
            }
        });

        btnGood = view.findViewById(R.id.btn_good);
        btnGood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(),MineGoodActivity.class);
                startActivity(intent);
            }
        });

        btnSet = view.findViewById(R.id.btn_set);
        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(),MineActivity_setup.class);
                startActivity(intent);
            }
        });

        btnHelp = view.findViewById(R.id.btn_help);
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), MineActivity_help.class);
                startActivity(intent);
            }
        });

        btnGetback = view.findViewById(R.id.btn_getBack);
        btnGetback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(),MineActivity_setup.class);
                startActivity(intent);
            }
        });
        return view;
    }


}
