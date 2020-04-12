/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modules;

/**
 *
 * @author asus
 */
public abstract class CaNhan {
    String hoTen;
    int tuoi;
    String diaChi;
    String sdt;
    //constructor

    public CaNhan() {
    }

    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    //set

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    //get

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSdt() {
        return sdt;
    }
    
    public abstract String HienThi();
}
