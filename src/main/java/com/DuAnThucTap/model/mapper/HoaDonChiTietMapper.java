package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.HoaDonChiTiet;
import com.DuAnThucTap.model.request.create_request.CreateHoaDonChiTietRequest;
import com.DuAnThucTap.model.request.update_request.UpdateHoaDonChiTietRequest;
import com.DuAnThucTap.model.response.HoaDonChiTietResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HoaDonChiTietMapper {
    HoaDonChiTiet hoaDonChiTietResponseToHoaDonChiTietEntity(HoaDonChiTietResponse hoaDonChiTietResponse);

    HoaDonChiTietResponse hoaDonChiTietEntityToHoaDonChiTietResponse(HoaDonChiTiet hoaDonChiTiet);

    HoaDonChiTiet createHoaDonChiTietRequestToHoaDonChiTietEntity(CreateHoaDonChiTietRequest createHoaDonChiTietRequest);

    HoaDonChiTiet updateHoaDonChiTietRequestToHoaDonChiTietEntity(UpdateHoaDonChiTietRequest updateHoaDonChiTietRequest);

    List<HoaDonChiTietResponse> listHoaDonChiTietEntityToHoaDonChiTietResponse(List<HoaDonChiTiet> listHoaDonChiTiet);
}
