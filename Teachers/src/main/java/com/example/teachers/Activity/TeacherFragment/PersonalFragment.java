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

import com.example.teachers.Mine.MineGoodActivity;
import com.example.teachers.Mine.MinePersonActivity;
import com.example.teachers.R;

public class PersonalFragment extends Fragment {

    private Button btnGood;
    private Button btnMine;
    private Button btnSignin;
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

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(),MinePersonActivity.class);
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

        return view;
    }


}
