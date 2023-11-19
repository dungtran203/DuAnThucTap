package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.KhachHang;
import com.DuAnThucTap.model.request.create_request.CreateKhachHangRequest;
import com.DuAnThucTap.model.request.update_request.UpdateKhachHangRequest;
import com.DuAnThucTap.model.response.KhachHangResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface KhachHangMapper {

    KhachHang khachHangResponseToTaiKhoanEntity(KhachHangResponse khachHangResponse);

    KhachHangResponse khachHangEntityToTaiKhoanResponse(KhachHang khachHang);
    KhachHang createKhachHangRequestToTaiKhoanEntity(CreateKhachHangRequest createKhachHangRequest);

    KhachHang updateKhachHangRequestToTaiKhoanEntity(UpdateKhachHangRequest updateKhachHangRequest);

    List<KhachHangResponse> listKhachHangEntityToKhachHangResponse(List<KhachHang> khachHangList);

}
