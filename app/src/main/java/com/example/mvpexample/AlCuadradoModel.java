package com.example.mvpexample;

public class AlCuadradoModel implements AlCuadrado.Model {

    private AlCuadrado.Presenter presenter;
    private double resultado;

    public AlCuadradoModel(AlCuadrado.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void alCuadrado(String data) {
        if (data.equals("")) {
            presenter.showError("Campo vacio");
        } else {
            resultado = Double.valueOf(data) * Double.valueOf(data);
            presenter.showResult(String.valueOf(resultado));
        }
    }
}
