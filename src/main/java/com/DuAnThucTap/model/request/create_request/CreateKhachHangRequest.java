package com.DuAnThucTap.model.request.create_request;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.entity.ThuHang;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class CreateKhachHangRequest {

    private Integer id;
    private ThuHang thuHang;

    @NotBlank(message = "Không Được để Trống")
    private String ten;

    private String ma;

    @NotNull(message = "Không Được để Trống")
    private Boolean gioiTinh;

    @NotNull(message = "Không Được để Trống")
    private LocalDate ngaySinh;

    @NotBlank(message = "Không Được để Trống")
    private String diaChi;

    @NotBlank(message = "Không Được để Trống")
    private String sdt;

    @NotBlank(message = "Không Được để Trống")
    @Email(message = "Email Không Hợp Lệ")
    private String email;

    private String matKhau;
    private LocalDate ngayTao;
    private LocalDate ngayCapNhat;

    @Enumerated(EnumType.STRING)
    private ApplicationConstant.TrangThaiTaiKhoan trangThai;

//    @NotNull(message = "Không Được để Trống")
    @Lob
    private Blob anh;

    private Integer soLuongDonHangThanhCong;

    private BigDecimal soTienDaChiTieu;

//    @NotBlank(message = "Không Được để Trống")
    private String soCanCuocCongDan;


}
