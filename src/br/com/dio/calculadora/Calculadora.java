package br.com.dio.calculadora;

import lombok.Getter;
import lombok.Setter;

import java.text.DecimalFormat;

@Getter
@Setter
public class Calculadora implements Calcular {

    private int x;
    private int y;


    public Calculadora() { }

    @Override
    public int getSoma(int x, int y) { return (x+y); }

    @Override
    public int getSub(int x, int y) { return (x-y); }

    @Override
    public int getMult(int x, int y) { return (x*y); }

    @Override
    public int getDiv(int x, int y) { return (x/y); }


}
