package com.DuAnThucTap.model.mapper.impl;

import com.DuAnThucTap.entity.KhachHang;
import com.DuAnThucTap.model.mapper.KhachHangMapper;
import com.DuAnThucTap.model.request.create_request.CreateKhachHangRequest;
import com.DuAnThucTap.model.request.update_request.UpdateKhachHangRequest;
import com.DuAnThucTap.model.response.KhachHangResponse;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated(value = "org.mapstruct.ap.MappingProcessor", date = "2023-03-29T01:09:18+0700", comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.6 (JetBrains s.r.o.)")
@Component
public class KhachHangMapperImpl implements KhachHangMapper {

    @Autowired
    ModelMapper modelMapper;
    @Override
    public KhachHang khachHangResponseToTaiKhoanEntity(KhachHangResponse khachHangResponse) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        KhachHang khachHang =modelMapper.map(khachHangResponse, KhachHang.class);
        return khachHang;
    }

    @Override
    public KhachHangResponse khachHangEntityToTaiKhoanResponse(KhachHang khachHang) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        KhachHangResponse khachHangResponse =modelMapper.map(khachHang, KhachHangResponse.class);
        return khachHangResponse;
    }

    @Override
    public KhachHang createKhachHangRequestToTaiKhoanEntity(CreateKhachHangRequest createKhachHangRequest) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        KhachHang khachHang =modelMapper.map(createKhachHangRequest, KhachHang.class);
        return khachHang;
    }

    @Override
    public KhachHang updateKhachHangRequestToTaiKhoanEntity(UpdateKhachHangRequest updateKhachHangRequest) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        KhachHang khachHang =modelMapper.map(updateKhachHangRequest, KhachHang.class);
        return khachHang;
    }

    @Override
    public List<KhachHangResponse> listKhachHangEntityToKhachHangResponse(List<KhachHang> khachHangList) {
        List<KhachHangResponse> list = new ArrayList<>(khachHangList.size());
        for (KhachHang th : khachHangList) {
            list.add(khachHangEntityToTaiKhoanResponse(th));
        }
        return list;
    }
}
