package com.application.newsapp;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TechnologyFragment extends Fragment
{
    @Nullable
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        View v=getLayoutInflater().inflate(R.layout.technologyfragment, null);
    }
}
