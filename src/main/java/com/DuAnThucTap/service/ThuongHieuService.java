package com.DuAnThucTap.service;

import com.DuAnThucTap.model.request.create_request.CreateThuongHieuRequest;
import com.DuAnThucTap.model.request.update_request.UpdateThuongHieuRequest;
import com.DuAnThucTap.model.response.ThuongHieuResponse;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface ThuongHieuService {
    Page<ThuongHieuResponse> pageThuongHieuActive(Integer pageNo, Integer size);

    List<ThuongHieuResponse> getAll();

    Page<ThuongHieuResponse> pageThuongHieuInActive(Integer pageNo, Integer size);

    ThuongHieuResponse add(CreateThuongHieuRequest createThuongHieuRequest);

    ThuongHieuResponse update(UpdateThuongHieuRequest updateThuongHieuRequest);

    ThuongHieuResponse getOne(Integer id);
    Page<ThuongHieuResponse> searchNameOrMaActive(String searchName, Integer pageNo, Integer size);
    Page<ThuongHieuResponse> searchNameOrMaInActive(String searchName, Integer pageNo, Integer size);

    void deleteThuongHieu(Integer id, LocalDate now);

    void revertThuongHieu(Integer id,LocalDate now);
}
