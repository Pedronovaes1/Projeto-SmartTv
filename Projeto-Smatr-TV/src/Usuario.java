public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smarTv = new SmartTv();

        System.out.println("A tv está ligada?" + smarTv.ligada);
        System.out.println("Canal atual: "+smarTv.canal);
        System.out.println("O volume: "+smarTv.volume);

        smarTv.ligar();
        System.out.println("Novo status -> TV ligada: " + smarTv.ligada);

        smarTv.desligar();
        System.out.println("A tv está ligada? " + smarTv.ligada);

        smarTv.aumentarVolume();
        System.out.println("Qual o volume? " + smarTv.volume);

        smarTv.diminuirVolume();
        System.out.println("Diminuindo o volume: " + smarTv.volume);

        smarTv.mudarCanal(14);
        System.out.println("Mudar canal para canal: " + smarTv.canal);
    }
}
