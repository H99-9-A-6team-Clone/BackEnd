package com.sparta.clone.dto.response;

import com.sparta.clone.domain.Photo;
import com.sparta.clone.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AllPostResponseDto {

    private Long id;

    private String username;

    private String profileImg;

    private String content;

    private List<String> postImgUrl;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;



    private Long likeCnt;
    private boolean likeCheck;
    private Long CommentCnt;
    //Post타입에서 PostResDto타입으로 가져올꺼기 때문에  Post post를 인자로 받아준다.
    public AllPostResponseDto(Post post){
        this.id = post.getId();
        this.username = post.getMember().getUsername();
        this.content = post.getContent();
        this.postImgUrl=post.getPhotos()
                .stream()
                .map(Photo::getPostImgUrl)
                .collect(Collectors.toList());
        //photo 있는 url을 가져와서 list에 담아줘라
        this.createdAt = post.getCreatedAt();
        this.modifiedAt = post.getModifiedAt();
    }
}
