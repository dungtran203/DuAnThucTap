package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.VoucherThuHang;
import com.DuAnThucTap.model.response.VoucherThuHangResponse;
import com.DuAnThucTap.model.request.create_request.CreateVoucherThuHangRequest;
import com.DuAnThucTap.model.request.update_request.UpdateVoucherThuHangRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VoucherThuHangMapper {

    VoucherThuHang voucherThuHangResponseToVoucherThuHangEntity(VoucherThuHangResponse voucherThuHangResponse);

    VoucherThuHangResponse voucherThuHangEntityToVoucherThuHangResponse(VoucherThuHang voucherThuHang);

    VoucherThuHang createVoucherThuHangRequestToVoucherThuHangEntity(CreateVoucherThuHangRequest createVoucherThuHangRequest);

    VoucherThuHang updateVoucherThuHangRequestToVoucherThuHangEntity(UpdateVoucherThuHangRequest updateVoucherThuHangRequest);

    List<VoucherThuHangResponse> listVoucherThuHangEntityToVoucherThuHangResponse(List<VoucherThuHang> voucherThuHangList);
}
