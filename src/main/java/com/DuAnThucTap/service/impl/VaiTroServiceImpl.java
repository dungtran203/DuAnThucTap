package com.DuAnThucTap.service.impl;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.common.GenCode;
import com.DuAnThucTap.entity.VaiTro;
import com.DuAnThucTap.service.VaiTroService;
import com.DuAnThucTap.model.mapper.VaiTroMapper;
import com.DuAnThucTap.model.request.create_request.CreateVaiTroRequest;
import com.DuAnThucTap.model.request.update_request.UpdateVaiTroRequest;
import com.DuAnThucTap.model.response.VaiTroResponse;
import com.DuAnThucTap.repository.VaiTroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public class VaiTroServiceImpl implements VaiTroService {
    @Autowired
    VaiTroRepository vaiTroRepository;

    @Autowired
    VaiTroMapper vaiTroMapper;


    @Override
    public Page<VaiTroResponse> pageVaiTroActive(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<VaiTro> vaiTroPage = vaiTroRepository.pageACTIVE(pageable);
        return vaiTroPage.map(vaiTroMapper::vaiTroEntityToVaiTroResponse);
    }

    @Override
    public Page<VaiTroResponse> pageVaiTroInActive(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<VaiTro> vaiTroPage = vaiTroRepository.pageINACTIVE(pageable);
        return vaiTroPage.map(vaiTroMapper::vaiTroEntityToVaiTroResponse);

    }

    @Override
    public VaiTroResponse add(CreateVaiTroRequest createVaiTroRequest) {
        VaiTro vaiTro = vaiTroMapper.createVaiTroRequestToVaiTroEntity(createVaiTroRequest);
        vaiTro.setMa(GenCode.generateVaiTroCode());
        vaiTro.setNgayTao(LocalDate.now());
        vaiTro.setTrangThai(ApplicationConstant.TrangThaiVaiTro.ACTIVE);
        return vaiTroMapper.vaiTroEntityToVaiTroResponse(vaiTroRepository.save(vaiTro));
    }

    @Override
    public VaiTroResponse update(UpdateVaiTroRequest updateVaiTroRequest) {
        VaiTro vaiTro = vaiTroMapper.updateVaiTroRequestToVaiTroEntity(updateVaiTroRequest);
        vaiTro.setNgayCapNhap(LocalDate.now());
        return vaiTroMapper.vaiTroEntityToVaiTroResponse(vaiTroRepository.save(vaiTro));
    }

    @Override
    public VaiTroResponse getOne(Integer id) {
        Optional<VaiTro> vaiTroOptional = vaiTroRepository.findById(id);
        return vaiTroMapper.vaiTroEntityToVaiTroResponse(vaiTroOptional.get());
    }

    @Override
    public Page<VaiTroResponse> searchNameOrMaActive(String searchName, Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<VaiTro> vaiTroPage = vaiTroRepository.pageSearchActive(searchName, pageable);
        return vaiTroPage.map(vaiTroMapper::vaiTroEntityToVaiTroResponse);
    }

    @Override
    public Page<VaiTroResponse> searchNameOrMaInActive(String searchName, Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<VaiTro> vaiTroPage = vaiTroRepository.pageSearchIvActive(searchName, pageable);
        return vaiTroPage.map(vaiTroMapper::vaiTroEntityToVaiTroResponse);
    }


    @Override
    public void deleteVaiTro(Integer id, LocalDate now) {
        vaiTroRepository.delete(id, LocalDate.now());
    }

    @Override
    public void revertVaiTro(Integer id, LocalDate now) {
        vaiTroRepository.revert(id, LocalDate.now());
    }

    @Override
    public List<VaiTro> getAll() {
        return vaiTroRepository.getAll();
    }
}
