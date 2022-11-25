package service;

import java.util.ArrayList;
import java.util.List;
import model.SinhVien;
import repository.SV_Repository;

public class SV_Service {

    SV_Repository svRepo = new SV_Repository();

    public ArrayList<SinhVien> getalldata() {
        return svRepo.getAll();
    }

    public void them(SinhVien sv) {
        svRepo.them(sv);
    }
    public void xoa(String ma){
        svRepo.xoa(ma);
    }

    public static void main(String[] args) {
        List<SinhVien> list = new SV_Service().getalldata();
        System.out.println(list);
    }
}
