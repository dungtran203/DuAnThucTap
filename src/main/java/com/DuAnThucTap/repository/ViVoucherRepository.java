package com.DuAnThucTap.repository;

import com.DuAnThucTap.entity.KhachHang;
import com.DuAnThucTap.entity.ViVoucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViVoucherRepository extends JpaRepository<ViVoucher,Integer> {

    List<ViVoucher> getViVouchersByKhachHang(KhachHang khachHang);
}
