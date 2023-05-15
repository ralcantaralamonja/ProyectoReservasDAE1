package Reserva;

import java.util.Date;

public class Hotel {

    String Cod_Ho = "";
    String Dir_Ho = "";
    String Tel_Hc = "";
    Date Fec_Const;

    public Hotel(String cod_Ho, String dir_Ho, String tel_Hc, Date fec_Const) {
        Cod_Ho = cod_Ho;
        Dir_Ho = dir_Ho;
        Tel_Hc = tel_Hc;
        Fec_Const = fec_Const;
    }

    public String getCod_Ho() {
        return Cod_Ho;
    }

    public void setCod_Ho(String cod_Ho) {
        Cod_Ho = cod_Ho;
    }

    public String getDir_Ho() {
        return Dir_Ho;
    }

    public void setDir_Ho(String dir_Ho) {
        Dir_Ho = dir_Ho;
    }

    public String getTel_Hc() {
        return Tel_Hc;
    }

    public void setTel_Hc(String tel_Hc) {
        Tel_Hc = tel_Hc;
    }

    public Date getFec_Const() {
        return Fec_Const;
    }

    public void setFec_Const(Date fec_Const) {
        Fec_Const = fec_Const;
    }
}