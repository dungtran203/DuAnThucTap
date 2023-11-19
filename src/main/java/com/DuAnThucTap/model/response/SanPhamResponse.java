package com.DuAnThucTap.model.response;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.entity.CauThu;
import com.DuAnThucTap.entity.ChatLieu;
import com.DuAnThucTap.entity.CoAo;
import com.DuAnThucTap.entity.CongNghe;
import com.DuAnThucTap.entity.DongSanPham;
import com.DuAnThucTap.entity.LoaiSanPham;
import com.DuAnThucTap.entity.MauSac;
import com.DuAnThucTap.entity.NhaSanXuat;
import com.DuAnThucTap.entity.NuocSanXuat;
import com.DuAnThucTap.entity.ThuongHieu;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class SanPhamResponse {
    private Integer id;
    private MauSac mauSac;
    private LoaiSanPham loaiSanPham;
    private ChatLieu chatLieu;
    private DongSanPham dongSanPham;
    private CauThu cauThu;
    private NhaSanXuat nhaSanXuat;
    private ThuongHieu thuongHieu;
    private NuocSanXuat nuocSanXuat;
    private CongNghe congNghe;
    private CoAo coAo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate namSanXuat;
    private String ma;
    private String ten;
    private BigDecimal gia;
    private String moTa;
    private String maVach;
    private LocalDate ngayTao;
    private LocalDate ngayCapNhat;
    @Enumerated(EnumType.STRING)
    private ApplicationConstant.TrangThaiTaiKhoan trangThai;
}
