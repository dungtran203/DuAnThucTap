package com.DuAnThucTap.service;

import com.DuAnThucTap.model.request.create_request.CreateNhaSanXuatRequest;
import com.DuAnThucTap.model.request.update_request.UpdateNhaSanXuatRequest;
import com.DuAnThucTap.model.response.NhaSanXuatResponse;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface NhaSanXuatService {
    Page<NhaSanXuatResponse> pageNhaSanXuatActive(Integer pageNo, Integer size);

    List<NhaSanXuatResponse> getAll();

    Page<NhaSanXuatResponse> pageNhaSanXuatInActive(Integer pageNo, Integer size);

    NhaSanXuatResponse add(CreateNhaSanXuatRequest createNhaSanXuatRequest);

    NhaSanXuatResponse update(UpdateNhaSanXuatRequest updateNhaSanXuatRequest);

    NhaSanXuatResponse getOne(Integer id);

    Page<NhaSanXuatResponse> searchNameOrMaActive(String searchName, Integer pageNo, Integer size);

    Page<NhaSanXuatResponse> searchNameOrMaInActive(String searchName, Integer pageNo, Integer size);

    void deleteNhaSanXuat(Integer id, LocalDate now);

    void revertNhaSanXuat(Integer id, LocalDate now);
}
