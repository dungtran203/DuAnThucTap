package com.DuAnThucTap.service;

import com.DuAnThucTap.model.response.AnhSanPhamResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface AnhSanPhamService {
    List<AnhSanPhamResponse> anhSanPhamResponseList(Integer idSP);
    AnhSanPhamResponse getOne(Integer id);
    void deleteAnhSanPham(Integer id, LocalDate now);


}
