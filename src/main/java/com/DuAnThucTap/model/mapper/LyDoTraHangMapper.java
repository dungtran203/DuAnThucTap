package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.LyDoTraHang;
import com.DuAnThucTap.model.request.create_request.CreateLyDoTraHangRequest;
import com.DuAnThucTap.model.request.update_request.UpdateLyDoTraHangRequest;
import com.DuAnThucTap.model.response.LyDoTraHangResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LyDoTraHangMapper {

    LyDoTraHang lyDoTraHangResponseToLyDoTraHangEntity(LyDoTraHangResponse lyDoTraHangResponse);

    LyDoTraHangResponse lyDoTraHangEntityToLyDoTraHangResponse(LyDoTraHang lyDoTraHang);

    LyDoTraHang createLyDoTraHangRequestToLyDoTraHangEntity(CreateLyDoTraHangRequest createLyDoTraHangRequest);

    LyDoTraHang updateLyDoTraHangRequestToLyDoTraHangEntity(UpdateLyDoTraHangRequest updateLyDoTraHangRequest);

    List<LyDoTraHangResponse> listLyDoTraHangEntityToLyDoTraHangResponses(List<LyDoTraHang> lyDoTraHangList);

}
