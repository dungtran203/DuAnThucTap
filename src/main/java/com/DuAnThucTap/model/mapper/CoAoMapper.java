package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.CoAo;
import com.DuAnThucTap.model.request.create_request.CreateCoAoRequest;
import com.DuAnThucTap.model.request.update_request.UpdateCoAoRequest;
import com.DuAnThucTap.model.response.CoAoResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CoAoMapper {

    CoAo coAoResponseToCoAoEntity(CoAoResponse coAoResponse);

    CoAoResponse coAoEntityToCoAoResponse(CoAo coAo);

    CoAo createCoAoRequestToCoAoEntity(CreateCoAoRequest createCoAoRequest);

    CoAo updateCoAoRequestToCoAoEntity(UpdateCoAoRequest updateCoAoRequest);

    List<CoAoResponse> listCoAoEntityToCoAoResponse(List<CoAo> coAoList);
}
