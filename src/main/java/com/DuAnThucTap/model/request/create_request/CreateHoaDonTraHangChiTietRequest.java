package com.DuAnThucTap.model.request.create_request;

import com.DuAnThucTap.entity.ChiTietSanPham;
import com.DuAnThucTap.entity.HoaDonTraHang;
import com.DuAnThucTap.entity.LyDoTraHang;
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
public class CreateHoaDonTraHangChiTietRequest {

    private Integer id;

    private HoaDonTraHang hoaDonTraHang;

    private ChiTietSanPham chiTietSanPham;

    private LyDoTraHang lyDoTraHang;

    private String tenSanPham;

    private String tenHang;

    private String kichThuoc;

    private String mauSac;

    private BigDecimal giaBan;

    private String soLuongTra;

    private String traHang;

    private String lyDo;

    private LocalDate ngayTao;

    private LocalDate ngayCapNhat;

    private String trangThai;
}
