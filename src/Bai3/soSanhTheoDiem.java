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
public class soSanhTheoDiem implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien obj1, SinhVien obj2){
        float d1 = obj1.getDiemTB();
        float d2 = obj2.getDiemTB();
        if(d1 > d2) return 1;
        else if(d1 == d2) return 0;
        else return -1;
    }
    
}
