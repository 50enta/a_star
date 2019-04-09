/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

import estado.Estado;
import estado.Log;
import estado.Rio;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author cinquenta
 */
public class Operacao {

    private static boolean valorLogico;
    private static boolean valorLogico2;
    private static Collection<Integer> lista = new ArrayList();

    public Estado getEstadoComMenorFn(ArrayList<Estado> todos) { //Dos estados avaliados mas nao visitados
        Estado maior = null;
        int maiorFn = 0;
        for (Estado est : todos) {
            if (est.isAvaliado()) {
                if (!est.isVisitado()) {
                    for (Log lg : est.getLogs()) {
                        if (lg.getFn() < maiorFn) {
                            maiorFn = lg.getFn();
                            maior = est;
                        }
                    }
                }
            }
        }
        return maior;
    }

    public ArrayList<String> getCaminhoDoEstadoComMenorFn(ArrayList<Estado> todos) {
        ArrayList<String> caminhoComMenorFn = null;
        int menorFn = 0;
        for (Estado est : todos) {
            if (est.isAvaliado()) {
                if (!est.isVisitado()) {
                    for (Log lg : est.getLogs()) {
                        if (lg.getFn() < menorFn) {
                            menorFn = lg.getFn();
                            caminhoComMenorFn = lg.getCaminho();
                        }
                    }
                }
            }
        }
        return caminhoComMenorFn;
    }

    public Log getLogEmCausa(ArrayList<Estado> todos) {
        Log logEmCau = null;
        int menorFn = 0;
        for (Estado est : todos) {
            if (est.isAvaliado()) {
                if (!est.isVisitado()) {
                    for (Log lg : est.getLogs()) {
                        if (lg.getFn() < menorFn) {
                            menorFn = lg.getFn();
                            logEmCau = lg;
                        }
                    }
                }
            }
        }
        return logEmCau;
    }

    /**
     * Retorna a chave dado o valor, peso mais concretamente
     *
     * @param mapa
     * @param valor
     * @return
     */
    public Estado getChaveDoValor(HashMap<Estado, Integer> mapa, Integer valor) {
        for (Entry<Estado, Integer> a : mapa.entrySet()) {
            if (a.getValue() == valor) {
                return a.getKey();
            }
        }
        return null;
    }

    public void processar() {
        ArrayList<Estado> todos = new Rio().gerarEstadosAleatorios();
        Estado agora = todos.get(0);

        ArrayList<String> ondeEstou = new ArrayList();

        Log logEmCausa = new Log();
        logEmCausa.setUsado(false);
        logEmCausa.setSomatorioCustoChegada(0);
        logEmCausa.setFn(logEmCausa.getSomatorioCustoChegada() + agora.getHn());
        logEmCausa.getCaminho().add(agora.getDesignacao());
        agora.getLogs().add(logEmCausa);

        valorLogico = !agora.isObjectivo();
        valorLogico2 = agora.temFilhos();
        while (valorLogico) {
//        while (true) {


            if (valorLogico2) {
                
                System.out.println(agora.getProximosEstadosPossiveis().values());
                for (Integer peso : agora.getProximosEstadosPossiveis().values()) {
                    //pegar o no filho e o peso de arresta
                    Estado est = getChaveDoValor(agora.getProximosEstadosPossiveis(), peso);
                    est.setAvaliado(true);
                    est.getLogs().add(new Log(logEmCausa.getSomatorioCustoChegada() + est.getHn(), logEmCausa.getSomatorioCustoChegada() + peso, logEmCausa.getCaminho()));

                }
            }
            agora.setVisitado(true);
            agora = this.getEstadoComMenorFn(todos);
            ondeEstou = this.getCaminhoDoEstadoComMenorFn(todos);
            logEmCausa = this.getLogEmCausa(todos);

        }
        System.out.println("Caminho optimo: " + ondeEstou);

    }
}
