package com.sparta.clone.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberResponseDto {
    private String username;
    private String profileImg;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AllRoomResponseDto {
        private Long id;
        private String subUsername;
    }

}
