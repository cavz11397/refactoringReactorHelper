package com.example;

public class Datos {

    private String code;
    private String date;

    public Datos() {
    }

    public Datos(String code, String date) {
        this.code = code;
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean isBlank(String dato){
        return dato.isBlank();
    }

}
