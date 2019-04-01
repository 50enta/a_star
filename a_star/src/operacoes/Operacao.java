/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

import estado.Canibal;
import estado.Estado;
import estado.Margem;
import estado.Missionario;
import estado.Rio;
import java.util.ArrayList;

/**
 *
 * @author cinquenta
 */
public class Operacao {

    public ArrayList<Estado> gerarEstadosAleatorios() {
        ArrayList<Estado> lista = new ArrayList();

        Missionario m1 = new Missionario("m1");
        Missionario m2 = new Missionario("m2");
        Missionario m3 = new Missionario("m3");

        Canibal c1 = new Canibal("c1");
        Canibal c2 = new Canibal("c2");
        Canibal c3 = new Canibal("c3");

//        primeiro
        ArrayList<Canibal> cs11 = new ArrayList();
        ArrayList<Missionario> ms11 = new ArrayList();
        ArrayList<Canibal> cs12 = new ArrayList();
        ArrayList<Missionario> ms12 = new ArrayList();

        cs11.add(c1);
        cs11.add(c2);
        cs11.add(c3);

        ms11.add(m1);
        ms11.add(m2);
        ms11.add(m3);

        Estado e1 = new Estado(new Rio(new Margem(cs11, ms11, true), new Margem(cs12, ms12, false)));
        lista.add(e1);

//        segundo
        ArrayList<Canibal> cs21 = new ArrayList();
        ArrayList<Missionario> ms21 = new ArrayList();
        ArrayList<Canibal> cs22 = new ArrayList();
        ArrayList<Missionario> ms22 = new ArrayList();

        cs11.add(c1);
        cs11.add(c2);
        cs11.add(c3);

        ms11.add(m1);
        ms11.add(m2);
        ms11.add(m3);

        Estado e2 = new Estado(new Rio(new Margem(cs11, ms11, true), new Margem(cs12, ms12, false)));
        lista.add(e2);

        return lista;
    }
}
