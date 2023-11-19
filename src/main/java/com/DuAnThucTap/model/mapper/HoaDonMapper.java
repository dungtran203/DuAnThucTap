package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.HoaDon;
import com.DuAnThucTap.model.request.create_request.CreateHoaDonRequest;
import com.DuAnThucTap.model.request.update_request.UpdateHoaDonRequest;
import com.DuAnThucTap.model.response.HoaDonResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HoaDonMapper {
    HoaDon hoaDonResponseToHoaDonEntity(HoaDonResponse hoaDonResponse);

    HoaDonResponse hoaDonEntityToHoaDonResponse(HoaDon hoaDon);

    HoaDon createHoaDonRequestToHoaDonEntity(CreateHoaDonRequest createHoaDonRequest);

    HoaDon updateHoaDonRequestToHoaDonEntity(UpdateHoaDonRequest updateHoaDonRequest);

    List<HoaDonResponse> listHoaDonEntityToHoaDonResponse(List<HoaDon> listHoaDon);
}
