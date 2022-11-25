package repository;

import java.util.ArrayList;
import model.SinhVien;
import java.sql.*;

public class SV_Repository {

    public ArrayList<SinhVien> getAll() {
        ArrayList<SinhVien> listSV = new ArrayList<>();
        String sql = "select * from sinhvien";
        try ( Connection connect = DBConnection.getConnection();  PreparedStatement ps = connect.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSV(rs.getString(1));
                sv.setTenSV(rs.getString(2));
                sv.setTenLop(rs.getString(3));
                sv.setGioiTinh(Integer.parseInt(rs.getString(4)));

                listSV.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSV;
    }

    public void them(SinhVien sv) {
//        ArrayList<SinhVien> SV = new ArrayList<>();
        String sql = "INSERT INTO sinhvien (Ma, TenSV, Tenlop, Gioitinh) VALUES (?,?,?,?)";
        try ( Connection connect = DBConnection.getConnection();  PreparedStatement ps = connect.prepareStatement(sql)) {
            ps.setObject(1, sv.getMaSV());
            ps.setObject(2, sv.getTenSV());
            ps.setObject(3, sv.getTenLop());
            ps.setObject(4, sv.getGioiTinh());

            ps.executeUpdate();

        } catch (Exception e) {
        }
    }
    
    public void sua(SinhVien sinhvienNew){
        String sql = "";
    }
    
    public void xoa(String ma){
        String sql = "delete from sinhvien where Ma = ?";
        try (Connection connect = DBConnection.getConnection(); PreparedStatement ps = connect.prepareStatement(sql)){
            ps.setString(1, ma);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        ArrayList<SinhVien> listsv = new SV_Repository().getAll();
        System.out.println(listsv.toString());
    }
}
