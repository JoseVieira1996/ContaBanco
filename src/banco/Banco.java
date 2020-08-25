/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author jose2
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setDono ("Jubileu");
        p1.setNumConta(4534);
        p1.abrirConta("CP");
        
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setDono ("Creuza");
        p2.setNumConta(2323);
        p2.abrirConta("CC");
        
        
        p1.depositar(140);
        p1.sacar(2000);
        
        
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}
