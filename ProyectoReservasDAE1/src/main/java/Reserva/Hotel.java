package Reserva;

import java.util.Date;

public class Hotel {
String Dir_Hc = "";
String Tel_Hc = "";
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

    public Hotel(String dir_Hc, String tel_Hc, Date fec_Const) {
        Dir_Hc = dir_Hc;
        Tel_Hc = tel_Hc;
        Fec_Const = fec_Const;
    }
}
