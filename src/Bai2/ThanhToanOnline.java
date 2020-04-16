/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author TranHuyThinh
 */
public class ThanhToanOnline implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000) return tienHang*95/100; //giam 5%
        else return tienHang*93/100; //giam 7%
    }
    
}
