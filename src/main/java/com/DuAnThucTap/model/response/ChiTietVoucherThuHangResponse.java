package com.DuAnThucTap.model.response;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.entity.ThuHang;
import com.DuAnThucTap.entity.VoucherThuHang;
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
public class ChiTietVoucherThuHangResponse {
    private Integer id;
    private ThuHang thuHang;
    private VoucherThuHang voucherThuHang;
    private Integer soLuong;
    @Enumerated(EnumType.STRING)
    private ApplicationConstant.TrangThaiVoucher trangThai;
    private LocalDate ngayTao;
    private LocalDate ngayCapNhat;
}
