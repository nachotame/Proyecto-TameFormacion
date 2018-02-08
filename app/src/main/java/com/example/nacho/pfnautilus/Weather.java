package com.example.nacho.pfnautilus;

/**
 * Created by Nacho on 08/02/2018.
 */

public class Weather {
    double temp;
    double humidity;
    double tempMax;
    double tempMin;
    double nubosidad;
    long salidaSol;
    long puestaSol;

    public Weather(double temp, double humidity, double tempMax, double tempMin, double nubosidad,
                   int salidaSol, int puestaSol){

        this.temp=temp;
        this.humidity=humidity;
        this.tempMax=tempMax;
        this.tempMin=tempMin;
        this.nubosidad=nubosidad;
        this.salidaSol=salidaSol;
        this.puestaSol=puestaSol;

    }

    public Weather(){

    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public void setNubosidad(double nubosidad) {
        this.nubosidad = nubosidad;
    }

    public void setSalidaSol(long salidaSol) {
        this.salidaSol = salidaSol;
    }

    public void setPuestaSol(long puestaSol) {
        this.puestaSol = puestaSol;
    }

    public void  alertas(){
        String lluvia="Va a llover muy fuerte".toString();
        String sol="disfrute de la naturaleza".toString();
        String abrigase="Coja una chaqueta, o dos".toString();

    }

}
