package pe.edu.idat.appforms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import pe.edu.idat.appforms.databinding.ActivityPrimosBinding;

public class PrimosActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityPrimosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrimosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btncalcularprimo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Integer numero = Integer.parseInt(
                binding.etnumeroprimo.getText().toString());
        String resultado =
                esPrimo(numero) ? "El número ingresado es PRIMO"
                        : "El número ingresado NO ES PRIMO";
        binding.tvresultadoprimo.setText(resultado);
    }


    private Boolean esPrimo(Integer numero){
        int contadorDiv = 0;
        for(int i = 1; i <= numero; i++){
            if((numero % i) == 0){
                contadorDiv++;
            }
        }
        return contadorDiv <=  2;
    }
}