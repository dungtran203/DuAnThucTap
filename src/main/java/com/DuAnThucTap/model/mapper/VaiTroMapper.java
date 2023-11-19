package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.VaiTro;
import com.DuAnThucTap.model.request.create_request.CreateVaiTroRequest;
import com.DuAnThucTap.model.request.update_request.UpdateVaiTroRequest;
import com.DuAnThucTap.model.response.VaiTroResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VaiTroMapper {

    VaiTro vaiTroResponseToVaiTroEntity(VaiTroResponse vaiTroResponse);

    VaiTroResponse vaiTroEntityToVaiTroResponse(VaiTro vaiTro);

    VaiTro createVaiTroRequestToVaiTroEntity(CreateVaiTroRequest createVaiTroRequest);

    VaiTro updateVaiTroRequestToVaiTroEntity(UpdateVaiTroRequest updateVaiTroRequest);

    List<VaiTroResponse> listVaiTroEntityToVaiTroResponse(List<VaiTro> vaiTroList);
}
