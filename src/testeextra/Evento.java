
package testeextra;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private String latitude;
    private String longitude;
    private String dataHora;
    private String desc;

    public Evento() {
    }

    public Evento(String nome, String latitude, String longitude, String dataHora, String desc) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.dataHora = dataHora;
        this.desc = desc;
    }

    public Evento(String latitude, String longitude, String dataHora, String desc) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.dataHora = dataHora;
        this.desc = desc;
    }
    
    public Evento (String nome)
    {
        this.nome = nome;
    }

    

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return this.nome;
                }
    
    
}
