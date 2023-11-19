package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.DongSanPham;
import com.DuAnThucTap.model.request.create_request.CreateDongSanPhamRequest;
import com.DuAnThucTap.model.request.update_request.UpdateDongSanPhamRequest;
import com.DuAnThucTap.model.response.DongSanPhamResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DongSanPhamMapper {

    DongSanPham dongSanPhamResponseToDongSanPhamEntity(DongSanPhamResponse dongSanPhamResponse);

    DongSanPhamResponse dongSanPhamEntityToDongSanPhamResponse(DongSanPham dongSanPham);

    DongSanPham createDongSanPhamRequestToDongSanPhamEntity(CreateDongSanPhamRequest createDongSanPhamRequest);

    DongSanPham updateDongSanPhamRequestToDongSanPhamEntity(UpdateDongSanPhamRequest updateDongSanPhamRequest);

    List<DongSanPhamResponse> listDongSanPhamEntityToDongSanPhamResponse(List<DongSanPham> dongSanPhamList);
}
