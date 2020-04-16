
import Modules.CaNhan;
import Modules.GiaoVien;
import Modules.HocSinh;
import Modules.LopHoc;
import Modules.QLDS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Baitap1Main {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh("10A1", "BOI", "Nguyen Xuan Huy", 16, "Ninh Thuan", "Khongco");
        HocSinh hs2 = new HocSinh("10A1", "Chay", "Nguyen Xuan Hoang", 16, "Ninh Thuan", "0123456");
        HocSinh hs3 = new HocSinh("10A2", "Đá Bóng", "Nguyen Xuan Hai", 16, "Khanh Hoa", "05423");
        HocSinh hs4 = new HocSinh("10A2", "Bơi", "Nguyen Xuan Hung", 16, "Binh Thuan", "012321");
        HocSinh hs5 = new HocSinh("10A3", "Chạy", "Nguyen Xuan Phong", 16, "Cam Ranh", "0123213");
        
        GiaoVien gv1 = new GiaoVien("Toán", "Toán", "Nguyễn Thị Thủy", 32, "Ninh Thuan", "0123423");
        GiaoVien gv2 = new GiaoVien("Lịch Sử", "KHXH", "Trần Thị Kim Ngân", 46, "Ninh Thuan", "0233423");
        GiaoVien gv3 = new GiaoVien("Văn", "KHXH", "Nguyễn Văn Toàn", 23, "Ninh Thuan", "233423");
        //thêm vào học sinh và giáo viên vào lớp học
        LopHoc lh1 = new LopHoc();
        lh1.themHocSinh(hs1);
        lh1.themHocSinh(hs2);
        lh1.themHocSinh(hs3);
        lh1.themHocSinh(hs4);
        lh1.themHocSinh(hs5);
        
        lh1.themGVGD(gv1);
        lh1.themGVGD(gv2);
        lh1.themGVGD(gv3);
        //in lớp học
        System.out.println("Danh Sách Học Sinh");
        lh1.inDSHS();
        System.out.println("Danh Sách Giáo Viên");
        lh1.inDSGVHD();
        
       //thêm cá nhân 
       System.out.println("---------------------------------------");
       System.out.println("Thêm Danh Sách");
        CaNhan cn1 = new HocSinh("10A1", "Rubik", "Trần Văn Cảnh", 18, "Gò Vấp", "0123241");
        CaNhan cn2 = new HocSinh("10A2", "Bơi", "Lê Văn Luyênh", 18, "Gò Ấp", "912313");
        CaNhan cn3 = new GiaoVien("Vật Lý", "Toán", "Trần Văn Lượng", 54, "Tân An","0127753");
        
        QLDS qldsHS = new QLDS();
        QLDS qldsGVHD = new QLDS();
        
        qldsHS.them(cn1);
        qldsGVHD.them(cn3);
        
        qldsHS.inDS();
        qldsGVHD.inDS(); 
        //xóa
        System.out.println("SDanh sách sau khi xóa: ");
        qldsHS.xoa("Trần Văn Cảnh");
        qldsHS.inDS();
        qldsGVHD.inDS(); 
    }
}
