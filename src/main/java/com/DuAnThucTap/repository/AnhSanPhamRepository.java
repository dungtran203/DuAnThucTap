package com.DuAnThucTap.repository;

import com.DuAnThucTap.entity.AnhSanPham;
import com.DuAnThucTap.entity.SanPham;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AnhSanPhamRepository extends JpaRepository<AnhSanPham,Integer> {
    @Transactional
    void deleteAllBySanPham(SanPham sanPham);

    List<AnhSanPham> getAnhSanPhamBySanPham(SanPham sanPham);

    @Transactional
    @Modifying
    @Query(value = "UPDATE AnhSanPham m SET m.trangThai = 'INACTIVE', m.ngayCapNhat = :now WHERE m.id = :id")
    void delete(@Param("id") Integer id, @Param("now") LocalDate now);
}
