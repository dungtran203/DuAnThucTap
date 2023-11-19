package com.DuAnThucTap.service;

import com.DuAnThucTap.model.request.create_request.CreateLoaiSanPhamRequest;
import com.DuAnThucTap.model.request.update_request.UpdateLoaiSanPhamRequest;
import com.DuAnThucTap.model.response.LoaiSanPhamResponse;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface LoaiSanPhamService {
    Page<LoaiSanPhamResponse> pageLoaiSanPhamActive(Integer pageNo, Integer size);

    List<LoaiSanPhamResponse> getAll();
    Page<LoaiSanPhamResponse> pageLoaiSanPhamInActive(Integer pageNo, Integer size);

    LoaiSanPhamResponse add(CreateLoaiSanPhamRequest createLoaiSanPhamRequest);

    LoaiSanPhamResponse update(UpdateLoaiSanPhamRequest updateLoaiSanPhamRequest);

    LoaiSanPhamResponse getOne(Integer id);

    Page<LoaiSanPhamResponse> searchNameOrMaActive(String searchName, Integer pageNo, Integer size);
    Page<LoaiSanPhamResponse> searchNameOrMaInActive(String searchName, Integer pageNo, Integer size);
    void deleteLoaiSanPham(Integer id, LocalDate now);

    void revertLoaiSanPham(Integer id,LocalDate now);
}
