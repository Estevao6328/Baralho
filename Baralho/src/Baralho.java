import java.util.ArrayList;

public class Baralho {
    private ArrayList<Carta> cartas;
    public Baralho() {
        cartas = new ArrayList<>();
        iniciarBaralho();
    }
    private void iniciarBaralho() {
        String numeros[] = {"As","Dois","Três","Quatro","Cinco","Seis","Sete","Oito","Nove","Dez","Valete","Dama","Reis"};
        String naipe[] = {"Espadas","Copas","Ouros","Paus"};

        for(int nai=0; nai<naipe.length;nai++){
            for(int num=0; num<numeros.length;num++){
                addCarta(numeros[num], naipe[nai]);
            }
        }
    }

    public void addCarta(String numero, String naipe) {
        Carta novaCarta = new Carta(numero, naipe);
        cartas.add(novaCarta);
    }

    public String toString() {
        String retorno = "[ ";
        for(Carta c: cartas) {
            retorno += c.toString() + " , ";
        }
        return retorno + " ]";
    }
}