package com.example.uahm.accoswv2;

public class Datos {

    private String a_paterno;
    private String a_materno;
    private String nombre;
    private String fecha_nac_pac;
    private String sexo;
    private String direccion_pac;
    private String tel_fijo;
    private String celular;
    private String padecimientos;

    public Datos() {
    }

    public Datos(String a_paterno, String a_materno, String nombre, String fecha_nac_pac, String sexo, String direccion_pac, String tel_fijo, String celular, String padecimientos) {
        this.a_paterno = a_paterno;
        this.a_materno = a_materno;
        this.nombre = nombre;
        this.fecha_nac_pac = fecha_nac_pac;
        this.sexo = sexo;
        this.direccion_pac = direccion_pac;
        this.tel_fijo = tel_fijo;
        this.celular = celular;
        this.padecimientos = padecimientos;
    }

    public String getA_paterno() {
        return a_paterno;
    }

    public void setA_paterno(String a_paterno) {
        this.a_paterno = a_paterno;
    }

    public String getA_materno() {
        return a_materno;
    }

    public void setA_materno(String a_materno) {
        this.a_materno = a_materno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_nac_pac() {
        return fecha_nac_pac;
    }

    public void setFecha_nac_pac(String fecha_nac_pac) {
        this.fecha_nac_pac = fecha_nac_pac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion_pac() {
        return direccion_pac;
    }

    public void setDireccion_pac(String direccion_pac) {
        this.direccion_pac = direccion_pac;
    }

    public String getTel_fijo() {
        return tel_fijo;
    }

    public void setTel_fijo(String tel_fijo) {
        this.tel_fijo = tel_fijo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getPadecimientos() {
        return padecimientos;
    }

    public void setPadecimientos(String padecimientos) {
        this.padecimientos = padecimientos;
    }

    @Override
    public String toString() {
        return "Datos{" +
                a_paterno + '\'' +
                a_materno + '\'' +
                nombre + '\'' +
                fecha_nac_pac + '\'' +
                sexo + '\'' +
                direccion_pac + '\'' +
                tel_fijo + '\'' +
                celular + '\'' +
                padecimientos + '\'' +
                '}';
    }
}
