package com.pareandroid.infocovid_19.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelDaerahIdn {
//    @SerializedName("lastUpdate")
//    private String lastUpdate;
//    @SerializedName("confirmed")
//    private IdnConfirmed idnConfirmed;
//    @SerializedName("recovered")
//    private IdnRecovered idnRecovered;
//    @SerializedName("deaths")
//    private IdnDeaths idnDeaths;

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("positif")
    @Expose
    private String positif;
    @SerializedName("sembuh")
    @Expose
    private String sembuh;
    @SerializedName("meninggal")
    @Expose
    private String meninggal;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getPositif() {
        return positif;
    }

    public void setPositif(String positif) {
        this.positif = positif;
    }



    public String getSembuh() {
        return sembuh;
    }

    public void setSembuh(String sembuh) {
        this.sembuh = sembuh;
    }

    public String getMeninggal() {
        return meninggal;
    }

    public void setMeninggal(String meninggal) {
        this.meninggal = meninggal;
    }

//    public String getLastUpdate() {
//        return lastUpdate;
//    }
//
//    public void setLastUpdate(String lastUpdate) {
//        this.lastUpdate = lastUpdate;
//    }
//
//    public IdnConfirmed getIdnConfirmed() {
//        return idnConfirmed;
//    }
//
//    public void setIdnConfirmed(IdnConfirmed idnConfirmed) {
//        this.idnConfirmed = idnConfirmed;
//    }
//
//    public IdnDeaths getIdnDeaths() {
//        return idnDeaths;
//    }
//
//    public void setIdnDeaths(IdnDeaths idnDeaths) {
//        this.idnDeaths = idnDeaths;
//    }
//
//    public IdnRecovered getIdnRecovered() {
//        return idnRecovered;
//    }
//
//    public void setIdnRecovered(IdnRecovered idnRecovered) {
//        this.idnRecovered = idnRecovered;
//    }

//    public class IdnConfirmed {
//        @SerializedName("value")
//        private int value;
//        @SerializedName("detail")
//        private String detail;
//
//        public IdnConfirmed(int value, String detail) {
//            this.value = value;
//            this.detail = detail;
//        }
//
//        public int getValue() {
//            return value;
//        }
//
//        public void setValue(int value) {
//            this.value = value;
//        }
//
//        public String getDetail() {
//            return detail;
//        }
//
//        public void setDetail(String detail) {
//            this.detail = detail;
//        }
//    }
//
//    public class IdnDeaths {
//        @SerializedName("value")
//        private int value;
//        @SerializedName("detail")
//        private String detail;
//
//        public IdnDeaths(int value, String detail) {
//            this.value = value;
//            this.detail = detail;
//        }
//
//        public int getValue() {
//            return value;
//        }
//
//        public void setValue(int value) {
//            this.value = value;
//        }
//
//        public String getDetail() {
//            return detail;
//        }
//
//        public void setDetail(String detail) {
//            this.detail = detail;
//        }
//    }
//
//    public class IdnRecovered {
//        @SerializedName("value")
//        private int value;
//        @SerializedName("detail")
//        private String detail;
//
//        public IdnRecovered(int value, String detail) {
//            this.value = value;
//            this.detail = detail;
//        }
//
//        public int getValue() {
//            return value;
//        }
//
//        public void setValue(int value) {
//            this.value = value;
//        }
//
//        public String getDetail() {
//            return detail;
//        }
//
//        public void setDetail(String detail) {
//            this.detail = detail;
//        }
//    }

}
