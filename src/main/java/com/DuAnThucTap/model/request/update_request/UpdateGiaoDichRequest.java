package com.DuAnThucTap.model.request.update_request;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.entity.HoaDon;
import com.DuAnThucTap.entity.KhachHang;
import com.DuAnThucTap.entity.NhanVien;
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
public class UpdateGiaoDichRequest {

    private Integer id;

//    @NotNull(message = "Hóa đơn không để trống")
    private HoaDon hoaDon;

//    @NotNull(message = "Khách hàng không để trống")
    private KhachHang khachHang;

//    @NotNull(message = "Nhân viên không để trống")
    private NhanVien nhanVien;

    @Enumerated(EnumType.STRING)
    private ApplicationConstant.TrangThaiGiaoDich trangThaiGiaoDich;

    @Enumerated(EnumType.STRING)
    private ApplicationConstant.HinhThucThanhToan phuongThucThanhToan;

    private BigDecimal soTienChuyenKhoan;

    private BigDecimal soTienMat;

    private LocalDate ngayTao;

    private LocalDate ngayCapNhat;

    @Enumerated(EnumType.STRING)
    private ApplicationConstant.LoaiGiaoDich loaiGiaoDich;
}
