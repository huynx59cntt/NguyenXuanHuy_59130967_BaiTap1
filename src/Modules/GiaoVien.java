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
public class GiaoVien extends CaNhan{
    String monDay;
    String toBoMon;
    //constructor

    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
    }

    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }
    //set

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }
    //get

    public String getMonDay() {
        return monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }
    //hien thị
    @Override
    public String HienThi() {
        return "TenGV: " + hoTen + "\ntuoi: " + tuoi + "\nDiaChi: " 
                +"\nSDT: " + sdt + "\nMonDay: " + monDay + "\nToBoMon: " + toBoMon;
    } 
}
