package View;

import Business.Inputhocsinh;
import Business.Inputmonhoc;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner scn=new Scanner(System.in);
    public static int Menu()
    {
        System.out.println(" ------------------------------------------------");
        System.out.println("|            1. Quản lý học sinh                 |");
        System.out.println("|            2. Quản lý điểm                     |");
        System.out.println("|            3. Thoát                            |");
        System.out.println(" ------------------------------------------------");
        int n;
        do {
            n=Integer.parseInt(scn.nextLine());
        }while (n<1||n>3);
        return n;
    }
    public static int Menuhs()
    {
        System.out.println(" ------------------------------------------------------------");
        System.out.println("|             1. Thêm học sinh                               |");
        System.out.println("|             2. Hiện học sinh                               |");
        System.out.println("|             3. Tìm thông tin học sinh                      |");
        System.out.println("|             4. Sửa thông tin học sinh                      |");
        System.out.println("|             5. Xóa học sinh                                |");
        System.out.println("|             6. Quay lại                                    |");
        System.out.println(" ------------------------------------------------------------");
        int n;
        do {
            n=Integer.parseInt(scn.nextLine());
        }while (n<1||n>6);
        return n;
    }
    public static int Menumh()
    {
        System.out.println(" ------------------------------------------------------------");
        System.out.println("|             1. Nhập điểm học sinh                          |");
        System.out.println("|             2. Hiện điểm học sinh                          |");
        System.out.println("|             3. Tìm điểm học sinh                           |");
        System.out.println("|             4. Xóa điểm học sinh                           |");
        System.out.println("|             5. Hiện học sinh giỏi                          |");
        System.out.println("|             6. Hiện học sinh trượt                         |");
        System.out.println("|             7. Thống kê học sinh giỏi                      |");
        System.out.println("|             8. Thống kê học sinh trượt                     |");
        System.out.println("|             9. Quay lại                                    |");
        System.out.println(" ------------------------------------------------------------");
        int n;
        do {
            n=Integer.parseInt(scn.nextLine());
        }while (n<1||n>9);
        return n;
    }
    public static void Run() throws IOException {
        do {
            int chon=0;
            chon=Menu();
            switch (chon)
            {
                case 1:
                    do {
                        chon=Menuhs();
                        switch (chon)
                        {
                            case 1:
                                Inputhocsinh.Them();
                                break;
                            case 2:
                                Inputhocsinh.Hien();
                                scn.nextLine();
                                break;
                            case 3:
                                System.out.print("Nhập mã học sinh cần tìm: ");
                                String ma1=scn.nextLine();
                                Inputhocsinh.Tim(ma1);
                                scn.nextLine();
                                break;
                            case 4:
                                System.out.print("Nhập mã học sinh cần sửa: ");
                                String ma2=scn.nextLine();
                                Inputhocsinh.Sua(ma2);
                                break;
                            case 5:
                                System.out.print("Nhập mã học sinh cần xóa: ");
                                String ma3=scn.nextLine();
                                Inputhocsinh.Xoa(ma3);
                                break;
                        }
                    }while (chon>=1&&chon<=5);
                    break;
                case 2:
                    do {
                        chon=Menumh();
                        switch (chon)
                        {
                            case 1:
                                Inputmonhoc.Them();
                                break;
                            case 2:
                                Inputmonhoc.Hien();
                                break;
                            case 3:
                                System.out.print("Nhập mã học sinh cần tìm điểm: ");
                                String ma=scn.nextLine();
                                Inputmonhoc.Tradiem(ma);
                                break;
                            case 4:
                                System.out.print("Nhập mã học sinh cần xóa điểm: ");
                                String ma1=scn.nextLine();
                                Inputmonhoc.Xoa(ma1);
                                break;
                            case 5:
                                Inputmonhoc.HienHSG();
                                break;
                            case 6:
                                Inputmonhoc.Hienhoclai();
                                break;
                            case 7:
                                System.out.println("Có "+Inputmonhoc.Thongkehsg()+" học sinh giỏi");
                                break;
                            case 8:
                                System.out.println("Có "+Inputmonhoc.Thongketruot()+" học sinh trượt");
                                break;
                        }
                    }while (chon>=1&&chon<=8);
                    break;
                case 3:
                    Inputmonhoc.Luu();
                    Inputhocsinh.Luu();
                    System.exit(0);
                    break;
            }
        }while (true);
    }

    public static void main(String[] args) throws IOException {
        Inputmonhoc.Doc();
        Inputhocsinh.Doc();
        Run();
    }
}
