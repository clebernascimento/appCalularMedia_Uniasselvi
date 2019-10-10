package com.example.appmediauniasselvi;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class MediaFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    private EditText avaliacao1;
    private EditText avaliacao2;
    private EditText discussiva;
    private EditText avaliacaoFinal;

    private TextView textMedia;
    private TextView textmediaFinal;
    private TextView textresulatado;

    private Button limpar;
    private Button calcular;

    private double media;

    public MediaFragment() {
        // Required empty public constructor
    }


    public static MediaFragment newInstance(String param1, String param2) {
        MediaFragment fragment = new MediaFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_media_fragmant, container, false);
        avaliacao1 = (EditText)view.findViewById(R.id.avaliacao1);
        avaliacao2 = (EditText)view.findViewById(R.id.avaliacao2);
        discussiva = (EditText)view.findViewById(R.id.discussiva);
        avaliacaoFinal = (EditText)view.findViewById(R.id.avaliacaoFinal);

        textMedia = (TextView) view.findViewById(R.id.textMedia);
        textmediaFinal = (TextView) view.findViewById(R.id.textMedia_Final);
        textresulatado = (TextView) view.findViewById(R.id.textResultado);

        limpar = (Button) view.findViewById(R.id.buttonLimpar);
        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                limparCampos();
            }
        });


        calcular = view.findViewById(R.id.buttonCalcular);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularMedia();
            }
        });
        return view;
    }

    public void calcularMedia(){

        DecimalFormat formatar = new DecimalFormat("0.00");
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');

        if ((avaliacao1.getText().toString().isEmpty()) || (avaliacao2.getText().toString().isEmpty()) ||
                (discussiva.getText().toString().isEmpty()) || (avaliacaoFinal.getText().toString().isEmpty())) {
            Toast.makeText(getActivity(), "Todos os campos devem ser preenchidos", Toast.LENGTH_LONG).show();
        } else {
            double nota1 = Float.parseFloat(avaliacao1.getText().toString());
            double nota2 = Float.parseFloat(avaliacao2.getText().toString());
            double nota3 = Float.parseFloat(discussiva.getText().toString());
            double nota4 = Float.parseFloat(avaliacaoFinal.getText().toString());
            media = ((nota1 * 1.5) + (nota2 * 1.5) + (nota3 * 4) + (nota4 * 3)) / 10;
        }
        if (media <= 6.50) {
            textMedia.setText("Média: " + formatar.format(media));
            textmediaFinal.setText("Média: " + formatar.format(media));
            textresulatado.setText("Reprovado !");
            textresulatado.setTextColor(Color.RED);
        }
        if ((media >= 6.51) && (media <= 7.50)) {
            textMedia.setText("Média: " + formatar.format(media));
            textmediaFinal.setText("Média Final: 7.00");
            textresulatado.setText("Aprovado !");
            textresulatado.setTextColor(Color.BLUE);
        }
        if ((media >= 7.51) && (media < 8.00)) {
            textMedia.setText("Média: " + formatar.format(media));
            textmediaFinal.setText("Média Final: 7.50");
            textresulatado.setText("Aprovado !");
            textresulatado.setTextColor(Color.BLUE);
        }
        if ((media >= 8.00) && (media <= 8.50)) {
            textMedia.setText("Média: " + formatar.format(media));
            textmediaFinal.setText("Média Final: 8.00");
            textresulatado.setText("Aprovado !");
            textresulatado.setTextColor(Color.BLUE);
        }
        if ((media >= 8.51) && (media < 9.00)) {
            textMedia.setText("Média: " + formatar.format(media));
            textmediaFinal.setText("Média Final: 8.50");
            textresulatado.setText("Aprovado !");
            textresulatado.setTextColor(Color.BLUE);
        }
        if ((media >= 9.00) && (media <= 9.50)) {
            textMedia.setText("Média: " + formatar.format(media));
            textmediaFinal.setText("Média Final: 9.00");
            textresulatado.setText("Aprovado !");
            textresulatado.setTextColor(Color.BLUE);
        }
        if ((media >= 9.51) && (media < 10.00)) {
            textMedia.setText("Média: " + formatar.format(media));
            textmediaFinal.setText("Média Final: 9.50");
            textresulatado.setText("Aprovado !");
            textresulatado.setTextColor(Color.BLUE);
        }
        if (media == 10.00) {
            textMedia.setText("Média: " + formatar.format(media));
            textmediaFinal.setText("Média Final: 10.00");
            textresulatado.setText("Aprovado !");
            textresulatado.setTextColor(Color.BLUE);
        }
    }

    public void limparCampos(){
        avaliacao1.setText("");
        avaliacao2.setText("");
        discussiva.setText("");
        avaliacaoFinal.setText("");

        textMedia.setText("");
        textmediaFinal.setText("");
        textresulatado.setText("");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
