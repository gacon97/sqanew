/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author nam
 */
public class Register implements Serializable {
    private int id, CMTND, thuNhap, soTienVay;
    private String tenKH, diaChi, gioiTinh, ngheNghiep, soDT;
    private Date ngayTao; // dd/mm/yyyy

    public Register() {
    }

    
    
    public Register(int id, int CMTND, String soDT, int thuNhap, int soTienVay, String tenKH, String diaChi, String gioiTinh, String ngheNghiep, Date ngayTao) {
        this.id = id;
        this.CMTND = CMTND;
        this.soDT = soDT;
        this.thuNhap = thuNhap;
        this.soTienVay = soTienVay;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.ngheNghiep = ngheNghiep;
        this.ngayTao = ngayTao;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCMTND() {
        return CMTND;
    }

    public void setCMTND(int CMTND) {
        this.CMTND = CMTND;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public int getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(int thuNhap) {
        this.thuNhap = thuNhap;
    }

    public int getSoTienVay() {
        return soTienVay;
    }

    public void setSoTienVay(int soTienVay) {
        this.soTienVay = soTienVay;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
    
}
