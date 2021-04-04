package com.example.saisons.ui.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.saisons.R;

public class MenuFragment extends Fragment {
    // Les champs utilisés par chaque Fragment
    //Ils sont distincts pour chaque NatureFragment instancié
    private String title;
    private int page;


    /**
     * Pour la sauvegarde et la récupération des données
     * dans un Bundle
     */
    private static final String ARG_SECTION_NUMBER = "numero_page";
    private static final String ARG_SECTION_TITLE = "titre_page";

    /**
     * Retourne une nouvelle instance de ce fragment
     * pour le numéro de section donné.
     */
    public static PlaceholderFragment newInstance(int position, String title) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, position);
        args.putString(ARG_SECTION_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    // retrouver les valeurs des champs à partir du bundle
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(ARG_SECTION_NUMBER, 0);
        title = getArguments().getString(ARG_SECTION_TITLE);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        ViewPager viewPager = this.getActivity().findViewById(R.id.view_pager);
        System.out.println("View pager"+viewPager);
        viewPager.getCurrentItem();
        ImageView imageAutomne = view.findViewById(R.id.imageAutomne);
        imageAutomne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("automne click");
                viewPager.setCurrentItem(3);
            }
        });
        ImageView imageEte = view.findViewById(R.id.imageEte);
        imageEte.setOnClickListener(v -> viewPager.setCurrentItem(2));
        ImageView imageHiver = view.findViewById(R.id.imageHiver);
        imageHiver.setOnClickListener(v -> viewPager.setCurrentItem(4));
        ImageView imagePrintemps = view.findViewById(R.id.imagePrintemps);
         imagePrintemps.setOnClickListener(v -> viewPager.setCurrentItem(1));
        return view;
    }
}
