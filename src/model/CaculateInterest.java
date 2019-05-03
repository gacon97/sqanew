/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author nam
 */
public class CaculateInterest {
    private int thang;
    private ArrayList<Double> tienGocConLai;
    private ArrayList<Double> tienLaiTraHangThang;
    private Double gocTraHangThang;
    private ArrayList<Double> tongTienTraHangThang;

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public ArrayList<Double> getTienGocConLai() {
        return tienGocConLai;
    }

    public void setTienGocConLai(ArrayList<Double> tienGocConLai) {
        this.tienGocConLai = tienGocConLai;
    }

    public ArrayList<Double> getTienLaiTraHangThang() {
        return tienLaiTraHangThang;
    }

    public void setTienLaiTraHangThang(ArrayList<Double> tienLaiTraHangThang) {
        this.tienLaiTraHangThang = tienLaiTraHangThang;
    }

    public Double getGocTraHangThang() {
        return gocTraHangThang;
    }

    public void setGocTraHangThang(Double gocTraHangThang) {
        this.gocTraHangThang = gocTraHangThang;
    }

    public ArrayList<Double> getTongTienTraHangThang() {
        return tongTienTraHangThang;
    }

    public void setTongTienTraHangThang(ArrayList<Double> tongTienTraHangThang) {
        this.tongTienTraHangThang = tongTienTraHangThang;
    }

   
    
}
