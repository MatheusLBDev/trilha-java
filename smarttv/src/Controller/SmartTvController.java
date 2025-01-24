package Controller;

import Model.SmartTv;
import View.SmartTvView;

public class SmartTvController {
    private SmartTvView view;
    private SmartTv model;

    public SmartTvController(SmartTv model, SmartTvView view){
        this.model = model;
        this.view = view;
    }

    public void on(){
        model.onTv(true);
        view.mostrarMensagem("TV Ligada");
    }

    public void off(){
        model.onTv(false);
        view.mostrarMensagem("TV Desligada");
    }

    public void setChannel(int newChannel){
        model.setChannel(newChannel);
        view.mostrarMensagem("Canal: " + newChannel);
    }

    public void upVolume(){
        model.upVolume();
        view.mostrarMensagem("Volume: " + model.getVolume());
    }

    public void downVolume(){
        model.downVolume();
        view.mostrarMensagem("Volume: " + model.getVolume());
    }

    public void status(){
        view.mostrarEstado(model);
    }

}
