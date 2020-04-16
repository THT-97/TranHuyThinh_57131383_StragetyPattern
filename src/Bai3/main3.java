/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author TranHuyThinh
 */
public class main3 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy"); //Dinh dang ngay
        SinhVien s1 =  new SinhVien("Nguyen Van A", f.parse("01-12-2000"), 8.0f);
        SinhVien s2 = new SinhVien("Le Thi B", f.parse("15-4-1999"), 5.0f);
        SinhVien s3 = new SinhVien("Tran Van C", f.parse("25-7-2000"), 7.5f);
        
        QLSV dsSV = new QLSV();
        //Tao DS
        dsSV.them(s1);
        dsSV.them(s2);
        dsSV.them(s3);
        //Sap xep
        System.out.println("Sap xep theo HoTen:");
        dsSV.setSoSanh(new soSanhTheoTen());
        dsSV.sapXep();
        dsSV.inDS();
        System.out.println("\nSap xep theo Diem:");
        dsSV.setSoSanh(new soSanhTheoDiem());
        dsSV.sapXep();
        dsSV.inDS();
    }
    
}
