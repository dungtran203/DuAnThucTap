package com.DuAnThucTap.model.mapper;

import com.DuAnThucTap.entity.ChatLieu;
import com.DuAnThucTap.model.request.create_request.CreateChatLieuRequest;
import com.DuAnThucTap.model.request.update_request.UpdateChatLieuRequest;
import com.DuAnThucTap.model.response.ChatLieuResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChatLieuMapper {

    ChatLieu chatLieuResponseToChatLieuEntity(ChatLieuResponse chatLieuResponse);

    ChatLieuResponse chatLieuEntityToChatLieuResponse(ChatLieu chatLieu);

    ChatLieu createChatLieuRequestToChatLieuEntity(CreateChatLieuRequest createChatLieuRequest);

    ChatLieu updateChatLieuRequestToChatLieuEntity(UpdateChatLieuRequest updateChatLieuRequest);

    List<ChatLieuResponse> listChatLieuEntityToChatLieuResponse(List<ChatLieu> chatLieuList);
}
