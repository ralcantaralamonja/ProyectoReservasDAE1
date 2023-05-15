package Reserva;

import java.util.Date;

public class Hotel {

String Cod_Ho = "";
String Dir_Hc = "";
String Tel_Hc = "";

    public Hotel(String cod_Hot, String dir_Hc, String tel_Hc, Date fec_Const) {
        Cod_Ho = Cod_Ho;
        Dir_Hc = Dir_Hc;
        Tel_Hc = tel_Hc;
        Fec_Const = fec_Const;
    }

    public String getCod_Hot() {
        return Cod_Ho;
    }

    public void setCod_Hot(String cod_Hot) {
        Cod_Ho = cod_Hot;
    }

    Date Fec_Const ;

    public String getDir_Hc() {
        return Dir_Hc;
    }

    public void setDir_Hc(String dir_Hc) {
        Dir_Hc = dir_Hc;
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
