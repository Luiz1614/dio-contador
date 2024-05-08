package Candidatura;

import java.util.Arrays;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Lucas", "Juliana"};
        for(String cadidato: candidatos){
            entrandoEmContato(cadidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }
            else {
                System.out.println("Contato Realizado com Sucesso!");
            }

        }while (continuarTentando && tentativasRealizadas < 3);{
            if (atendeu) {
                System.out.println("Conseguimos contato com o candidato " + candidato);
            } else {
                System.out.println("Não conseguimos contato com o candidato " + candidato);
            }
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String [] selecionados = {"João", "Maria", "José", "Ana", "Carlos"};
        System.out.println(Arrays.toString(selecionados));

        for (int i = 0; i < selecionados.length; i++){
            System.out.println("O candidato " + "de número " + (i + 1) + " é o " + selecionados[i]);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Lucas", "Juliana"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = Math.random() * 5000;

            System.out.println("O candidato " + candidato + " pretende ganhar " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioPretendido > salarioBase){
            System.out.println("Ligar para o candidato");
        } else if (salarioPretendido == salarioBase){
            System.out.println("Ligar para candidato com contraproposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
