/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author TranHuyThinh
 */
public class SinhVien {
    private String hoTen;
    private Date ngaySinh;
    private float diemTB;

    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }
    
    public void inTT(){
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
        String strD = f.format(ngaySinh); //chuyen doi Date->String
        System.out.println(hoTen +"\t"+ strD +"\t"+ diemTB);
    }
}
