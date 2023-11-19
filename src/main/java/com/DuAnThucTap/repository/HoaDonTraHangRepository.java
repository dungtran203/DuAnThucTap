package com.DuAnThucTap.repository;

import com.DuAnThucTap.entity.HoaDonTraHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoaDonTraHangRepository extends JpaRepository<HoaDonTraHang,Integer> {
}
