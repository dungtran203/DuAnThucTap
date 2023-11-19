package com.DuAnThucTap.model.mapper.impl;

import com.DuAnThucTap.entity.LyDoTraHang;
import com.DuAnThucTap.model.response.LyDoTraHangResponse;
import com.DuAnThucTap.model.mapper.LyDoTraHangMapper;
import com.DuAnThucTap.model.request.create_request.CreateLyDoTraHangRequest;
import com.DuAnThucTap.model.request.update_request.UpdateLyDoTraHangRequest;
import jakarta.annotation.Generated;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Generated(value = "org.mapstruct.ap.MappingProcessor", date = "2023-03-29T01:09:18+0700", comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.6 (JetBrains s.r.o.)")
@Component
public class LyDoTraHangMapperImpl implements LyDoTraHangMapper {

    @Autowired
    ModelMapper modelMapper;

    @Override
    public LyDoTraHang lyDoTraHangResponseToLyDoTraHangEntity(LyDoTraHangResponse lyDoTraHangResponse) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        LyDoTraHang lyDoTraHang = modelMapper.map(lyDoTraHangResponse, LyDoTraHang.class);
        return lyDoTraHang;
    }

    @Override
    public LyDoTraHangResponse lyDoTraHangEntityToLyDoTraHangResponse(LyDoTraHang lyDoTraHang) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        LyDoTraHangResponse lyDoTraHangResponse = modelMapper.map(lyDoTraHang, LyDoTraHangResponse.class);
        return lyDoTraHangResponse;
    }

    @Override
    public LyDoTraHang createLyDoTraHangRequestToLyDoTraHangEntity(CreateLyDoTraHangRequest createLyDoTraHangRequest) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        LyDoTraHang lyDoTraHang = modelMapper.map(createLyDoTraHangRequest, LyDoTraHang.class);
        return lyDoTraHang;
    }

    @Override
    public LyDoTraHang updateLyDoTraHangRequestToLyDoTraHangEntity(UpdateLyDoTraHangRequest updateLyDoTraHangRequest) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        LyDoTraHang lyDoTraHang = modelMapper.map(updateLyDoTraHangRequest, LyDoTraHang.class);
        return lyDoTraHang;
    }

    @Override
    public List<LyDoTraHangResponse> listLyDoTraHangEntityToLyDoTraHangResponses(List<LyDoTraHang> lyDoTraHangList) {
        List<LyDoTraHangResponse> list = new ArrayList<>(lyDoTraHangList.size());
        for (LyDoTraHang ldth : lyDoTraHangList
             ) {
            list.add(lyDoTraHangEntityToLyDoTraHangResponse(ldth));
        }
        return list;
    }
}
