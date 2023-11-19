package com.DuAnThucTap.repository;

import com.DuAnThucTap.entity.ChiTietSanPham;
import com.DuAnThucTap.entity.HoaDon;
import com.DuAnThucTap.entity.HoaDonChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HoaDonChiTietRepository extends JpaRepository<HoaDonChiTiet,Integer> {

    List<HoaDonChiTiet> getHoaDonChiTietByHoaDon(HoaDon hoaDon);

    HoaDonChiTiet findHoaDonChiTietByHoaDonAndChiTietSanPham(HoaDon hoaDon, ChiTietSanPham chiTietSanPham);


}
