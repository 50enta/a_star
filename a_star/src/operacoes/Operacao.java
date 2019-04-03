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

        //inicializando os estados possiveis
        Estado e1 = new Estado(new Rio(new Margem(3, 3, true), new Margem(0, 0, false)));
        Estado e2 = new Estado(new Rio(new Margem(1, 3, false), new Margem(2, 0, true)));
        Estado e3 = new Estado(new Rio(new Margem(2, 2, false), new Margem(1, 1, true)));
        Estado e4 = new Estado(new Rio(new Margem(2, 3, false), new Margem(1, 0, true)));
        Estado e5 = new Estado(new Rio(new Margem(2, 3, true), new Margem(1, 0, false)));
        Estado e7 = new Estado(new Rio(new Margem(0, 3, false), new Margem(3, 0, true)));
        Estado e8 = new Estado(new Rio(new Margem(2, 3, true), new Margem(1, 0, false)));
        Estado e9 = new Estado(new Rio(new Margem(1, 3, true), new Margem(2, 0, false)));
        Estado e11 = new Estado(new Rio(new Margem(1, 1, false), new Margem(2, 2, true)));
        Estado e12 = new Estado(new Rio(new Margem(2, 2, true), new Margem(1, 1, false)));
        Estado e13 = new Estado(new Rio(new Margem(2, 0, false), new Margem(1, 3, true)));
        Estado e14 = new Estado(new Rio(new Margem(3, 0, true), new Margem(0, 3, false)));
        Estado e15 = new Estado(new Rio(new Margem(1, 0, false), new Margem(2, 3, true)));
        Estado e16 = new Estado(new Rio(new Margem(2, 0, true), new Margem(1, 3, false)));
        Estado e17 = new Estado(new Rio(new Margem(1, 1, true), new Margem(2, 2, false)));
        Estado e18 = new Estado(new Rio(new Margem(0, 0, false), new Margem(3, 3, true)));
        Estado e19 = new Estado(new Rio(new Margem(1, 0, true), new Margem(2, 3, false)));

        //mais propriedades 
        e1.adicionarProximoEstadoPossivel(e2, 1);
        e1.adicionarProximoEstadoPossivel(e3, 1);
        e1.adicionarProximoEstadoPossivel(e4, 1);
        
        e2.adicionarProximoEstadoPossivel(e5, 1);
        e2.adicionarProximoEstadoPossivel(e1, 1);
        
        e3.adicionarProximoEstadoPossivel(e1, 1);
        e3.adicionarProximoEstadoPossivel(e5, 1);
        
        e4.adicionarProximoEstadoPossivel(e1, 1);
        
        e5.adicionarProximoEstadoPossivel(e7, 1);
        e5.adicionarProximoEstadoPossivel(e3, 1);
        e5.adicionarProximoEstadoPossivel(e2, 1);
        
        e7.adicionarProximoEstadoPossivel(e8, 1);
        e7.adicionarProximoEstadoPossivel(e9, 1);
        
        e8.adicionarProximoEstadoPossivel(e7, 1);
        e8.adicionarProximoEstadoPossivel(e2, 1);
        e8.adicionarProximoEstadoPossivel(e3, 1);
        
        e9.adicionarProximoEstadoPossivel(e7, 1);
        e9.adicionarProximoEstadoPossivel(e11, 1);
        
        e11.adicionarProximoEstadoPossivel(e9, 1);
        e11.adicionarProximoEstadoPossivel(e12, 1);
        
        e12.adicionarProximoEstadoPossivel(e13, 1);
        
        e13.adicionarProximoEstadoPossivel(e12, 1);
        e13.adicionarProximoEstadoPossivel(e14, 1);
        
        e14.adicionarProximoEstadoPossivel(e15, 1);
        e14.adicionarProximoEstadoPossivel(e13, 1);
        
        e15.adicionarProximoEstadoPossivel(e14, 1);
        e15.adicionarProximoEstadoPossivel(e16, 1);
        e15.adicionarProximoEstadoPossivel(e17, 1);
        
        e16.adicionarProximoEstadoPossivel(e15, 1);
        e16.adicionarProximoEstadoPossivel(e18, 1);
                
        e17.adicionarProximoEstadoPossivel(e18, 1);
        e17.adicionarProximoEstadoPossivel(e15, 1);
                
        e18.adicionarProximoEstadoPossivel(e16, 1);
        e18.adicionarProximoEstadoPossivel(e17, 1);
        e18.adicionarProximoEstadoPossivel(e19, 1);
                
        e19.adicionarProximoEstadoPossivel(e18, 1);
        
        //Adicionando os estados na lista, para o retorno
        ArrayList<Estado> lista = new ArrayList();
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e4);
        lista.add(e5);
        lista.add(e7);
        lista.add(e8);
        lista.add(e9);
        lista.add(e11);
        lista.add(e12);
        lista.add(e13);
        lista.add(e14);
        lista.add(e15);
        lista.add(e16);
        lista.add(e17);
        lista.add(e18);
        lista.add(e19);

        return lista;
    }
    
    
    
    
    public void processar(){
        ArrayList<Estado> todosEstados = this.gerarEstadosAleatorios();
        
    }
}
