package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.DiaChi;
import com.DuAnThucTap.model.request.create_request.CreateDiaChiRequest;
import com.DuAnThucTap.model.request.update_request.UpdateDiaChiRequest;
import com.DuAnThucTap.model.response.DiaChiResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DiaChiMapper {

    DiaChi diaChiResponseToDiaChiEntity(DiaChiResponse diaChiResponse);

    DiaChiResponse diaChiEntityToDiaChiResponse(DiaChi diaChi);

    DiaChi createDiaChiRequestToDiaChiEntity(CreateDiaChiRequest createDiaChiRequest);

    DiaChi updateDiaChiRequestToDiaChiEntity(UpdateDiaChiRequest updateDiaChiRequest);

    List<DiaChiResponse> listDiaChiEntityToDiaChiResponse(List<DiaChi> diaChiList);
}
