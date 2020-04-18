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
public class main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GioHang ghOnline = new GioHang();
        GioHang ghCOD = new GioHang();
        HangHoa p1 = new HangHoa("Vaio NoteBookLaptop", 8000000, "Silver");
        HangHoa p2 = new HangHoa("Casio Calculator", 300000, "Black");
        HangHoa p3 = new HangHoa("Senko StandingFan", 1500000, "Green");
        
        //Gio hang Online
        ghOnline.setThanhToan(new ThanhToanOnline());
        ghOnline.themHH(p2);
        ghOnline.themHH(p3);
        System.out.println("THANH TOAN ONLINE");
        ghOnline.inDS();
        System.out.println("So tien thanh toan: " + ghOnline.ThanhToan());
        
        //Gio hang COD
        ghCOD.setThanhToan(new ThanhToanCOD());
        ghCOD.themHH(p1);
        ghCOD.themHH(p3);
        System.out.println("\nTHANH TOAN COD");
        ghCOD.inDS();
        System.out.println("So tien thanh toan: " + ghCOD.ThanhToan());
    }
    
}
