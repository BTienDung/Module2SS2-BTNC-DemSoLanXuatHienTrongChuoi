package season_2.DemSoLanXuatHienCuaKyTu;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap chuoi: ");
        String chuoi = sc.nextLine();
        System.out.printf("Nhap ky tu can dem: ");
        char nhapKyTu = sc.nextLine().charAt(0);
        int dem = 0;
        int vitri=0;
        for (int i=0;i<chuoi.length();i++){
            if (nhapKyTu == chuoi.charAt(i) ){
                vitri = i;
                dem++;
            }
        }


        if (dem!=0){
            System.out.printf("Ki tu ban nhap xuat hien: "+dem+" lan.");
        } else {
            System.out.printf("\nKi tu nhap vao khong co trong chuoi.");
        }
        if (vitri!=0){
            System.out.println("\nO vi tri thu"+(vitri+1));
        }
    }
}
