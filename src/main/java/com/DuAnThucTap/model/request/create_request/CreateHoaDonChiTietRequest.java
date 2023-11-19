package com.DuAnThucTap.model.request.create_request;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.entity.ChiTietSanPham;
import com.DuAnThucTap.entity.HoaDon;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class CreateHoaDonChiTietRequest {

    private Integer id;
    private ChiTietSanPham chiTietSanPham;
    private HoaDon hoaDon;
    private Integer soLuong;
    private BigDecimal donGia;
    private BigDecimal giaBan;
    private LocalDate ngayTao;
    private LocalDate ngayCapNhat;
    @Enumerated(EnumType.STRING)
    private ApplicationConstant.TrangThaiHoaDonChiTiet trangThai;
}
