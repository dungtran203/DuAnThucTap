package com.DuAnThucTap.entity;

import com.DuAnThucTap.common.ApplicationConstant;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
@Entity
@Table(name = "giao_dich")
public class GiaoDich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "hoa_don_id")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "khach_hang_id")
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "nhan_vien_id")
    private NhanVien nhanVien;

    @Column(name = "trang_thai_giao_dich")
    @Enumerated(EnumType.STRING)
    private ApplicationConstant.TrangThaiGiaoDich trangThaiGiaoDich;

    @Column(name = "phuong_thuc_thanh_toan")
    @Enumerated(EnumType.STRING)
    private ApplicationConstant.HinhThucThanhToan phuongThucThanhToan;

    @Column(name = "ngay_tao")
    private LocalDate ngayTao;

    @Column(name = "so_tien_chuyen_khoan")
    private BigDecimal soTienChuyenKhoan;

    @Column(name = "so_tien_mat")
    private BigDecimal soTienMat;

    @Column(name = "ngay_cap_nhat")
    private LocalDate ngayCapNhat;

    @Column(name = "loai_giao_dich")
    @Enumerated(EnumType.STRING)
    private ApplicationConstant.LoaiGiaoDich loaiGiaoDich;

   }
