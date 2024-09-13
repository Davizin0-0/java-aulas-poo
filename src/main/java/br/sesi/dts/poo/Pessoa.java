package br.sesi.dts.poo;


import br.sesi.dts.poo.cabeca.Cabeca;
import br.sesi.dts.poo.inferior.MembrosInferiores;
import br.sesi.dts.poo.tronco.Tronco;

public class Pessoa {

    public Cabeca cabeca;
    public Tronco tronco;
    public MembrosInferiores inferior;

    public Pessoa(){
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferior = new MembrosInferiores();
    }
}
