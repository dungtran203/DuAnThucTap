package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.CongNghe;
import com.DuAnThucTap.model.request.create_request.CreateCongNgheRequest;
import com.DuAnThucTap.model.request.update_request.UpdateCongNgheRequest;
import com.DuAnThucTap.model.response.CongNgheResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CongNgheMapper {

    CongNghe congNgheResponseToCongNgheEntity(CongNgheResponse congNgheResponse);

    CongNgheResponse congNgheEntityToCongNgheResponse(CongNghe congNghe);

    CongNghe createCongNgheRequestToCongNgheEntity(CreateCongNgheRequest createCongNgheRequest);

    CongNghe updateCongNgheRequestToCongNgheEntity(UpdateCongNgheRequest updateCongNgheRequest);

    List<CongNgheResponse> listCongNgheEntityToCongNgheResponses(List<CongNghe> congNgheList);
}
