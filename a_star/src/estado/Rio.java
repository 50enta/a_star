package estado;

import java.util.ArrayList;

/**
 *
 * @author cinquenta
 */
public class Rio {
    

    private Margem direita, esquerda;

    /**
     * Construtor, que inicializa o rio com as magens direita e esquerda
     *
     * @param direita
     * @param esquerda
     */
    public Rio(Margem esquerda, Margem direita) {
        this.setEsquerda(esquerda);
        this.setDireita(direita);
    }
    public Rio(){
        
    }

    public Margem getDireita() {
        return direita;
    }

    public void setDireita(Margem direita) {
        this.direita = direita;
    }

    public Margem getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Margem esquerda) {
        this.esquerda = esquerda;
    }
    
    
    
    
    public ArrayList<Estado> gerarEstadosAleatorios() {

        //inicializando os estados possiveis
        Estado e1 = new Estado("1", new Rio(new Margem(3, 3, true), new Margem(0, 0, false)), 23);
        Estado e2 = new Estado("2", new Rio(new Margem(1, 3, false), new Margem(2, 0, true)), 12);
        Estado e3 = new Estado("3", new Rio(new Margem(2, 2, false), new Margem(1, 1, true)), 32);
        Estado e4 = new Estado("4", new Rio(new Margem(2, 3, false), new Margem(1, 0, true)), 32);
        Estado e5 = new Estado("5", new Rio(new Margem(2, 3, true), new Margem(1, 0, false)), 11);
        Estado e7 = new Estado("7", new Rio(new Margem(0, 3, false), new Margem(3, 0, true)), 5);
        Estado e9 = new Estado("9", new Rio(new Margem(1, 3, true), new Margem(2, 0, false)), 54);
        Estado e11 = new Estado("11", new Rio(new Margem(1, 1, false), new Margem(2, 2, true)), 9);
        Estado e12 = new Estado("12", new Rio(new Margem(2, 2, true), new Margem(1, 1, false)), 2);
        Estado e13 = new Estado("13", new Rio(new Margem(2, 0, false), new Margem(1, 3, true)), 21);
        Estado e14 = new Estado("14", new Rio(new Margem(3, 0, true), new Margem(0, 3, false)), 1);
        Estado e15 = new Estado("15", new Rio(new Margem(1, 0, false), new Margem(2, 3, true)), 21);
        Estado e16 = new Estado("16", new Rio(new Margem(2, 0, true), new Margem(1, 3, false)), 6);
        Estado e17 = new Estado("17", new Rio(new Margem(1, 1, true), new Margem(2, 2, false)), 15);
        Estado e18 = new Estado("18", new Rio(new Margem(0, 0, false), new Margem(3, 3, true)), 3);
        e18.setObjectivo(true);
        Estado e19 = new Estado("19", new Rio(new Margem(1, 0, true), new Margem(2, 3, false)), 14);

        //mais propriedades 
        e1.adicionarProximoEstadoPossivel(e2, 1);
        e1.adicionarProximoEstadoPossivel(e3, 2);
        e1.adicionarProximoEstadoPossivel(e4, 3);

        e2.adicionarProximoEstadoPossivel(e5, 4);
//        e2.adicionarProximoEstadoPossivel(e1, 1);

        e3.adicionarProximoEstadoPossivel(e1, 5);
        e3.adicionarProximoEstadoPossivel(e5, 6);

//        e4.adicionarProximoEstadoPossivel(e1, 1);

        e5.adicionarProximoEstadoPossivel(e7, 7);
//        e5.adicionarProximoEstadoPossivel(e3, 1);
//        e5.adicionarProximoEstadoPossivel(e2, 1);

//        e7.adicionarProximoEstadoPossivel(e5, 1);
        e7.adicionarProximoEstadoPossivel(e9, 8);

//        e9.adicionarProximoEstadoPossivel(e7, 1);
        e9.adicionarProximoEstadoPossivel(e11, 9);

//        e11.adicionarProximoEstadoPossivel(e9, 1);
        e11.adicionarProximoEstadoPossivel(e12, 10);

        e12.adicionarProximoEstadoPossivel(e13, 11);

        e13.adicionarProximoEstadoPossivel(e12, 12);
        e13.adicionarProximoEstadoPossivel(e14, 13);

        e14.adicionarProximoEstadoPossivel(e15, 14);
        e14.adicionarProximoEstadoPossivel(e13, 15);

        e15.adicionarProximoEstadoPossivel(e14, 16);
        e15.adicionarProximoEstadoPossivel(e16, 17);
        e15.adicionarProximoEstadoPossivel(e17, 18);

        e16.adicionarProximoEstadoPossivel(e15, 19);
        e16.adicionarProximoEstadoPossivel(e18, 20);

        e17.adicionarProximoEstadoPossivel(e18, 21);
        e17.adicionarProximoEstadoPossivel(e15, 22);

        e18.adicionarProximoEstadoPossivel(e16, 23);
        e18.adicionarProximoEstadoPossivel(e17, 24);
        e18.adicionarProximoEstadoPossivel(e19, 25);

        e19.adicionarProximoEstadoPossivel(e18, 26);

        //Adicionando os estados na lista, para o retorno
        ArrayList<Estado> lista = new ArrayList();
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e4);
        lista.add(e5);
        lista.add(e7);
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


}
