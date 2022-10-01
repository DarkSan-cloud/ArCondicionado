import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        ArCondicionado AC = new ArCondicionado();
        int op;
        do {
            System.out.println("1 - Ligar/Desligar");
            System.out.println("2 - Mudar modo de operação");
            System.out.println("3 - Aumentar temperatura");
            System.out.println("4 - Diminuir Temperatura");
            System.out.println("5 - Status");
            System.out.println("6 - Sair");
            op = leia.nextInt();

            switch (op) {
                case 1:
                    AC.liga_desliga();
                    break;
                    
                case 2:
                    AC.modoop();
                    break;

                case 3:
                    AC.aumentarTemperatura();
                    break;

                case 4:
                    AC.diminuirTemperatura();
                    break;

                case 5:
                    AC.exibirStatus();
                    break;

                case 6:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Opção invalida");
            }

        } while (op != 6);
    }
}
