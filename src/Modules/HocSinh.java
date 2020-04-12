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
public class HocSinh extends CaNhan{
    String lop;
    String nangKhieu;
    //constructor

    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
    }

    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }
    //set

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
    //get

    public String getLop() {
        return lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }
    
    @Override
    public String HienThi() {
        return "TenGV: " + hoTen + "\ntuoi: " + tuoi + "\nDiaChi: " 
                +"\nSDT: " + sdt + "\nLop: " + lop + "\nNangKhieu: " + nangKhieu;
    }
    
}
