package com.DuAnThucTap.service.impl;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.entity.DiaChi;
import com.DuAnThucTap.model.mapper.KhachHangMapper;
import com.DuAnThucTap.service.DiaChiService;
import com.DuAnThucTap.model.mapper.DiaChiMapper;
import com.DuAnThucTap.model.request.create_request.CreateDiaChiRequest;
import com.DuAnThucTap.model.request.update_request.UpdateDiaChiRequest;
import com.DuAnThucTap.model.response.DiaChiResponse;
import com.DuAnThucTap.model.response.KhachHangResponse;
import com.DuAnThucTap.repository.DiaChiRepository;
import com.DuAnThucTap.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public class DiaChiServiceImpl implements DiaChiService {
    @Autowired
    DiaChiRepository diaChiRepository;

    @Autowired
    DiaChiMapper diaChiMapper;

    @Autowired
    private KhachHangRepository khachHangRepository;

    @Autowired
    private KhachHangMapper khachHangMapper;

    @Override
    public Page<DiaChiResponse> pageDiaChiActive(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<DiaChi> diaChiPage = diaChiRepository.pageACTIVE(pageable);
        return diaChiPage.map(diaChiMapper::diaChiEntityToDiaChiResponse);
    }

    @Override
    public Page<DiaChiResponse> pageDiaChiInActive(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<DiaChi> diaChiPage = diaChiRepository.pageINACTIVE(pageable);
        return diaChiPage.map(diaChiMapper::diaChiEntityToDiaChiResponse);

    }

    @Override
    public DiaChiResponse add(CreateDiaChiRequest createDiaChiRequest) {
        DiaChi diaChi = diaChiMapper.createDiaChiRequestToDiaChiEntity(createDiaChiRequest);
        diaChi.setNgayTao(LocalDate.now());
        diaChi.setTrangThai(ApplicationConstant.TrangThaiDiaChi.ACTIVE);
        return diaChiMapper.diaChiEntityToDiaChiResponse(diaChiRepository.save(diaChi));
    }

    @Override
    public DiaChiResponse update(UpdateDiaChiRequest updateDiaChiRequest) {
        DiaChi diaChi = diaChiMapper.updateDiaChiRequestToDiaChiEntity(updateDiaChiRequest);
        diaChi.setNgayCapNhap(LocalDate.now());
        diaChi.setTrangThai(ApplicationConstant.TrangThaiDiaChi.ACTIVE);
        return diaChiMapper.diaChiEntityToDiaChiResponse(diaChiRepository.save(diaChi));
    }

    @Override
    public DiaChiResponse getOne(Integer id) {
        Optional<DiaChi> diaChiOptional = diaChiRepository.findById(id);
        return diaChiMapper.diaChiEntityToDiaChiResponse(diaChiOptional.get());
    }

    @Override
    public Page<DiaChiResponse> searchNameOrMaActive(String searchName, Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<DiaChi> diaChiPage = diaChiRepository.pageSearchActive(searchName, pageable);
        return diaChiPage.map(diaChiMapper::diaChiEntityToDiaChiResponse);
    }

    @Override
    public Page<DiaChiResponse> searchNameOrMaInActive(String searchName, Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<DiaChi> diaChiPage = diaChiRepository.pageSearchIvActive(searchName, pageable);
        return diaChiPage.map(diaChiMapper::diaChiEntityToDiaChiResponse);
    }

    @Override
    public void deleteDiaChi(Integer id, LocalDate now) {
        diaChiRepository.delete(id, LocalDate.now());
    }

    @Override
    public void revertDiaChi(Integer id, LocalDate now) {

        diaChiRepository.revert(id, LocalDate.now());
    }

    @Override
    public List<KhachHangResponse> getAllKhachHangActive() {
        return khachHangMapper.listKhachHangEntityToKhachHangResponse(khachHangRepository.listKhachHangActive());
    }


}
