package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.NhaSanXuat;
import com.DuAnThucTap.model.request.create_request.CreateNhaSanXuatRequest;
import com.DuAnThucTap.model.request.update_request.UpdateNhaSanXuatRequest;
import com.DuAnThucTap.model.response.NhaSanXuatResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NhaSanXuatMapper {

    NhaSanXuat nhaSanXuatResponseToNhaSanXuatEntity(NhaSanXuatResponse nhaSanXuatResponse);

    NhaSanXuatResponse nhaSanXuatEntityToNhaSanXuatResponse(NhaSanXuat nhaSanXuat);

    NhaSanXuat createNhaSanXuatRequestToNhaSanXuatEntity(CreateNhaSanXuatRequest createNhaSanXuatRequest);

    NhaSanXuat updateNhaSanXuatRequestToNhaSanXuatEntity(UpdateNhaSanXuatRequest updateNhaSanXuatRequest);

    List<NhaSanXuatResponse> listNhaSanXuatEntityToNhaSanXuatRespnse(List<NhaSanXuat> nhaSanXuatList);
}
