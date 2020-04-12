/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modules;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class LopHoc {
    ArrayList<HocSinh> dsHS = new ArrayList<HocSinh>(); 
    ArrayList<GiaoVien> dsGV = new ArrayList<GiaoVien>();
    
    public LopHoc() {
    }
    
    public void themHocSinh(HocSinh hs){
        dsHS.add(hs);
    }
    public void themGVGD(GiaoVien gv){
        dsGV.add(gv);
    }
    public void inDSHS(){
        for(var x: dsHS)
        {
            System.out.println(x.HienThi());
        }
    }
    public void inDSGVHD(){
        for(var x: dsGV)
        {
            System.out.println(x.HienThi());
        }
    }
}
