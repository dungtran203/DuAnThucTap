package com.DuAnThucTap.service.impl;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.common.GenCode;
import com.DuAnThucTap.entity.LoaiSanPham;
import com.DuAnThucTap.model.mapper.LoaiSanPhamMapper;
import com.DuAnThucTap.model.request.create_request.CreateLoaiSanPhamRequest;
import com.DuAnThucTap.model.request.update_request.UpdateLoaiSanPhamRequest;
import com.DuAnThucTap.model.response.LoaiSanPhamResponse;
import com.DuAnThucTap.repository.LoaiSanPhamRepository;
import com.DuAnThucTap.service.LoaiSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public class LoaiSanPhamServiceImpl implements LoaiSanPhamService {
    @Autowired
    LoaiSanPhamRepository loaiSanPhamRepository;

    @Autowired
    LoaiSanPhamMapper loaiSanPhamMapper;


    @Override
    public Page<LoaiSanPhamResponse> pageLoaiSanPhamActive(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<LoaiSanPham> loaiSanPhamPage = loaiSanPhamRepository.pageACTIVE(pageable);
        return loaiSanPhamPage.map(loaiSanPhamMapper::loaiSanPhamEntityToLoaiSanPhamResponse);

    }

    @Override
    public List<LoaiSanPhamResponse> getAll() {
        List<LoaiSanPham> loaiSanPhamList = loaiSanPhamRepository.getAll();
        return loaiSanPhamMapper.listLoaiSanPhamEntityToLoaiSanPhamResponses(loaiSanPhamList);
    }

    @Override
    public Page<LoaiSanPhamResponse> pageLoaiSanPhamInActive(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<LoaiSanPham> loaiSanPhamPage = loaiSanPhamRepository.pageINACTIVE(pageable);
        return loaiSanPhamPage.map(loaiSanPhamMapper::loaiSanPhamEntityToLoaiSanPhamResponse);

    }

    @Override
    public LoaiSanPhamResponse add(CreateLoaiSanPhamRequest createLoaiSanPhamRequest) {
        LoaiSanPham loaiSanPham = loaiSanPhamMapper.createLoaiSanPhamRequestToLoaiSanPhamEntity(createLoaiSanPhamRequest);
        loaiSanPham.setMa(GenCode.generateLoaiSanPhamCode());
        loaiSanPham.setNgayTao(LocalDate.now());
        loaiSanPham.setTrangThai(ApplicationConstant.TrangThaiSanPham.ACTIVE);
        return loaiSanPhamMapper.loaiSanPhamEntityToLoaiSanPhamResponse(loaiSanPhamRepository.save(loaiSanPham));
    }

    @Override
    public LoaiSanPhamResponse update(UpdateLoaiSanPhamRequest updateLoaiSanPhamRequest) {
        LoaiSanPham loaiSanPham = loaiSanPhamMapper.updateLoaiSanPhamRequestToLoaiSanPhamEntity(updateLoaiSanPhamRequest);
        loaiSanPham.setNgayCapNhat(LocalDate.now());
        loaiSanPham.setTrangThai(ApplicationConstant.TrangThaiSanPham.ACTIVE);
        return loaiSanPhamMapper.loaiSanPhamEntityToLoaiSanPhamResponse(loaiSanPhamRepository.save(loaiSanPham));
    }

    @Override
    public LoaiSanPhamResponse getOne(Integer id) {
        Optional<LoaiSanPham> loaiSanPhamOptional = loaiSanPhamRepository.findById(id);
        return loaiSanPhamMapper.loaiSanPhamEntityToLoaiSanPhamResponse(loaiSanPhamOptional.get());
    }

    @Override
    public Page<LoaiSanPhamResponse> searchNameOrMaActive(String searchName, Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<LoaiSanPham> loaiSanPhamPage = loaiSanPhamRepository.pageSearchActive(searchName, pageable);
        return loaiSanPhamPage.map(loaiSanPhamMapper::loaiSanPhamEntityToLoaiSanPhamResponse);
    }

    @Override
    public Page<LoaiSanPhamResponse> searchNameOrMaInActive(String searchName, Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<LoaiSanPham> loaiSanPhamPage = loaiSanPhamRepository.pageSearchIvActive(searchName, pageable);
        return loaiSanPhamPage.map(loaiSanPhamMapper::loaiSanPhamEntityToLoaiSanPhamResponse);
    }


    @Override
    public void deleteLoaiSanPham(Integer id, LocalDate now) {
        loaiSanPhamRepository.delete(id, LocalDate.now());
    }

    @Override
    public void revertLoaiSanPham(Integer id, LocalDate now) {
        loaiSanPhamRepository.revert(id, LocalDate.now());
    }
}
