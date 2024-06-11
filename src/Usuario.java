import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Volume Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Status atual -> Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Status atual -> Tv Ligada? " + smartTv.ligada);

        smartTv.aumentarCanal();
        System.out.println("Aumentando o Canal da TV para: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Diminuindo o Canal da TV para: " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Aumentando o Volume da TV para: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Diminuindo o volume da TV para: " + smartTv.canal);

        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println("Digite o novo canal: ");
        int novoCanal = scanner.nextInt();
        smartTv.definirCanal(novoCanal);

        System.out.println("Canal atual: " + smartTv.canal);
    }

}
