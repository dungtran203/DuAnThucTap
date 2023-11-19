package com.DuAnThucTap.model.response;

import com.DuAnThucTap.common.ApplicationConstant;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class QuyDinhResponse {

    private Integer id;

    @Enumerated(EnumType.STRING)
    private ApplicationConstant.TrangThaiQuyDinh trangThai;

    private LocalDate ngayTao;

    private LocalDate ngayCapNhat;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime ngayDatLaiThuHang;
}
