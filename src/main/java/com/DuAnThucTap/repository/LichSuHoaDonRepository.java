package com.DuAnThucTap.repository;

import com.DuAnThucTap.entity.HoaDon;
import com.DuAnThucTap.entity.LichSuHoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LichSuHoaDonRepository extends JpaRepository<LichSuHoaDon,Integer> {

    List<LichSuHoaDon> getLichSuHoaDonByHoaDon(HoaDon hoaDon);

}
