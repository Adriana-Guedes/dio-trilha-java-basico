package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args){


        System.out.println("Processo Seletivo");

        analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(2200.0);

    }


    //METODO VERIFICAR SALARIO
    static void analisarCandidato(double salariopretendido){
        double salariobase = 2000.0;
        if(salariobase > salariopretendido) {
            System.out.println("LIGAR PARA O CONDIDATO.");
        } else if (salariobase == salariopretendido){
            System.out.println("LIGAR PARA O CONDIDATO COM CONTRA PROPOSTA.");
            }else{
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");

        }
    }


}
