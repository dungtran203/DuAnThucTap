package com.DuAnThucTap.service.impl;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.entity.QuyDinh;
import com.DuAnThucTap.model.response.QuyDinhResponse;
import com.DuAnThucTap.service.QuyDinhService;
import com.DuAnThucTap.model.mapper.QuyDinhMapper;
import com.DuAnThucTap.model.request.create_request.CreateQuyDinhRequest;
import com.DuAnThucTap.model.request.update_request.UpdateQuyDinhRequest;
import com.DuAnThucTap.repository.QuyDinhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Optional;

@Component
public class QuyDinhServiceImpl implements QuyDinhService {

    @Autowired
    QuyDinhRepository quyDinhRepository;

    @Autowired
    QuyDinhMapper quyDinhMapper;


    @Override
    public Page<QuyDinhResponse> pageQuyDinhActive(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<QuyDinh> quyDinhPage = quyDinhRepository.pageACTIVE(pageable);
        return quyDinhPage.map(quyDinhMapper::quyDinhEntityToQuyDinhResponse);

    }

    @Override
    public Page<QuyDinhResponse> pageQuyDinhInActive(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<QuyDinh> quyDinhPage = quyDinhRepository.pageINACTIVE(pageable);
        return quyDinhPage.map(quyDinhMapper::quyDinhEntityToQuyDinhResponse);

    }

    @Override
    public QuyDinhResponse add(CreateQuyDinhRequest createQuyDinhRequest) {
        QuyDinh quyDinh = quyDinhMapper.createQuyDinhRequestToQuyDinhEntity(createQuyDinhRequest);
        quyDinh.setNgayTao(LocalDate.now());
        quyDinh.setTrangThai(ApplicationConstant.TrangThaiQuyDinh.ACTIVE);
        return quyDinhMapper.quyDinhEntityToQuyDinhResponse(quyDinhRepository.save(quyDinh));
    }

    @Override
    public QuyDinhResponse update(UpdateQuyDinhRequest updateQuyDinhRequest) {
        QuyDinh quyDinh = quyDinhMapper.updateQuyDinhRequestToQuyDinhEntity(updateQuyDinhRequest);
        quyDinh.setNgayCapNhat(LocalDate.now());
        quyDinh.setTrangThai(ApplicationConstant.TrangThaiQuyDinh.ACTIVE);
        return quyDinhMapper.quyDinhEntityToQuyDinhResponse(quyDinhRepository.save(quyDinh));
    }

    @Override
    public QuyDinhResponse getOne(Integer id) {
        Optional<QuyDinh> quyDinhOptional = quyDinhRepository.findById(id);
        return quyDinhMapper.quyDinhEntityToQuyDinhResponse(quyDinhOptional.get());
    }

    @Override
    public Page<QuyDinhResponse> searchNameOrMaActive(String searchName, Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<QuyDinh> quyDinhPage = quyDinhRepository.pageSearchActive(searchName, pageable);
        return quyDinhPage.map(quyDinhMapper::quyDinhEntityToQuyDinhResponse);
    }

    @Override
    public Page<QuyDinhResponse> searchNameOrMaInActive(String searchName, Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<QuyDinh> quyDinhPage = quyDinhRepository.pageSearchIvActive(searchName, pageable);
        return quyDinhPage.map(quyDinhMapper::quyDinhEntityToQuyDinhResponse);
    }

    @Override
    public void deleteQuyDinh(Integer id,LocalDate now) {
        quyDinhRepository.delete(id,LocalDate.now());
    }

    @Override
    public void revertQuyDinh(Integer id,LocalDate now) {
        quyDinhRepository.revert(id,LocalDate.now());
    }
}
