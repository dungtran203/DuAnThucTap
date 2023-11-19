package com.DuAnThucTap.repository;

import com.DuAnThucTap.entity.GiaoDich;
import com.DuAnThucTap.entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GiaoDichRepository extends JpaRepository<GiaoDich, Integer> {
    List<GiaoDich> getGiaoDichByHoaDon(HoaDon hoaDon);
}
