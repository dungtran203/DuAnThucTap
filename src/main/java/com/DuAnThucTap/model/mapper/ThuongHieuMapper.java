package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.ThuongHieu;
import com.DuAnThucTap.model.request.create_request.CreateThuongHieuRequest;
import com.DuAnThucTap.model.request.update_request.UpdateThuongHieuRequest;
import com.DuAnThucTap.model.response.ThuongHieuResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ThuongHieuMapper {

    ThuongHieu thuongHieuResponseToThuongHieuEntity(ThuongHieuResponse thuongHieuResponse);

    ThuongHieuResponse thuongHieuEntityToThuongHieuResponse(ThuongHieu thuongHieu);

    ThuongHieu createThuongHieuRequestToThuongHieuEntity(CreateThuongHieuRequest createThuongHieuRequest);

    ThuongHieu updateThuongHieuRequestToThuongHieuEntity(UpdateThuongHieuRequest updateThuongHieuRequest);

    List<ThuongHieuResponse> listThuongHieuEntityToThuongHieuResponse(List<ThuongHieu> thuongHieuList);
}
