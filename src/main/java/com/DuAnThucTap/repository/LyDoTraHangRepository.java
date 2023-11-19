package com.DuAnThucTap.repository;

import com.DuAnThucTap.entity.LyDoTraHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LyDoTraHangRepository extends JpaRepository<LyDoTraHang,Integer> {
}
