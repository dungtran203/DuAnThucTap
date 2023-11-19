package com.DuAnThucTap.service;

import com.DuAnThucTap.model.response.KichThuocResponse;
import com.DuAnThucTap.model.request.create_request.CreateKichThuocRequest;
import com.DuAnThucTap.model.request.update_request.UpdateKichThuocRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface KichThuocService {
    Page<KichThuocResponse> pageKichThuocActive(Integer pageNo, Integer size);

    List<KichThuocResponse> getALl();

    Page<KichThuocResponse> pageKichThuocInActive(Integer pageNo, Integer size);

    KichThuocResponse add(CreateKichThuocRequest createKichThuocRequest);

    KichThuocResponse update(UpdateKichThuocRequest updateKichThuocRequest);

    KichThuocResponse getOne(Integer id);

    Page<KichThuocResponse> searchNameOrMaActive(String searchName, Integer pageNo, Integer size);

    Page<KichThuocResponse> searchNameOrMaInActive(String searchName, Integer pageNo, Integer size);

    void deleteKichThuoc(Integer id, LocalDate now);

    void revertKichThuoc(Integer id,LocalDate now);
}
