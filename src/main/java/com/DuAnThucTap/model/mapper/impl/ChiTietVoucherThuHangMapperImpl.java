package com.DuAnThucTap.model.mapper.impl;

import com.DuAnThucTap.entity.ChiTietVoucherThuHang;
import com.DuAnThucTap.model.response.ChiTietVoucherThuHangResponse;
import com.DuAnThucTap.model.mapper.ChiTietVoucherThuHangMapper;
import com.DuAnThucTap.model.request.create_request.CreateChiTietVoucherThuHangRequest;
import com.DuAnThucTap.model.request.update_request.UpdateChiTietVoucherThuHangRequest;
import jakarta.annotation.Generated;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Generated(value = "org.mapstruct.ap.MappingProcessor", date = "2023-03-29T01:09:18+0700", comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.6 (JetBrains s.r.o.)")
@Component
public class ChiTietVoucherThuHangMapperImpl implements ChiTietVoucherThuHangMapper {

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ChiTietVoucherThuHang chiTietVoucherThuHangResponseToChiTietVoucherThuHangEntity(ChiTietVoucherThuHangResponse chiTietVoucherThuHangResponse) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        ChiTietVoucherThuHang chiTietVoucherThuHang = modelMapper.map(chiTietVoucherThuHangResponse, ChiTietVoucherThuHang.class);
        return chiTietVoucherThuHang;
    }

    @Override
    public ChiTietVoucherThuHangResponse chiTietVoucherThuHangEntityToChiTietVoucherThuHangResponse(ChiTietVoucherThuHang chiTietVoucherThuHang) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        ChiTietVoucherThuHangResponse chiTietVoucherThuHangResponse = modelMapper.map(chiTietVoucherThuHang, ChiTietVoucherThuHangResponse.class);
        return chiTietVoucherThuHangResponse;
    }

    @Override
    public ChiTietVoucherThuHang createChiTietVoucherThuHangRequestToChiTietVouCherThuHangEntity(CreateChiTietVoucherThuHangRequest createChiTietVoucherThuHangRequest) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        ChiTietVoucherThuHang chiTietVoucherThuHang = modelMapper.map(createChiTietVoucherThuHangRequest, ChiTietVoucherThuHang.class);
        return chiTietVoucherThuHang;
    }

    @Override
    public ChiTietVoucherThuHang updateChiTietVoucherThuHangRequestToChiTietVouCherThuHangEntity(UpdateChiTietVoucherThuHangRequest updateChiTietVoucherThuHangRequest) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        ChiTietVoucherThuHang chiTietVoucherThuHang = modelMapper.map(updateChiTietVoucherThuHangRequest, ChiTietVoucherThuHang.class);
        return chiTietVoucherThuHang;
    }

    @Override
    public List<ChiTietVoucherThuHangResponse> listChiTietVoucherThuHangEntityToChiTietVoucherThuHangResponse(List<ChiTietVoucherThuHang> chiTietVoucherThuHangList) {
        List<ChiTietVoucherThuHangResponse> list = new ArrayList<>(chiTietVoucherThuHangList.size());
        for (ChiTietVoucherThuHang ctvth : chiTietVoucherThuHangList) {
            list.add(chiTietVoucherThuHangEntityToChiTietVoucherThuHangResponse(ctvth));
        }
        return list;
    }

}
