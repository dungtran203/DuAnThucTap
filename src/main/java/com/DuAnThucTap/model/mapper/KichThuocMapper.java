package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.KichThuoc;
import com.DuAnThucTap.model.response.KichThuocResponse;
import com.DuAnThucTap.model.request.create_request.CreateKichThuocRequest;
import com.DuAnThucTap.model.request.update_request.UpdateKichThuocRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface KichThuocMapper {

    KichThuoc kichThuocResponseToKichThuocEntity(KichThuocResponse kichThuocResponse);

    KichThuocResponse kichThuocEntityToKichThuocResponse(KichThuoc kichThuoc);

    KichThuoc createKichThuocRequestToKichThuocEntity(CreateKichThuocRequest createKichThuocRequest);

    KichThuoc updateKichThuocRequestToKichThuocEntity(UpdateKichThuocRequest updateKichThuocRequest);

    List<KichThuocResponse> listKichThuocEntityToKichThuocResponses(List<KichThuoc> kichThuocList);
}
