package com.DuAnThucTap.model.request.update_request;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.entity.ChiTietVoucherThuHang;
import com.DuAnThucTap.entity.KhachHang;
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
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class UpdateViVoucherRequest {
    private Integer id;
    private KhachHang khachHang;
    private ChiTietVoucherThuHang chiTietVoucherThuHang;
    private String ma;
    private LocalDateTime ngayBatDau;
    private LocalDateTime ngayKetThuc;
    private BigDecimal soTienGiam;
    private BigDecimal giaTriDonHangToiThieu;
    private LocalDate ngayTao;
    private LocalDate ngayCapNhat;
    @Enumerated(EnumType.STRING)
    private ApplicationConstant.TrangThaiViVoucher trangThai;

}
