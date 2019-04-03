/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import estado.Estado;
import estado.Margem;
import java.util.HashMap;
import operacoes.Operacao;

/**
 *
 * @author cinquenta
 */
public class Teste {
    
    public static void main(String[] args) {
        for(Estado est: new Operacao().gerarEstadosAleatorios()){
            System.out.println("===================");
            System.err.println(est);
            System.out.println("===================");
            System.out.println(est.getProximosEstadosPossiveis());
            System.out.println("------------------- \n \n \n \n ");
                
            }
            
        }
    }

