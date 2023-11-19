package com.DuAnThucTap.model.mapper.impl;

import com.DuAnThucTap.entity.ThuHang;
import com.DuAnThucTap.model.response.ThuHangResponse;
import com.DuAnThucTap.model.mapper.ThuHangMapper;
import com.DuAnThucTap.model.request.create_request.CreateThuHangRequest;
import com.DuAnThucTap.model.request.update_request.UpdateThuHangRequest;
import jakarta.annotation.Generated;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Generated(value = "org.mapstruct.ap.MappingProcessor", date = "2023-03-29T01:09:18+0700", comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.6 (JetBrains s.r.o.)")
@Component
public class ThuHangMapperImpl implements ThuHangMapper {
    
    @Autowired
    ModelMapper modelMapper;
    
    @Override
    public ThuHang thuHangResponseToThuHangEntity(ThuHangResponse thuHangResponse) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        ThuHang thuHang = modelMapper.map(thuHangResponse, ThuHang.class);
        return thuHang;
    }

    @Override
    public ThuHangResponse thuHangEntiyToThuHangResponse(ThuHang thuHang) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        ThuHangResponse thuHangResponse = modelMapper.map(thuHang, ThuHangResponse.class);
        return thuHangResponse;
    }

    @Override
    public ThuHang createThuHangRequestToThuHangEntity(CreateThuHangRequest createThuHangRequest) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        ThuHang thuHang = modelMapper.map(createThuHangRequest, ThuHang.class);
        return thuHang;
    }

    @Override
    public ThuHang updateThuHangRequestToThuHangEntity(UpdateThuHangRequest updateThuHangRequest) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        ThuHang thuHang = modelMapper.map(updateThuHangRequest, ThuHang.class);
        return thuHang;
    }

    @Override
    public List<ThuHangResponse> listThuHangEntityToThuHangResponse(List<ThuHang> thuHangMapperList) {
        List<ThuHangResponse> list = new ArrayList<>(thuHangMapperList.size());
        for (ThuHang th : thuHangMapperList
             ) {
            list.add(thuHangEntiyToThuHangResponse(th));
        }
        return list;
    }
}
