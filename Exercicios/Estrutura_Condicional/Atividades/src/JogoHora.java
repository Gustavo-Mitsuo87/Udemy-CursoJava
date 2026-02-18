import java.util.Scanner;

public class JogoHora {
    /*
    Nessa atividade faz o cálculo de horas jogadas.
    In this activity, the calculation of hours played is done.
    */

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int duracao, horaInicio, horaFinal;

        horaInicio = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicio < horaFinal) {
            duracao = horaFinal - horaInicio;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        } else {
            duracao = 24 - horaInicio + horaFinal; // ou duracao = (24 - horaInicio) + horaFinal;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        }
        sc.close();
    }
}
