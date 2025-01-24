package View;
import Model.SmartTv;

public class SmartTvView {

    public void mostrarEstado(SmartTv smartTv) {
        if (smartTv.isTvOn()) {
            System.out.println("A TV está ligada.");
        } else {
            System.out.println("A TV está desligada.");
        }
        System.out.println("Canal atual: " + smartTv.getChannel());
        System.out.println("Volume atual: " + smartTv.getVolume());
    }

    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }

}
