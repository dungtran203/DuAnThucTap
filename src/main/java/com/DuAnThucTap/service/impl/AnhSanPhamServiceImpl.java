package com.DuAnThucTap.service.impl;

import com.DuAnThucTap.entity.AnhSanPham;
import com.DuAnThucTap.service.AnhSanPhamService;
import com.DuAnThucTap.model.mapper.AnhSanPhamMapper;
import com.DuAnThucTap.model.response.AnhSanPhamResponse;
import com.DuAnThucTap.repository.AnhSanPhamRepository;
import com.DuAnThucTap.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
@Component
public class AnhSanPhamServiceImpl implements AnhSanPhamService {

    @Autowired
    AnhSanPhamRepository anhSanPhamRepository;

    @Autowired
    SanPhamRepository sanPhamRepository;

    @Autowired
    AnhSanPhamMapper anhSanPhamMapper;

    @Override
    public List<AnhSanPhamResponse> anhSanPhamResponseList(Integer idSP) {
        List<AnhSanPham> anhSanPhamList = anhSanPhamRepository.getAnhSanPhamBySanPham(sanPhamRepository.findById(idSP).get());
        return anhSanPhamMapper.listAnhSanPhamEntityToAnhSanPhamResponse(anhSanPhamList);
    }

    @Override
    public AnhSanPhamResponse getOne(Integer id) {
        return anhSanPhamMapper.anhSanPhamEntityToAnhSanPhamResponse(anhSanPhamRepository.findById(id).get());
    }

    @Override
    public void deleteAnhSanPham(Integer id, LocalDate now) {
        anhSanPhamRepository.delete(id,LocalDate.now());
    }




}
