package com.sparta.clone.dto.response;

import com.sparta.clone.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AllPostResponseDto {

    private Long Id;

    private String nickname;

    private String content;

    private List<PhotoResponseDto> postImgUrl;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;
    //Post타입에서 PostResDto타입으로 가져올꺼기 때문에  Post post를 인자로 받아준다.
    public AllPostResponseDto(Post post){
        this.Id = post.getId();
        this.nickname = post.getMember().getUsername();
        this.content = post.getContent();
        this.postImgUrl = getPostImgUrl();
        this.createdAt = post.getCreatedAt();
        this.modifiedAt = post.getModifiedAt();
    }
}
