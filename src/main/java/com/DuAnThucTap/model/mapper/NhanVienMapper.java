package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.NhanVien;
import com.DuAnThucTap.model.request.create_request.CreateNhanVienRequest;
import com.DuAnThucTap.model.request.update_request.UpdateNhanVienRequest;
import com.DuAnThucTap.model.response.NhanVienResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NhanVienMapper {
    NhanVien nhanVienResponseToNhanVienEntity(NhanVienResponse nhanVienResponse);

    NhanVienResponse nhanVienEntityToNhanVienResponse(NhanVien nhanVien);

    NhanVien createNhanVienRequestToNhanVienEntity(CreateNhanVienRequest createNhanVienRequest);

    NhanVien updateNhanVienRequestToNhanVienEntity(UpdateNhanVienRequest updateNhanVienRequest);

    List<NhanVienResponse>listNhanVienEntityToNhanVienResponse(List<NhanVien> nhanVienList);

}
