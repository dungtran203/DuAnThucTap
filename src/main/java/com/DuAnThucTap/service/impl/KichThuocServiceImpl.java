package com.DuAnThucTap.service.impl;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.common.GenCode;
import com.DuAnThucTap.entity.KichThuoc;
import com.DuAnThucTap.model.response.KichThuocResponse;
import com.DuAnThucTap.service.KichThuocService;
import com.DuAnThucTap.model.mapper.KichThuocMapper;
import com.DuAnThucTap.model.request.create_request.CreateKichThuocRequest;
import com.DuAnThucTap.model.request.update_request.UpdateKichThuocRequest;
import com.DuAnThucTap.repository.KichThuocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public class KichThuocServiceImpl implements KichThuocService {

    @Autowired
    KichThuocRepository kichThuocRepository;

    @Autowired
    KichThuocMapper kichThuocMapper;

    @Override
    public Page<KichThuocResponse> pageKichThuocActive(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<KichThuoc> kichThuocPage = kichThuocRepository.pageACTIVE(pageable);
        return kichThuocPage.map(kichThuocMapper::kichThuocEntityToKichThuocResponse);
    }

    @Override
    public List<KichThuocResponse> getALl() {
        List<KichThuoc> kichThuocList = kichThuocRepository.getAll();
        return kichThuocMapper.listKichThuocEntityToKichThuocResponses(kichThuocList);
    }

    @Override
    public Page<KichThuocResponse> pageKichThuocInActive(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<KichThuoc> kichThuocPage = kichThuocRepository.pageINACTIVE(pageable);
        return kichThuocPage.map(kichThuocMapper::kichThuocEntityToKichThuocResponse);

    }

    @Override
    public KichThuocResponse add(CreateKichThuocRequest createKichThuocRequest) {
        KichThuoc kichThuoc = kichThuocMapper.createKichThuocRequestToKichThuocEntity(createKichThuocRequest);
        kichThuoc.setMa(GenCode.generateKichThuocCode());
        kichThuoc.setNgayTao(LocalDate.now());
        kichThuoc.setTrangThai(ApplicationConstant.TrangThaiSanPham.ACTIVE);
        return kichThuocMapper.kichThuocEntityToKichThuocResponse(kichThuocRepository.save(kichThuoc));
    }

    @Override
    public KichThuocResponse update(UpdateKichThuocRequest updateKichThuocRequest) {
        KichThuoc kichThuoc = kichThuocMapper.updateKichThuocRequestToKichThuocEntity(updateKichThuocRequest);
        kichThuoc.setNgayCapNhat(LocalDate.now());
        kichThuoc.setTrangThai(ApplicationConstant.TrangThaiSanPham.ACTIVE);
        return kichThuocMapper.kichThuocEntityToKichThuocResponse(kichThuocRepository.save(kichThuoc));
    }

    @Override
    public KichThuocResponse getOne(Integer id) {
        Optional<KichThuoc> kichThuocOptional = kichThuocRepository.findById(id);
        return kichThuocMapper.kichThuocEntityToKichThuocResponse(kichThuocOptional.get());
    }

    @Override
    public Page<KichThuocResponse> searchNameOrMaActive(String searchName, Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<KichThuoc> kichThuocPage = kichThuocRepository.pageSearchActive(searchName, pageable);
        return kichThuocPage.map(kichThuocMapper::kichThuocEntityToKichThuocResponse);
    }

    @Override
    public Page<KichThuocResponse> searchNameOrMaInActive(String searchName, Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<KichThuoc> kichThuocPage = kichThuocRepository.pageSearchIvActive(searchName, pageable);
        return kichThuocPage.map(kichThuocMapper::kichThuocEntityToKichThuocResponse);
    }


    @Override
    public void deleteKichThuoc(Integer id,LocalDate now) {
        kichThuocRepository.delete(id,LocalDate.now());
    }

    @Override
    public void revertKichThuoc(Integer id,LocalDate now) {
        kichThuocRepository.revert(id,LocalDate.now());
    }
}
