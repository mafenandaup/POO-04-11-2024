package sortheights;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaAlturas {
    public static void main(String[] args) {
        List<Pessoa> grupo = new ArrayList<Pessoa>();
        
        // Adicionando objetos Pessoa à lista
        Pessoa p = new Pessoa("Asdrubal", 1.80);
        grupo.add(p);
        Pessoa p2 = new Pessoa("Robervalda", 1.50);
        grupo.add(p2);
        Pessoa p3 = new Pessoa("Florisbella", 1.60);
        grupo.add(p3);
        
        // Ordenando a lista usando o método compareTo implementado na classe Pessoa
        Collections.sort(grupo);
        
        // Imprimindo os elementos da lista ordenada
        for (int i = 0; i < grupo.size(); i++) {
            System.out.println(grupo.get(i)); // O toString() de Pessoa será chamado automaticamente
        }
    }
}
