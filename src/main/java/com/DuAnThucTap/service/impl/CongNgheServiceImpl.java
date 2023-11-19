package com.DuAnThucTap.service.impl;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.common.GenCode;
import com.DuAnThucTap.entity.CongNghe;
import com.DuAnThucTap.service.CongNgheService;
import com.DuAnThucTap.model.mapper.CongNgheMapper;
import com.DuAnThucTap.model.request.create_request.CreateCongNgheRequest;
import com.DuAnThucTap.model.request.update_request.UpdateCongNgheRequest;
import com.DuAnThucTap.model.response.CongNgheResponse;
import com.DuAnThucTap.repository.CongNgheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public class CongNgheServiceImpl implements CongNgheService {
    @Autowired
    CongNgheRepository congNgheRepository;

    @Autowired
    CongNgheMapper congNgheMapper;


    @Override
    public Page<CongNgheResponse> pageCongNgheActive(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<CongNghe> congNghePage = congNgheRepository.pageACTIVE(pageable);
        return congNghePage.map(congNgheMapper::congNgheEntityToCongNgheResponse);
    }

    @Override
    public List<CongNgheResponse> getAll() {
        List<CongNghe> congNgheList = congNgheRepository.getAll();
        return congNgheMapper.listCongNgheEntityToCongNgheResponses(congNgheList);
    }

    @Override
    public Page<CongNgheResponse> pageCongNgheInActive(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<CongNghe> congNghePage = congNgheRepository.pageINACTIVE(pageable);
        return congNghePage.map(congNgheMapper::congNgheEntityToCongNgheResponse);

    }

    @Override
    public CongNgheResponse add(CreateCongNgheRequest createCongNgheRequest) {
        CongNghe congNghe = congNgheMapper.createCongNgheRequestToCongNgheEntity(createCongNgheRequest);
        congNghe.setMa(GenCode.generateCongNgheCode());
        congNghe.setNgayTao(LocalDate.now());
        congNghe.setTrangThai(ApplicationConstant.TrangThaiSanPham.ACTIVE);
        return congNgheMapper.congNgheEntityToCongNgheResponse(congNgheRepository.save(congNghe));
    }

    @Override
    public CongNgheResponse update(UpdateCongNgheRequest updateCongNgheRequest) {
        CongNghe congNghe = congNgheMapper.updateCongNgheRequestToCongNgheEntity(updateCongNgheRequest);
        congNghe.setNgayCapNhat(LocalDate.now());
        congNghe.setTrangThai(ApplicationConstant.TrangThaiSanPham.ACTIVE);
        return congNgheMapper.congNgheEntityToCongNgheResponse(congNgheRepository.save(congNghe));
    }

    @Override
    public CongNgheResponse getOne(Integer id) {
        Optional<CongNghe> congNgheOptional = congNgheRepository.findById(id);
        return congNgheMapper.congNgheEntityToCongNgheResponse(congNgheOptional.get());
    }

    @Override
    public Page<CongNgheResponse> searchNameOrMaActive(String searchName, Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<CongNghe> congNghePage = congNgheRepository.pageSearchActive(searchName, pageable);
        return congNghePage.map(congNgheMapper::congNgheEntityToCongNgheResponse);
    }

    @Override
    public Page<CongNgheResponse> searchNameOrMaInActive(String searchName, Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<CongNghe> congNghePage = congNgheRepository.pageSearchIvActive(searchName, pageable);
        return congNghePage.map(congNgheMapper::congNgheEntityToCongNgheResponse);
    }


    @Override
    public void deleteCongNghe(Integer id, LocalDate now) {
        congNgheRepository.delete(id, LocalDate.now());
    }

    @Override
    public void revertCongNghe(Integer id, LocalDate now) {
        congNgheRepository.revert(id, LocalDate.now());
    }
}
