/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author TranHuyThinh
 */
public class soSanhTheoTen implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien obj1, SinhVien obj2) {
        String t1 = obj1.getHoTen();
        String t2 = obj2.getHoTen();
        if(t1.compareTo(t2)>0) return 1;
        else if(t1.compareTo(t2)==0) return 0;
        else return -1;
    }
  
}
