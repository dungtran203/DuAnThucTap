package com.DuAnThucTap.service;

import com.DuAnThucTap.entity.VoucherThuHang;
import com.DuAnThucTap.model.response.VoucherThuHangResponse;

import com.DuAnThucTap.model.request.create_request.CreateVoucherThuHangRequest;

import com.DuAnThucTap.model.request.update_request.UpdateVoucherThuHangRequest;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;

@Service
public interface VoucherThuHangService {

    Page<VoucherThuHangResponse> pageVouCherThuHangActive(Integer pageNo, Integer size);

    List<VoucherThuHang> getAll();

    Page<VoucherThuHangResponse> pageVouCherThuHangInActive(Integer pageNo, Integer size);

    Page<VoucherThuHangResponse> pageVouCherThuHangPending(Integer pageNo, Integer size);

    VoucherThuHangResponse add(CreateVoucherThuHangRequest createVouCherThuHangRequest);

    VoucherThuHangResponse update(UpdateVoucherThuHangRequest updateVouCherThuHangRequest);

    VoucherThuHangResponse getOne(Integer id);
    Page<VoucherThuHangResponse> searchNameOrMaActive(String searchName, Integer pageNo, Integer size);
    Page<VoucherThuHangResponse> searchNameOrMaInActive(String searchName, Integer pageNo, Integer size);

    void deleteVoucherThuHang(Integer id, LocalDateTime now);

    void revertVoucherThuHang(Integer id,LocalDateTime now);





    VoucherThuHang findById(Integer voucherId);
}
