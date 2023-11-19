package com.DuAnThucTap.service.impl;

import com.DuAnThucTap.model.response.ChiTietSanPhamResponse;
import com.DuAnThucTap.service.TrangChuService;
import com.DuAnThucTap.model.mapper.ChiTietSanPhamMapper;
import com.DuAnThucTap.model.mapper.SanPhamMapper;
import com.DuAnThucTap.model.response.SanPhamResponse;
import com.DuAnThucTap.repository.ChiTietSanPhamRepository;
import com.DuAnThucTap.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TrangChuServiceImpl implements TrangChuService {
    @Autowired
    private SanPhamRepository sanPhamRepository;

    @Autowired
    private SanPhamMapper sanPhamMapper;

    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    @Autowired
    private ChiTietSanPhamMapper chiTietSanPhamMapper;

    @Override
    public List<SanPhamResponse> danhSachSanPhamCauThu(Integer id) {
        return sanPhamMapper.listSanPhamEntityToSanPhamResponse(sanPhamRepository.danhSachSanPhamCauThu(id));
    }

    @Override
    public List<ChiTietSanPhamResponse> getChiTietSanPhamBySanPham(Integer idSP)  {
        return chiTietSanPhamMapper.listchiTietSanPhamEntityTochiTietSanPhamResponse(chiTietSanPhamRepository.getChiTietSanPhamBySanPham(sanPhamRepository.findById(idSP).get()));

    }


//    @Override
//    public List<AnhSanPham> pageCauThu() {
//        return trangChuRepository.danhSachCauThuHienThi();
//    }

//    @Override
//    public List<AnhSanPham> getAnhSanPhamBySanPham(SanPham sanPham) {
//        return null;
//    }
}
