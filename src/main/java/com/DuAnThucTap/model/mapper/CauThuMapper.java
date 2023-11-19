package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.CauThu;
import com.DuAnThucTap.model.response.CauThuResponse;
import com.DuAnThucTap.model.request.create_request.CreateCauThuRequest;
import com.DuAnThucTap.model.request.update_request.UpdateCauThuRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CauThuMapper {

    CauThu cauThuResponseToCauThuEntity(CauThuResponse cauThuResponse);

    CauThuResponse cauThuEntityToCauThuResponse(CauThu cauThu);

    CauThu createCauThuRequestToCauThuEntity(CreateCauThuRequest createCauThuRequest);

    CauThu updateCauThuRequestToCauThuEntity(UpdateCauThuRequest updateCauThuRequest);

    List<CauThuResponse> listCauThuEntityToCauThuResponse(List<CauThu> cauThuList);
}
