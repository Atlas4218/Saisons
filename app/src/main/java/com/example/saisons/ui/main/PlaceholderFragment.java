package com.example.saisons.ui.main;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.saisons.R;

/**
 * une instance de NatureFragment contient ici juste un label
 */
public class PlaceholderFragment extends Fragment {
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
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);

        switch (page){
            case 0:
                view = inflater.inflate(R.layout.fragment_menu,container,false);
                break;
            case 1:
                imageView.setImageResource(R.drawable.printemps);
                break;
            case 2:
                imageView.setImageResource(R.drawable.ete);
                break;
            case 3:
                imageView.setImageResource(R.drawable.automne);
                break;
            case 4:
                imageView.setImageResource(R.drawable.hiver);
                break;
        }

        return view;
    }
}

