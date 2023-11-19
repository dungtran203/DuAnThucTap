package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.QuyDinh;
import com.DuAnThucTap.model.response.QuyDinhResponse;
import com.DuAnThucTap.model.request.create_request.CreateQuyDinhRequest;
import com.DuAnThucTap.model.request.update_request.UpdateQuyDinhRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuyDinhMapper {

    QuyDinh quyDinhResponseToQuyDinhEntity(QuyDinhResponse quyDinhResponse);

    QuyDinhResponse quyDinhEntityToQuyDinhResponse(QuyDinh quyDinh);

    QuyDinh createQuyDinhRequestToQuyDinhEntity(CreateQuyDinhRequest createQuyDinhRequest);

    QuyDinh updateQuyDinhRequestToQuyDinhEntity(UpdateQuyDinhRequest updateQuyDinhRequestQuyDinhRequest);

    List<QuyDinhResponse> listQuyDinhEntityToQuyDinhResponse(List<QuyDinh> quyDinhList);
}
