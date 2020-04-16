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
    QLDS qldsHS = new QLDS();
    QLDS qldsGVHD = new QLDS();
    public QLDS getQldsHS() {
        return qldsHS;
    }

    public QLDS getQldsGVHD() {
        return qldsGVHD;
    }
    
    public LopHoc() {
     
    }
    
    public void themHocSinh(HocSinh hs){
        qldsHS.them(hs);
    }
    public void themGVGD(GiaoVien gv){
        qldsGVHD.them(gv);
    }
    public void inDSHS(){
        qldsHS.inDS();
    }
    public void inDSGVHD(){
        qldsGVHD.inDS();
    }
    
}
