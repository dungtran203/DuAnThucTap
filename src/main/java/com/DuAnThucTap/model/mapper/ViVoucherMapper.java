package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.ViVoucher;
import com.DuAnThucTap.model.request.create_request.CreateViVoucherRequest;
import com.DuAnThucTap.model.request.update_request.UpdateViVoucherRequest;
import com.DuAnThucTap.model.response.ViVoucherResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ViVoucherMapper {

    ViVoucher viVoucherResponseToViVoucherEntity(ViVoucherResponse viVoucherResponse);

    ViVoucherResponse viVoucherEntityToViVoucherResponse(ViVoucher viVoucher);

    ViVoucher createViVoucherRequestToViVoucherEntity(CreateViVoucherRequest createViVoucherRequest);

    ViVoucher updateViVoucherRequestToViVoucherEntity(UpdateViVoucherRequest updateViVoucherRequest);

    List<ViVoucherResponse> listViVoucherEntityToViVoucherResponse(List<ViVoucher> viVoucherList);
}
