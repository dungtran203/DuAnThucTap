package com.DuAnThucTap.service.impl;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.common.GenCode;
import com.DuAnThucTap.entity.DongSanPham;
import com.DuAnThucTap.service.DongSanPhamService;
import com.DuAnThucTap.model.mapper.DongSanPhamMapper;
import com.DuAnThucTap.model.request.create_request.CreateDongSanPhamRequest;
import com.DuAnThucTap.model.request.update_request.UpdateDongSanPhamRequest;
import com.DuAnThucTap.model.response.DongSanPhamResponse;
import com.DuAnThucTap.repository.DongSanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public class DongSanPhamServiceImpl implements DongSanPhamService {
    @Autowired
    DongSanPhamRepository dongSanPhamRepository;

    @Autowired
    DongSanPhamMapper dongSanPhamMapper;


    @Override
    public Page<DongSanPhamResponse> pageDongSanPhamActive(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<DongSanPham> dongSanPhamPage = dongSanPhamRepository.pageACTIVE(pageable);
        return dongSanPhamPage.map(dongSanPhamMapper::dongSanPhamEntityToDongSanPhamResponse);
    }

    @Override
    public List<DongSanPhamResponse> getAll() {
        List<DongSanPham> dongSanPhamList = dongSanPhamRepository.getAll();
        return dongSanPhamMapper.listDongSanPhamEntityToDongSanPhamResponse(dongSanPhamList);
    }

    @Override
    public Page<DongSanPhamResponse> pageDongSanPhamInActive(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<DongSanPham> dongSanPhamPage = dongSanPhamRepository.pageINACTIVE(pageable);
        return dongSanPhamPage.map(dongSanPhamMapper::dongSanPhamEntityToDongSanPhamResponse);

    }

    @Override
    public DongSanPhamResponse add(CreateDongSanPhamRequest createDongSanPhamRequest) {
        DongSanPham dongSanPham = dongSanPhamMapper.createDongSanPhamRequestToDongSanPhamEntity(createDongSanPhamRequest);
        dongSanPham.setMa(GenCode.generateDongSanPhamCode());
        dongSanPham.setNgayTao(LocalDate.now());
        dongSanPham.setTrangThai(ApplicationConstant.TrangThaiSanPham.ACTIVE);
        return dongSanPhamMapper.dongSanPhamEntityToDongSanPhamResponse(dongSanPhamRepository.save(dongSanPham));
    }

    @Override
    public DongSanPhamResponse update(UpdateDongSanPhamRequest updateDongSanPhamRequest) {
        DongSanPham dongSanPham = dongSanPhamMapper.updateDongSanPhamRequestToDongSanPhamEntity(updateDongSanPhamRequest);
        dongSanPham.setNgayCapNhat(LocalDate.now());
        dongSanPham.setTrangThai(ApplicationConstant.TrangThaiSanPham.ACTIVE);
        return dongSanPhamMapper.dongSanPhamEntityToDongSanPhamResponse(dongSanPhamRepository.save(dongSanPham));
    }

    @Override
    public DongSanPhamResponse getOne(Integer id) {
        Optional<DongSanPham> dongSanPhamOptional = dongSanPhamRepository.findById(id);
        return dongSanPhamMapper.dongSanPhamEntityToDongSanPhamResponse(dongSanPhamOptional.get());
    }

    @Override
    public Page<DongSanPhamResponse> searchNameOrMaActive(String searchName, Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<DongSanPham> dongSanPhamPage = dongSanPhamRepository.pageSearchActive(searchName, pageable);
        return dongSanPhamPage.map(dongSanPhamMapper::dongSanPhamEntityToDongSanPhamResponse);
    }

    @Override
    public Page<DongSanPhamResponse> searchNameOrMaInActive(String searchName, Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<DongSanPham> dongSanPhamPage = dongSanPhamRepository.pageSearchIvActive(searchName, pageable);
        return dongSanPhamPage.map(dongSanPhamMapper::dongSanPhamEntityToDongSanPhamResponse);
    }


    @Override
    public void deleteDongSanPham(Integer id,LocalDate now) {
        dongSanPhamRepository.delete(id,LocalDate.now());
    }

    @Override
    public void revertDongSanPham(Integer id,LocalDate now) {
        dongSanPhamRepository.revert(id,LocalDate.now());
    }
}
