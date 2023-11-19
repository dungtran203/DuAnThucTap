package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.AnhSanPham;
import com.DuAnThucTap.model.request.create_request.CreateAnhSanPhamRequest;
import com.DuAnThucTap.model.request.update_request.UpdateAnhSanPhamRequest;
import com.DuAnThucTap.model.response.AnhSanPhamResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AnhSanPhamMapper {

    AnhSanPham anhSanPhamResponeToAnhSanPhamEntity(AnhSanPhamResponse anhSanPhamResponse);

    AnhSanPhamResponse anhSanPhamEntityToAnhSanPhamResponse(AnhSanPham anhSanPham);

    AnhSanPham createAnhSanPhamRequestToAnhSanPhamEntity(CreateAnhSanPhamRequest createAnhSanPhamRequest);

    AnhSanPham updateAnhSanPhamRequestToAnhSanPhamEntity(UpdateAnhSanPhamRequest updateAnhSanPhamRequest);

    List<AnhSanPhamResponse> listAnhSanPhamEntityToAnhSanPhamResponse(List<AnhSanPham> anhSanPhamList);
}
