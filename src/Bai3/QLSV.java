/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.ArrayList;
/**
 *
 * @author TranHuyThinh
 */
public class QLSV {
    private ISoSanh<SinhVien> soSanh;
    private ArrayList<SinhVien> ds;

    public QLSV() {
        ds = new ArrayList<>();
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    
    public void them(SinhVien sv){
        ds.add(sv);
    }
    
    public void sapXep(){
        int l = ds.size();
        SinhVien temp;
        for (int i = 0; i < l-1; i++) {
            for (int j = i+1; j < l; j++) {
                if(soSanh.soSanh(ds.get(i), ds.get(j))>0){ //swap
                    temp = ds.get(i);
                    ds.set(i, ds.get(j));
                    ds.set(j, temp);
                }
            }
        }
    }
    
    public void inDS(){
        System.out.println("Ho ten" +"\t\t"+ "Ngay sinh" +"\t"+ "DTB");
        for (int i = 0; i < ds.size(); i++) {
            ds.get(i).inTT();
        }
    }
}
