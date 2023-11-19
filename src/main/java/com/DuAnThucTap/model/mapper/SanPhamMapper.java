package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.SanPham;
import com.DuAnThucTap.model.request.create_request.CreateSanPhamRequest;
import com.DuAnThucTap.model.request.update_request.UpdateSanPhamRequest;
import com.DuAnThucTap.model.response.SanPhamResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SanPhamMapper {

    SanPham sanPhamResponseToSanPhamEntity(SanPhamResponse sanPhamResponse);

    SanPhamResponse sanPhamEntityToSanPhamResponse(SanPham sanPham);

    SanPham createSanPhamRequestToSanPhamEntity(CreateSanPhamRequest createSanPhamRequest);

    SanPham updateSanPhamRequestToSanPhamEntity(UpdateSanPhamRequest updateSanPhamRequest);

    List<SanPhamResponse> listSanPhamEntityToSanPhamResponse(List<SanPham> sanPhamList);
}
