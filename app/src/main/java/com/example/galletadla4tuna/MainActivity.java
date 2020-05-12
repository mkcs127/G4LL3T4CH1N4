package com.example.galletadla4tuna;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;
        import android.view.View;

//Libreria Java
        import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView fortuna;
    private TextView mensaje;

    private String[] respuestaArray={"Siente la felicidad que espera por ti y no olvides atraparla para mantenerla contigo.", "Sabes que es exactamente lo que quieres. Trabaja en ello y hazlo materializarse.", "No olvides que un amigo es un regalo que te das a ti mismo.", "Se te cumplirá un hermoso sueño y veras como otros sueños se hacen realidad.", "Confía en tu buen juicio y veras que este te lleva al triunfo.", "Eres una persona a la que le gusta triunfar en la vida.",
            "Muchos se alegraran por tus logros y a ti te mejorara la vida.", "Tendrás entera satisfacción al final de esta temporada. Prepárate.", "La rueda de la fortuna te favorecerá y estarás rodeado de prosperidad.", "Hoy compartirás las horas mas tiernas de tu vida con alguien muy amado.", "Hoy tendrás un día de increíble alegría y brillara tu sentido del humor.", "Nunca tendrás que preocuparte por un ingreso estable.",
            "Mejor no decirte ahora", "No puedo predecir ahora", "Concéntrate y pregunta de nuevo", "No cuentes con eso",
            "Seras promovido en tu trabajo debido a tus logros y capacidades.", "Mañana puede ser muy tarde para disfrutar lo que tienes hoy.", "Tu corazón estallara de alegría con la llegada de buenas noticias.", "Te aguarda una larga y feliz vida."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fortuna = findViewById(R.id.galleta);
        mensaje = findViewById(R.id.mensaje);

        fortuna.setOnClickListener(this);
        Toast.makeText(MainActivity.this, "Buscando tu destino!!!", Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onClick(View v){
        //creacion de metodo de respuesta aleatorio

        switch (v.getId()) {
            case R.id.galleta:
                int rand = new Random().nextInt(respuestaArray.length);
                mensaje.setText(respuestaArray[rand]);
        }
    }
}