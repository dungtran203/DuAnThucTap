package com.DuAnThucTap.model.request.create_request;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.entity.ThuHang;
import com.DuAnThucTap.entity.VoucherThuHang;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
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
public class CreateChiTietVoucherThuHangRequest {

    private Integer id;

    @NotNull(message = "Thứ hạng không để trống")
    private ThuHang thuHang;

    @NotNull(message = "Thứ hạng không để trống")
    private VoucherThuHang voucherThuHang;

    @NotNull(message = "Số lượng không để trống")
    @Min(value = 1, message = "Số lượng là số nguyên và lớn hơn 0")
    private Integer soLuong;

    @Enumerated(EnumType.STRING)
    private ApplicationConstant.TrangThaiVoucher trangThai;

    private LocalDate ngayTao;

    private LocalDate ngayCapNhat;
}
