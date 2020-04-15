/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author TranHuyThinh
 */
public class tinhToan {
    private ITinh tinh;

    public tinhToan() {
    }

    public void setTinh(ITinh tinh) {
        this.tinh = tinh;
    }
    
    public float thucHienTinh(float a, float b){
        return tinh.tinh(a, b);
    }
}
