package com.sparta.clone.dto.request;

import com.sparta.clone.domain.Comment;
import com.sparta.clone.domain.Member;
import com.sparta.clone.domain.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommentRequestDto {

    private String comment;

    public Comment toEntity(Member member, Post post){

        return new Comment(member, post, this.comment);
    }
}
