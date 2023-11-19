package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.ChiTietSanPham;
import com.DuAnThucTap.model.response.ChiTietSanPhamResponse;
import com.DuAnThucTap.model.request.create_request.CreateChiTietSanPhamRequest;
import com.DuAnThucTap.model.request.update_request.UpdateChiTietSanPhamRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChiTietSanPhamMapper {
    
    ChiTietSanPham chiTietSanPhamResponseTochiTietSanPhamEntity(ChiTietSanPhamResponse chiTietSanPhamResponse);
    
    ChiTietSanPhamResponse chiTietSanPhamEntityTochiTietSanPhamResponse(ChiTietSanPham chiTietSanPham);
    
    ChiTietSanPham createChiTietSanPhamRequestToChiTietSanPhamEntity(CreateChiTietSanPhamRequest createchiTietSanPhamRequest);
    
    ChiTietSanPham updateChiTietSanPhamRequestToChiTietSanPhamEntity(UpdateChiTietSanPhamRequest updatechiTietSanPhamRequest);
    
    List<ChiTietSanPhamResponse> listchiTietSanPhamEntityTochiTietSanPhamResponse(List<ChiTietSanPham> chiTietSanPhamList);
}
