package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.NuocSanXuat;
import com.DuAnThucTap.model.request.create_request.CreateNuocSanXuatRequest;
import com.DuAnThucTap.model.request.update_request.UpdateNuocSanXuatRequest;
import com.DuAnThucTap.model.response.NuocSanXuatResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NuocSanXuatMapper {

    NuocSanXuat nuocSanXuatResponseToNuocSanXuatEntity(NuocSanXuatResponse nuocSanXuatResponse);

    NuocSanXuatResponse nuocSanXuatEntityToNuocSanXuatResponse(NuocSanXuat nuocSanXuat);

    NuocSanXuat createNuocSanXuatRequestToNuocSanXuatEntity(CreateNuocSanXuatRequest createNuocSanXuatRequest);

    NuocSanXuat updateNuocSanXuatRequestToNuocSanXuatEntity(UpdateNuocSanXuatRequest updateNuocSanXuatRequest);

    List<NuocSanXuatResponse> listNuocSanXuatEntityToNuocSanXuatResponses(List<NuocSanXuat> nuocSanXuatList);
}
