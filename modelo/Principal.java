/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Participante objPart = new Participante();
        System.out.println("O Evento começou e o participante esta "+ objPart.lendo());
        System.out.println("O participante esta "+ objPart.programando());
    }
    
}
