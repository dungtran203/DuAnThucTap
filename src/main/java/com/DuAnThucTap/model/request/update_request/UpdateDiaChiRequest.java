package com.DuAnThucTap.model.request.update_request;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.entity.KhachHang;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
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
public class UpdateDiaChiRequest {

    private Integer id;
    private KhachHang khachHang;
//    @NotBlank(message = "Tên không để trống")
    private String hoTen;
//    @NotBlank(message = "Số điện thoại không để trống")
//    @Size(max = 10,  message = "Số điện thoại không vượt quá 10 số")
//    @Size(min = 10,  message = "Số điện thoại không được nhỏ hơn 10 số")
    private String sdt;
    @NotBlank(message = "Địa chỉ chi tiết không để trống")
    private String diaChiChiTiet;
    private String maTinh;
    private String tenTinh;
    private String maQuanHuyen;
    private String tenQuanHuyen;
    private String maPhuongXa;
    private String tenPhuongXa;
    private LocalDate ngayTao;
    private LocalDate ngayCapNhap;

    @Enumerated(EnumType.STRING)
    private ApplicationConstant.TrangThaiDiaChi trangThai;
}
