package com.DuAnThucTap.model.response;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.entity.ChiTietSanPham;
import com.DuAnThucTap.entity.KhachHang;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class GioHangChiTietResponse {
    private Integer id;
    private ChiTietSanPham chiTietSanPham;
    private KhachHang khachHang;
    private Integer soLuong;
    private LocalDate ngayTao;
    private LocalDate ngayCapNhat;
    @Enumerated(EnumType.STRING)
    private ApplicationConstant.TrangThaiGioHangChiTiet trangThai;
}
