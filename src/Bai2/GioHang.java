/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.ArrayList;

/**
 *
 * @author TranHuyThinh
 */
public class GioHang {
    private IThanhToan thanhToan;
    private ArrayList<HangHoa> dsHH;

    public GioHang() {
        dsHH = new ArrayList<>();
    }

    public void setThanhToan(IThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }
    
    public void themHH(HangHoa p){
        dsHH.add(p);
    }
    
    public double ThanhToan(){
        int sum = 0;
        for (int i = 0; i < dsHH.size(); i++) {
            sum += thanhToan.thanhToan(dsHH.get(i).getGia());
        }
        return sum;
    }
    
    public void inDS(){
        System.out.println("Mat hang" +"\t\t" + "Mo ta" + "\t" + "Gia");
        for (int i = 0; i < dsHH.size(); i++) {
            dsHH.get(i).ThongTin();    
        }
    }
}
