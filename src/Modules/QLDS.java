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
public class QLDS  implements IQLDS{
    ArrayList<CaNhan> dsCN= new ArrayList<CaNhan>(); 

    public QLDS() {
    }
    @Override
    public void them(CaNhan cn) {
         dsCN.add(cn);
    }

    @Override
    public void xoa(String ten) {
         for(int i=0; i < dsCN.size(); i++)
        {   
            if(dsCN.get(i).getHoTen() == ten)
                dsCN.remove(dsCN.get(i));
        }
    }

    @Override
    public void inDS() {
        for(var x :dsCN)
        {
            System.out.println(x.HienThi());
        }
    }
    
       
}
