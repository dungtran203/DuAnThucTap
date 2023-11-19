package com.DuAnThucTap.service;

import com.DuAnThucTap.entity.ThuHang;
import com.DuAnThucTap.model.response.ThuHangResponse;
import com.DuAnThucTap.model.request.create_request.CreateThuHangRequest;
import com.DuAnThucTap.model.request.update_request.UpdateThuHangRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public interface ThuHangService {

    Integer getMaxId();

    List<ThuHang> getAll();

    Page<ThuHangResponse> pageThuHangActive(Integer pageNo, Integer size);

    Page<ThuHangResponse> pageThuHangInActive(Integer pageNo, Integer size);

    ThuHangResponse add(CreateThuHangRequest createThuHangRequest);

    ThuHangResponse update(UpdateThuHangRequest updateThuHangRequest);

    ThuHangResponse getOne(Integer id);

    Page<ThuHangResponse> searchSoLuongDonHangToiThieuInActive(Integer search, Integer pageNo, Integer size);

    Page<ThuHangResponse> searchNameOrMaActive(String searchName, Integer pageNo, Integer size);

    Page<ThuHangResponse> searchSoLuongDonHangToiThieuActive(Integer search, Integer pageNo, Integer size);

    Page<ThuHangResponse> searchNameOrMaInActive(String searchName, Integer pageNo, Integer size);

    Page<ThuHangResponse> searchSoLuongDonHangOrSoTienInActive(String searchName, Integer pageNo, Integer size);

    void deleteThuHang(Integer id, LocalDate now);

    void revertThuHang(Integer id, LocalDate now);

    void checkDuplicateName(Integer id);

    Page<ThuHangResponse> searchMinMaxSoTien(BigDecimal min, BigDecimal max, Integer pageNo, Integer size);

    Page<ThuHangResponse> searchMinMaxDonHang(Integer min, Integer max, Integer pageNo, Integer size);

    Page<ThuHangResponse> searchMinMaxSoTienInActive(BigDecimal min, BigDecimal max, Integer pageNo, Integer size);

    Page<ThuHangResponse> searchMinMaxDonHangInActive(Integer min, Integer max, Integer pageNo, Integer size);
}
