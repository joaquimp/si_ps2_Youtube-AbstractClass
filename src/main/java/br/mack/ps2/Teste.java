package br.mack.ps2;

import br.mack.ps2.followers.Desktop;
import br.mack.ps2.followers.Smartphone;

public class Teste {

    public static void main( String[] args ) {
        Youtube zequinha = new Youtube("Zequinha");
        Youtube luizinha = new Youtube("Luizinha");

        Smartphone spCarlos = new Smartphone("Carlos");
        Smartphone spKarina = new Smartphone("Carlos");
        Desktop dtJulio = new Desktop("Julio");
        Desktop dtPedro = new Desktop("Pedro");

        zequinha.addSubscriber(spCarlos);
        zequinha.addSubscriber(spKarina);
        zequinha.addSubscriber(dtJulio);

        luizinha.addSubscriber(spCarlos);
        luizinha.addSubscriber(spKarina);
        luizinha.addSubscriber(dtJulio);
        luizinha.addSubscriber(dtPedro);

        zequinha.addVideo("Todo mundo em panico");
        luizinha.addVideo("E o vento levou");
    }
}
