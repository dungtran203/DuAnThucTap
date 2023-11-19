package com.DuAnThucTap.model.request.update_request;

import com.DuAnThucTap.common.ApplicationConstant;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
public class UpdateVaiTroRequest {

    private Integer id;

    private String ma;

    @NotBlank(message = "Tên không để trống")
    @Size(min = 0, max = 45, message = "Email không vượt quá 45 ký tự")
    private String ten;

    private LocalDate ngayTao;

    private LocalDate ngayCapNhap;

    @Enumerated(EnumType.STRING)
    private ApplicationConstant.TrangThaiVaiTro trangThai;
}
