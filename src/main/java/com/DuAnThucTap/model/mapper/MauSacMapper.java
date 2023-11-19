package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.MauSac;
import com.DuAnThucTap.model.response.MauSacResponse;
import com.DuAnThucTap.model.request.create_request.CreateMauSacRequest;
import com.DuAnThucTap.model.request.update_request.UpdateMauSacRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MauSacMapper {

    MauSac mauSacResponseToMauSacEntity(MauSacResponse mauSacResponse);

    MauSacResponse mauSacEntityToMauSacResponse(MauSac mauSac);

    MauSac createMauSacRequestToMauSacEntity(CreateMauSacRequest createMauSacRequest);

    MauSac updateMauSacRequestToMauSacEntity(UpdateMauSacRequest updateMauSacRequest);

    List<MauSacResponse> listMauSacEntityToMauSacResponse(List<MauSac> mauSacList);
}
