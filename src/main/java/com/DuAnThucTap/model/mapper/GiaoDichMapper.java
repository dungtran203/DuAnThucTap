package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.GiaoDich;
import com.DuAnThucTap.model.request.create_request.CreateGiaoDichRequest;
import com.DuAnThucTap.model.request.update_request.UpdateGiaoDichRequest;
import com.DuAnThucTap.model.response.GiaoDichResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GiaoDichMapper {
    GiaoDich giaoDichResponseToGiaoDichEntity(GiaoDichResponse giaoDichResponse);

    GiaoDichResponse giaoDichEntityToGiaoDichResponse(GiaoDich giaoDich);

    GiaoDich createGiaoDichRequestToGiaoDichEntity(CreateGiaoDichRequest createGiaoDichRequest);

    GiaoDich updateGiaoDichRequestToGiaoDichEntity(UpdateGiaoDichRequest updateGiaoDichRequest);

    List<GiaoDichResponse> listGiaoDichEntityToGiaoDichResponse(List<GiaoDich> listGiaoDich);
}
