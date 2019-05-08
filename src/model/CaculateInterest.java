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
    private ArrayList<Long> tienGocConLai;
    private ArrayList<Long> tienLaiTraHangThang;
    private Long gocTraHangThang;
    private ArrayList<Long> tongTienTraHangThang;

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public ArrayList<Long> getTienGocConLai() {
        return tienGocConLai;
    }

    public void setTienGocConLai(ArrayList<Long> tienGocConLai) {
        this.tienGocConLai = tienGocConLai;
    }

    public ArrayList<Long> getTienLaiTraHangThang() {
        return tienLaiTraHangThang;
    }

    public void setTienLaiTraHangThang(ArrayList<Long> tienLaiTraHangThang) {
        this.tienLaiTraHangThang = tienLaiTraHangThang;
    }

    public Long getGocTraHangThang() {
        return gocTraHangThang;
    }

    public void setGocTraHangThang(Long gocTraHangThang) {
        this.gocTraHangThang = gocTraHangThang;
    }

    public ArrayList<Long> getTongTienTraHangThang() {
        return tongTienTraHangThang;
    }

    public void setTongTienTraHangThang(ArrayList<Long> tongTienTraHangThang) {
        this.tongTienTraHangThang = tongTienTraHangThang;
    }

    
}
