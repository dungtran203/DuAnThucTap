package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.ThuHang;
import com.DuAnThucTap.model.request.create_request.CreateThuHangRequest;
import com.DuAnThucTap.model.request.update_request.UpdateThuHangRequest;
import com.DuAnThucTap.model.response.ThuHangResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ThuHangMapper {

    ThuHang thuHangResponseToThuHangEntity(ThuHangResponse thuHangResponse);

    ThuHangResponse thuHangEntiyToThuHangResponse(ThuHang thuHang);

    ThuHang createThuHangRequestToThuHangEntity(CreateThuHangRequest createThuHangRequest);

    ThuHang updateThuHangRequestToThuHangEntity(UpdateThuHangRequest updateThuHangRequest);

    List<ThuHangResponse> listThuHangEntityToThuHangResponse(List<ThuHang> thuHangMapperList);
}
