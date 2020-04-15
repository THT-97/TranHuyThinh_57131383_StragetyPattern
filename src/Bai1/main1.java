/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import Bai1.Cong;
import Bai1.Tru;
import Bai1.tinhToan;

/**
 *
 * @author TranHuyThinh
 */
public class main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       tinhToan bieuthuc = new tinhToan();
       //75 + 12
       bieuthuc.setTinh(new Cong());
       System.out.println("75 + 12 = " + bieuthuc.thucHienTinh(75, 12));
       
       //54 - 78
       bieuthuc.setTinh(new Tru());
       System.out.println("54 - 78 = " + bieuthuc.thucHienTinh(54, 78));
    }
    
}
