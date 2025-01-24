import Controller.SmartTvController;
import Model.SmartTv;
import View.SmartTvView;

public class Main {
    public static void main(String[] args) {
        // Criando as instâncias de Model, View e Controller
        SmartTv smartTv = new SmartTv();
        SmartTvView view = new SmartTvView();
        SmartTvController controller = new SmartTvController(smartTv, view);

        // Usando o controlador para interagir com o modelo e a visão
        controller.on();
        controller.setChannel(5);
        controller.upVolume();
        controller.downVolume();
        controller.status();// Atualiza a visualização do estado da TV
        controller.off();
        controller.status(); // Exibe o estado da TV após desligar
    }
}