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
public class ThanhToanCOD implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang > 2000000) return tienHang*98/100; //giam 2%
        else return tienHang;
    }
    
}
