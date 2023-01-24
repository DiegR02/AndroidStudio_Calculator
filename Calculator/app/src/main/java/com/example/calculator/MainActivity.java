package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Variables
    TextView textView1;
    float num1 = 0.0f, num2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Enlazar XML con Java
        textView1 = findViewById(R.id.textView1);
    }

    //Botones numericos
    public void escribirCero(View view) {
        //Convertir "valor" de Float en String
        float valor = Float.parseFloat(textView1.getText().toString());
        if (valor == 0.0f) {
            textView1.setText("0");
        } else {
            textView1.setText(textView1.getText() + "0");
        }
    }

    public void escribirUno(View view) {
        float valor = Float.parseFloat(textView1.getText().toString());
        if (valor == 0.0f) {
            textView1.setText("1");
        } else {
            textView1.setText(textView1.getText() + "1");
        }
    }

    public void escribirDos(View view) {
        float valor = Float.parseFloat(textView1.getText().toString());
        if (valor == 0.0f) {
            textView1.setText("2");
        } else {
            textView1.setText(textView1.getText() + "2");
        }
    }

    public void escribirTres(View view) {
        float valor = Float.parseFloat(textView1.getText().toString());
        if (valor == 0.0f) {
            textView1.setText("3");
        } else {
            textView1.setText(textView1.getText() + "3");
        }
    }

    public void escribirCuatro(View view) {
        float valor = Float.parseFloat(textView1.getText().toString());
        if (valor == 0.0f) {
            textView1.setText("4");
        } else {
            textView1.setText(textView1.getText() + "4");
        }
    }

    public void escribirCinco(View view) {
        float valor = Float.parseFloat(textView1.getText().toString());
        if (valor == 0.0f) {
            textView1.setText("5");
        } else {
            textView1.setText(textView1.getText() + "5");
        }
    }

    public void escribirSeis(View view) {
        float valor = Float.parseFloat(textView1.getText().toString());
        if (valor == 0.0f) {
            textView1.setText("6");
        } else {
            textView1.setText(textView1.getText() + "6");
        }
    }

    public void escribirSiete(View view) {
        float valor = Float.parseFloat(textView1.getText().toString());
        if (valor == 0.0f) {
            textView1.setText("7");
        } else {
            textView1.setText(textView1.getText() + "7");
        }
    }

    public void escribirOcho(View view) {
        float valor = Float.parseFloat(textView1.getText().toString());
        if (valor == 0.0f) {
            textView1.setText("8");
        } else {
            textView1.setText(textView1.getText() + "8");
        }
    }

    public void escribirNueva(View view) {
        float valor = Float.parseFloat(textView1.getText().toString());
        if (valor == 0.0f) {
            textView1.setText("9");
        } else {
            textView1.setText(textView1.getText() + "9");
        }
    }

    //Boton de borrar
    public void borrarResultado(View view) {
        num1 = 0.0f;
        num2 = 0.0f;
        operacion = "";
        textView1.setText("0");
    }

    //Botones operadores (-, +, /, *, ^)
    public void operacionRestar(View view) {
        //Convertir "num1" de Float en String
        num1 = Float.parseFloat(String.valueOf(textView1.getText()));
        operacion = "-";
        textView1.setText("0");
    }

    public void operacionSumar(View view) {
        num1 = Float.parseFloat(String.valueOf(textView1.getText()));
        operacion = "+";
        textView1.setText("0");
    }

    public void operacionDivision(View view) {
        num1 = Float.parseFloat(String.valueOf(textView1.getText()));
        operacion = "/";
        textView1.setText("0");
    }

    public void operacionMultiplicacion(View view) {
        num1 = Float.parseFloat(String.valueOf(textView1.getText()));
        operacion = "*";
        textView1.setText("0");
    }

    public void operacionPotencia(View view) {
        num1 = Float.parseFloat(String.valueOf(textView1.getText()));
        operacion = "^";
        textView1.setText("0");
    }

    //Boton de igual
    public void mostrarResultado(View view) {
        //Convertir "num2" de Float en String
        num2 = Float.parseFloat(String.valueOf(textView1.getText()));
        float result = 0.0f;
        //Restar
        if (operacion.equals("-")) {
            result = num1 - num2;
        }
        //Sumar
        if (operacion.equals("+")){
            result = num1 + num2;
        }
        //Dividir
        if (operacion.equals("/")) {
            if (num2 != 0.0f) {
                result = num1 / num2;
            } else {
                result = 0.0f;
                //Mostrar mensaje por pantalla
                Toast.makeText(this, "Operación invalida", Toast.LENGTH_LONG).show();
            }
        }
        //Multiplicar
        if (operacion.equals("*")) {
            result = num1 * num2;
        }

        //Potencia
        if (operacion.equals("^")){
            result = (float) Math.pow(num1, num2);
        }
        textView1.setText(result + "");
        num1 = 0.0f;
        num2 = 0.0f;
        operacion = "";
    }

    //Boton de raiz
    public void operacionRaiz(View view) {
        num1 = Float.parseFloat(String.valueOf(textView1.getText()));
        operacion = "√";
        textView1.setText("0");
        float result = 0.0f;
        //Raiz
        if(operacion.equals("√")){
            result= (float) Math.sqrt(num1);
            if (result > 0){
            textView1.setText(result + "");
            } else {
                //Mostrar mensaje por pantalla
                Toast.makeText(this, "Operación invalida", Toast.LENGTH_LONG).show();
            }
        }
        num1 = 0.0f;
        num2 = 0.0f;
        operacion = "";
    }

    //Boton de area
    public void operacionArea(View view) {
        num1 = Float.parseFloat(String.valueOf(textView1.getText()));
        operacion = "a";
        textView1.setText("0");
        float result = 0.0f;
        //Calculo del área
        result= (float) (3.1416* Math.pow(num1, 2));
        textView1.setText(result + "");
        num1 = 0.0f;
        num2 = 0.0f;
        operacion = "";
    }

    //Boton de longitud
    public void operacionLongitud(View view) {
        num1 = Float.parseFloat(String.valueOf(textView1.getText()));
        operacion = "l";
        textView1.setText("0");
        float result = 0.0f;
        //Calculo de la longitud
        result = (float) ((2*3.1416)*num1);
        textView1.setText(result + "");
        num1 = 0.0f;
        num2 = 0.0f;
        operacion = "";
    }

}

