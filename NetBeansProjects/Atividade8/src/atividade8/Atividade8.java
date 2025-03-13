
package atividade8;

/**
 * @author Mendes
 * Data: 12/03/2025
 */
public class Atividade8 {

    public static void main(String[] args) {
       Cachorro cachorro = new Cachorro("Olívia", 5);
       
        cachorro.setNome("Olívia");
        cachorro.setIdade(5);
        
        System.out.println("Nome do Cachorro: " + cachorro.getNome());
        System.out.println("Idade do Cachorro: " + cachorro.getIdade());
        cachorro.latir();
    }
    
}
