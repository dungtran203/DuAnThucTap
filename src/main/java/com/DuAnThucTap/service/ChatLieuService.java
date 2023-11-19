package com.DuAnThucTap.service;

import com.DuAnThucTap.model.request.create_request.CreateChatLieuRequest;
import com.DuAnThucTap.model.request.update_request.UpdateChatLieuRequest;
import com.DuAnThucTap.model.response.ChatLieuResponse;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface ChatLieuService {
    Page<ChatLieuResponse> pageChatLieuActive(Integer pageNo, Integer size);

    List<ChatLieuResponse> getAll();

    Page<ChatLieuResponse> pageChatLieuInActive(Integer pageNo, Integer size);

    ChatLieuResponse add(CreateChatLieuRequest createChatLieuRequest);

    ChatLieuResponse update(UpdateChatLieuRequest updateChatLieuRequest);

    ChatLieuResponse getOne(Integer id);

    Page<ChatLieuResponse> searchNameOrMaActive(String searchName, Integer pageNo, Integer size);
    Page<ChatLieuResponse> searchNameOrMaInActive(String searchName, Integer pageNo, Integer size);

    void deleteChatLieu(Integer id, LocalDate now);

    void revertChatLieu(Integer id, LocalDate now);
}
